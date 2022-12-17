package typings.formatjsIcuMessageformatParser.libTypesMod

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedNumberFormatOptions
  extends StObject
     with NumberFormatOptions {
  
  var scale: js.UndefOr[Double] = js.undefined
}
object ExtendedNumberFormatOptions {
  
  inline def apply(): ExtendedNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedNumberFormatOptions]
  }
  
  extension [Self <: ExtendedNumberFormatOptions](x: Self) {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
