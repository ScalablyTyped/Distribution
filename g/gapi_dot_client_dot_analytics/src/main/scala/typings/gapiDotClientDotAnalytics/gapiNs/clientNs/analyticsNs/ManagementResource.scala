package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementResource extends js.Object {
  var accountSummaries: AccountSummariesResource
  var accountUserLinks: AccountUserLinksResource
  var accounts: AccountsResource
  var customDataSources: CustomDataSourcesResource
  var customDimensions: CustomDimensionsResource
  var customMetrics: CustomMetricsResource
  var experiments: ExperimentsResource
  var filters: FiltersResource
  var goals: GoalsResource
  var profileFilterLinks: ProfileFilterLinksResource
  var profileUserLinks: ProfileUserLinksResource
  var profiles: ProfilesResource
  var remarketingAudience: RemarketingAudienceResource
  var segments: SegmentsResource
  var unsampledReports: UnsampledReportsResource
  var uploads: UploadsResource
  var webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource
  var webproperties: WebpropertiesResource
  var webpropertyUserLinks: WebpropertyUserLinksResource
}

object ManagementResource {
  @scala.inline
  def apply(
    accountSummaries: AccountSummariesResource,
    accountUserLinks: AccountUserLinksResource,
    accounts: AccountsResource,
    customDataSources: CustomDataSourcesResource,
    customDimensions: CustomDimensionsResource,
    customMetrics: CustomMetricsResource,
    experiments: ExperimentsResource,
    filters: FiltersResource,
    goals: GoalsResource,
    profileFilterLinks: ProfileFilterLinksResource,
    profileUserLinks: ProfileUserLinksResource,
    profiles: ProfilesResource,
    remarketingAudience: RemarketingAudienceResource,
    segments: SegmentsResource,
    unsampledReports: UnsampledReportsResource,
    uploads: UploadsResource,
    webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource,
    webproperties: WebpropertiesResource,
    webpropertyUserLinks: WebpropertyUserLinksResource
  ): ManagementResource = {
    val __obj = js.Dynamic.literal(accountSummaries = accountSummaries, accountUserLinks = accountUserLinks, accounts = accounts, customDataSources = customDataSources, customDimensions = customDimensions, customMetrics = customMetrics, experiments = experiments, filters = filters, goals = goals, profileFilterLinks = profileFilterLinks, profileUserLinks = profileUserLinks, profiles = profiles, remarketingAudience = remarketingAudience, segments = segments, unsampledReports = unsampledReports, uploads = uploads, webPropertyAdWordsLinks = webPropertyAdWordsLinks, webproperties = webproperties, webpropertyUserLinks = webpropertyUserLinks)
  
    __obj.asInstanceOf[ManagementResource]
  }
}

