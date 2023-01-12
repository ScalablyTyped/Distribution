package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable21
import typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default
import typings.std.Record
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
  
  @js.native
  trait Typeofdefault
    extends StObject
       with Instantiable21[
          /* email */ String, 
          /* phone */ String, 
          /* gender */ String, 
          /* first_name */ String, 
          /* last_name */ String, 
          /* date_of_birth */ String, 
          /* city */ String, 
          /* state */ String, 
          /* zip */ String, 
          /* country */ String, 
          /* external_id */ String, 
          /* client_ip_address */ String, 
          /* client_user_agent */ String, 
          /* fbp */ String, 
          /* fbc */ String, 
          /* subscription_id */ String, 
          /* fb_login_id */ String, 
          /* lead_id */ String, 
          /* dobd */ String, 
          /* dobm */ String, 
          /* doby */ String, 
          default
        ] {
    
    def Gender: Record[String, Any] = js.native
  }
  
  @js.native
  trait TypeofdefaultInstantiable
    extends StObject
       with Instantiable0[typings.facebookNodejsBusinessSdk.srcObjectsEventMod.default] {
    
    def Category: Record[String, Any] = js.native
    
    def EventStateFilter: Record[String, Any] = js.native
    
    def Fields: Record[String, Any] = js.native
    
    def OnlineEventFormat: Record[String, Any] = js.native
    
    def TimeFilter: Record[String, Any] = js.native
    
    def Type: Record[String, Any] = js.native
  }
}
