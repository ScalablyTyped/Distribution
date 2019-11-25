package typings.gapiDotClientDotAnalytics.gapi.client.analytics

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
    val __obj = js.Dynamic.literal(accountSummaries = accountSummaries.asInstanceOf[js.Any], accountUserLinks = accountUserLinks.asInstanceOf[js.Any], accounts = accounts.asInstanceOf[js.Any], customDataSources = customDataSources.asInstanceOf[js.Any], customDimensions = customDimensions.asInstanceOf[js.Any], customMetrics = customMetrics.asInstanceOf[js.Any], experiments = experiments.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], goals = goals.asInstanceOf[js.Any], profileFilterLinks = profileFilterLinks.asInstanceOf[js.Any], profileUserLinks = profileUserLinks.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], remarketingAudience = remarketingAudience.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], unsampledReports = unsampledReports.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], webPropertyAdWordsLinks = webPropertyAdWordsLinks.asInstanceOf[js.Any], webproperties = webproperties.asInstanceOf[js.Any], webpropertyUserLinks = webpropertyUserLinks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManagementResource]
  }
}

