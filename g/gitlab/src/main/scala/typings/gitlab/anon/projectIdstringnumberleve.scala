package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.distTypesCoreServicesNotificationSettingsMod.NotificationSettingLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number} & {  level :gitlab.gitlab/dist/types/core/services/NotificationSettings.NotificationSettingLevel | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait projectIdstringnumberleve
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var level: js.UndefOr[NotificationSettingLevel] = js.undefined
  
  var projectId: String | Double
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object projectIdstringnumberleve {
  
  inline def apply(projectId: String | Double): projectIdstringnumberleve = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[projectIdstringnumberleve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: projectIdstringnumberleve] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: NotificationSettingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
