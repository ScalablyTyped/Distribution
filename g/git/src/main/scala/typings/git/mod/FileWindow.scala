package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "FileWindow")
@js.native
open class FileWindow protected () extends StObject {
  def this(idxfile: Any, version: Any) = this()
  
  def close(): Unit = js.native
  
  var global_offset: Any = js.native
  
  var idxfile: Any = js.native
  
  def index(idx: js.Array[Any]): Unit = js.native
  def index(idx: Double): Unit = js.native
  
  var offset: Any = js.native
  
  var seek_offset: Any = js.native
  
  def unmap(): Unit = js.native
  
  var version: Any = js.native
}
