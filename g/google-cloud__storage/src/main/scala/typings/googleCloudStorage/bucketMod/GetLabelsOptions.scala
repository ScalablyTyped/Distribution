package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLabelsOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetLabelsOptions {
  
  inline def apply(): GetLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelsOptions]
  }
  
  extension [Self <: GetLabelsOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
