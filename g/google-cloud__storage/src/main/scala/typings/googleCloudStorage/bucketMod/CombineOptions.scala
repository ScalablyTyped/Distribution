package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombineOptions extends StObject {
  
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object CombineOptions {
  
  @scala.inline
  def apply(): CombineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombineOptions]
  }
  
  @scala.inline
  implicit class CombineOptionsMutableBuilder[Self <: CombineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
