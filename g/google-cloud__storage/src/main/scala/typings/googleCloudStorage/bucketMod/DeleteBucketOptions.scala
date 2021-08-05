package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object DeleteBucketOptions {
  
  inline def apply(): DeleteBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBucketOptions]
  }
  
  extension [Self <: DeleteBucketOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
