package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def getInternalSlots(rtf: RelativeTimeFormat): RelativeTimeFormatInternal
}
object `2` {
  
  inline def apply(getInternalSlots: RelativeTimeFormat => RelativeTimeFormatInternal): `2` = {
    val __obj = js.Dynamic.literal(getInternalSlots = js.Any.fromFunction1(getInternalSlots))
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setGetInternalSlots(value: RelativeTimeFormat => RelativeTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
  }
}
