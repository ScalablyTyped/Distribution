package typings.git.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "FileWindow")
@js.native
class FileWindow protected () extends js.Object {
  def this(idxfile: js.Any, version: js.Any) = this()
  
  def close(): Unit = js.native
  
  var global_offset: js.Any = js.native
  
  var idxfile: js.Any = js.native
  
  def index(idx: js.Array[_]): Unit = js.native
  def index(idx: Double): Unit = js.native
  
  var offset: js.Any = js.native
  
  var seek_offset: js.Any = js.native
  
  def unmap(): Unit = js.native
  
  var version: js.Any = js.native
}
