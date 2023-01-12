package typings.fastLevenshtein

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-levenshtein", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(str1: String, str2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(str1.asInstanceOf[js.Any], str2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def get(str1: String, str2: String, opts: LevenshteinOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(str1.asInstanceOf[js.Any], str2.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait LevenshteinOptions extends StObject {
    
    var useCollator: js.UndefOr[Boolean] = js.undefined
  }
  object LevenshteinOptions {
    
    inline def apply(): LevenshteinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevenshteinOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LevenshteinOptions] (val x: Self) extends AnyVal {
      
      inline def setUseCollator(value: Boolean): Self = StObject.set(x, "useCollator", value.asInstanceOf[js.Any])
      
      inline def setUseCollatorUndefined: Self = StObject.set(x, "useCollator", js.undefined)
    }
  }
}
