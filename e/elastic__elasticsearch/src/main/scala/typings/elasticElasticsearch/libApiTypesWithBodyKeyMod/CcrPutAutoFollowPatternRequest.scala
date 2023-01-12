package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Followindexpattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrPutAutoFollowPatternRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Followindexpattern] = js.undefined
  
  var name: Name
}
object CcrPutAutoFollowPatternRequest {
  
  inline def apply(name: Name): CcrPutAutoFollowPatternRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPutAutoFollowPatternRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrPutAutoFollowPatternRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Followindexpattern): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
