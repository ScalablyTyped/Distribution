package typings.filesystem

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /**
    * This is the time at which the file or directory was last modified.
    * @readonly
    */
  var modificationTime: Date
  
  /**
    * The size of the file, in bytes. This must return 0 for directories.
    * @readonly
    */
  var size: Double
}
object Metadata {
  
  inline def apply(modificationTime: Date, size: Double): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setModificationTime(value: Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
