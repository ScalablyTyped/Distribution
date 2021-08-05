package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatInternal
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInternalSlots extends StObject {
  
  def getInternalSlots(nf: NumberFormat): NumberFormatInternal
}
object GetInternalSlots {
  
  inline def apply(getInternalSlots: NumberFormat => NumberFormatInternal): GetInternalSlots = {
    val __obj = js.Dynamic.literal(getInternalSlots = js.Any.fromFunction1(getInternalSlots))
    __obj.asInstanceOf[GetInternalSlots]
  }
  
  extension [Self <: GetInternalSlots](x: Self) {
    
    inline def setGetInternalSlots(value: NumberFormat => NumberFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
  }
}
