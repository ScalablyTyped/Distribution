package typings.domDashHelpers

import typings.domDashHelpers.queryOffsetMod.DomHelpersRect
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  @JSName("closest")
  var closest_Original: js.Function3[/* element */ Element, /* selector */ String, /* context */ Element, Element] = js.native
  @JSName("contains")
  var contains_Original: js.Function2[/* context */ Node, /* node */ Node, Boolean] = js.native
  var default: Anon_Closest = js.native
  @JSName("height")
  var height_Original: js.Function2[/* element */ Element, /* useClientHeight */ js.UndefOr[Boolean], Double] = js.native
  @JSName("matches")
  var matches_Original: js.Function2[/* element */ Element, /* selectors */ String, Boolean] = js.native
  @JSName("offsetParent")
  var offsetParent_Original: js.Function1[/* element */ Element, Element] = js.native
  @JSName("offset")
  var offset_Original: js.Function1[/* element */ Element, DomHelpersRect] = js.native
  @JSName("position")
  var position_Original: js.Function2[/* element */ Element, /* offsetParent */ js.UndefOr[Node], DomHelpersRect] = js.native
  @JSName("querySelectorAll")
  var querySelectorAll_Original: js.Function2[/* element */ Element, /* selector */ String, js.Array[Element]] = js.native
  @JSName("scrollParent")
  var scrollParent_Original: js.Function1[/* element */ Element, Element] = js.native
  var scrollTop: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _scrollTop */ js.Any = js.native
  @JSName("width")
  var width_Original: js.Function2[/* element */ Element, /* useClientWidth */ js.UndefOr[Boolean], Double] = js.native
  def closest(element: Element, selector: String, context: Element): Element = js.native
  def contains(context: Node, node: Node): Boolean = js.native
  def height(element: Element): Double = js.native
  def height(element: Element, useClientHeight: Boolean): Double = js.native
  def matches(element: Element, selectors: String): Boolean = js.native
  def offset(element: Element): DomHelpersRect = js.native
  def offsetParent(element: Element): Element = js.native
  def position(element: Element): DomHelpersRect = js.native
  def position(element: Element, offsetParent: Node): DomHelpersRect = js.native
  def querySelectorAll(element: Element, selector: String): js.Array[Element] = js.native
  def scrollParent(element: Element): Element = js.native
  def width(element: Element): Double = js.native
  def width(element: Element, useClientWidth: Boolean): Double = js.native
}

