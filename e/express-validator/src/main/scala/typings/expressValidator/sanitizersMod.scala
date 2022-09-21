package typings.expressValidator

import typings.expressValidator.baseMod.CustomSanitizer
import typings.expressValidator.optionsMod.NormalizeEmailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizersMod {
  
  @js.native
  trait Sanitizers[Return] extends StObject {
    
    def default(default_value: Any): Return = js.native
    
    def blacklist(chars: String): Return = js.native
    
    def customSanitizer(sanitizer: CustomSanitizer): Return = js.native
    
    def escape(): Return = js.native
    
    def ltrim(): Return = js.native
    def ltrim(chars: String): Return = js.native
    
    def normalizeEmail(): Return = js.native
    def normalizeEmail(options: NormalizeEmailOptions): Return = js.native
    
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
