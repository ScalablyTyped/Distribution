package typings.ejWebAll.ej.Ribbon

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemType with Double] = js.native
  /* 0 */ @js.native
  object Button extends TopLevel[Button with Double]
  
  /* 1 */ @js.native
  object Tab
    extends TopLevel[typings.ejWebAll.ej.Ribbon.ItemType.Tab with Double]
  
}

