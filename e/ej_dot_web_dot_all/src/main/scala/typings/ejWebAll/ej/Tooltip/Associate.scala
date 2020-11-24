package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Associate extends js.Object
@JSGlobal("ej.Tooltip.Associate")
@js.native
object Associate extends js.Object {
  
  ///Sets the position related to (x,y) co-ordinates.
  @js.native
  sealed trait Axis extends Associate
  
  ///Sets the position related to mouse, first entry to the target element.
  @js.native
  sealed trait MouseEnter extends Associate
  
  ///Sets the position related to mouse.
  @js.native
  sealed trait MouseFollow extends Associate
  
  ///Sets the position related to target element.
  @js.native
  sealed trait Target extends Associate
  
  ///Sets the position related to browser window.
  @js.native
  sealed trait Window extends Associate
}
