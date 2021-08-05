package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigInfo extends StObject {
  
  var CreatedAt: String
  
  var ID: String
  
  var Spec: js.UndefOr[ConfigSpec] = js.undefined
  
  var UpdatedAt: js.UndefOr[String] = js.undefined
  
  var Version: SecretVersion
}
object ConfigInfo {
  
  inline def apply(CreatedAt: String, ID: String, Version: SecretVersion): ConfigInfo = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
  
  extension [Self <: ConfigInfo](x: Self) {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: ConfigSpec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "Spec", js.undefined)
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setVersion(value: SecretVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
