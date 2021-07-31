package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.numberMod.NumberFormatInternal
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def getInternalSlots(nf: NumberFormat): NumberFormatInternal
}
object `1` {
  
  @scala.inline
  def apply(getInternalSlots: NumberFormat => NumberFormatInternal): `1` = {
    val __obj = js.Dynamic.literal(getInternalSlots = js.Any.fromFunction1(getInternalSlots))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInternalSlots(value: NumberFormat => NumberFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
  }
}
