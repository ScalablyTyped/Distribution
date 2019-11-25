package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.DataCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.ManagementCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.MetadataCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.ProvisioningCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.UserDeletionCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Account
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AccountChildLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AccountPermissions
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AccountRef
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AdWordsAccount
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.AnalyticsDataimportDeleteUploadDataRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.CustomDimension
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.CustomDimensionParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.CustomMetric
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.CustomMetricParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLinkEntity
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkEntity
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkPermissions
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Experiment
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ExperimentParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ExperimentVariations
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Filter
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterAdvancedDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterExpression
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterLowercaseDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterRef
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterSearchAndReplaceDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.FilterUppercaseDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Goal
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalEventDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalEventDetailsEventConditions
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetailsSteps
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalVisitNumPagesDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.GoalVisitTimeOnSiteDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.IncludeConditions
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.LinkedForeignAccount
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Profile
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ProfileChildLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ProfileFilterLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ProfileParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ProfilePermissions
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.ProfileRef
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RemarketingAudience
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceAudienceDefinition
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinition
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UnsampledReport
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UnsampledReportCloudStorageDownloadDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UnsampledReportDriveDownloadDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequestId
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.UserRef
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.WebPropertyRef
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Webproperty
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.WebpropertyChildLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.WebpropertyParentLink
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.WebpropertyPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Analytics")
trait Analytics_ extends js.Object {
  var Data: js.UndefOr[DataCollection] = js.undefined
  var Management: js.UndefOr[ManagementCollection] = js.undefined
  var Metadata: js.UndefOr[MetadataCollection] = js.undefined
  var Provisioning: js.UndefOr[ProvisioningCollection] = js.undefined
  var UserDeletion: js.UndefOr[UserDeletionCollection] = js.undefined
  // Create a new instance of Account
  def newAccount(): Account
  // Create a new instance of AccountChildLink
  def newAccountChildLink(): AccountChildLink
  // Create a new instance of AccountPermissions
  def newAccountPermissions(): AccountPermissions
  // Create a new instance of AccountRef
  def newAccountRef(): AccountRef
  // Create a new instance of AccountTicket
  def newAccountTicket(): AccountTicket
  // Create a new instance of AccountTreeRequest
  def newAccountTreeRequest(): AccountTreeRequest
  // Create a new instance of AdWordsAccount
  def newAdWordsAccount(): AdWordsAccount
  // Create a new instance of AnalyticsDataimportDeleteUploadDataRequest
  def newAnalyticsDataimportDeleteUploadDataRequest(): AnalyticsDataimportDeleteUploadDataRequest
  // Create a new instance of CustomDimension
  def newCustomDimension(): CustomDimension
  // Create a new instance of CustomDimensionParentLink
  def newCustomDimensionParentLink(): CustomDimensionParentLink
  // Create a new instance of CustomMetric
  def newCustomMetric(): CustomMetric
  // Create a new instance of CustomMetricParentLink
  def newCustomMetricParentLink(): CustomMetricParentLink
  // Create a new instance of EntityAdWordsLink
  def newEntityAdWordsLink(): EntityAdWordsLink
  // Create a new instance of EntityAdWordsLinkEntity
  def newEntityAdWordsLinkEntity(): EntityAdWordsLinkEntity
  // Create a new instance of EntityUserLink
  def newEntityUserLink(): EntityUserLink
  // Create a new instance of EntityUserLinkEntity
  def newEntityUserLinkEntity(): EntityUserLinkEntity
  // Create a new instance of EntityUserLinkPermissions
  def newEntityUserLinkPermissions(): EntityUserLinkPermissions
  // Create a new instance of Experiment
  def newExperiment(): Experiment
  // Create a new instance of ExperimentParentLink
  def newExperimentParentLink(): ExperimentParentLink
  // Create a new instance of ExperimentVariations
  def newExperimentVariations(): ExperimentVariations
  // Create a new instance of Filter
  def newFilter(): Filter
  // Create a new instance of FilterAdvancedDetails
  def newFilterAdvancedDetails(): FilterAdvancedDetails
  // Create a new instance of FilterExpression
  def newFilterExpression(): FilterExpression
  // Create a new instance of FilterLowercaseDetails
  def newFilterLowercaseDetails(): FilterLowercaseDetails
  // Create a new instance of FilterParentLink
  def newFilterParentLink(): FilterParentLink
  // Create a new instance of FilterRef
  def newFilterRef(): FilterRef
  // Create a new instance of FilterSearchAndReplaceDetails
  def newFilterSearchAndReplaceDetails(): FilterSearchAndReplaceDetails
  // Create a new instance of FilterUppercaseDetails
  def newFilterUppercaseDetails(): FilterUppercaseDetails
  // Create a new instance of Goal
  def newGoal(): Goal
  // Create a new instance of GoalEventDetails
  def newGoalEventDetails(): GoalEventDetails
  // Create a new instance of GoalEventDetailsEventConditions
  def newGoalEventDetailsEventConditions(): GoalEventDetailsEventConditions
  // Create a new instance of GoalParentLink
  def newGoalParentLink(): GoalParentLink
  // Create a new instance of GoalUrlDestinationDetails
  def newGoalUrlDestinationDetails(): GoalUrlDestinationDetails
  // Create a new instance of GoalUrlDestinationDetailsSteps
  def newGoalUrlDestinationDetailsSteps(): GoalUrlDestinationDetailsSteps
  // Create a new instance of GoalVisitNumPagesDetails
  def newGoalVisitNumPagesDetails(): GoalVisitNumPagesDetails
  // Create a new instance of GoalVisitTimeOnSiteDetails
  def newGoalVisitTimeOnSiteDetails(): GoalVisitTimeOnSiteDetails
  // Create a new instance of HashClientIdRequest
  def newHashClientIdRequest(): HashClientIdRequest
  // Create a new instance of IncludeConditions
  def newIncludeConditions(): IncludeConditions
  // Create a new instance of LinkedForeignAccount
  def newLinkedForeignAccount(): LinkedForeignAccount
  // Create a new instance of Profile
  def newProfile(): Profile
  // Create a new instance of ProfileChildLink
  def newProfileChildLink(): ProfileChildLink
  // Create a new instance of ProfileFilterLink
  def newProfileFilterLink(): ProfileFilterLink
  // Create a new instance of ProfileParentLink
  def newProfileParentLink(): ProfileParentLink
  // Create a new instance of ProfilePermissions
  def newProfilePermissions(): ProfilePermissions
  // Create a new instance of ProfileRef
  def newProfileRef(): ProfileRef
  // Create a new instance of RemarketingAudience
  def newRemarketingAudience(): RemarketingAudience
  // Create a new instance of RemarketingAudienceAudienceDefinition
  def newRemarketingAudienceAudienceDefinition(): RemarketingAudienceAudienceDefinition
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinition
  def newRemarketingAudienceStateBasedAudienceDefinition(): RemarketingAudienceStateBasedAudienceDefinition
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
  def newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions(): RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
  // Create a new instance of UnsampledReport
  def newUnsampledReport(): UnsampledReport
  // Create a new instance of UnsampledReportCloudStorageDownloadDetails
  def newUnsampledReportCloudStorageDownloadDetails(): UnsampledReportCloudStorageDownloadDetails
  // Create a new instance of UnsampledReportDriveDownloadDetails
  def newUnsampledReportDriveDownloadDetails(): UnsampledReportDriveDownloadDetails
  // Create a new instance of UserDeletionRequest
  def newUserDeletionRequest(): UserDeletionRequest
  // Create a new instance of UserDeletionRequestId
  def newUserDeletionRequestId(): UserDeletionRequestId
  // Create a new instance of UserRef
  def newUserRef(): UserRef
  // Create a new instance of WebPropertyRef
  def newWebPropertyRef(): WebPropertyRef
  // Create a new instance of Webproperty
  def newWebproperty(): Webproperty
  // Create a new instance of WebpropertyChildLink
  def newWebpropertyChildLink(): WebpropertyChildLink
  // Create a new instance of WebpropertyParentLink
  def newWebpropertyParentLink(): WebpropertyParentLink
  // Create a new instance of WebpropertyPermissions
  def newWebpropertyPermissions(): WebpropertyPermissions
}

object Analytics_ {
  @scala.inline
  def apply(
    newAccount: () => Account,
    newAccountChildLink: () => AccountChildLink,
    newAccountPermissions: () => AccountPermissions,
    newAccountRef: () => AccountRef,
    newAccountTicket: () => AccountTicket,
    newAccountTreeRequest: () => AccountTreeRequest,
    newAdWordsAccount: () => AdWordsAccount,
    newAnalyticsDataimportDeleteUploadDataRequest: () => AnalyticsDataimportDeleteUploadDataRequest,
    newCustomDimension: () => CustomDimension,
    newCustomDimensionParentLink: () => CustomDimensionParentLink,
    newCustomMetric: () => CustomMetric,
    newCustomMetricParentLink: () => CustomMetricParentLink,
    newEntityAdWordsLink: () => EntityAdWordsLink,
    newEntityAdWordsLinkEntity: () => EntityAdWordsLinkEntity,
    newEntityUserLink: () => EntityUserLink,
    newEntityUserLinkEntity: () => EntityUserLinkEntity,
    newEntityUserLinkPermissions: () => EntityUserLinkPermissions,
    newExperiment: () => Experiment,
    newExperimentParentLink: () => ExperimentParentLink,
    newExperimentVariations: () => ExperimentVariations,
    newFilter: () => Filter,
    newFilterAdvancedDetails: () => FilterAdvancedDetails,
    newFilterExpression: () => FilterExpression,
    newFilterLowercaseDetails: () => FilterLowercaseDetails,
    newFilterParentLink: () => FilterParentLink,
    newFilterRef: () => FilterRef,
    newFilterSearchAndReplaceDetails: () => FilterSearchAndReplaceDetails,
    newFilterUppercaseDetails: () => FilterUppercaseDetails,
    newGoal: () => Goal,
    newGoalEventDetails: () => GoalEventDetails,
    newGoalEventDetailsEventConditions: () => GoalEventDetailsEventConditions,
    newGoalParentLink: () => GoalParentLink,
    newGoalUrlDestinationDetails: () => GoalUrlDestinationDetails,
    newGoalUrlDestinationDetailsSteps: () => GoalUrlDestinationDetailsSteps,
    newGoalVisitNumPagesDetails: () => GoalVisitNumPagesDetails,
    newGoalVisitTimeOnSiteDetails: () => GoalVisitTimeOnSiteDetails,
    newHashClientIdRequest: () => HashClientIdRequest,
    newIncludeConditions: () => IncludeConditions,
    newLinkedForeignAccount: () => LinkedForeignAccount,
    newProfile: () => Profile,
    newProfileChildLink: () => ProfileChildLink,
    newProfileFilterLink: () => ProfileFilterLink,
    newProfileParentLink: () => ProfileParentLink,
    newProfilePermissions: () => ProfilePermissions,
    newProfileRef: () => ProfileRef,
    newRemarketingAudience: () => RemarketingAudience,
    newRemarketingAudienceAudienceDefinition: () => RemarketingAudienceAudienceDefinition,
    newRemarketingAudienceStateBasedAudienceDefinition: () => RemarketingAudienceStateBasedAudienceDefinition,
    newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions: () => RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions,
    newUnsampledReport: () => UnsampledReport,
    newUnsampledReportCloudStorageDownloadDetails: () => UnsampledReportCloudStorageDownloadDetails,
    newUnsampledReportDriveDownloadDetails: () => UnsampledReportDriveDownloadDetails,
    newUserDeletionRequest: () => UserDeletionRequest,
    newUserDeletionRequestId: () => UserDeletionRequestId,
    newUserRef: () => UserRef,
    newWebPropertyRef: () => WebPropertyRef,
    newWebproperty: () => Webproperty,
    newWebpropertyChildLink: () => WebpropertyChildLink,
    newWebpropertyParentLink: () => WebpropertyParentLink,
    newWebpropertyPermissions: () => WebpropertyPermissions,
    Data: DataCollection = null,
    Management: ManagementCollection = null,
    Metadata: MetadataCollection = null,
    Provisioning: ProvisioningCollection = null,
    UserDeletion: UserDeletionCollection = null
  ): Analytics_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountChildLink = js.Any.fromFunction0(newAccountChildLink), newAccountPermissions = js.Any.fromFunction0(newAccountPermissions), newAccountRef = js.Any.fromFunction0(newAccountRef), newAccountTicket = js.Any.fromFunction0(newAccountTicket), newAccountTreeRequest = js.Any.fromFunction0(newAccountTreeRequest), newAdWordsAccount = js.Any.fromFunction0(newAdWordsAccount), newAnalyticsDataimportDeleteUploadDataRequest = js.Any.fromFunction0(newAnalyticsDataimportDeleteUploadDataRequest), newCustomDimension = js.Any.fromFunction0(newCustomDimension), newCustomDimensionParentLink = js.Any.fromFunction0(newCustomDimensionParentLink), newCustomMetric = js.Any.fromFunction0(newCustomMetric), newCustomMetricParentLink = js.Any.fromFunction0(newCustomMetricParentLink), newEntityAdWordsLink = js.Any.fromFunction0(newEntityAdWordsLink), newEntityAdWordsLinkEntity = js.Any.fromFunction0(newEntityAdWordsLinkEntity), newEntityUserLink = js.Any.fromFunction0(newEntityUserLink), newEntityUserLinkEntity = js.Any.fromFunction0(newEntityUserLinkEntity), newEntityUserLinkPermissions = js.Any.fromFunction0(newEntityUserLinkPermissions), newExperiment = js.Any.fromFunction0(newExperiment), newExperimentParentLink = js.Any.fromFunction0(newExperimentParentLink), newExperimentVariations = js.Any.fromFunction0(newExperimentVariations), newFilter = js.Any.fromFunction0(newFilter), newFilterAdvancedDetails = js.Any.fromFunction0(newFilterAdvancedDetails), newFilterExpression = js.Any.fromFunction0(newFilterExpression), newFilterLowercaseDetails = js.Any.fromFunction0(newFilterLowercaseDetails), newFilterParentLink = js.Any.fromFunction0(newFilterParentLink), newFilterRef = js.Any.fromFunction0(newFilterRef), newFilterSearchAndReplaceDetails = js.Any.fromFunction0(newFilterSearchAndReplaceDetails), newFilterUppercaseDetails = js.Any.fromFunction0(newFilterUppercaseDetails), newGoal = js.Any.fromFunction0(newGoal), newGoalEventDetails = js.Any.fromFunction0(newGoalEventDetails), newGoalEventDetailsEventConditions = js.Any.fromFunction0(newGoalEventDetailsEventConditions), newGoalParentLink = js.Any.fromFunction0(newGoalParentLink), newGoalUrlDestinationDetails = js.Any.fromFunction0(newGoalUrlDestinationDetails), newGoalUrlDestinationDetailsSteps = js.Any.fromFunction0(newGoalUrlDestinationDetailsSteps), newGoalVisitNumPagesDetails = js.Any.fromFunction0(newGoalVisitNumPagesDetails), newGoalVisitTimeOnSiteDetails = js.Any.fromFunction0(newGoalVisitTimeOnSiteDetails), newHashClientIdRequest = js.Any.fromFunction0(newHashClientIdRequest), newIncludeConditions = js.Any.fromFunction0(newIncludeConditions), newLinkedForeignAccount = js.Any.fromFunction0(newLinkedForeignAccount), newProfile = js.Any.fromFunction0(newProfile), newProfileChildLink = js.Any.fromFunction0(newProfileChildLink), newProfileFilterLink = js.Any.fromFunction0(newProfileFilterLink), newProfileParentLink = js.Any.fromFunction0(newProfileParentLink), newProfilePermissions = js.Any.fromFunction0(newProfilePermissions), newProfileRef = js.Any.fromFunction0(newProfileRef), newRemarketingAudience = js.Any.fromFunction0(newRemarketingAudience), newRemarketingAudienceAudienceDefinition = js.Any.fromFunction0(newRemarketingAudienceAudienceDefinition), newRemarketingAudienceStateBasedAudienceDefinition = js.Any.fromFunction0(newRemarketingAudienceStateBasedAudienceDefinition), newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = js.Any.fromFunction0(newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions), newUnsampledReport = js.Any.fromFunction0(newUnsampledReport), newUnsampledReportCloudStorageDownloadDetails = js.Any.fromFunction0(newUnsampledReportCloudStorageDownloadDetails), newUnsampledReportDriveDownloadDetails = js.Any.fromFunction0(newUnsampledReportDriveDownloadDetails), newUserDeletionRequest = js.Any.fromFunction0(newUserDeletionRequest), newUserDeletionRequestId = js.Any.fromFunction0(newUserDeletionRequestId), newUserRef = js.Any.fromFunction0(newUserRef), newWebPropertyRef = js.Any.fromFunction0(newWebPropertyRef), newWebproperty = js.Any.fromFunction0(newWebproperty), newWebpropertyChildLink = js.Any.fromFunction0(newWebpropertyChildLink), newWebpropertyParentLink = js.Any.fromFunction0(newWebpropertyParentLink), newWebpropertyPermissions = js.Any.fromFunction0(newWebpropertyPermissions))
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (Management != null) __obj.updateDynamic("Management")(Management.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (Provisioning != null) __obj.updateDynamic("Provisioning")(Provisioning.asInstanceOf[js.Any])
    if (UserDeletion != null) __obj.updateDynamic("UserDeletion")(UserDeletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics_]
  }
}

