package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MatrixTypes extends js.Object
@JSGlobal("ej.MatrixTypes")
@js.native
object MatrixTypes extends js.Object {
  
  @js.native
  sealed trait Identity extends MatrixTypes
  
  @js.native
  sealed trait Scaling extends MatrixTypes
  
  @js.native
  sealed trait Translation extends MatrixTypes
  
  @js.native
  sealed trait Unknown extends MatrixTypes
}
