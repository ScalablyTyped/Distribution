package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilesOptions
  extends StObject
     with GetFilesOptions
     with PreconditionOptions {
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object DeleteFilesOptions {
  
  inline def apply(): DeleteFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFilesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFilesOptions] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
