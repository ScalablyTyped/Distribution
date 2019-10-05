package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.AccountSummariesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.AccountUserLinksCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.AccountsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.ClientIdCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.CustomDataSourcesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.CustomDimensionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.CustomMetricsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.ExperimentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.FiltersCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.GoalsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.ProfileFilterLinksCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.ProfileUserLinksCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.ProfilesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.RemarketingAudienceCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.SegmentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.UnsampledReportsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.UploadsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.WebPropertyAdWordsLinksCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertiesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertyUserLinksCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementCollection extends js.Object {
  var AccountSummaries: js.UndefOr[AccountSummariesCollection] = js.undefined
  var AccountUserLinks: js.UndefOr[AccountUserLinksCollection] = js.undefined
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var ClientId: js.UndefOr[ClientIdCollection] = js.undefined
  var CustomDataSources: js.UndefOr[CustomDataSourcesCollection] = js.undefined
  var CustomDimensions: js.UndefOr[CustomDimensionsCollection] = js.undefined
  var CustomMetrics: js.UndefOr[CustomMetricsCollection] = js.undefined
  var Experiments: js.UndefOr[ExperimentsCollection] = js.undefined
  var Filters: js.UndefOr[FiltersCollection] = js.undefined
  var Goals: js.UndefOr[GoalsCollection] = js.undefined
  var ProfileFilterLinks: js.UndefOr[ProfileFilterLinksCollection] = js.undefined
  var ProfileUserLinks: js.UndefOr[ProfileUserLinksCollection] = js.undefined
  var Profiles: js.UndefOr[ProfilesCollection] = js.undefined
  var RemarketingAudience: js.UndefOr[RemarketingAudienceCollection] = js.undefined
  var Segments: js.UndefOr[SegmentsCollection] = js.undefined
  var UnsampledReports: js.UndefOr[UnsampledReportsCollection] = js.undefined
  var Uploads: js.UndefOr[UploadsCollection] = js.undefined
  var WebPropertyAdWordsLinks: js.UndefOr[WebPropertyAdWordsLinksCollection] = js.undefined
  var Webproperties: js.UndefOr[WebpropertiesCollection] = js.undefined
  var WebpropertyUserLinks: js.UndefOr[WebpropertyUserLinksCollection] = js.undefined
}

object ManagementCollection {
  @scala.inline
  def apply(
    AccountSummaries: AccountSummariesCollection = null,
    AccountUserLinks: AccountUserLinksCollection = null,
    Accounts: AccountsCollection = null,
    ClientId: ClientIdCollection = null,
    CustomDataSources: CustomDataSourcesCollection = null,
    CustomDimensions: CustomDimensionsCollection = null,
    CustomMetrics: CustomMetricsCollection = null,
    Experiments: ExperimentsCollection = null,
    Filters: FiltersCollection = null,
    Goals: GoalsCollection = null,
    ProfileFilterLinks: ProfileFilterLinksCollection = null,
    ProfileUserLinks: ProfileUserLinksCollection = null,
    Profiles: ProfilesCollection = null,
    RemarketingAudience: RemarketingAudienceCollection = null,
    Segments: SegmentsCollection = null,
    UnsampledReports: UnsampledReportsCollection = null,
    Uploads: UploadsCollection = null,
    WebPropertyAdWordsLinks: WebPropertyAdWordsLinksCollection = null,
    Webproperties: WebpropertiesCollection = null,
    WebpropertyUserLinks: WebpropertyUserLinksCollection = null
  ): ManagementCollection = {
    val __obj = js.Dynamic.literal()
    if (AccountSummaries != null) __obj.updateDynamic("AccountSummaries")(AccountSummaries)
    if (AccountUserLinks != null) __obj.updateDynamic("AccountUserLinks")(AccountUserLinks)
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (CustomDataSources != null) __obj.updateDynamic("CustomDataSources")(CustomDataSources)
    if (CustomDimensions != null) __obj.updateDynamic("CustomDimensions")(CustomDimensions)
    if (CustomMetrics != null) __obj.updateDynamic("CustomMetrics")(CustomMetrics)
    if (Experiments != null) __obj.updateDynamic("Experiments")(Experiments)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Goals != null) __obj.updateDynamic("Goals")(Goals)
    if (ProfileFilterLinks != null) __obj.updateDynamic("ProfileFilterLinks")(ProfileFilterLinks)
    if (ProfileUserLinks != null) __obj.updateDynamic("ProfileUserLinks")(ProfileUserLinks)
    if (Profiles != null) __obj.updateDynamic("Profiles")(Profiles)
    if (RemarketingAudience != null) __obj.updateDynamic("RemarketingAudience")(RemarketingAudience)
    if (Segments != null) __obj.updateDynamic("Segments")(Segments)
    if (UnsampledReports != null) __obj.updateDynamic("UnsampledReports")(UnsampledReports)
    if (Uploads != null) __obj.updateDynamic("Uploads")(Uploads)
    if (WebPropertyAdWordsLinks != null) __obj.updateDynamic("WebPropertyAdWordsLinks")(WebPropertyAdWordsLinks)
    if (Webproperties != null) __obj.updateDynamic("Webproperties")(Webproperties)
    if (WebpropertyUserLinks != null) __obj.updateDynamic("WebpropertyUserLinks")(WebpropertyUserLinks)
    __obj.asInstanceOf[ManagementCollection]
  }
}

