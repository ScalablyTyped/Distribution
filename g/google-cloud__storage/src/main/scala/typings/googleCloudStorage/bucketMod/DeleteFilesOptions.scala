package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.storageMod.PreconditionOptions
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
  
  extension [Self <: DeleteFilesOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
