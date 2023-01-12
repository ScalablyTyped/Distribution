package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBucketMetadataOptions
  extends StObject
     with PreconditionOptions {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object SetBucketMetadataOptions {
  
  inline def apply(): SetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBucketMetadataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBucketMetadataOptions] (val x: Self) extends AnyVal {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
