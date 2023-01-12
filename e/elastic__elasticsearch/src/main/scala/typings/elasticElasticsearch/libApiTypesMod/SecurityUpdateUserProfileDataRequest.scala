package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateUserProfileDataRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var data: js.UndefOr[Record[String, Any]] = js.undefined
  
  var if_primary_term: js.UndefOr[long] = js.undefined
  
  var if_seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var labels: js.UndefOr[Record[String, Any]] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var uid: SecurityUserProfileId
}
object SecurityUpdateUserProfileDataRequest {
  
  inline def apply(uid: SecurityUserProfileId): SecurityUpdateUserProfileDataRequest = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUpdateUserProfileDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityUpdateUserProfileDataRequest] (val x: Self) extends AnyVal {
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIf_primary_term(value: long): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    inline def setIf_seq_no(value: SequenceNumber): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    inline def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    inline def setLabels(value: Record[String, Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setUid(value: SecurityUserProfileId): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
