package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePacketmirroringsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the PacketMirroring resource to return.
    */
  var packetMirroring: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourcePacketmirroringsGet {
  
  inline def apply(): ParamsResourcePacketmirroringsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePacketmirroringsGet]
  }
  
  extension [Self <: ParamsResourcePacketmirroringsGet](x: Self) {
    
    inline def setPacketMirroring(value: String): Self = StObject.set(x, "packetMirroring", value.asInstanceOf[js.Any])
    
    inline def setPacketMirroringUndefined: Self = StObject.set(x, "packetMirroring", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
