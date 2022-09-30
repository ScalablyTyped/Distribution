package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftypes extends StObject {
  
  /** Basic type wire types. */
  val basic: Typeofbasic
  
  /** Basic type defaults. */
  val defaults: Typeofdefaults
  
  /** Basic long type wire types. */
  val long: Typeoflong
  
  /** Allowed types for map keys with their associated wire type. */
  val mapKey: TypeofmapKey
  
  /** Allowed types for packed repeated fields with their associated wire type. */
  val packed: Typeofpacked
}
object Typeoftypes {
  
  inline def apply(
    basic: Typeofbasic,
    defaults: Typeofdefaults,
    long: Typeoflong,
    mapKey: TypeofmapKey,
    packed: Typeofpacked
  ): Typeoftypes = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], mapKey = mapKey.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftypes]
  }
  
  extension [Self <: Typeoftypes](x: Self) {
    
    inline def setBasic(value: Typeofbasic): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: Typeofdefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setLong(value: Typeoflong): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setMapKey(value: TypeofmapKey): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: Typeofpacked): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
  }
}
