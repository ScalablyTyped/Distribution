package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowByDefaultWrap
  extends StObject
     with SmsRegionConfig {
  
  /**
    * Allow every region by default.
    */
  var allowByDefault: AllowByDefault
  
  /** @alpha */
  var allowlistOnly: js.UndefOr[scala.Nothing] = js.undefined
}
object AllowByDefaultWrap {
  
  inline def apply(allowByDefault: AllowByDefault): AllowByDefaultWrap = {
    val __obj = js.Dynamic.literal(allowByDefault = allowByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowByDefaultWrap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowByDefaultWrap] (val x: Self) extends AnyVal {
    
    inline def setAllowByDefault(value: AllowByDefault): Self = StObject.set(x, "allowByDefault", value.asInstanceOf[js.Any])
  }
}
