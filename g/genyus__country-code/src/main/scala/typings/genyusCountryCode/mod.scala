package typings.genyusCountryCode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@genyus/country-code", "find")
  @js.native
  def find(opts: Options): js.UndefOr[Country] = js.native
  
  @JSImport("@genyus/country-code", "nameIncludes")
  @js.native
  def nameIncludes(name: String): js.Array[Country] = js.native
  @JSImport("@genyus/country-code", "nameIncludes")
  @js.native
  def nameIncludes(name: String, opts: Options): js.Array[Country] = js.native
  
  @js.native
  trait Country extends StObject {
    
    val alpha2: String = js.native
    
    val alpha3: String = js.native
    
    var isoNumeric: String = js.native
    
    val name: String = js.native
  }
  object Country {
    
    @scala.inline
    def apply(alpha2: String, alpha3: String, isoNumeric: String, name: String): Country = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], isoNumeric = isoNumeric.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsoNumeric(value: String): Self = StObject.set(x, "isoNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * number from 0 - 1, a percentage of accuracy for the search
      * @default 1
      */
    var accuracy: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
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
      def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
