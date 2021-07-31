package typings.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatDigitOptions because var conflicts: maximumFractionDigits, maximumSignificantDigits, minimumFractionDigits, minimumIntegerDigits, minimumSignificantDigits. Inlined  */ trait NumberFormatOptions
  extends StObject
     with typings.std.Intl.NumberFormatOptions {
  
  var numberingSystem: js.UndefOr[String] = js.undefined
}
object NumberFormatOptions {
  
  @scala.inline
  def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  
  @scala.inline
  implicit class NumberFormatOptionsMutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
  }
}
