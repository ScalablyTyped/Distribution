package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "RawObject")
@js.native
open class RawObject protected () extends StObject {
  def this(`type`: Any, content: Any) = this()
  
  var content: Any = js.native
  
  def sha1(): Any = js.native
  def sha1(encoding: String): Any = js.native
  
  def sha1_hex(): Any = js.native
  
  var `type`: Any = js.native
}
