package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Badge.html
  *
  * A utility class to create and update a badge node.
  * Badge is not a widget, but a simple utility class for creating and
  * updating a badge node. A badge consists of a simple DOM button.
  * It is intended to be used from other widgets such as dojox/mobile/IconItem
  * or dojox/mobile/TabBarButton.
  *
  * @param params       OptionalContains properties to be set.
  * @param node       OptionalThe DOM node. If none is specified, it is automatically created.
  */
@JSGlobal("dojox.mobile.Badge")
@js.native
class Badge () extends js.Object {
  def this(params: js.Object) = this()
  def this(params: js.Object, node: HTMLElement) = this()
  /**
    * A CSS class name of a DOM button.
    *
    */
  var className: String = js.native
  /**
    * Font size in pixel. The other style attributes are determined by the DOM
    * button itself.
    * Note that changing the value of the property after the badge
    * creation has no effect.
    *
    */
  var fontSize: Double = js.native
  /**
    * A text to show in a badge.
    * Note that changing the value of the property after the badge
    * creation has no effect.
    *
    */
  var value: String = js.native
  /**
    * Returns the text shown in the badge.
    *
    */
  def getValue(): String = js.native
  /**
    * Set a label text to the badge.
    *
    * @param value
    */
  def setValue(value: String): Unit = js.native
}

