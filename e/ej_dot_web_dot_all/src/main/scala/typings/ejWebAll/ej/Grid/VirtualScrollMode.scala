package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualScrollMode extends js.Object
@JSGlobal("ej.Grid.VirtualScrollMode")
@js.native
object VirtualScrollMode extends js.Object {
  
  ///virtual scroll mode is continuous.
  @js.native
  sealed trait Continuous extends VirtualScrollMode
  
  ///virtual scroll mode is normal.
  @js.native
  sealed trait Normal extends VirtualScrollMode
}
