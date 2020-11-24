package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormPosition extends js.Object
@JSGlobal("ej.Grid.FormPosition")
@js.native
object FormPosition extends js.Object {
  
  ///Form position is bottomleft.
  @js.native
  sealed trait BottomLeft extends FormPosition
  
  ///Form position is topright.
  @js.native
  sealed trait TopRight extends FormPosition
}
