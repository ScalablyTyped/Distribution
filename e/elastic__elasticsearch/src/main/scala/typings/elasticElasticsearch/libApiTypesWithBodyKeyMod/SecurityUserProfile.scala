package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUserProfile extends StObject {
  
  var data: Record[String, Any]
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var labels: Record[String, Any]
  
  var uid: SecurityUserProfileId
  
  var user: SecurityUserProfileUser
}
object SecurityUserProfile {
  
  inline def apply(
    data: Record[String, Any],
    labels: Record[String, Any],
    uid: SecurityUserProfileId,
    user: SecurityUserProfileUser
  ): SecurityUserProfile = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUserProfile]
  }
  
  extension [Self <: SecurityUserProfile](x: Self) {
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLabels(value: Record[String, Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setUid(value: SecurityUserProfileId): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUser(value: SecurityUserProfileUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
