package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Standard extends StObject {
  
  var long: RecordDecimalFormatNumLDM
  
  var short: RecordDecimalFormatNumLDM
  
  var standard: String
}
object Standard {
  
  inline def apply(long: RecordDecimalFormatNumLDM, short: RecordDecimalFormatNumLDM, standard: String): Standard = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
    
    inline def setLong(value: RecordDecimalFormatNumLDM): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setShort(value: RecordDecimalFormatNumLDM): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
