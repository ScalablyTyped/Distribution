package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketOptions extends StObject {
  
  var ignoreNotFound: js.UndefOr[Boolean] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object DeleteBucketOptions {
  
  inline def apply(): DeleteBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBucketOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBucketOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreNotFound(value: Boolean): Self = StObject.set(x, "ignoreNotFound", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNotFoundUndefined: Self = StObject.set(x, "ignoreNotFound", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
