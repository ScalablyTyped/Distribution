package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAckInfo extends StObject {
  
  /**
    * Output only. Number of meeting devices that have not acked yet.
    */
  var unackedDeviceCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. IDs of meeting devices (at most ten are provided) that have not acked yet.
    */
  var unackedDeviceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAckInfo {
  
  inline def apply(): SchemaAckInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAckInfo]
  }
  
  extension [Self <: SchemaAckInfo](x: Self) {
    
    inline def setUnackedDeviceCount(value: Double): Self = StObject.set(x, "unackedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnackedDeviceCountNull: Self = StObject.set(x, "unackedDeviceCount", null)
    
    inline def setUnackedDeviceCountUndefined: Self = StObject.set(x, "unackedDeviceCount", js.undefined)
    
    inline def setUnackedDeviceIds(value: js.Array[String]): Self = StObject.set(x, "unackedDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setUnackedDeviceIdsNull: Self = StObject.set(x, "unackedDeviceIds", null)
    
    inline def setUnackedDeviceIdsUndefined: Self = StObject.set(x, "unackedDeviceIds", js.undefined)
    
    inline def setUnackedDeviceIdsVarargs(value: String*): Self = StObject.set(x, "unackedDeviceIds", js.Array(value*))
  }
}
