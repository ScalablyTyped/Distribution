package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__iconv")
@js.native
object iconv extends js.Object {
  
  def decode(charset: String, data: typings.fibjs.ClassBuffer): String = js.native
  
  def encode(charset: String, data: String): typings.fibjs.ClassBuffer = js.native
  
  def isEncoding(charset: String): Boolean = js.native
}
