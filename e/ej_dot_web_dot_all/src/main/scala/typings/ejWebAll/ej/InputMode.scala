package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputMode extends js.Object
@JSGlobal("ej.InputMode")
@js.native
object InputMode extends js.Object {
  
  //string
  @js.native
  sealed trait Password extends InputMode
  
  //string
  @js.native
  sealed trait Text extends InputMode
}
