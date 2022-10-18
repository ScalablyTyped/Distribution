package typings.googleCloudStorage.buildSrcBucketMod

import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLabelsOptions
  extends StObject
     with PreconditionOptions {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object SetLabelsOptions {
  
  inline def apply(): SetLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLabelsOptions]
  }
  
  extension [Self <: SetLabelsOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
