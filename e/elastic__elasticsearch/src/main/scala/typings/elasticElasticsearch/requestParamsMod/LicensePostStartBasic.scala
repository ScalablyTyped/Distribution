package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostStartBasic
  extends StObject
     with Generic {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
}
object LicensePostStartBasic {
  
  inline def apply(): LicensePostStartBasic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartBasic]
  }
  
  extension [Self <: LicensePostStartBasic](x: Self) {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
  }
}
