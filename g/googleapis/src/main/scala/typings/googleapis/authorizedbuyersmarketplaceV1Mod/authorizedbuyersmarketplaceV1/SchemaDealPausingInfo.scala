package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealPausingInfo extends StObject {
  
  /**
    * The reason for the pausing of the deal; empty for active deals.
    */
  var pauseReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The party that first paused the deal; unspecified for active deals.
    */
  var pauseRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether pausing is consented between buyer and seller for the deal.
    */
  var pausingConsented: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDealPausingInfo {
  
  inline def apply(): SchemaDealPausingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealPausingInfo]
  }
  
  extension [Self <: SchemaDealPausingInfo](x: Self) {
    
    inline def setPauseReason(value: String): Self = StObject.set(x, "pauseReason", value.asInstanceOf[js.Any])
    
    inline def setPauseReasonNull: Self = StObject.set(x, "pauseReason", null)
    
    inline def setPauseReasonUndefined: Self = StObject.set(x, "pauseReason", js.undefined)
    
    inline def setPauseRole(value: String): Self = StObject.set(x, "pauseRole", value.asInstanceOf[js.Any])
    
    inline def setPauseRoleNull: Self = StObject.set(x, "pauseRole", null)
    
    inline def setPauseRoleUndefined: Self = StObject.set(x, "pauseRole", js.undefined)
    
    inline def setPausingConsented(value: Boolean): Self = StObject.set(x, "pausingConsented", value.asInstanceOf[js.Any])
    
    inline def setPausingConsentedNull: Self = StObject.set(x, "pausingConsented", null)
    
    inline def setPausingConsentedUndefined: Self = StObject.set(x, "pausingConsented", js.undefined)
  }
}
