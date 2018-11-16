package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PivotPagerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PivotPagerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PivotPagerNs.Model = js.native
  @JSName("model")
  var model_PivotPager: ejDotWebDotAllLib.ejNs.PivotPagerNs.Model = js.native
  /** This function initializes the page counts and page numbers for the PivotPager.
           * @returns {void}
           */
  def initPagerProperties(): scala.Unit = js.native
}

@JSGlobal("ej.PivotPager")
@js.native
object PivotPager extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.PivotPager = js.native
}

