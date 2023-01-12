package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Maxoutstandingreadrequests
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrResumeFollowRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Maxoutstandingreadrequests] = js.undefined
  
  var index: IndexName
}
object CcrResumeFollowRequest {
  
  inline def apply(index: IndexName): CcrResumeFollowRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrResumeFollowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrResumeFollowRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Maxoutstandingreadrequests): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
