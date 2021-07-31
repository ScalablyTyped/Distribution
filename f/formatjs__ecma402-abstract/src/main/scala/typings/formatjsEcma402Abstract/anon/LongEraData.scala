package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDateTimeMod.EraData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongEraData extends StObject {
  
  var long: EraData
  
  var narrow: EraData
  
  var short: EraData
}
object LongEraData {
  
  @scala.inline
  def apply(long: EraData, narrow: EraData, short: EraData): LongEraData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongEraData]
  }
  
  @scala.inline
  implicit class LongEraDataMutableBuilder[Self <: LongEraData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: EraData): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: EraData): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: EraData): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
