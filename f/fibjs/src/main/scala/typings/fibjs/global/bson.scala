package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__bson")
@js.native
object bson extends js.Object {
  
  def decode(data: typings.fibjs.ClassBuffer): js.Object = js.native
  
  def encode(data: js.Object): typings.fibjs.ClassBuffer = js.native
}
