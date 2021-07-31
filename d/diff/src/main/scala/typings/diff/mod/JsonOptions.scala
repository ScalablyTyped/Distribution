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
  
  @scala.inline
  def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  
  @scala.inline
  implicit class JsonOptionsMutableBuilder[Self <: JsonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStringifyReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "stringifyReplacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStringifyReplacerUndefined: Self = StObject.set(x, "stringifyReplacer", js.undefined)
    
    @scala.inline
    def setUndefinedReplacement(value: js.Any): Self = StObject.set(x, "undefinedReplacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedReplacementUndefined: Self = StObject.set(x, "undefinedReplacement", js.undefined)
  }
}
