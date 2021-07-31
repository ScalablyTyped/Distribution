package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectDiagnosticsLinkStatus extends StObject {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP
    * neighbor entries seen on this link. This will be empty if the link is
    * bundled
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.undefined
  
  /**
    * The unique ID for this link assigned during turn up by Google.
    */
  var circuitId: js.UndefOr[String] = js.undefined
  
  /**
    * The Demarc address assigned by Google and provided in the LoA.
    */
  var googleDemarc: js.UndefOr[String] = js.undefined
  
  var lacpStatus: js.UndefOr[SchemaInterconnectDiagnosticsLinkLACPStatus] = js.undefined
  
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the
    * current value and status of the received light level.
    */
  var receivingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.undefined
  
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the
    * current value and status of the transmitted light level.
    */
  var transmittingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.undefined
}
object SchemaInterconnectDiagnosticsLinkStatus {
  
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkStatus]
  }
  
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsLinkStatusMutableBuilder[Self <: SchemaInterconnectDiagnosticsLinkStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArpCaches(value: js.Array[SchemaInterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    @scala.inline
    def setArpCachesVarargs(value: SchemaInterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value :_*))
    
    @scala.inline
    def setCircuitId(value: String): Self = StObject.set(x, "circuitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircuitIdUndefined: Self = StObject.set(x, "circuitId", js.undefined)
    
    @scala.inline
    def setGoogleDemarc(value: String): Self = StObject.set(x, "googleDemarc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleDemarcUndefined: Self = StObject.set(x, "googleDemarc", js.undefined)
    
    @scala.inline
    def setLacpStatus(value: SchemaInterconnectDiagnosticsLinkLACPStatus): Self = StObject.set(x, "lacpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLacpStatusUndefined: Self = StObject.set(x, "lacpStatus", js.undefined)
    
    @scala.inline
    def setReceivingOpticalPower(value: SchemaInterconnectDiagnosticsLinkOpticalPower): Self = StObject.set(x, "receivingOpticalPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivingOpticalPowerUndefined: Self = StObject.set(x, "receivingOpticalPower", js.undefined)
    
    @scala.inline
    def setTransmittingOpticalPower(value: SchemaInterconnectDiagnosticsLinkOpticalPower): Self = StObject.set(x, "transmittingOpticalPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmittingOpticalPowerUndefined: Self = StObject.set(x, "transmittingOpticalPower", js.undefined)
  }
}
