package typings.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFileMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object SetFileMetadataOptions {
  
  inline def apply(): SetFileMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetFileMetadataOptions]
  }
  
  extension [Self <: SetFileMetadataOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
