package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var data: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var uid: SecurityUserProfileId
}
object SecurityGetUserProfileRequest {
  
  inline def apply(uid: SecurityUserProfileId): SecurityGetUserProfileRequest = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetUserProfileRequest]
  }
  
  extension [Self <: SecurityGetUserProfileRequest](x: Self) {
    
    inline def setData(value: String | js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setUid(value: SecurityUserProfileId): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
