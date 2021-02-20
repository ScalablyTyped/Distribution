package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongShort extends StObject {
  
  var long: RecordDecimalFormatNumLDM1000 = js.native
  
  var short: RecordDecimalFormatNumLDM1000 = js.native
  
  var standard: String = js.native
}
object LongShort {
  
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM1000, short: RecordDecimalFormatNumLDM1000, standard: String): LongShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongShort]
  }
  
  @scala.inline
  implicit class LongShortMutableBuilder[Self <: LongShort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: RecordDecimalFormatNumLDM1000): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: RecordDecimalFormatNumLDM1000): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
