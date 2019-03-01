package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountSummaries")(accountSummaries)
    __obj.updateDynamic("accountUserLinks")(accountUserLinks)
    __obj.updateDynamic("accounts")(accounts)
    __obj.updateDynamic("customDataSources")(customDataSources)
    __obj.updateDynamic("customDimensions")(customDimensions)
    __obj.updateDynamic("customMetrics")(customMetrics)
    __obj.updateDynamic("experiments")(experiments)
    __obj.updateDynamic("filters")(filters)
    __obj.updateDynamic("goals")(goals)
    __obj.updateDynamic("profileFilterLinks")(profileFilterLinks)
    __obj.updateDynamic("profileUserLinks")(profileUserLinks)
    __obj.updateDynamic("profiles")(profiles)
    __obj.updateDynamic("remarketingAudience")(remarketingAudience)
    __obj.updateDynamic("segments")(segments)
    __obj.updateDynamic("unsampledReports")(unsampledReports)
    __obj.updateDynamic("uploads")(uploads)
    __obj.updateDynamic("webPropertyAdWordsLinks")(webPropertyAdWordsLinks)
    __obj.updateDynamic("webproperties")(webproperties)
    __obj.updateDynamic("webpropertyUserLinks")(webpropertyUserLinks)
    __obj.asInstanceOf[ManagementResource]
  }
}

