package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.native
}
object GetBucketMetadataOptions {
  
  @scala.inline
  def apply(): GetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetadataOptions]
  }
  
  @scala.inline
  implicit class GetBucketMetadataOptionsMutableBuilder[Self <: GetBucketMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
