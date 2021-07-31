package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptions extends StObject {
  
  var destinationKmsKeyName: js.UndefOr[String] = js.undefined
  
  var predefinedAcl: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsMutableBuilder[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationKmsKeyName(value: String): Self = StObject.set(x, "destinationKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationKmsKeyNameUndefined: Self = StObject.set(x, "destinationKmsKeyName", js.undefined)
    
    @scala.inline
    def setPredefinedAcl(value: String): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
