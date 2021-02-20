package typings.fastLevenshtein

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-levenshtein", "get")
  @js.native
  def get(str1: String, str2: String): Double = js.native
  @JSImport("fast-levenshtein", "get")
  @js.native
  def get(str1: String, str2: String, opts: LevenshteinOptions): Double = js.native
  
  @js.native
  trait LevenshteinOptions extends StObject {
    
    var useCollator: js.UndefOr[Boolean] = js.native
  }
  object LevenshteinOptions {
    
    @scala.inline
    def apply(): LevenshteinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevenshteinOptions]
    }
    
    @scala.inline
    implicit class LevenshteinOptionsMutableBuilder[Self <: LevenshteinOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseCollator(value: Boolean): Self = StObject.set(x, "useCollator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCollatorUndefined: Self = StObject.set(x, "useCollator", js.undefined)
    }
  }
}
