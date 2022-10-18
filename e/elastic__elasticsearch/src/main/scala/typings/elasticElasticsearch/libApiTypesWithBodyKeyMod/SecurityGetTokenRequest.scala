package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Granttype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetTokenRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Granttype] = js.undefined
}
object SecurityGetTokenRequest {
  
  inline def apply(): SecurityGetTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetTokenRequest]
  }
  
  extension [Self <: SecurityGetTokenRequest](x: Self) {
    
    inline def setBody(value: Granttype): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
