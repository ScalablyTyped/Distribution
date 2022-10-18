package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumableFileObject extends StObject {
  
  /**
    * an object containing any custom resume data for the file
    */
  var customResumeData: js.UndefOr[Any] = js.undefined
  
  /**
    * filename
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * number of bytes to be uploaded
    */
  var remaining: js.UndefOr[Double] = js.undefined
  
  /**
    * total file size in bytes
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * the unique id
    */
  var uuid: js.UndefOr[Double] = js.undefined
}
object ResumableFileObject {
  
  inline def apply(): ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumableFileObject]
  }
  
  extension [Self <: ResumableFileObject](x: Self) {
    
    inline def setCustomResumeData(value: Any): Self = StObject.set(x, "customResumeData", value.asInstanceOf[js.Any])
    
    inline def setCustomResumeDataUndefined: Self = StObject.set(x, "customResumeData", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUuid(value: Double): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
