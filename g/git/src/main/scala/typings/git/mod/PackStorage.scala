package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "PackStorage")
@js.native
open class PackStorage protected () extends StObject {
  def this(file: Any) = this()
  
  var cache: Any = js.native
  
  def close(): Unit = js.native
  
  def find(sha1: Any): RawObject = js.native
  
  var name: Any = js.native
  
  var offsets: Any = js.native
  
  def parse_object(pack: Any, offset: Any): RawObject = js.native
  
  var size: Any = js.native
  
  def unpack_deltified(packfile: Any, `type`: Any, offset: Any, objOffset: Any, size: Any, options: Any): Any = js.native
  
  def unpack_object(pack: Any, packfile: Any, offset: Any, options: Any): js.Array[Any] = js.native
  
  var version: Any = js.native
}
