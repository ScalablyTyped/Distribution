package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A plain JavaScript object describing a location. */
trait TargetedLocationObject extends StObject {
  
  var bidModifier: js.UndefOr[Double] = js.undefined
  
  var id: Double
}
object TargetedLocationObject {
  
  inline def apply(id: Double): TargetedLocationObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedLocationObject]
  }
  
  extension [Self <: TargetedLocationObject](x: Self) {
    
    inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
