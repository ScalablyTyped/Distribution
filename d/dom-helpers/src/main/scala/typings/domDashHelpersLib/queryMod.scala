package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  @JSName("closest")
  var closest_Original: js.Function3[
    /* element */ stdLib.Element, 
    /* selector */ java.lang.String, 
    /* context */ stdLib.Element, 
    stdLib.Element
  ] = js.native
  @JSName("contains")
  var contains_Original: js.Function2[/* context */ stdLib.Node, /* node */ stdLib.Node, scala.Boolean] = js.native
  var default: domDashHelpersLib.Anon_Closest = js.native
  @JSName("height")
  var height_Original: js.Function2[
    /* element */ stdLib.Element, 
    /* useClientHeight */ js.UndefOr[scala.Boolean], 
    scala.Double
  ] = js.native
  @JSName("matches")
  var matches_Original: js.Function2[/* element */ stdLib.Element, /* selectors */ java.lang.String, scala.Boolean] = js.native
  @JSName("offsetParent")
  var offsetParent_Original: js.Function1[/* element */ stdLib.Element, stdLib.Element] = js.native
  @JSName("offset")
  var offset_Original: js.Function1[/* element */ stdLib.Element, domDashHelpersLib.queryOffsetMod.DomHelpersRect] = js.native
  @JSName("position")
  var position_Original: js.Function2[
    /* element */ stdLib.Element, 
    /* offsetParent */ js.UndefOr[stdLib.Node], 
    domDashHelpersLib.queryOffsetMod.DomHelpersRect
  ] = js.native
  @JSName("querySelectorAll")
  var querySelectorAll_Original: js.Function2[
    /* element */ stdLib.Element, 
    /* selector */ java.lang.String, 
    js.Array[stdLib.Element]
  ] = js.native
  @JSName("scrollParent")
  var scrollParent_Original: js.Function1[/* element */ stdLib.Element, stdLib.Element] = js.native
  var scrollTop: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _scrollTop */ js.Any = js.native
  @JSName("width")
  var width_Original: js.Function2[
    /* element */ stdLib.Element, 
    /* useClientWidth */ js.UndefOr[scala.Boolean], 
    scala.Double
  ] = js.native
  def closest(element: stdLib.Element, selector: java.lang.String, context: stdLib.Element): stdLib.Element = js.native
  def contains(context: stdLib.Node, node: stdLib.Node): scala.Boolean = js.native
  def height(element: stdLib.Element): scala.Double = js.native
  def height(element: stdLib.Element, useClientHeight: scala.Boolean): scala.Double = js.native
  def matches(element: stdLib.Element, selectors: java.lang.String): scala.Boolean = js.native
  def offset(element: stdLib.Element): domDashHelpersLib.queryOffsetMod.DomHelpersRect = js.native
  def offsetParent(element: stdLib.Element): stdLib.Element = js.native
  def position(element: stdLib.Element): domDashHelpersLib.queryOffsetMod.DomHelpersRect = js.native
  def position(element: stdLib.Element, offsetParent: stdLib.Node): domDashHelpersLib.queryOffsetMod.DomHelpersRect = js.native
  def querySelectorAll(element: stdLib.Element, selector: java.lang.String): js.Array[stdLib.Element] = js.native
  def scrollParent(element: stdLib.Element): stdLib.Element = js.native
  def width(element: stdLib.Element): scala.Double = js.native
  def width(element: stdLib.Element, useClientWidth: scala.Boolean): scala.Double = js.native
}

