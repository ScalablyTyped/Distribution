package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "RawObject")
@js.native
class RawObject protected () extends StObject {
  def this(`type`: js.Any, content: js.Any) = this()
  
  var content: js.Any = js.native
  
  def sha1(): js.Any = js.native
  def sha1(encoding: String): js.Any = js.native
  
  def sha1_hex(): js.Any = js.native
  
  var `type`: js.Any = js.native
}
