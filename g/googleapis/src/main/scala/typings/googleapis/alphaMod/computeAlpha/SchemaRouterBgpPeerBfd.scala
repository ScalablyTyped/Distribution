package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterBgpPeerBfd extends StObject {
  
  /**
    * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
    */
  var minReceiveInterval: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
    */
  var minTransmitInterval: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
    */
  var multiplier: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The BFD packet mode for this BGP peer. If set to CONTROL_AND_ECHO, BFD echo mode is enabled for this BGP peer. In this mode, if the peer router also has BFD echo mode enabled, BFD echo packets will be sent to the other router. If the peer router does not have BFD echo mode enabled, only control packets will be sent. If set to CONTROL_ONLY, BFD echo mode is disabled for this BGP peer. If this router and the peer router have a multihop connection, this should be set to CONTROL_ONLY as BFD echo mode is only supported on singlehop connections. The default is CONTROL_AND_ECHO.
    */
  var packetMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
    */
  var sessionInitializationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum interval, in milliseconds, between BFD control packets transmitted to and received from the peer router when BFD echo mode is enabled on both routers. The actual transmit and receive intervals are negotiated between the two routers and are equal to the greater of this value and the corresponding interval on the other router. If set, this value must be between 1000 and 30000. The default is 5000.
    */
  var slowTimerInterval: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRouterBgpPeerBfd {
  
  inline def apply(): SchemaRouterBgpPeerBfd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeerBfd]
  }
  
  extension [Self <: SchemaRouterBgpPeerBfd](x: Self) {
    
    inline def setMinReceiveInterval(value: Double): Self = StObject.set(x, "minReceiveInterval", value.asInstanceOf[js.Any])
    
    inline def setMinReceiveIntervalNull: Self = StObject.set(x, "minReceiveInterval", null)
    
    inline def setMinReceiveIntervalUndefined: Self = StObject.set(x, "minReceiveInterval", js.undefined)
    
    inline def setMinTransmitInterval(value: Double): Self = StObject.set(x, "minTransmitInterval", value.asInstanceOf[js.Any])
    
    inline def setMinTransmitIntervalNull: Self = StObject.set(x, "minTransmitInterval", null)
    
    inline def setMinTransmitIntervalUndefined: Self = StObject.set(x, "minTransmitInterval", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierNull: Self = StObject.set(x, "multiplier", null)
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setPacketMode(value: String): Self = StObject.set(x, "packetMode", value.asInstanceOf[js.Any])
    
    inline def setPacketModeNull: Self = StObject.set(x, "packetMode", null)
    
    inline def setPacketModeUndefined: Self = StObject.set(x, "packetMode", js.undefined)
    
    inline def setSessionInitializationMode(value: String): Self = StObject.set(x, "sessionInitializationMode", value.asInstanceOf[js.Any])
    
    inline def setSessionInitializationModeNull: Self = StObject.set(x, "sessionInitializationMode", null)
    
    inline def setSessionInitializationModeUndefined: Self = StObject.set(x, "sessionInitializationMode", js.undefined)
    
    inline def setSlowTimerInterval(value: Double): Self = StObject.set(x, "slowTimerInterval", value.asInstanceOf[js.Any])
    
    inline def setSlowTimerIntervalNull: Self = StObject.set(x, "slowTimerInterval", null)
    
    inline def setSlowTimerIntervalUndefined: Self = StObject.set(x, "slowTimerInterval", js.undefined)
  }
}
