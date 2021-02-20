package typings.franc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("franc", JSImport.Namespace)
  @js.native
  def apply(text: String): ISO6393 = js.native
  @JSImport("franc", JSImport.Namespace)
  @js.native
  def apply(text: String, options: Options): ISO6393 = js.native
  
  @JSImport("franc", "all")
  @js.native
  def all(text: String): js.Tuple2[ISO6393, Double] = js.native
  @JSImport("franc", "all")
  @js.native
  def all(text: String, options: Options): js.Tuple2[ISO6393, Double] = js.native
  
  // Range [0, 1]
  type Confidence = Double
  
  type ISO6393 = String
  
  @js.native
  trait Options extends StObject {
    
    var blacklist: js.UndefOr[js.Array[ISO6393]] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var only: js.UndefOr[js.Array[String]] = js.native
    
    var whitelist: js.UndefOr[js.Array[ISO6393]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[ISO6393]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: ISO6393*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setOnly(value: js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      @scala.inline
      def setWhitelist(value: js.Array[ISO6393]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: ISO6393*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
