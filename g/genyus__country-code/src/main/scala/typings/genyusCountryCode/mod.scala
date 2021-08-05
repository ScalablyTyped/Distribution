package typings.genyusCountryCode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@genyus/country-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(opts: Options): js.UndefOr[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(opts.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Country]]
  
  inline def nameIncludes(name: String): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("nameIncludes")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  inline def nameIncludes(name: String, opts: Options): js.Array[Country] = (^.asInstanceOf[js.Dynamic].applyDynamic("nameIncludes")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country]]
  
  trait Country extends StObject {
    
    val alpha2: String
    
    val alpha3: String
    
    var isoNumeric: String
    
    val name: String
  }
  object Country {
    
    inline def apply(alpha2: String, alpha3: String, isoNumeric: String, name: String): Country = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], isoNumeric = isoNumeric.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      inline def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      inline def setIsoNumeric(value: String): Self = StObject.set(x, "isoNumeric", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * number from 0 - 1, a percentage of accuracy for the search
      * @default 1
      */
    var accuracy: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
