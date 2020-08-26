package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountSummariesCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountUserLinksCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.AccountsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ClientIdCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomDataSourcesCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomDimensionsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.CustomMetricsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ExperimentsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.FiltersCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.GoalsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfileFilterLinksCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfileUserLinksCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.ProfilesCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.RemarketingAudienceCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.SegmentsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.UnsampledReportsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.UploadsCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebPropertyAdWordsLinksCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertiesCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management.WebpropertyUserLinksCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementCollection extends js.Object {
  var AccountSummaries: js.UndefOr[AccountSummariesCollection] = js.native
  var AccountUserLinks: js.UndefOr[AccountUserLinksCollection] = js.native
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var ClientId: js.UndefOr[ClientIdCollection] = js.native
  var CustomDataSources: js.UndefOr[CustomDataSourcesCollection] = js.native
  var CustomDimensions: js.UndefOr[CustomDimensionsCollection] = js.native
  var CustomMetrics: js.UndefOr[CustomMetricsCollection] = js.native
  var Experiments: js.UndefOr[ExperimentsCollection] = js.native
  var Filters: js.UndefOr[FiltersCollection] = js.native
  var Goals: js.UndefOr[GoalsCollection] = js.native
  var ProfileFilterLinks: js.UndefOr[ProfileFilterLinksCollection] = js.native
  var ProfileUserLinks: js.UndefOr[ProfileUserLinksCollection] = js.native
  var Profiles: js.UndefOr[ProfilesCollection] = js.native
  var RemarketingAudience: js.UndefOr[RemarketingAudienceCollection] = js.native
  var Segments: js.UndefOr[SegmentsCollection] = js.native
  var UnsampledReports: js.UndefOr[UnsampledReportsCollection] = js.native
  var Uploads: js.UndefOr[UploadsCollection] = js.native
  var WebPropertyAdWordsLinks: js.UndefOr[WebPropertyAdWordsLinksCollection] = js.native
  var Webproperties: js.UndefOr[WebpropertiesCollection] = js.native
  var WebpropertyUserLinks: js.UndefOr[WebpropertyUserLinksCollection] = js.native
}

object ManagementCollection {
  @scala.inline
  def apply(): ManagementCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementCollection]
  }
  @scala.inline
  implicit class ManagementCollectionOps[Self <: ManagementCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountSummaries(value: AccountSummariesCollection): Self = this.set("AccountSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountSummaries: Self = this.set("AccountSummaries", js.undefined)
    @scala.inline
    def setAccountUserLinks(value: AccountUserLinksCollection): Self = this.set("AccountUserLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountUserLinks: Self = this.set("AccountUserLinks", js.undefined)
    @scala.inline
    def setAccounts(value: AccountsCollection): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    @scala.inline
    def setClientId(value: ClientIdCollection): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    @scala.inline
    def setCustomDataSources(value: CustomDataSourcesCollection): Self = this.set("CustomDataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDataSources: Self = this.set("CustomDataSources", js.undefined)
    @scala.inline
    def setCustomDimensions(value: CustomDimensionsCollection): Self = this.set("CustomDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDimensions: Self = this.set("CustomDimensions", js.undefined)
    @scala.inline
    def setCustomMetrics(value: CustomMetricsCollection): Self = this.set("CustomMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetrics: Self = this.set("CustomMetrics", js.undefined)
    @scala.inline
    def setExperiments(value: ExperimentsCollection): Self = this.set("Experiments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperiments: Self = this.set("Experiments", js.undefined)
    @scala.inline
    def setFilters(value: FiltersCollection): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setGoals(value: GoalsCollection): Self = this.set("Goals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoals: Self = this.set("Goals", js.undefined)
    @scala.inline
    def setProfileFilterLinks(value: ProfileFilterLinksCollection): Self = this.set("ProfileFilterLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileFilterLinks: Self = this.set("ProfileFilterLinks", js.undefined)
    @scala.inline
    def setProfileUserLinks(value: ProfileUserLinksCollection): Self = this.set("ProfileUserLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileUserLinks: Self = this.set("ProfileUserLinks", js.undefined)
    @scala.inline
    def setProfiles(value: ProfilesCollection): Self = this.set("Profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfiles: Self = this.set("Profiles", js.undefined)
    @scala.inline
    def setRemarketingAudience(value: RemarketingAudienceCollection): Self = this.set("RemarketingAudience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarketingAudience: Self = this.set("RemarketingAudience", js.undefined)
    @scala.inline
    def setSegments(value: SegmentsCollection): Self = this.set("Segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("Segments", js.undefined)
    @scala.inline
    def setUnsampledReports(value: UnsampledReportsCollection): Self = this.set("UnsampledReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsampledReports: Self = this.set("UnsampledReports", js.undefined)
    @scala.inline
    def setUploads(value: UploadsCollection): Self = this.set("Uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("Uploads", js.undefined)
    @scala.inline
    def setWebPropertyAdWordsLinks(value: WebPropertyAdWordsLinksCollection): Self = this.set("WebPropertyAdWordsLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyAdWordsLinks: Self = this.set("WebPropertyAdWordsLinks", js.undefined)
    @scala.inline
    def setWebproperties(value: WebpropertiesCollection): Self = this.set("Webproperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebproperties: Self = this.set("Webproperties", js.undefined)
    @scala.inline
    def setWebpropertyUserLinks(value: WebpropertyUserLinksCollection): Self = this.set("WebpropertyUserLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpropertyUserLinks: Self = this.set("WebpropertyUserLinks", js.undefined)
  }
  
}

