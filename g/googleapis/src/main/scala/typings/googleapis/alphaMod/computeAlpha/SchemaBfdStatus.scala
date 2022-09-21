package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBfdStatus extends StObject {
  
  /**
    * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer.
    */
  var bfdSessionInitializationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unix timestamp of the most recent config update.
    */
  var configUpdateTimestampMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Control packet counts for the current BFD session.
    */
  var controlPacketCounts: js.UndefOr[SchemaBfdStatusPacketCounts] = js.undefined
  
  /**
    * Inter-packet time interval statistics for control packets.
    */
  var controlPacketIntervals: js.UndefOr[js.Array[SchemaPacketIntervals]] = js.undefined
  
  /**
    * Echo packet counts for the current BFD session.
    */
  var echoPacketCounts: js.UndefOr[SchemaBfdStatusPacketCounts] = js.undefined
  
  /**
    * Inter-packet time interval statistics for echo packets.
    */
  var echoPacketIntervals: js.UndefOr[js.Array[SchemaPacketIntervals]] = js.undefined
  
  /**
    * The diagnostic code specifies the local system's reason for the last change in session state. This allows remote systems to determine the reason that the previous session failed, for example. These diagnostic codes are specified in section 4.1 of RFC5880
    */
  var localDiagnostic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current BFD session state as seen by the transmitting system. These states are specified in section 4.1 of RFC5880
    */
  var localState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Negotiated transmit interval for control packets.
    */
  var negotiatedLocalControlTxIntervalMs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Negotiated transmit interval for echo packets.
    */
  var negotiatedLocalEchoTxIntervalMs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The most recent Rx control packet for this BFD session.
    */
  var rxPacket: js.UndefOr[SchemaBfdPacket] = js.undefined
  
  /**
    * The most recent Tx control packet for this BFD session.
    */
  var txPacket: js.UndefOr[SchemaBfdPacket] = js.undefined
  
  /**
    * Session uptime in milliseconds. Value will be 0 if session is not up.
    */
  var uptimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if echo mode is currently being used.
    */
  var usingEchoMode: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaBfdStatus {
  
  inline def apply(): SchemaBfdStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBfdStatus]
  }
  
  extension [Self <: SchemaBfdStatus](x: Self) {
    
    inline def setBfdSessionInitializationMode(value: String): Self = StObject.set(x, "bfdSessionInitializationMode", value.asInstanceOf[js.Any])
    
    inline def setBfdSessionInitializationModeNull: Self = StObject.set(x, "bfdSessionInitializationMode", null)
    
    inline def setBfdSessionInitializationModeUndefined: Self = StObject.set(x, "bfdSessionInitializationMode", js.undefined)
    
    inline def setConfigUpdateTimestampMicros(value: String): Self = StObject.set(x, "configUpdateTimestampMicros", value.asInstanceOf[js.Any])
    
    inline def setConfigUpdateTimestampMicrosNull: Self = StObject.set(x, "configUpdateTimestampMicros", null)
    
    inline def setConfigUpdateTimestampMicrosUndefined: Self = StObject.set(x, "configUpdateTimestampMicros", js.undefined)
    
    inline def setControlPacketCounts(value: SchemaBfdStatusPacketCounts): Self = StObject.set(x, "controlPacketCounts", value.asInstanceOf[js.Any])
    
    inline def setControlPacketCountsUndefined: Self = StObject.set(x, "controlPacketCounts", js.undefined)
    
    inline def setControlPacketIntervals(value: js.Array[SchemaPacketIntervals]): Self = StObject.set(x, "controlPacketIntervals", value.asInstanceOf[js.Any])
    
    inline def setControlPacketIntervalsUndefined: Self = StObject.set(x, "controlPacketIntervals", js.undefined)
    
    inline def setControlPacketIntervalsVarargs(value: SchemaPacketIntervals*): Self = StObject.set(x, "controlPacketIntervals", js.Array(value*))
    
    inline def setEchoPacketCounts(value: SchemaBfdStatusPacketCounts): Self = StObject.set(x, "echoPacketCounts", value.asInstanceOf[js.Any])
    
    inline def setEchoPacketCountsUndefined: Self = StObject.set(x, "echoPacketCounts", js.undefined)
    
    inline def setEchoPacketIntervals(value: js.Array[SchemaPacketIntervals]): Self = StObject.set(x, "echoPacketIntervals", value.asInstanceOf[js.Any])
    
    inline def setEchoPacketIntervalsUndefined: Self = StObject.set(x, "echoPacketIntervals", js.undefined)
    
    inline def setEchoPacketIntervalsVarargs(value: SchemaPacketIntervals*): Self = StObject.set(x, "echoPacketIntervals", js.Array(value*))
    
    inline def setLocalDiagnostic(value: String): Self = StObject.set(x, "localDiagnostic", value.asInstanceOf[js.Any])
    
    inline def setLocalDiagnosticNull: Self = StObject.set(x, "localDiagnostic", null)
    
    inline def setLocalDiagnosticUndefined: Self = StObject.set(x, "localDiagnostic", js.undefined)
    
    inline def setLocalState(value: String): Self = StObject.set(x, "localState", value.asInstanceOf[js.Any])
    
    inline def setLocalStateNull: Self = StObject.set(x, "localState", null)
    
    inline def setLocalStateUndefined: Self = StObject.set(x, "localState", js.undefined)
    
    inline def setNegotiatedLocalControlTxIntervalMs(value: Double): Self = StObject.set(x, "negotiatedLocalControlTxIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setNegotiatedLocalControlTxIntervalMsNull: Self = StObject.set(x, "negotiatedLocalControlTxIntervalMs", null)
    
    inline def setNegotiatedLocalControlTxIntervalMsUndefined: Self = StObject.set(x, "negotiatedLocalControlTxIntervalMs", js.undefined)
    
    inline def setNegotiatedLocalEchoTxIntervalMs(value: Double): Self = StObject.set(x, "negotiatedLocalEchoTxIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setNegotiatedLocalEchoTxIntervalMsNull: Self = StObject.set(x, "negotiatedLocalEchoTxIntervalMs", null)
    
    inline def setNegotiatedLocalEchoTxIntervalMsUndefined: Self = StObject.set(x, "negotiatedLocalEchoTxIntervalMs", js.undefined)
    
    inline def setRxPacket(value: SchemaBfdPacket): Self = StObject.set(x, "rxPacket", value.asInstanceOf[js.Any])
    
    inline def setRxPacketUndefined: Self = StObject.set(x, "rxPacket", js.undefined)
    
    inline def setTxPacket(value: SchemaBfdPacket): Self = StObject.set(x, "txPacket", value.asInstanceOf[js.Any])
    
    inline def setTxPacketUndefined: Self = StObject.set(x, "txPacket", js.undefined)
    
    inline def setUptimeMs(value: String): Self = StObject.set(x, "uptimeMs", value.asInstanceOf[js.Any])
    
    inline def setUptimeMsNull: Self = StObject.set(x, "uptimeMs", null)
    
    inline def setUptimeMsUndefined: Self = StObject.set(x, "uptimeMs", js.undefined)
    
    inline def setUsingEchoMode(value: Boolean): Self = StObject.set(x, "usingEchoMode", value.asInstanceOf[js.Any])
    
    inline def setUsingEchoModeNull: Self = StObject.set(x, "usingEchoMode", null)
    
    inline def setUsingEchoModeUndefined: Self = StObject.set(x, "usingEchoMode", js.undefined)
  }
}
