package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUserProfileWithMetadata
  extends StObject
     with SecurityUserProfile {
  
  var _doc: SecurityUserProfileHitMetadata
  
  var last_synchronized: long
}
object SecurityUserProfileWithMetadata {
  
  inline def apply(
    _doc: SecurityUserProfileHitMetadata,
    data: Record[String, Any],
    labels: Record[String, Any],
    last_synchronized: long,
    uid: SecurityUserProfileId,
    user: SecurityUserProfileUser
  ): SecurityUserProfileWithMetadata = {
    val __obj = js.Dynamic.literal(_doc = _doc.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], last_synchronized = last_synchronized.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUserProfileWithMetadata]
  }
  
  extension [Self <: SecurityUserProfileWithMetadata](x: Self) {
    
    inline def setLast_synchronized(value: long): Self = StObject.set(x, "last_synchronized", value.asInstanceOf[js.Any])
    
    inline def set_doc(value: SecurityUserProfileHitMetadata): Self = StObject.set(x, "_doc", value.asInstanceOf[js.Any])
  }
}
