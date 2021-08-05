package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormatInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def getInternalSlots(rtf: RelativeTimeFormat): RelativeTimeFormatInternal
}
object `0` {
  
  inline def apply(getInternalSlots: RelativeTimeFormat => RelativeTimeFormatInternal): `0` = {
    val __obj = js.Dynamic.literal(getInternalSlots = js.Any.fromFunction1(getInternalSlots))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setGetInternalSlots(value: RelativeTimeFormat => RelativeTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
  }
}
