package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBucketMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.native
}
object SetBucketMetadataOptions {
  
  @scala.inline
  def apply(): SetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBucketMetadataOptions]
  }
  
  @scala.inline
  implicit class SetBucketMetadataOptionsMutableBuilder[Self <: SetBucketMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
