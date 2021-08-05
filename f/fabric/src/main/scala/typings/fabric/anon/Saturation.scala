package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Saturation extends StObject {
  
  var saturation: js.UndefOr[Double] = js.undefined
}
object Saturation {
  
  inline def apply(): Saturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Saturation]
  }
  
  extension [Self <: Saturation](x: Self) {
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
  }
}
