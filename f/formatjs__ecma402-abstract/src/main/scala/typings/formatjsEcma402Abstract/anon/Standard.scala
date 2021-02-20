package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Standard extends StObject {
  
  var long: RecordDecimalFormatNumLDM = js.native
  
  var short: RecordDecimalFormatNumLDM = js.native
  
  var standard: String = js.native
}
object Standard {
  
  @scala.inline
  def apply(long: RecordDecimalFormatNumLDM, short: RecordDecimalFormatNumLDM, standard: String): Standard = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  
  @scala.inline
  implicit class StandardMutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: RecordDecimalFormatNumLDM): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: RecordDecimalFormatNumLDM): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
