package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines Open Location Codes or &quot;<a href="https://plus.codes/">plus
  * codes</a>&quot; for a Place. Plus codes can be used as a replacement for
  * street addresses in places where they do not exist (where buildings are not
  * numbered or streets are not named).
  */
trait PlacePlusCode extends StObject {
  
  /**
    * A <a href="https://plus.codes/">plus code</a> with a 1/8000th of a degree
    * by 1/8000th of a degree area where the first four characters (the area
    * code) are dropped and replaced with a locality description. For example,
    * <code>"9G8F+5W Zurich, Switzerland"</code>. If no suitable locality that
    * can be found to shorten the code then this field is omitted.
    */
  var compound_code: js.UndefOr[String] = js.undefined
  
  /**
    * A <a href="https://plus.codes/">plus code</a> with a 1/8000th of a degree
    * by 1/8000th of a degree area. For example, <code>"8FVC9G8F+5W"</code>.
    */
  var global_code: String
}
object PlacePlusCode {
  
  inline def apply(global_code: String): PlacePlusCode = {
    val __obj = js.Dynamic.literal(global_code = global_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePlusCode]
  }
  
  extension [Self <: PlacePlusCode](x: Self) {
    
    inline def setCompound_code(value: String): Self = StObject.set(x, "compound_code", value.asInstanceOf[js.Any])
    
    inline def setCompound_codeUndefined: Self = StObject.set(x, "compound_code", js.undefined)
    
    inline def setGlobal_code(value: String): Self = StObject.set(x, "global_code", value.asInstanceOf[js.Any])
  }
}
