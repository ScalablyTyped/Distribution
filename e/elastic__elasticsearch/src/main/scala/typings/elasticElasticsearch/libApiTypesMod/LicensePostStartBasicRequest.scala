package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostStartBasicRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
}
object LicensePostStartBasicRequest {
  
  inline def apply(): LicensePostStartBasicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartBasicRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicensePostStartBasicRequest] (val x: Self) extends AnyVal {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
  }
}
