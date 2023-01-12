package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetBucketMetadataOptions {
  
  inline def apply(): GetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketMetadataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketMetadataOptions] (val x: Self) extends AnyVal {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
