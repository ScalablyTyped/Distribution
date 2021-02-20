package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigInfo extends StObject {
  
  var CreatedAt: String = js.native
  
  var ID: String = js.native
  
  var Spec: js.UndefOr[ConfigSpec] = js.native
  
  var UpdatedAt: js.UndefOr[String] = js.native
  
  var Version: SecretVersion = js.native
}
object ConfigInfo {
  
  @scala.inline
  def apply(CreatedAt: String, ID: String, Version: SecretVersion): ConfigInfo = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
  
  @scala.inline
  implicit class ConfigInfoMutableBuilder[Self <: ConfigInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: ConfigSpec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "Spec", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    @scala.inline
    def setVersion(value: SecretVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
