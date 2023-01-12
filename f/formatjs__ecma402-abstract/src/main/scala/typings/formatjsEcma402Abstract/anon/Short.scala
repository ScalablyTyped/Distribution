package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.libTypesDateTimeMod.EraData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Short extends StObject {
  
  var long: EraData
  
  var narrow: EraData
  
  var short: EraData
}
object Short {
  
  inline def apply(long: EraData, narrow: EraData, short: EraData): Short = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Short]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Short] (val x: Self) extends AnyVal {
    
    inline def setLong(value: EraData): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: EraData): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: EraData): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
