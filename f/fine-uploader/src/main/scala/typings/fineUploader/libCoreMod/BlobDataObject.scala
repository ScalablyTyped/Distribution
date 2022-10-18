package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobDataObject extends StObject {
  
  /**
    * the name of the file
    */
  var name: String
  
  /**
    * the size of the file
    */
  var size: Double
}
object BlobDataObject {
  
  inline def apply(name: String, size: Double): BlobDataObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobDataObject]
  }
  
  extension [Self <: BlobDataObject](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
