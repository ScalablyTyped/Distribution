package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Acs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlInvalidateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Acs] = js.undefined
}
object SecuritySamlInvalidateRequest {
  
  inline def apply(): SecuritySamlInvalidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlInvalidateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlInvalidateRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Acs): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
