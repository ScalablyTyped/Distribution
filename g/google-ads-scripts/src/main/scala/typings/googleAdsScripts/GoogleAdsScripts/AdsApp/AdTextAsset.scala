package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Text asset with an optional pinning. */
trait AdTextAsset extends StObject {
  
  /** The (possibly null) pinned location for this asset. */
  var pinning: js.UndefOr[String] = js.undefined
  
  /** The text of this asset (e.g. "headline"). */
  var text: String
}
object AdTextAsset {
  
  inline def apply(text: String): AdTextAsset = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdTextAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdTextAsset] (val x: Self) extends AnyVal {
    
    inline def setPinning(value: String): Self = StObject.set(x, "pinning", value.asInstanceOf[js.Any])
    
    inline def setPinningUndefined: Self = StObject.set(x, "pinning", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
