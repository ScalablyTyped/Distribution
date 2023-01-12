package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.GetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketExistsOptions
  extends StObject
     with GetConfig {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object BucketExistsOptions {
  
  inline def apply(): BucketExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketExistsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketExistsOptions] (val x: Self) extends AnyVal {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
