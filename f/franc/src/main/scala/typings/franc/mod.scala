package typings.franc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): ISO6393 = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[ISO6393]
  inline def apply(text: String, options: Options): ISO6393 = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISO6393]
  
  @JSImport("franc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(text: String): js.Tuple2[ISO6393, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(text.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ISO6393, Double]]
  inline def all(text: String, options: Options): js.Tuple2[ISO6393, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ISO6393, Double]]
  
  // Range [0, 1]
  type Confidence = Double
  
  type ISO6393 = String
  
  trait Options extends StObject {
    
    var blacklist: js.UndefOr[js.Array[ISO6393]] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var only: js.UndefOr[js.Array[String]] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[ISO6393]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlacklist(value: js.Array[ISO6393]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: ISO6393*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOnly(value: js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      inline def setWhitelist(value: js.Array[ISO6393]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: ISO6393*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
