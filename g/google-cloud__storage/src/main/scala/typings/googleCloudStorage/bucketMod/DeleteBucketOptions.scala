package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object DeleteBucketOptions {
  
  @scala.inline
  def apply(): DeleteBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBucketOptions]
  }
  
  @scala.inline
  implicit class DeleteBucketOptionsMutableBuilder[Self <: DeleteBucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
