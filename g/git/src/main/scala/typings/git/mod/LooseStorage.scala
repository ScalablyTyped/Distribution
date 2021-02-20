package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "LooseStorage")
@js.native
class LooseStorage protected () extends StObject {
  def this(directory: js.Any) = this()
  
  var directory: js.Any = js.native
  
  def find(sha1: js.Any): RawObject = js.native
  
  def get_raw_object(buf: js.Any): RawObject = js.native
  
  def is_legacy_loose_object(buf: js.Any): Boolean = js.native
  
  def put_raw_object(content: js.Any, `type`: js.Any, callback: js.Function): Unit = js.native
  
  def unpack_object_header_gently(buf: js.Any): js.Array[_] = js.native
}
/* static members */
object LooseStorage {
  
  @JSImport("git", "LooseStorage.verify_header")
  @js.native
  def verify_header(`type`: js.Any, size: js.Any): Unit = js.native
}
