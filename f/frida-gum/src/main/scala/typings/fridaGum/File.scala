package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides basic filesystem access.
  */
@js.native
trait File extends StObject {
  
  /**
    * Closes the file. You should call this function when you’re done with
    * the file unless you are fine with this happening when the object is
    * garbage-collected or the script is unloaded.
    */
  def close(): Unit = js.native
  
  /**
    * Flushes any buffered data to the underlying file.
    */
  def flush(): Unit = js.native
  
  /**
    * Synchronously writes `data` to the file.
    *
    * @param data Data to write.
    */
  def write(data: String): Unit = js.native
  def write(data: ArrayBuffer): Unit = js.native
}
