package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumableFileObject extends StObject {
  
  /**
    * an object containing any custom resume data for the file
    */
  var customResumeData: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumableFileObject]
  }
  
  @scala.inline
  implicit class ResumableFileObjectMutableBuilder[Self <: ResumableFileObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomResumeData(value: js.Any): Self = StObject.set(x, "customResumeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomResumeDataUndefined: Self = StObject.set(x, "customResumeData", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUuid(value: Double): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
