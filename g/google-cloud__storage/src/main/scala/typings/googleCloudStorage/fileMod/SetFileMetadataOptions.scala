package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFileMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.native
}
object SetFileMetadataOptions {
  
  @scala.inline
  def apply(): SetFileMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetFileMetadataOptions]
  }
  
  @scala.inline
  implicit class SetFileMetadataOptionsMutableBuilder[Self <: SetFileMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
