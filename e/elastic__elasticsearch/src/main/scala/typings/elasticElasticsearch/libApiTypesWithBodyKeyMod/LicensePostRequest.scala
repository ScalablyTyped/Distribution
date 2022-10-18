package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.License
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[License] = js.undefined
}
object LicensePostRequest {
  
  inline def apply(): LicensePostRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostRequest]
  }
  
  extension [Self <: LicensePostRequest](x: Self) {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    inline def setBody(value: License): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
