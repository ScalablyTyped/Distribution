package typings.ejDotWebDotAll.ejNs.RibbonNs

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
  sealed trait Button extends ItemType
  
  ///To render the tab for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Tab extends ItemType
  
  /* 0 */ val Button: typings.ejDotWebDotAll.ejNs.RibbonNs.ItemType.Button with Double = js.native
  /* 1 */ val Tab: typings.ejDotWebDotAll.ejNs.RibbonNs.ItemType.Tab with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemType with Double] = js.native
}

