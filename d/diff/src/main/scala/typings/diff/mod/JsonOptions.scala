package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonOptions
  extends StObject
     with LinesOptions {
  
  /**
    * Replacer used to stringify the properties of the passed objects.
    */
  var stringifyReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
  
  /**
    * The value to use when `undefined` values in the passed objects are encountered during stringification.
    * Will only be used if `stringifyReplacer` option wasn't specified.
    * @default undefined
    */
  var undefinedReplacement: js.UndefOr[js.Any] = js.undefined
}
object JsonOptions {
  
  inline def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  
  extension [Self <: JsonOptions](x: Self) {
    
    inline def setStringifyReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "stringifyReplacer", js.Any.fromFunction2(value))
    
    inline def setStringifyReplacerUndefined: Self = StObject.set(x, "stringifyReplacer", js.undefined)
    
    inline def setUndefinedReplacement(value: js.Any): Self = StObject.set(x, "undefinedReplacement", value.asInstanceOf[js.Any])
    
    inline def setUndefinedReplacementUndefined: Self = StObject.set(x, "undefinedReplacement", js.undefined)
  }
}
