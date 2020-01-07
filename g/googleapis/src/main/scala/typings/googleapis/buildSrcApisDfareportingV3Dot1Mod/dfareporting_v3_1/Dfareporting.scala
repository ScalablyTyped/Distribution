package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DCM/DFA Reporting And Trafficking API
  *
  * Manages your DoubleClick Campaign Manager ad campaigns and reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const dfareporting = google.dfareporting('v3.1');
  *
  * @namespace dfareporting
  * @type {Function}
  * @version v3.1
  * @variation v3.1
  * @param {object=} options Options for Dfareporting
  */
@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Dfareporting")
@js.native
class Dfareporting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accountActiveAdSummaries: Resource$Accountactiveadsummaries = js.native
  var accountPermissionGroups: Resource$Accountpermissiongroups = js.native
  var accountPermissions: Resource$Accountpermissions = js.native
  var accountUserProfiles: Resource$Accountuserprofiles = js.native
  var accounts: Resource$Accounts = js.native
  var ads: Resource$Ads = js.native
  var advertiserGroups: Resource$Advertisergroups = js.native
  var advertiserLandingPages: Resource$Advertiserlandingpages = js.native
  var advertisers: Resource$Advertisers = js.native
  var browsers: Resource$Browsers = js.native
  var campaignCreativeAssociations: Resource$Campaigncreativeassociations = js.native
  var campaigns: Resource$Campaigns = js.native
  var changeLogs: Resource$Changelogs = js.native
  var cities: Resource$Cities = js.native
  var connectionTypes: Resource$Connectiontypes = js.native
  var contentCategories: Resource$Contentcategories = js.native
  var context: APIRequestContext = js.native
  var conversions: Resource$Conversions = js.native
  var countries: Resource$Countries = js.native
  var creativeAssets: Resource$Creativeassets = js.native
  var creativeFieldValues: Resource$Creativefieldvalues = js.native
  var creativeFields: Resource$Creativefields = js.native
  var creativeGroups: Resource$Creativegroups = js.native
  var creatives: Resource$Creatives = js.native
  var dimensionValues: Resource$Dimensionvalues = js.native
  var directorySiteContacts: Resource$Directorysitecontacts = js.native
  var directorySites: Resource$Directorysites = js.native
  var dynamicTargetingKeys: Resource$Dynamictargetingkeys = js.native
  var eventTags: Resource$Eventtags = js.native
  var files: Resource$Files = js.native
  var floodlightActivities: Resource$Floodlightactivities = js.native
  var floodlightActivityGroups: Resource$Floodlightactivitygroups = js.native
  var floodlightConfigurations: Resource$Floodlightconfigurations = js.native
  var inventoryItems: Resource$Inventoryitems = js.native
  var languages: Resource$Languages = js.native
  var metros: Resource$Metros = js.native
  var mobileApps: Resource$Mobileapps = js.native
  var mobileCarriers: Resource$Mobilecarriers = js.native
  var operatingSystemVersions: Resource$Operatingsystemversions = js.native
  var operatingSystems: Resource$Operatingsystems = js.native
  var orderDocuments: Resource$Orderdocuments = js.native
  var orders: Resource$Orders = js.native
  var placementGroups: Resource$Placementgroups = js.native
  var placementStrategies: Resource$Placementstrategies = js.native
  var placements: Resource$Placements = js.native
  var platformTypes: Resource$Platformtypes = js.native
  var postalCodes: Resource$Postalcodes = js.native
  var projects: Resource$Projects = js.native
  var regions: Resource$Regions = js.native
  var remarketingListShares: Resource$Remarketinglistshares = js.native
  var remarketingLists: Resource$Remarketinglists = js.native
  var reports: Resource$Reports = js.native
  var sites: Resource$Sites = js.native
  var sizes: Resource$Sizes = js.native
  var subaccounts: Resource$Subaccounts = js.native
  var targetableRemarketingLists: Resource$Targetableremarketinglists = js.native
  var targetingTemplates: Resource$Targetingtemplates = js.native
  var userProfiles: Resource$Userprofiles = js.native
  var userRolePermissionGroups: Resource$Userrolepermissiongroups = js.native
  var userRolePermissions: Resource$Userrolepermissions = js.native
  var userRoles: Resource$Userroles = js.native
  var videoFormats: Resource$Videoformats = js.native
}

