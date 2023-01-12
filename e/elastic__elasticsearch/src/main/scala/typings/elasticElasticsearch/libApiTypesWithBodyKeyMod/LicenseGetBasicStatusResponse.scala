package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseGetBasicStatusResponse extends StObject {
  
  var eligible_to_start_basic: Boolean
}
object LicenseGetBasicStatusResponse {
  
  inline def apply(eligible_to_start_basic: Boolean): LicenseGetBasicStatusResponse = {
    val __obj = js.Dynamic.literal(eligible_to_start_basic = eligible_to_start_basic.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseGetBasicStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseGetBasicStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setEligible_to_start_basic(value: Boolean): Self = StObject.set(x, "eligible_to_start_basic", value.asInstanceOf[js.Any])
  }
}
