package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateUserProfileDataRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Labels] = js.undefined
  
  var if_primary_term: js.UndefOr[long] = js.undefined
  
  var if_seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var uid: SecurityUserProfileId
}
object SecurityUpdateUserProfileDataRequest {
  
  inline def apply(uid: SecurityUserProfileId): SecurityUpdateUserProfileDataRequest = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUpdateUserProfileDataRequest]
  }
  
  extension [Self <: SecurityUpdateUserProfileDataRequest](x: Self) {
    
    inline def setBody(value: Labels): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIf_primary_term(value: long): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    inline def setIf_seq_no(value: SequenceNumber): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    inline def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setUid(value: SecurityUserProfileId): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
