package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeFilePrivateOptions extends StObject {
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object MakeFilePrivateOptions {
  
  @scala.inline
  def apply(): MakeFilePrivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeFilePrivateOptions]
  }
  
  @scala.inline
  implicit class MakeFilePrivateOptionsMutableBuilder[Self <: MakeFilePrivateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
