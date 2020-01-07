package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute Engine API
  *
  * Creates and runs virtual machines on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const compute = google.compute('alpha');
  *
  * @namespace compute
  * @type {Function}
  * @version alpha
  * @variation alpha
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Compute")
@js.native
class Compute protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var acceleratorTypes: Resource$Acceleratortypes = js.native
  var addresses: Resource$Addresses = js.native
  var autoscalers: Resource$Autoscalers = js.native
  var backendBuckets: Resource$Backendbuckets = js.native
  var backendServices: Resource$Backendservices = js.native
  var context: APIRequestContext = js.native
  var diskTypes: Resource$Disktypes = js.native
  var disks: Resource$Disks = js.native
  var externalVpnGateways: Resource$Externalvpngateways = js.native
  var firewalls: Resource$Firewalls = js.native
  var forwardingRules: Resource$Forwardingrules = js.native
  var globalAddresses: Resource$Globaladdresses = js.native
  var globalForwardingRules: Resource$Globalforwardingrules = js.native
  var globalOperations: Resource$Globaloperations = js.native
  var globalOrganizationOperations: Resource$Globalorganizationoperations = js.native
  var healthChecks: Resource$Healthchecks = js.native
  var httpHealthChecks: Resource$Httphealthchecks = js.native
  var httpsHealthChecks: Resource$Httpshealthchecks = js.native
  var images: Resource$Images = js.native
  var instanceGroupManagers: Resource$Instancegroupmanagers = js.native
  var instanceGroups: Resource$Instancegroups = js.native
  var instanceTemplates: Resource$Instancetemplates = js.native
  var instances: Resource$Instances = js.native
  var interconnectAttachments: Resource$Interconnectattachments = js.native
  var interconnectLocations: Resource$Interconnectlocations = js.native
  var interconnects: Resource$Interconnects = js.native
  var licenseCodes: Resource$Licensecodes = js.native
  var licenses: Resource$Licenses = js.native
  var machineImages: Resource$Machineimages = js.native
  var machineTypes: Resource$Machinetypes = js.native
  var networkEndpointGroups: Resource$Networkendpointgroups = js.native
  var networks: Resource$Networks = js.native
  var nodeGroups: Resource$Nodegroups = js.native
  var nodeTemplates: Resource$Nodetemplates = js.native
  var nodeTypes: Resource$Nodetypes = js.native
  var organizationSecurityPolicies: Resource$Organizationsecuritypolicies = js.native
  var projects: Resource$Projects = js.native
  var regionAutoscalers: Resource$Regionautoscalers = js.native
  var regionBackendServices: Resource$Regionbackendservices = js.native
  var regionCommitments: Resource$Regioncommitments = js.native
  var regionDiskTypes: Resource$Regiondisktypes = js.native
  var regionDisks: Resource$Regiondisks = js.native
  var regionHealthCheckServices: Resource$Regionhealthcheckservices = js.native
  var regionHealthChecks: Resource$Regionhealthchecks = js.native
  var regionInstanceGroupManagers: Resource$Regioninstancegroupmanagers = js.native
  var regionInstanceGroups: Resource$Regioninstancegroups = js.native
  var regionNotificationEndpoints: Resource$Regionnotificationendpoints = js.native
  var regionOperations: Resource$Regionoperations = js.native
  var regionSslCertificates: Resource$Regionsslcertificates = js.native
  var regionTargetHttpProxies: Resource$Regiontargethttpproxies = js.native
  var regionTargetHttpsProxies: Resource$Regiontargethttpsproxies = js.native
  var regionUrlMaps: Resource$Regionurlmaps = js.native
  var regions: Resource$Regions = js.native
  var reservations: Resource$Reservations = js.native
  var resourcePolicies: Resource$Resourcepolicies = js.native
  var routers: Resource$Routers = js.native
  var routes: Resource$Routes = js.native
  var securityPolicies: Resource$Securitypolicies = js.native
  var snapshots: Resource$Snapshots = js.native
  var sslCertificates: Resource$Sslcertificates = js.native
  var sslPolicies: Resource$Sslpolicies = js.native
  var subnetworks: Resource$Subnetworks = js.native
  var targetHttpProxies: Resource$Targethttpproxies = js.native
  var targetHttpsProxies: Resource$Targethttpsproxies = js.native
  var targetInstances: Resource$Targetinstances = js.native
  var targetPools: Resource$Targetpools = js.native
  var targetSslProxies: Resource$Targetsslproxies = js.native
  var targetTcpProxies: Resource$Targettcpproxies = js.native
  var targetVpnGateways: Resource$Targetvpngateways = js.native
  var urlMaps: Resource$Urlmaps = js.native
  var vpnGateways: Resource$Vpngateways = js.native
  var vpnTunnels: Resource$Vpntunnels = js.native
  var zoneOperations: Resource$Zoneoperations = js.native
  var zones: Resource$Zones = js.native
}

