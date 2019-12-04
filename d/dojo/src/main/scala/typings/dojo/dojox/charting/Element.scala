package typings.dojo.dojox.charting

import typings.dojo.dojox.gfx.shape.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Element.html
  *
  * A base class that is used to build other elements of a chart, such as
  * a series.
  *
  * @param chart The chart that this element belongs to.
  */
@JSGlobal("dojox.charting.Element")
@js.native
class Element protected () extends js.Object {
  def this(chart: Chart) = this()
  /**
    * The parent chart for this element.
    *
    */
  var chart: js.Object = js.native
  /**
    * A flag indicating whether or not this element needs to be rendered.
    *
    */
  var dirty: Boolean = js.native
  /**
    * The visual GFX group representing this element.
    *
    */
  var group: js.Object = js.native
  /**
    * Any DOMNodes used as a part of this element (such as HTML-based labels).
    *
    */
  var htmlElement: js.Array[_] = js.native
  /**
    *
    */
  var htmlElements: js.Object = js.native
  /**
    * Clean any elements (HTML or GFX-based) out of our group, and create a new one.
    *
    * @param creator               OptionalAn optional surface to work with.
    */
  def cleanGroup(creator: Surface): js.Any = js.native
  /**
    * API addition to conform to the rest of the Dojo Toolkit's standard.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Destroy any DOMNodes that may have been created as a part of this element.
    *
    */
  def destroyHtmlElements(): Unit = js.native
  /**
    *
    */
  def getGroup(): js.Any = js.native
  /**
    *
    * @param s
    * @param font
    */
  def getTextWidth(s: js.Any, font: js.Any): Double = js.native
  /**
    * Get the truncated string based on the limited character count(dichotomy algorithm)
    *
    * @param s               Optionalcandidate text.
    * @param font               Optionaltext's font style.
    * @param wcLimit               Optionaltext limited character count.
    * @param truncated               Optionalwhether the input text(s) has already been truncated.
    */
  def getTextWithLimitCharCount(s: String, font: String, wcLimit: Double, truncated: Boolean): js.Any = js.native
  /**
    * Get the truncated string based on the limited width in px(dichotomy algorithm)
    *
    * @param s               Optionalcandidate text.
    * @param font               Optionaltext's font style.
    * @param limitWidth               Optionaltext limited width in px.
    * @param truncated               Optionalwhether the input text(s) has already been truncated.
    */
  def getTextWithLimitLength(s: String, font: String, limitWidth: Double, truncated: Boolean): js.Any = js.native
  /**
    * Clear any elements out of our group, and destroy the group.
    *
    */
  def purgeGroup(): js.Any = js.native
}

