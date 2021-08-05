package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBucketMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object SetBucketMetadataOptions {
  
  inline def apply(): SetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBucketMetadataOptions]
  }
  
  extension [Self <: SetBucketMetadataOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
