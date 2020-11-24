package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseMode extends js.Object
@JSGlobal("ej.Tooltip.CloseMode")
@js.native
object CloseMode extends js.Object {
  
  ///Sets the delay for Tooltip close
  @js.native
  sealed trait Auto extends CloseMode
  
  ///The Tooltip will be display normally.
  @js.native
  sealed trait None extends CloseMode
  
  ///Enables close button in Tooltip.
  @js.native
  sealed trait Sticky extends CloseMode
}
