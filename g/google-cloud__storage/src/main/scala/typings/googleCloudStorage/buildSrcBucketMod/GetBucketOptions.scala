package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.GetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketOptions
  extends StObject
     with GetConfig {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetBucketOptions {
  
  inline def apply(): GetBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketOptions] (val x: Self) extends AnyVal {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
