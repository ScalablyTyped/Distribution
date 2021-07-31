package typings.googleCloudStorage.fileMod

import typings.googleCloudCommon.serviceObjectMod.GetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileOptions
  extends StObject
     with GetConfig {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetFileOptions {
  
  @scala.inline
  def apply(): GetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileOptions]
  }
  
  @scala.inline
  implicit class GetFileOptionsMutableBuilder[Self <: GetFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
