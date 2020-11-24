package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Trigger extends js.Object
@JSGlobal("ej.Tooltip.Trigger")
@js.native
object Trigger extends js.Object {
  
  ///The Tooltip to be shown when the target element is clicked.
  @js.native
  sealed trait Click extends Trigger
  
  ///Enables the Tooltip when focus is set to target element.
  @js.native
  sealed trait Focus extends Trigger
  
  ///Enables the Tooltip when hover on the target element.
  @js.native
  sealed trait Hover extends Trigger
}
