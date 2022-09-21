package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2Restrictions extends StObject {
  
  /**
    * The Android apps that are allowed to use the key.
    */
  var androidKeyRestrictions: js.UndefOr[SchemaV2AndroidKeyRestrictions] = js.undefined
  
  /**
    * A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
    */
  var apiTargets: js.UndefOr[js.Array[SchemaV2ApiTarget]] = js.undefined
  
  /**
    * The HTTP referrers (websites) that are allowed to use the key.
    */
  var browserKeyRestrictions: js.UndefOr[SchemaV2BrowserKeyRestrictions] = js.undefined
  
  /**
    * The iOS apps that are allowed to use the key.
    */
  var iosKeyRestrictions: js.UndefOr[SchemaV2IosKeyRestrictions] = js.undefined
  
  /**
    * The IP addresses of callers that are allowed to use the key.
    */
  var serverKeyRestrictions: js.UndefOr[SchemaV2ServerKeyRestrictions] = js.undefined
}
object SchemaV2Restrictions {
  
  inline def apply(): SchemaV2Restrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2Restrictions]
  }
  
  extension [Self <: SchemaV2Restrictions](x: Self) {
    
    inline def setAndroidKeyRestrictions(value: SchemaV2AndroidKeyRestrictions): Self = StObject.set(x, "androidKeyRestrictions", value.asInstanceOf[js.Any])
    
    inline def setAndroidKeyRestrictionsUndefined: Self = StObject.set(x, "androidKeyRestrictions", js.undefined)
    
    inline def setApiTargets(value: js.Array[SchemaV2ApiTarget]): Self = StObject.set(x, "apiTargets", value.asInstanceOf[js.Any])
    
    inline def setApiTargetsUndefined: Self = StObject.set(x, "apiTargets", js.undefined)
    
    inline def setApiTargetsVarargs(value: SchemaV2ApiTarget*): Self = StObject.set(x, "apiTargets", js.Array(value*))
    
    inline def setBrowserKeyRestrictions(value: SchemaV2BrowserKeyRestrictions): Self = StObject.set(x, "browserKeyRestrictions", value.asInstanceOf[js.Any])
    
    inline def setBrowserKeyRestrictionsUndefined: Self = StObject.set(x, "browserKeyRestrictions", js.undefined)
    
    inline def setIosKeyRestrictions(value: SchemaV2IosKeyRestrictions): Self = StObject.set(x, "iosKeyRestrictions", value.asInstanceOf[js.Any])
    
    inline def setIosKeyRestrictionsUndefined: Self = StObject.set(x, "iosKeyRestrictions", js.undefined)
    
    inline def setServerKeyRestrictions(value: SchemaV2ServerKeyRestrictions): Self = StObject.set(x, "serverKeyRestrictions", value.asInstanceOf[js.Any])
    
    inline def setServerKeyRestrictionsUndefined: Self = StObject.set(x, "serverKeyRestrictions", js.undefined)
  }
}
