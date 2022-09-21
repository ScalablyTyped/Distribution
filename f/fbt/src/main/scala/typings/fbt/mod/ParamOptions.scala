package typings.fbt.mod

import typings.fbt.fbtBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamOptions extends StObject {
  
  /**
    * `IntlVariations.GENDER_*` Pass the gender of the parameter for correctly variated text.
    */
  var gender: js.UndefOr[IntlVariationsGender] = js.undefined
  
  /**
    * Passing a value of type `number` into the `number` option uses that value as the input for which we determine the [CLDR plural value](http://cldr.unicode.org/index/cldr-spec/plural-rules).
    * You can pass `true` to simply use the parameter value (the same value that replaces the token).
    */
  var number: js.UndefOr[Double | `true`] = js.undefined
}
object ParamOptions {
  
  inline def apply(): ParamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamOptions]
  }
  
  extension [Self <: ParamOptions](x: Self) {
    
    inline def setGender(value: IntlVariationsGender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setNumber(value: Double | `true`): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
