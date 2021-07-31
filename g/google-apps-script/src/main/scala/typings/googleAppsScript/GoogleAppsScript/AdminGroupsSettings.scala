package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection.GroupsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminGroupsSettings extends StObject {
  
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  
  // Create a new instance of Groups
  def newGroups(): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
}
object AdminGroupsSettings {
  
  @scala.inline
  def apply(newGroups: () => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): AdminGroupsSettings = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    __obj.asInstanceOf[AdminGroupsSettings]
  }
  
  @scala.inline
  implicit class AdminGroupsSettingsMutableBuilder[Self <: AdminGroupsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: GroupsCollection): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setNewGroups(value: () => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): Self = StObject.set(x, "newGroups", js.Any.fromFunction0(value))
  }
  
  object Collection {
    
    trait GroupsCollection extends StObject {
      
      // Gets one resource by id.
      def get(groupUniqueId: String): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
      
      // Updates an existing resource. This method supports patch semantics.
      def patch(
        resource: typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
        groupUniqueId: String
      ): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
      
      // Updates an existing resource.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
        groupUniqueId: String
      ): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
    }
    object GroupsCollection {
      
      @scala.inline
      def apply(
        get: String => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
        patch: (typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
        update: (typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
      ): GroupsCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
        __obj.asInstanceOf[GroupsCollection]
      }
      
      @scala.inline
      implicit class GroupsCollectionMutableBuilder[Self <: GroupsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPatch(
          value: (typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
        ): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
        
        @scala.inline
        def setUpdate(
          value: (typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
        ): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      }
    }
  }
  
  object Schema {
    
    trait Groups extends StObject {
      
      var allowExternalMembers: js.UndefOr[String] = js.undefined
      
      var allowGoogleCommunication: js.UndefOr[String] = js.undefined
      
      var allowWebPosting: js.UndefOr[String] = js.undefined
      
      var archiveOnly: js.UndefOr[String] = js.undefined
      
      var customFooterText: js.UndefOr[String] = js.undefined
      
      var customReplyTo: js.UndefOr[String] = js.undefined
      
      var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String] = js.undefined
      
      var defaultMessageDenyNotificationText: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var email: js.UndefOr[String] = js.undefined
      
      var enableCollaborativeInbox: js.UndefOr[String] = js.undefined
      
      var favoriteRepliesOnTop: js.UndefOr[String] = js.undefined
      
      var includeCustomFooter: js.UndefOr[String] = js.undefined
      
      var includeInGlobalAddressList: js.UndefOr[String] = js.undefined
      
      var isArchived: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var maxMessageBytes: js.UndefOr[Double] = js.undefined
      
      var membersCanPostAsTheGroup: js.UndefOr[String] = js.undefined
      
      var messageDisplayFont: js.UndefOr[String] = js.undefined
      
      var messageModerationLevel: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var primaryLanguage: js.UndefOr[String] = js.undefined
      
      var replyTo: js.UndefOr[String] = js.undefined
      
      var sendMessageDenyNotification: js.UndefOr[String] = js.undefined
      
      var showInGroupDirectory: js.UndefOr[String] = js.undefined
      
      var spamModerationLevel: js.UndefOr[String] = js.undefined
      
      var whoCanAdd: js.UndefOr[String] = js.undefined
      
      var whoCanAddReferences: js.UndefOr[String] = js.undefined
      
      var whoCanApproveMembers: js.UndefOr[String] = js.undefined
      
      var whoCanApproveMessages: js.UndefOr[String] = js.undefined
      
      var whoCanAssignTopics: js.UndefOr[String] = js.undefined
      
      var whoCanAssistContent: js.UndefOr[String] = js.undefined
      
      var whoCanBanUsers: js.UndefOr[String] = js.undefined
      
      var whoCanContactOwner: js.UndefOr[String] = js.undefined
      
      var whoCanDeleteAnyPost: js.UndefOr[String] = js.undefined
      
      var whoCanDeleteTopics: js.UndefOr[String] = js.undefined
      
      var whoCanDiscoverGroup: js.UndefOr[String] = js.undefined
      
      var whoCanEnterFreeFormTags: js.UndefOr[String] = js.undefined
      
      var whoCanHideAbuse: js.UndefOr[String] = js.undefined
      
      var whoCanInvite: js.UndefOr[String] = js.undefined
      
      var whoCanJoin: js.UndefOr[String] = js.undefined
      
      var whoCanLeaveGroup: js.UndefOr[String] = js.undefined
      
      var whoCanLockTopics: js.UndefOr[String] = js.undefined
      
      var whoCanMakeTopicsSticky: js.UndefOr[String] = js.undefined
      
      var whoCanMarkDuplicate: js.UndefOr[String] = js.undefined
      
      var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.undefined
      
      var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String] = js.undefined
      
      var whoCanMarkNoResponseNeeded: js.UndefOr[String] = js.undefined
      
      var whoCanModerateContent: js.UndefOr[String] = js.undefined
      
      var whoCanModerateMembers: js.UndefOr[String] = js.undefined
      
      var whoCanModifyMembers: js.UndefOr[String] = js.undefined
      
      var whoCanModifyTagsAndCategories: js.UndefOr[String] = js.undefined
      
      var whoCanMoveTopicsIn: js.UndefOr[String] = js.undefined
      
      var whoCanMoveTopicsOut: js.UndefOr[String] = js.undefined
      
      var whoCanPostAnnouncements: js.UndefOr[String] = js.undefined
      
      var whoCanPostMessage: js.UndefOr[String] = js.undefined
      
      var whoCanTakeTopics: js.UndefOr[String] = js.undefined
      
      var whoCanUnassignTopic: js.UndefOr[String] = js.undefined
      
      var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.undefined
      
      var whoCanViewGroup: js.UndefOr[String] = js.undefined
      
      var whoCanViewMembership: js.UndefOr[String] = js.undefined
    }
    object Groups {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups]
      }
      
      @scala.inline
      implicit class GroupsMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowExternalMembers(value: String): Self = StObject.set(x, "allowExternalMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowExternalMembersUndefined: Self = StObject.set(x, "allowExternalMembers", js.undefined)
        
        @scala.inline
        def setAllowGoogleCommunication(value: String): Self = StObject.set(x, "allowGoogleCommunication", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowGoogleCommunicationUndefined: Self = StObject.set(x, "allowGoogleCommunication", js.undefined)
        
        @scala.inline
        def setAllowWebPosting(value: String): Self = StObject.set(x, "allowWebPosting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowWebPostingUndefined: Self = StObject.set(x, "allowWebPosting", js.undefined)
        
        @scala.inline
        def setArchiveOnly(value: String): Self = StObject.set(x, "archiveOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArchiveOnlyUndefined: Self = StObject.set(x, "archiveOnly", js.undefined)
        
        @scala.inline
        def setCustomFooterText(value: String): Self = StObject.set(x, "customFooterText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomFooterTextUndefined: Self = StObject.set(x, "customFooterText", js.undefined)
        
        @scala.inline
        def setCustomReplyTo(value: String): Self = StObject.set(x, "customReplyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomReplyToUndefined: Self = StObject.set(x, "customReplyTo", js.undefined)
        
        @scala.inline
        def setCustomRolesEnabledForSettingsToBeMerged(value: String): Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomRolesEnabledForSettingsToBeMergedUndefined: Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", js.undefined)
        
        @scala.inline
        def setDefaultMessageDenyNotificationText(value: String): Self = StObject.set(x, "defaultMessageDenyNotificationText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultMessageDenyNotificationTextUndefined: Self = StObject.set(x, "defaultMessageDenyNotificationText", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setEnableCollaborativeInbox(value: String): Self = StObject.set(x, "enableCollaborativeInbox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableCollaborativeInboxUndefined: Self = StObject.set(x, "enableCollaborativeInbox", js.undefined)
        
        @scala.inline
        def setFavoriteRepliesOnTop(value: String): Self = StObject.set(x, "favoriteRepliesOnTop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFavoriteRepliesOnTopUndefined: Self = StObject.set(x, "favoriteRepliesOnTop", js.undefined)
        
        @scala.inline
        def setIncludeCustomFooter(value: String): Self = StObject.set(x, "includeCustomFooter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeCustomFooterUndefined: Self = StObject.set(x, "includeCustomFooter", js.undefined)
        
        @scala.inline
        def setIncludeInGlobalAddressList(value: String): Self = StObject.set(x, "includeInGlobalAddressList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeInGlobalAddressListUndefined: Self = StObject.set(x, "includeInGlobalAddressList", js.undefined)
        
        @scala.inline
        def setIsArchived(value: String): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMaxMessageBytes(value: Double): Self = StObject.set(x, "maxMessageBytes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxMessageBytesUndefined: Self = StObject.set(x, "maxMessageBytes", js.undefined)
        
        @scala.inline
        def setMembersCanPostAsTheGroup(value: String): Self = StObject.set(x, "membersCanPostAsTheGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMembersCanPostAsTheGroupUndefined: Self = StObject.set(x, "membersCanPostAsTheGroup", js.undefined)
        
        @scala.inline
        def setMessageDisplayFont(value: String): Self = StObject.set(x, "messageDisplayFont", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageDisplayFontUndefined: Self = StObject.set(x, "messageDisplayFont", js.undefined)
        
        @scala.inline
        def setMessageModerationLevel(value: String): Self = StObject.set(x, "messageModerationLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageModerationLevelUndefined: Self = StObject.set(x, "messageModerationLevel", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPrimaryLanguage(value: String): Self = StObject.set(x, "primaryLanguage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryLanguageUndefined: Self = StObject.set(x, "primaryLanguage", js.undefined)
        
        @scala.inline
        def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
        
        @scala.inline
        def setSendMessageDenyNotification(value: String): Self = StObject.set(x, "sendMessageDenyNotification", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSendMessageDenyNotificationUndefined: Self = StObject.set(x, "sendMessageDenyNotification", js.undefined)
        
        @scala.inline
        def setShowInGroupDirectory(value: String): Self = StObject.set(x, "showInGroupDirectory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowInGroupDirectoryUndefined: Self = StObject.set(x, "showInGroupDirectory", js.undefined)
        
        @scala.inline
        def setSpamModerationLevel(value: String): Self = StObject.set(x, "spamModerationLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpamModerationLevelUndefined: Self = StObject.set(x, "spamModerationLevel", js.undefined)
        
        @scala.inline
        def setWhoCanAdd(value: String): Self = StObject.set(x, "whoCanAdd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAddReferences(value: String): Self = StObject.set(x, "whoCanAddReferences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAddReferencesUndefined: Self = StObject.set(x, "whoCanAddReferences", js.undefined)
        
        @scala.inline
        def setWhoCanAddUndefined: Self = StObject.set(x, "whoCanAdd", js.undefined)
        
        @scala.inline
        def setWhoCanApproveMembers(value: String): Self = StObject.set(x, "whoCanApproveMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanApproveMembersUndefined: Self = StObject.set(x, "whoCanApproveMembers", js.undefined)
        
        @scala.inline
        def setWhoCanApproveMessages(value: String): Self = StObject.set(x, "whoCanApproveMessages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanApproveMessagesUndefined: Self = StObject.set(x, "whoCanApproveMessages", js.undefined)
        
        @scala.inline
        def setWhoCanAssignTopics(value: String): Self = StObject.set(x, "whoCanAssignTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAssignTopicsUndefined: Self = StObject.set(x, "whoCanAssignTopics", js.undefined)
        
        @scala.inline
        def setWhoCanAssistContent(value: String): Self = StObject.set(x, "whoCanAssistContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanAssistContentUndefined: Self = StObject.set(x, "whoCanAssistContent", js.undefined)
        
        @scala.inline
        def setWhoCanBanUsers(value: String): Self = StObject.set(x, "whoCanBanUsers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanBanUsersUndefined: Self = StObject.set(x, "whoCanBanUsers", js.undefined)
        
        @scala.inline
        def setWhoCanContactOwner(value: String): Self = StObject.set(x, "whoCanContactOwner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanContactOwnerUndefined: Self = StObject.set(x, "whoCanContactOwner", js.undefined)
        
        @scala.inline
        def setWhoCanDeleteAnyPost(value: String): Self = StObject.set(x, "whoCanDeleteAnyPost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanDeleteAnyPostUndefined: Self = StObject.set(x, "whoCanDeleteAnyPost", js.undefined)
        
        @scala.inline
        def setWhoCanDeleteTopics(value: String): Self = StObject.set(x, "whoCanDeleteTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanDeleteTopicsUndefined: Self = StObject.set(x, "whoCanDeleteTopics", js.undefined)
        
        @scala.inline
        def setWhoCanDiscoverGroup(value: String): Self = StObject.set(x, "whoCanDiscoverGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanDiscoverGroupUndefined: Self = StObject.set(x, "whoCanDiscoverGroup", js.undefined)
        
        @scala.inline
        def setWhoCanEnterFreeFormTags(value: String): Self = StObject.set(x, "whoCanEnterFreeFormTags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanEnterFreeFormTagsUndefined: Self = StObject.set(x, "whoCanEnterFreeFormTags", js.undefined)
        
        @scala.inline
        def setWhoCanHideAbuse(value: String): Self = StObject.set(x, "whoCanHideAbuse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanHideAbuseUndefined: Self = StObject.set(x, "whoCanHideAbuse", js.undefined)
        
        @scala.inline
        def setWhoCanInvite(value: String): Self = StObject.set(x, "whoCanInvite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanInviteUndefined: Self = StObject.set(x, "whoCanInvite", js.undefined)
        
        @scala.inline
        def setWhoCanJoin(value: String): Self = StObject.set(x, "whoCanJoin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanJoinUndefined: Self = StObject.set(x, "whoCanJoin", js.undefined)
        
        @scala.inline
        def setWhoCanLeaveGroup(value: String): Self = StObject.set(x, "whoCanLeaveGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanLeaveGroupUndefined: Self = StObject.set(x, "whoCanLeaveGroup", js.undefined)
        
        @scala.inline
        def setWhoCanLockTopics(value: String): Self = StObject.set(x, "whoCanLockTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanLockTopicsUndefined: Self = StObject.set(x, "whoCanLockTopics", js.undefined)
        
        @scala.inline
        def setWhoCanMakeTopicsSticky(value: String): Self = StObject.set(x, "whoCanMakeTopicsSticky", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMakeTopicsStickyUndefined: Self = StObject.set(x, "whoCanMakeTopicsSticky", js.undefined)
        
        @scala.inline
        def setWhoCanMarkDuplicate(value: String): Self = StObject.set(x, "whoCanMarkDuplicate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkDuplicateUndefined: Self = StObject.set(x, "whoCanMarkDuplicate", js.undefined)
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", js.undefined)
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkFavoriteReplyOnOwnTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", js.undefined)
        
        @scala.inline
        def setWhoCanMarkNoResponseNeeded(value: String): Self = StObject.set(x, "whoCanMarkNoResponseNeeded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMarkNoResponseNeededUndefined: Self = StObject.set(x, "whoCanMarkNoResponseNeeded", js.undefined)
        
        @scala.inline
        def setWhoCanModerateContent(value: String): Self = StObject.set(x, "whoCanModerateContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModerateContentUndefined: Self = StObject.set(x, "whoCanModerateContent", js.undefined)
        
        @scala.inline
        def setWhoCanModerateMembers(value: String): Self = StObject.set(x, "whoCanModerateMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModerateMembersUndefined: Self = StObject.set(x, "whoCanModerateMembers", js.undefined)
        
        @scala.inline
        def setWhoCanModifyMembers(value: String): Self = StObject.set(x, "whoCanModifyMembers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModifyMembersUndefined: Self = StObject.set(x, "whoCanModifyMembers", js.undefined)
        
        @scala.inline
        def setWhoCanModifyTagsAndCategories(value: String): Self = StObject.set(x, "whoCanModifyTagsAndCategories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanModifyTagsAndCategoriesUndefined: Self = StObject.set(x, "whoCanModifyTagsAndCategories", js.undefined)
        
        @scala.inline
        def setWhoCanMoveTopicsIn(value: String): Self = StObject.set(x, "whoCanMoveTopicsIn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMoveTopicsInUndefined: Self = StObject.set(x, "whoCanMoveTopicsIn", js.undefined)
        
        @scala.inline
        def setWhoCanMoveTopicsOut(value: String): Self = StObject.set(x, "whoCanMoveTopicsOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanMoveTopicsOutUndefined: Self = StObject.set(x, "whoCanMoveTopicsOut", js.undefined)
        
        @scala.inline
        def setWhoCanPostAnnouncements(value: String): Self = StObject.set(x, "whoCanPostAnnouncements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanPostAnnouncementsUndefined: Self = StObject.set(x, "whoCanPostAnnouncements", js.undefined)
        
        @scala.inline
        def setWhoCanPostMessage(value: String): Self = StObject.set(x, "whoCanPostMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanPostMessageUndefined: Self = StObject.set(x, "whoCanPostMessage", js.undefined)
        
        @scala.inline
        def setWhoCanTakeTopics(value: String): Self = StObject.set(x, "whoCanTakeTopics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanTakeTopicsUndefined: Self = StObject.set(x, "whoCanTakeTopics", js.undefined)
        
        @scala.inline
        def setWhoCanUnassignTopic(value: String): Self = StObject.set(x, "whoCanUnassignTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanUnassignTopicUndefined: Self = StObject.set(x, "whoCanUnassignTopic", js.undefined)
        
        @scala.inline
        def setWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanUnmarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", js.undefined)
        
        @scala.inline
        def setWhoCanViewGroup(value: String): Self = StObject.set(x, "whoCanViewGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanViewGroupUndefined: Self = StObject.set(x, "whoCanViewGroup", js.undefined)
        
        @scala.inline
        def setWhoCanViewMembership(value: String): Self = StObject.set(x, "whoCanViewMembership", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhoCanViewMembershipUndefined: Self = StObject.set(x, "whoCanViewMembership", js.undefined)
      }
    }
  }
}
