package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttachedFiles extends StObject {
    
    var attachedFiles: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var name: Any
    
    var relative_url: String
  }
  object AttachedFiles {
    
    inline def apply(method: String, name: Any, relative_url: String): AttachedFiles = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative_url = relative_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachedFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttachedFiles] (val x: Self) extends AnyVal {
      
      inline def setAttachedFiles(value: String): Self = StObject.set(x, "attachedFiles", value.asInstanceOf[js.Any])
      
      inline def setAttachedFilesUndefined: Self = StObject.set(x, "attachedFiles", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRelative_url(value: String): Self = StObject.set(x, "relative_url", value.asInstanceOf[js.Any])
    }
  }
}
