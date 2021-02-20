package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNotificationsOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.native
}
object GetNotificationsOptions {
  
  @scala.inline
  def apply(): GetNotificationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationsOptions]
  }
  
  @scala.inline
  implicit class GetNotificationsOptionsMutableBuilder[Self <: GetNotificationsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
