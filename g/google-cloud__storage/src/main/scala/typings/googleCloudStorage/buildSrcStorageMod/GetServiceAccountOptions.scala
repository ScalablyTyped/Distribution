package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceAccountOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetServiceAccountOptions {
  
  inline def apply(): GetServiceAccountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceAccountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceAccountOptions] (val x: Self) extends AnyVal {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
