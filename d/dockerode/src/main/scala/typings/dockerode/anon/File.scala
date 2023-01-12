package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var Config: js.UndefOr[String] = js.undefined
  
  var File: js.UndefOr[String] = js.undefined
  
  var Registry: js.UndefOr[String] = js.undefined
}
object File {
  
  inline def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: String): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "File", js.undefined)
    
    inline def setRegistry(value: String): Self = StObject.set(x, "Registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "Registry", js.undefined)
  }
}
