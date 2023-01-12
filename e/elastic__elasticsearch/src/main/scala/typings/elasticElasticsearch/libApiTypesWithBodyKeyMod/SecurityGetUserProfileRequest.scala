package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var data: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var uid: SecurityUserProfileId | js.Array[SecurityUserProfileId]
}
object SecurityGetUserProfileRequest {
  
  inline def apply(uid: SecurityUserProfileId | js.Array[SecurityUserProfileId]): SecurityGetUserProfileRequest = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetUserProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetUserProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setUid(value: SecurityUserProfileId | js.Array[SecurityUserProfileId]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidVarargs(value: SecurityUserProfileId*): Self = StObject.set(x, "uid", js.Array(value*))
  }
}
