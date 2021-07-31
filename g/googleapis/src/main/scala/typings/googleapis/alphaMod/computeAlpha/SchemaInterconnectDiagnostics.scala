package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Diagnostics information about interconnect, contains detailed and current
  * technical information about Google?s side of the connection.
  */
trait SchemaInterconnectDiagnostics extends StObject {
  
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing individual
    * neighbors currently seen by the Google router in the ARP cache for the
    * Interconnect. This will be empty when the Interconnect is not bundled.
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.undefined
  
  /**
    * A list of InterconnectDiagnostics.LinkStatus objects, describing the
    * status for each link on the Interconnect.
    */
  var links: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsLinkStatus]] = js.undefined
  
  /**
    * The MAC address of the Interconnect&#39;s bundle interface.
    */
  var macAddress: js.UndefOr[String] = js.undefined
}
object SchemaInterconnectDiagnostics {
  
  @scala.inline
  def apply(): SchemaInterconnectDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsMutableBuilder[Self <: SchemaInterconnectDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArpCaches(value: js.Array[SchemaInterconnectDiagnosticsARPEntry]): Self = StObject.set(x, "arpCaches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArpCachesUndefined: Self = StObject.set(x, "arpCaches", js.undefined)
    
    @scala.inline
    def setArpCachesVarargs(value: SchemaInterconnectDiagnosticsARPEntry*): Self = StObject.set(x, "arpCaches", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[SchemaInterconnectDiagnosticsLinkStatus]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: SchemaInterconnectDiagnosticsLinkStatus*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
