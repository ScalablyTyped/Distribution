package typings.durandal.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plugins/serializer", "deserialize")
@js.native
object deserialize extends js.Object {
  
  def apply[T](text: String): T = js.native
  def apply[T](text: String, settings: DeserializerOptions): T = js.native
}
