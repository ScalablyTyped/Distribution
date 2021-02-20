package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.native
}
object MoveOptions {
  
  @scala.inline
  def apply(): MoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveOptions]
  }
  
  @scala.inline
  implicit class MoveOptionsMutableBuilder[Self <: MoveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
