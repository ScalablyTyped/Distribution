package typings.expressValidator

import typings.expressValidator.srcBaseMod.CustomSanitizer
import typings.expressValidator.srcOptionsMod.NormalizeEmailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainSanitizersMod {
  
  @js.native
  trait Sanitizers[Return] extends StObject {
    
    /**
      * Replaces the value of the field if it's one of `''`, `null`, `undefined` or `NaN`.
      *
      * @param default_value the value to replace with
      * @returns the current validation chain
      */
    def default(default_value: Any): Return = js.native
    
    def blacklist(chars: String): Return = js.native
    
    /**
      * Adds a custom sanitizer to the validation chain.
      *
      * @param sanitizer the custom sanitizer
      * @returns the current validation chain
      */
    def customSanitizer(sanitizer: CustomSanitizer): Return = js.native
    
    def escape(): Return = js.native
    
    def ltrim(): Return = js.native
    def ltrim(chars: String): Return = js.native
    
    def normalizeEmail(): Return = js.native
    def normalizeEmail(options: NormalizeEmailOptions): Return = js.native
    
    /**
      * Replaces a field's value with another value.
      *
      * @param values_to_replace one or more values that should be replaced
      * @param new_value the value to replace with
      * @returns the current validation chain
      */
    def replace(values_to_replace: Any, new_value: Any): Return = js.native
    
    def rtrim(): Return = js.native
    def rtrim(chars: String): Return = js.native
    
    def stripLow(): Return = js.native
    def stripLow(keep_new_lines: Boolean): Return = js.native
    
    def toArray(): Return = js.native
    
    def toBoolean(): Return = js.native
    def toBoolean(strict: Boolean): Return = js.native
    
    def toDate(): Return = js.native
    
    def toFloat(): Return = js.native
    
    def toInt(): Return = js.native
    def toInt(radix: Double): Return = js.native
    
    def toLowerCase(): Return = js.native
    
    def toUpperCase(): Return = js.native
    
    def trim(): Return = js.native
    def trim(chars: String): Return = js.native
    
    def unescape(): Return = js.native
    
    def whitelist(chars: String): Return = js.native
  }
}
