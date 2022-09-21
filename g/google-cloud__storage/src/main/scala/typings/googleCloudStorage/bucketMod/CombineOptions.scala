package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.storageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombineOptions
  extends StObject
     with PreconditionOptions {
  
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object CombineOptions {
  
  inline def apply(): CombineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombineOptions]
  }
  
  extension [Self <: CombineOptions](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
