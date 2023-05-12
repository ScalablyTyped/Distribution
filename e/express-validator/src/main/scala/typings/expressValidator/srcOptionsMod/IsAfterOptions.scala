package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAfterOptions extends StObject {
  
  var comparisonDate: js.UndefOr[String] = js.undefined
}
object IsAfterOptions {
  
  inline def apply(): IsAfterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsAfterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsAfterOptions] (val x: Self) extends AnyVal {
    
    inline def setComparisonDate(value: String): Self = StObject.set(x, "comparisonDate", value.asInstanceOf[js.Any])
    
    inline def setComparisonDateUndefined: Self = StObject.set(x, "comparisonDate", js.undefined)
  }
}
