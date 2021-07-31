package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Load balancing specific fields for network endpoint group.
  */
trait SchemaNetworkEndpointGroupLbNetworkEndpointGroup extends StObject {
  
  /**
    * The default port used if the port number is not specified in the network
    * endpoint. [Deprecated] This field is deprecated.
    */
  var defaultPort: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL of the network to which all network endpoints in the NEG belong.
    * Uses &quot;default&quot; project network if unspecified. [Deprecated]
    * This field is deprecated.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG
    * belong. [Deprecated] This field is deprecated.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The URL of the zone where the network endpoint group is
    * located. [Deprecated] This field is deprecated.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaNetworkEndpointGroupLbNetworkEndpointGroup {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupLbNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupLbNetworkEndpointGroup]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointGroupLbNetworkEndpointGroupMutableBuilder[Self <: SchemaNetworkEndpointGroupLbNetworkEndpointGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPort(value: Double): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
