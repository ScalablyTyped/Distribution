package typings.googleCloudStorage.buildSrcBucketMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLabelsOptions] (val x: Self) extends AnyVal {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
