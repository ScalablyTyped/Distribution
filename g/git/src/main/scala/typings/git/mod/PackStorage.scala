package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "PackStorage")
@js.native
class PackStorage protected () extends StObject {
  def this(file: js.Any) = this()
  
  var cache: js.Any = js.native
  
  def close(): Unit = js.native
  
  def find(sha1: js.Any): RawObject = js.native
  
  var name: js.Any = js.native
  
  var offsets: js.Any = js.native
  
  def parse_object(pack: js.Any, offset: js.Any): RawObject = js.native
  
  var size: js.Any = js.native
  
  def unpack_deltified(packfile: js.Any, `type`: js.Any, offset: js.Any, objOffset: js.Any, size: js.Any, options: js.Any): js.Any = js.native
  
  def unpack_object(pack: js.Any, packfile: js.Any, offset: js.Any, options: js.Any): js.Array[_] = js.native
  
  var version: js.Any = js.native
}
