package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "LooseStorage")
@js.native
open class LooseStorage protected () extends StObject {
  def this(directory: Any) = this()
  
  var directory: Any = js.native
  
  def find(sha1: Any): RawObject = js.native
  
  def get_raw_object(buf: Any): RawObject = js.native
  
  def is_legacy_loose_object(buf: Any): Boolean = js.native
  
  def put_raw_object(content: Any, `type`: Any, callback: js.Function): Unit = js.native
  
  def unpack_object_header_gently(buf: Any): js.Array[Any] = js.native
}
/* static members */
object LooseStorage {
  
  @JSImport("git", "LooseStorage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def verify_header(`type`: Any, size: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify_header")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
