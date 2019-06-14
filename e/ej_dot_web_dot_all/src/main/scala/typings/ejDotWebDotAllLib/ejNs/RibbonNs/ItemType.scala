package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

@JSGlobal("ej.Ribbon.ItemType")
@js.native
object ItemType extends js.Object {
  ///To render the button for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Button
    extends ejDotWebDotAllLib.ejNs.RibbonNs.ItemType
  
  ///To render the tab for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Tab
    extends ejDotWebDotAllLib.ejNs.RibbonNs.ItemType
  
  /* 0 */ val Button: Button with scala.Double = js.native
  /* 1 */ val Tab: Tab with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.ItemType with scala.Double] = js.native
}

