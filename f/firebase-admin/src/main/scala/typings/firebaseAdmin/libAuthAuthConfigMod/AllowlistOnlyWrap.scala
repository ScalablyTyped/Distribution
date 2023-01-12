package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistOnlyWrap
  extends StObject
     with SmsRegionConfig {
  
  /** @alpha */
  var allowByDefault: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Only allowing regions by explicitly adding them to an
    * allowlist.
    */
  var allowlistOnly: AllowlistOnly
}
object AllowlistOnlyWrap {
  
  inline def apply(allowlistOnly: AllowlistOnly): AllowlistOnlyWrap = {
    val __obj = js.Dynamic.literal(allowlistOnly = allowlistOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowlistOnlyWrap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowlistOnlyWrap] (val x: Self) extends AnyVal {
    
    inline def setAllowlistOnly(value: AllowlistOnly): Self = StObject.set(x, "allowlistOnly", value.asInstanceOf[js.Any])
  }
}
