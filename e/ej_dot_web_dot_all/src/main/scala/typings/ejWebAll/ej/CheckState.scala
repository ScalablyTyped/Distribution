package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckState extends js.Object
@JSGlobal("ej.CheckState")
@js.native
object CheckState extends js.Object {
  
  //string
  @js.native
  sealed trait Check extends CheckState
  
  //string
  @js.native
  sealed trait Indeterminate extends CheckState
  
  //string
  @js.native
  sealed trait Uncheck extends CheckState
}
