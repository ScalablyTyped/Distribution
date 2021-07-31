package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStorageClassOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object SetStorageClassOptions {
  
  @scala.inline
  def apply(): SetStorageClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetStorageClassOptions]
  }
  
  @scala.inline
  implicit class SetStorageClassOptionsMutableBuilder[Self <: SetStorageClassOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
