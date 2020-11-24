package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.DataCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.ManagementCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.MetadataCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.ProvisioningCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.UserDeletionCollection
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountChildLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountPermissions
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountRef
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AdWordsAccount
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AnalyticsDataimportDeleteUploadDataRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimension
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimensionParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetric
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetricParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLinkEntity
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkEntity
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkPermissions
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Experiment
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ExperimentParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ExperimentVariations
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Filter
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterAdvancedDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterExpression
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterLowercaseDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterRef
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterSearchAndReplaceDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterUppercaseDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Goal
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalEventDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalEventDetailsEventConditions
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetailsSteps
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalVisitNumPagesDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalVisitTimeOnSiteDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.IncludeConditions
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.LinkedForeignAccount
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Profile
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileChildLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileFilterLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfilePermissions
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileRef
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudience
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceAudienceDefinition
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinition
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReport
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReportCloudStorageDownloadDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReportDriveDownloadDetails
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequestId
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserRef
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebPropertyRef
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Webproperty
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyChildLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyParentLink
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics_ extends js.Object {
  
  var Data: js.UndefOr[DataCollection] = js.native
  
  var Management: js.UndefOr[ManagementCollection] = js.native
  
  var Metadata: js.UndefOr[MetadataCollection] = js.native
  
  var Provisioning: js.UndefOr[ProvisioningCollection] = js.native
  
  var UserDeletion: js.UndefOr[UserDeletionCollection] = js.native
  
  // Create a new instance of Account
  def newAccount(): Account = js.native
  
  // Create a new instance of AccountChildLink
  def newAccountChildLink(): AccountChildLink = js.native
  
  // Create a new instance of AccountPermissions
  def newAccountPermissions(): AccountPermissions = js.native
  
  // Create a new instance of AccountRef
  def newAccountRef(): AccountRef = js.native
  
  // Create a new instance of AccountTicket
  def newAccountTicket(): AccountTicket = js.native
  
  // Create a new instance of AccountTreeRequest
  def newAccountTreeRequest(): AccountTreeRequest = js.native
  
  // Create a new instance of AdWordsAccount
  def newAdWordsAccount(): AdWordsAccount = js.native
  
  // Create a new instance of AnalyticsDataimportDeleteUploadDataRequest
  def newAnalyticsDataimportDeleteUploadDataRequest(): AnalyticsDataimportDeleteUploadDataRequest = js.native
  
  // Create a new instance of CustomDimension
  def newCustomDimension(): CustomDimension = js.native
  
  // Create a new instance of CustomDimensionParentLink
  def newCustomDimensionParentLink(): CustomDimensionParentLink = js.native
  
  // Create a new instance of CustomMetric
  def newCustomMetric(): CustomMetric = js.native
  
  // Create a new instance of CustomMetricParentLink
  def newCustomMetricParentLink(): CustomMetricParentLink = js.native
  
  // Create a new instance of EntityAdWordsLink
  def newEntityAdWordsLink(): EntityAdWordsLink = js.native
  
  // Create a new instance of EntityAdWordsLinkEntity
  def newEntityAdWordsLinkEntity(): EntityAdWordsLinkEntity = js.native
  
  // Create a new instance of EntityUserLink
  def newEntityUserLink(): EntityUserLink = js.native
  
  // Create a new instance of EntityUserLinkEntity
  def newEntityUserLinkEntity(): EntityUserLinkEntity = js.native
  
  // Create a new instance of EntityUserLinkPermissions
  def newEntityUserLinkPermissions(): EntityUserLinkPermissions = js.native
  
  // Create a new instance of Experiment
  def newExperiment(): Experiment = js.native
  
  // Create a new instance of ExperimentParentLink
  def newExperimentParentLink(): ExperimentParentLink = js.native
  
  // Create a new instance of ExperimentVariations
  def newExperimentVariations(): ExperimentVariations = js.native
  
  // Create a new instance of Filter
  def newFilter(): Filter = js.native
  
  // Create a new instance of FilterAdvancedDetails
  def newFilterAdvancedDetails(): FilterAdvancedDetails = js.native
  
  // Create a new instance of FilterExpression
  def newFilterExpression(): FilterExpression = js.native
  
  // Create a new instance of FilterLowercaseDetails
  def newFilterLowercaseDetails(): FilterLowercaseDetails = js.native
  
  // Create a new instance of FilterParentLink
  def newFilterParentLink(): FilterParentLink = js.native
  
  // Create a new instance of FilterRef
  def newFilterRef(): FilterRef = js.native
  
  // Create a new instance of FilterSearchAndReplaceDetails
  def newFilterSearchAndReplaceDetails(): FilterSearchAndReplaceDetails = js.native
  
  // Create a new instance of FilterUppercaseDetails
  def newFilterUppercaseDetails(): FilterUppercaseDetails = js.native
  
  // Create a new instance of Goal
  def newGoal(): Goal = js.native
  
  // Create a new instance of GoalEventDetails
  def newGoalEventDetails(): GoalEventDetails = js.native
  
  // Create a new instance of GoalEventDetailsEventConditions
  def newGoalEventDetailsEventConditions(): GoalEventDetailsEventConditions = js.native
  
  // Create a new instance of GoalParentLink
  def newGoalParentLink(): GoalParentLink = js.native
  
  // Create a new instance of GoalUrlDestinationDetails
  def newGoalUrlDestinationDetails(): GoalUrlDestinationDetails = js.native
  
  // Create a new instance of GoalUrlDestinationDetailsSteps
  def newGoalUrlDestinationDetailsSteps(): GoalUrlDestinationDetailsSteps = js.native
  
  // Create a new instance of GoalVisitNumPagesDetails
  def newGoalVisitNumPagesDetails(): GoalVisitNumPagesDetails = js.native
  
  // Create a new instance of GoalVisitTimeOnSiteDetails
  def newGoalVisitTimeOnSiteDetails(): GoalVisitTimeOnSiteDetails = js.native
  
  // Create a new instance of HashClientIdRequest
  def newHashClientIdRequest(): HashClientIdRequest = js.native
  
  // Create a new instance of IncludeConditions
  def newIncludeConditions(): IncludeConditions = js.native
  
  // Create a new instance of LinkedForeignAccount
  def newLinkedForeignAccount(): LinkedForeignAccount = js.native
  
  // Create a new instance of Profile
  def newProfile(): Profile = js.native
  
  // Create a new instance of ProfileChildLink
  def newProfileChildLink(): ProfileChildLink = js.native
  
  // Create a new instance of ProfileFilterLink
  def newProfileFilterLink(): ProfileFilterLink = js.native
  
  // Create a new instance of ProfileParentLink
  def newProfileParentLink(): ProfileParentLink = js.native
  
  // Create a new instance of ProfilePermissions
  def newProfilePermissions(): ProfilePermissions = js.native
  
  // Create a new instance of ProfileRef
  def newProfileRef(): ProfileRef = js.native
  
  // Create a new instance of RemarketingAudience
  def newRemarketingAudience(): RemarketingAudience = js.native
  
  // Create a new instance of RemarketingAudienceAudienceDefinition
  def newRemarketingAudienceAudienceDefinition(): RemarketingAudienceAudienceDefinition = js.native
  
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinition
  def newRemarketingAudienceStateBasedAudienceDefinition(): RemarketingAudienceStateBasedAudienceDefinition = js.native
  
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
  def newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions(): RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = js.native
  
  // Create a new instance of UnsampledReport
  def newUnsampledReport(): UnsampledReport = js.native
  
  // Create a new instance of UnsampledReportCloudStorageDownloadDetails
  def newUnsampledReportCloudStorageDownloadDetails(): UnsampledReportCloudStorageDownloadDetails = js.native
  
  // Create a new instance of UnsampledReportDriveDownloadDetails
  def newUnsampledReportDriveDownloadDetails(): UnsampledReportDriveDownloadDetails = js.native
  
  // Create a new instance of UserDeletionRequest
  def newUserDeletionRequest(): UserDeletionRequest = js.native
  
  // Create a new instance of UserDeletionRequestId
  def newUserDeletionRequestId(): UserDeletionRequestId = js.native
  
  // Create a new instance of UserRef
  def newUserRef(): UserRef = js.native
  
  // Create a new instance of WebPropertyRef
  def newWebPropertyRef(): WebPropertyRef = js.native
  
  // Create a new instance of Webproperty
  def newWebproperty(): Webproperty = js.native
  
  // Create a new instance of WebpropertyChildLink
  def newWebpropertyChildLink(): WebpropertyChildLink = js.native
  
  // Create a new instance of WebpropertyParentLink
  def newWebpropertyParentLink(): WebpropertyParentLink = js.native
  
  // Create a new instance of WebpropertyPermissions
  def newWebpropertyPermissions(): WebpropertyPermissions = js.native
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
    newWebpropertyPermissions: () => WebpropertyPermissions
  ): Analytics_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountChildLink = js.Any.fromFunction0(newAccountChildLink), newAccountPermissions = js.Any.fromFunction0(newAccountPermissions), newAccountRef = js.Any.fromFunction0(newAccountRef), newAccountTicket = js.Any.fromFunction0(newAccountTicket), newAccountTreeRequest = js.Any.fromFunction0(newAccountTreeRequest), newAdWordsAccount = js.Any.fromFunction0(newAdWordsAccount), newAnalyticsDataimportDeleteUploadDataRequest = js.Any.fromFunction0(newAnalyticsDataimportDeleteUploadDataRequest), newCustomDimension = js.Any.fromFunction0(newCustomDimension), newCustomDimensionParentLink = js.Any.fromFunction0(newCustomDimensionParentLink), newCustomMetric = js.Any.fromFunction0(newCustomMetric), newCustomMetricParentLink = js.Any.fromFunction0(newCustomMetricParentLink), newEntityAdWordsLink = js.Any.fromFunction0(newEntityAdWordsLink), newEntityAdWordsLinkEntity = js.Any.fromFunction0(newEntityAdWordsLinkEntity), newEntityUserLink = js.Any.fromFunction0(newEntityUserLink), newEntityUserLinkEntity = js.Any.fromFunction0(newEntityUserLinkEntity), newEntityUserLinkPermissions = js.Any.fromFunction0(newEntityUserLinkPermissions), newExperiment = js.Any.fromFunction0(newExperiment), newExperimentParentLink = js.Any.fromFunction0(newExperimentParentLink), newExperimentVariations = js.Any.fromFunction0(newExperimentVariations), newFilter = js.Any.fromFunction0(newFilter), newFilterAdvancedDetails = js.Any.fromFunction0(newFilterAdvancedDetails), newFilterExpression = js.Any.fromFunction0(newFilterExpression), newFilterLowercaseDetails = js.Any.fromFunction0(newFilterLowercaseDetails), newFilterParentLink = js.Any.fromFunction0(newFilterParentLink), newFilterRef = js.Any.fromFunction0(newFilterRef), newFilterSearchAndReplaceDetails = js.Any.fromFunction0(newFilterSearchAndReplaceDetails), newFilterUppercaseDetails = js.Any.fromFunction0(newFilterUppercaseDetails), newGoal = js.Any.fromFunction0(newGoal), newGoalEventDetails = js.Any.fromFunction0(newGoalEventDetails), newGoalEventDetailsEventConditions = js.Any.fromFunction0(newGoalEventDetailsEventConditions), newGoalParentLink = js.Any.fromFunction0(newGoalParentLink), newGoalUrlDestinationDetails = js.Any.fromFunction0(newGoalUrlDestinationDetails), newGoalUrlDestinationDetailsSteps = js.Any.fromFunction0(newGoalUrlDestinationDetailsSteps), newGoalVisitNumPagesDetails = js.Any.fromFunction0(newGoalVisitNumPagesDetails), newGoalVisitTimeOnSiteDetails = js.Any.fromFunction0(newGoalVisitTimeOnSiteDetails), newHashClientIdRequest = js.Any.fromFunction0(newHashClientIdRequest), newIncludeConditions = js.Any.fromFunction0(newIncludeConditions), newLinkedForeignAccount = js.Any.fromFunction0(newLinkedForeignAccount), newProfile = js.Any.fromFunction0(newProfile), newProfileChildLink = js.Any.fromFunction0(newProfileChildLink), newProfileFilterLink = js.Any.fromFunction0(newProfileFilterLink), newProfileParentLink = js.Any.fromFunction0(newProfileParentLink), newProfilePermissions = js.Any.fromFunction0(newProfilePermissions), newProfileRef = js.Any.fromFunction0(newProfileRef), newRemarketingAudience = js.Any.fromFunction0(newRemarketingAudience), newRemarketingAudienceAudienceDefinition = js.Any.fromFunction0(newRemarketingAudienceAudienceDefinition), newRemarketingAudienceStateBasedAudienceDefinition = js.Any.fromFunction0(newRemarketingAudienceStateBasedAudienceDefinition), newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = js.Any.fromFunction0(newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions), newUnsampledReport = js.Any.fromFunction0(newUnsampledReport), newUnsampledReportCloudStorageDownloadDetails = js.Any.fromFunction0(newUnsampledReportCloudStorageDownloadDetails), newUnsampledReportDriveDownloadDetails = js.Any.fromFunction0(newUnsampledReportDriveDownloadDetails), newUserDeletionRequest = js.Any.fromFunction0(newUserDeletionRequest), newUserDeletionRequestId = js.Any.fromFunction0(newUserDeletionRequestId), newUserRef = js.Any.fromFunction0(newUserRef), newWebPropertyRef = js.Any.fromFunction0(newWebPropertyRef), newWebproperty = js.Any.fromFunction0(newWebproperty), newWebpropertyChildLink = js.Any.fromFunction0(newWebpropertyChildLink), newWebpropertyParentLink = js.Any.fromFunction0(newWebpropertyParentLink), newWebpropertyPermissions = js.Any.fromFunction0(newWebpropertyPermissions))
    __obj.asInstanceOf[Analytics_]
  }
  
  @scala.inline
  implicit class Analytics_Ops[Self <: Analytics_] (val x: Self) extends AnyVal {
    
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
    def setNewAccount(value: () => Account): Self = this.set("newAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAccountChildLink(value: () => AccountChildLink): Self = this.set("newAccountChildLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAccountPermissions(value: () => AccountPermissions): Self = this.set("newAccountPermissions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAccountRef(value: () => AccountRef): Self = this.set("newAccountRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAccountTicket(value: () => AccountTicket): Self = this.set("newAccountTicket", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAccountTreeRequest(value: () => AccountTreeRequest): Self = this.set("newAccountTreeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAdWordsAccount(value: () => AdWordsAccount): Self = this.set("newAdWordsAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAnalyticsDataimportDeleteUploadDataRequest(value: () => AnalyticsDataimportDeleteUploadDataRequest): Self = this.set("newAnalyticsDataimportDeleteUploadDataRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCustomDimension(value: () => CustomDimension): Self = this.set("newCustomDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCustomDimensionParentLink(value: () => CustomDimensionParentLink): Self = this.set("newCustomDimensionParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCustomMetric(value: () => CustomMetric): Self = this.set("newCustomMetric", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCustomMetricParentLink(value: () => CustomMetricParentLink): Self = this.set("newCustomMetricParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntityAdWordsLink(value: () => EntityAdWordsLink): Self = this.set("newEntityAdWordsLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntityAdWordsLinkEntity(value: () => EntityAdWordsLinkEntity): Self = this.set("newEntityAdWordsLinkEntity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntityUserLink(value: () => EntityUserLink): Self = this.set("newEntityUserLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntityUserLinkEntity(value: () => EntityUserLinkEntity): Self = this.set("newEntityUserLinkEntity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntityUserLinkPermissions(value: () => EntityUserLinkPermissions): Self = this.set("newEntityUserLinkPermissions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExperiment(value: () => Experiment): Self = this.set("newExperiment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExperimentParentLink(value: () => ExperimentParentLink): Self = this.set("newExperimentParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExperimentVariations(value: () => ExperimentVariations): Self = this.set("newExperimentVariations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilter(value: () => Filter): Self = this.set("newFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterAdvancedDetails(value: () => FilterAdvancedDetails): Self = this.set("newFilterAdvancedDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterExpression(value: () => FilterExpression): Self = this.set("newFilterExpression", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterLowercaseDetails(value: () => FilterLowercaseDetails): Self = this.set("newFilterLowercaseDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterParentLink(value: () => FilterParentLink): Self = this.set("newFilterParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterRef(value: () => FilterRef): Self = this.set("newFilterRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterSearchAndReplaceDetails(value: () => FilterSearchAndReplaceDetails): Self = this.set("newFilterSearchAndReplaceDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterUppercaseDetails(value: () => FilterUppercaseDetails): Self = this.set("newFilterUppercaseDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoal(value: () => Goal): Self = this.set("newGoal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalEventDetails(value: () => GoalEventDetails): Self = this.set("newGoalEventDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalEventDetailsEventConditions(value: () => GoalEventDetailsEventConditions): Self = this.set("newGoalEventDetailsEventConditions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalParentLink(value: () => GoalParentLink): Self = this.set("newGoalParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalUrlDestinationDetails(value: () => GoalUrlDestinationDetails): Self = this.set("newGoalUrlDestinationDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalUrlDestinationDetailsSteps(value: () => GoalUrlDestinationDetailsSteps): Self = this.set("newGoalUrlDestinationDetailsSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalVisitNumPagesDetails(value: () => GoalVisitNumPagesDetails): Self = this.set("newGoalVisitNumPagesDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoalVisitTimeOnSiteDetails(value: () => GoalVisitTimeOnSiteDetails): Self = this.set("newGoalVisitTimeOnSiteDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewHashClientIdRequest(value: () => HashClientIdRequest): Self = this.set("newHashClientIdRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewIncludeConditions(value: () => IncludeConditions): Self = this.set("newIncludeConditions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLinkedForeignAccount(value: () => LinkedForeignAccount): Self = this.set("newLinkedForeignAccount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfile(value: () => Profile): Self = this.set("newProfile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfileChildLink(value: () => ProfileChildLink): Self = this.set("newProfileChildLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfileFilterLink(value: () => ProfileFilterLink): Self = this.set("newProfileFilterLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfileParentLink(value: () => ProfileParentLink): Self = this.set("newProfileParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfilePermissions(value: () => ProfilePermissions): Self = this.set("newProfilePermissions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProfileRef(value: () => ProfileRef): Self = this.set("newProfileRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRemarketingAudience(value: () => RemarketingAudience): Self = this.set("newRemarketingAudience", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRemarketingAudienceAudienceDefinition(value: () => RemarketingAudienceAudienceDefinition): Self = this.set("newRemarketingAudienceAudienceDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRemarketingAudienceStateBasedAudienceDefinition(value: () => RemarketingAudienceStateBasedAudienceDefinition): Self = this.set("newRemarketingAudienceStateBasedAudienceDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions(value: () => RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions): Self = this.set("newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUnsampledReport(value: () => UnsampledReport): Self = this.set("newUnsampledReport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUnsampledReportCloudStorageDownloadDetails(value: () => UnsampledReportCloudStorageDownloadDetails): Self = this.set("newUnsampledReportCloudStorageDownloadDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUnsampledReportDriveDownloadDetails(value: () => UnsampledReportDriveDownloadDetails): Self = this.set("newUnsampledReportDriveDownloadDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserDeletionRequest(value: () => UserDeletionRequest): Self = this.set("newUserDeletionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserDeletionRequestId(value: () => UserDeletionRequestId): Self = this.set("newUserDeletionRequestId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserRef(value: () => UserRef): Self = this.set("newUserRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWebPropertyRef(value: () => WebPropertyRef): Self = this.set("newWebPropertyRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWebproperty(value: () => Webproperty): Self = this.set("newWebproperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWebpropertyChildLink(value: () => WebpropertyChildLink): Self = this.set("newWebpropertyChildLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWebpropertyParentLink(value: () => WebpropertyParentLink): Self = this.set("newWebpropertyParentLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWebpropertyPermissions(value: () => WebpropertyPermissions): Self = this.set("newWebpropertyPermissions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: DataCollection): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setManagement(value: ManagementCollection): Self = this.set("Management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagement: Self = this.set("Management", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataCollection): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setProvisioning(value: ProvisioningCollection): Self = this.set("Provisioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioning: Self = this.set("Provisioning", js.undefined)
    
    @scala.inline
    def setUserDeletion(value: UserDeletionCollection): Self = this.set("UserDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDeletion: Self = this.set("UserDeletion", js.undefined)
  }
}
