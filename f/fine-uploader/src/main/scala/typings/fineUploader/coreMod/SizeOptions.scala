package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeOptions extends StObject {
  
  /**
    * maximum size
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * name property will be appended to the file name of the scaled file
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * MIME type
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SizeOptions {
  
  @scala.inline
  def apply(): SizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeOptions]
  }
  
  @scala.inline
  implicit class SizeOptionsMutableBuilder[Self <: SizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
