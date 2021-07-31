package typings.googleCloudStorage.bucketMod

import typings.googleCloudCommon.serviceObjectMod.GetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketExistsOptions
  extends StObject
     with GetConfig {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object BucketExistsOptions {
  
  @scala.inline
  def apply(): BucketExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketExistsOptions]
  }
  
  @scala.inline
  implicit class BucketExistsOptionsMutableBuilder[Self <: BucketExistsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
