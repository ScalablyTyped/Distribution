package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import typings.gitlab.notificationSettingsMod.NotificationSettingLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  groupId :string | number} & {  level :gitlab.gitlab/dist/types/core/services/NotificationSettings.NotificationSettingLevel | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait groupIdstringnumberlevelN
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var groupId: String | Double
  
  var level: js.UndefOr[NotificationSettingLevel] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object groupIdstringnumberlevelN {
  
  inline def apply(groupId: String | Double): groupIdstringnumberlevelN = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupIdstringnumberlevelN]
  }
  
  extension [Self <: groupIdstringnumberlevelN](x: Self) {
    
    inline def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: NotificationSettingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
