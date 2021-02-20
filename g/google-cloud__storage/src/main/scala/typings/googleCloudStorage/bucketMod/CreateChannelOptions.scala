package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.native
}
object CreateChannelOptions {
  
  @scala.inline
  def apply(): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelOptions]
  }
  
  @scala.inline
  implicit class CreateChannelOptionsMutableBuilder[Self <: CreateChannelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
