package typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  var allowExternalMembers: js.UndefOr[String] = js.native
  var allowGoogleCommunication: js.UndefOr[String] = js.native
  var allowWebPosting: js.UndefOr[String] = js.native
  var archiveOnly: js.UndefOr[String] = js.native
  var customFooterText: js.UndefOr[String] = js.native
  var customReplyTo: js.UndefOr[String] = js.native
  var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String] = js.native
  var defaultMessageDenyNotificationText: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var enableCollaborativeInbox: js.UndefOr[String] = js.native
  var favoriteRepliesOnTop: js.UndefOr[String] = js.native
  var includeCustomFooter: js.UndefOr[String] = js.native
  var includeInGlobalAddressList: js.UndefOr[String] = js.native
  var isArchived: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var maxMessageBytes: js.UndefOr[Double] = js.native
  var membersCanPostAsTheGroup: js.UndefOr[String] = js.native
  var messageDisplayFont: js.UndefOr[String] = js.native
  var messageModerationLevel: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var primaryLanguage: js.UndefOr[String] = js.native
  var replyTo: js.UndefOr[String] = js.native
  var sendMessageDenyNotification: js.UndefOr[String] = js.native
  var showInGroupDirectory: js.UndefOr[String] = js.native
  var spamModerationLevel: js.UndefOr[String] = js.native
  var whoCanAdd: js.UndefOr[String] = js.native
  var whoCanAddReferences: js.UndefOr[String] = js.native
  var whoCanApproveMembers: js.UndefOr[String] = js.native
  var whoCanApproveMessages: js.UndefOr[String] = js.native
  var whoCanAssignTopics: js.UndefOr[String] = js.native
  var whoCanAssistContent: js.UndefOr[String] = js.native
  var whoCanBanUsers: js.UndefOr[String] = js.native
  var whoCanContactOwner: js.UndefOr[String] = js.native
  var whoCanDeleteAnyPost: js.UndefOr[String] = js.native
  var whoCanDeleteTopics: js.UndefOr[String] = js.native
  var whoCanDiscoverGroup: js.UndefOr[String] = js.native
  var whoCanEnterFreeFormTags: js.UndefOr[String] = js.native
  var whoCanHideAbuse: js.UndefOr[String] = js.native
  var whoCanInvite: js.UndefOr[String] = js.native
  var whoCanJoin: js.UndefOr[String] = js.native
  var whoCanLeaveGroup: js.UndefOr[String] = js.native
  var whoCanLockTopics: js.UndefOr[String] = js.native
  var whoCanMakeTopicsSticky: js.UndefOr[String] = js.native
  var whoCanMarkDuplicate: js.UndefOr[String] = js.native
  var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
  var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String] = js.native
  var whoCanMarkNoResponseNeeded: js.UndefOr[String] = js.native
  var whoCanModerateContent: js.UndefOr[String] = js.native
  var whoCanModerateMembers: js.UndefOr[String] = js.native
  var whoCanModifyMembers: js.UndefOr[String] = js.native
  var whoCanModifyTagsAndCategories: js.UndefOr[String] = js.native
  var whoCanMoveTopicsIn: js.UndefOr[String] = js.native
  var whoCanMoveTopicsOut: js.UndefOr[String] = js.native
  var whoCanPostAnnouncements: js.UndefOr[String] = js.native
  var whoCanPostMessage: js.UndefOr[String] = js.native
  var whoCanTakeTopics: js.UndefOr[String] = js.native
  var whoCanUnassignTopic: js.UndefOr[String] = js.native
  var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.native
  var whoCanViewGroup: js.UndefOr[String] = js.native
  var whoCanViewMembership: js.UndefOr[String] = js.native
}

object Groups {
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
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
    def setAllowExternalMembers(value: String): Self = this.set("allowExternalMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExternalMembers: Self = this.set("allowExternalMembers", js.undefined)
    @scala.inline
    def setAllowGoogleCommunication(value: String): Self = this.set("allowGoogleCommunication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowGoogleCommunication: Self = this.set("allowGoogleCommunication", js.undefined)
    @scala.inline
    def setAllowWebPosting(value: String): Self = this.set("allowWebPosting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowWebPosting: Self = this.set("allowWebPosting", js.undefined)
    @scala.inline
    def setArchiveOnly(value: String): Self = this.set("archiveOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveOnly: Self = this.set("archiveOnly", js.undefined)
    @scala.inline
    def setCustomFooterText(value: String): Self = this.set("customFooterText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFooterText: Self = this.set("customFooterText", js.undefined)
    @scala.inline
    def setCustomReplyTo(value: String): Self = this.set("customReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomReplyTo: Self = this.set("customReplyTo", js.undefined)
    @scala.inline
    def setCustomRolesEnabledForSettingsToBeMerged(value: String): Self = this.set("customRolesEnabledForSettingsToBeMerged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRolesEnabledForSettingsToBeMerged: Self = this.set("customRolesEnabledForSettingsToBeMerged", js.undefined)
    @scala.inline
    def setDefaultMessageDenyNotificationText(value: String): Self = this.set("defaultMessageDenyNotificationText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessageDenyNotificationText: Self = this.set("defaultMessageDenyNotificationText", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEnableCollaborativeInbox(value: String): Self = this.set("enableCollaborativeInbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCollaborativeInbox: Self = this.set("enableCollaborativeInbox", js.undefined)
    @scala.inline
    def setFavoriteRepliesOnTop(value: String): Self = this.set("favoriteRepliesOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavoriteRepliesOnTop: Self = this.set("favoriteRepliesOnTop", js.undefined)
    @scala.inline
    def setIncludeCustomFooter(value: String): Self = this.set("includeCustomFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCustomFooter: Self = this.set("includeCustomFooter", js.undefined)
    @scala.inline
    def setIncludeInGlobalAddressList(value: String): Self = this.set("includeInGlobalAddressList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInGlobalAddressList: Self = this.set("includeInGlobalAddressList", js.undefined)
    @scala.inline
    def setIsArchived(value: String): Self = this.set("isArchived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsArchived: Self = this.set("isArchived", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxMessageBytes(value: Double): Self = this.set("maxMessageBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMessageBytes: Self = this.set("maxMessageBytes", js.undefined)
    @scala.inline
    def setMembersCanPostAsTheGroup(value: String): Self = this.set("membersCanPostAsTheGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembersCanPostAsTheGroup: Self = this.set("membersCanPostAsTheGroup", js.undefined)
    @scala.inline
    def setMessageDisplayFont(value: String): Self = this.set("messageDisplayFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageDisplayFont: Self = this.set("messageDisplayFont", js.undefined)
    @scala.inline
    def setMessageModerationLevel(value: String): Self = this.set("messageModerationLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageModerationLevel: Self = this.set("messageModerationLevel", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrimaryLanguage(value: String): Self = this.set("primaryLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLanguage: Self = this.set("primaryLanguage", js.undefined)
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setSendMessageDenyNotification(value: String): Self = this.set("sendMessageDenyNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendMessageDenyNotification: Self = this.set("sendMessageDenyNotification", js.undefined)
    @scala.inline
    def setShowInGroupDirectory(value: String): Self = this.set("showInGroupDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInGroupDirectory: Self = this.set("showInGroupDirectory", js.undefined)
    @scala.inline
    def setSpamModerationLevel(value: String): Self = this.set("spamModerationLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpamModerationLevel: Self = this.set("spamModerationLevel", js.undefined)
    @scala.inline
    def setWhoCanAdd(value: String): Self = this.set("whoCanAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanAdd: Self = this.set("whoCanAdd", js.undefined)
    @scala.inline
    def setWhoCanAddReferences(value: String): Self = this.set("whoCanAddReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanAddReferences: Self = this.set("whoCanAddReferences", js.undefined)
    @scala.inline
    def setWhoCanApproveMembers(value: String): Self = this.set("whoCanApproveMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanApproveMembers: Self = this.set("whoCanApproveMembers", js.undefined)
    @scala.inline
    def setWhoCanApproveMessages(value: String): Self = this.set("whoCanApproveMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanApproveMessages: Self = this.set("whoCanApproveMessages", js.undefined)
    @scala.inline
    def setWhoCanAssignTopics(value: String): Self = this.set("whoCanAssignTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanAssignTopics: Self = this.set("whoCanAssignTopics", js.undefined)
    @scala.inline
    def setWhoCanAssistContent(value: String): Self = this.set("whoCanAssistContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanAssistContent: Self = this.set("whoCanAssistContent", js.undefined)
    @scala.inline
    def setWhoCanBanUsers(value: String): Self = this.set("whoCanBanUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanBanUsers: Self = this.set("whoCanBanUsers", js.undefined)
    @scala.inline
    def setWhoCanContactOwner(value: String): Self = this.set("whoCanContactOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanContactOwner: Self = this.set("whoCanContactOwner", js.undefined)
    @scala.inline
    def setWhoCanDeleteAnyPost(value: String): Self = this.set("whoCanDeleteAnyPost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanDeleteAnyPost: Self = this.set("whoCanDeleteAnyPost", js.undefined)
    @scala.inline
    def setWhoCanDeleteTopics(value: String): Self = this.set("whoCanDeleteTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanDeleteTopics: Self = this.set("whoCanDeleteTopics", js.undefined)
    @scala.inline
    def setWhoCanDiscoverGroup(value: String): Self = this.set("whoCanDiscoverGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanDiscoverGroup: Self = this.set("whoCanDiscoverGroup", js.undefined)
    @scala.inline
    def setWhoCanEnterFreeFormTags(value: String): Self = this.set("whoCanEnterFreeFormTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanEnterFreeFormTags: Self = this.set("whoCanEnterFreeFormTags", js.undefined)
    @scala.inline
    def setWhoCanHideAbuse(value: String): Self = this.set("whoCanHideAbuse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanHideAbuse: Self = this.set("whoCanHideAbuse", js.undefined)
    @scala.inline
    def setWhoCanInvite(value: String): Self = this.set("whoCanInvite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanInvite: Self = this.set("whoCanInvite", js.undefined)
    @scala.inline
    def setWhoCanJoin(value: String): Self = this.set("whoCanJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanJoin: Self = this.set("whoCanJoin", js.undefined)
    @scala.inline
    def setWhoCanLeaveGroup(value: String): Self = this.set("whoCanLeaveGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanLeaveGroup: Self = this.set("whoCanLeaveGroup", js.undefined)
    @scala.inline
    def setWhoCanLockTopics(value: String): Self = this.set("whoCanLockTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanLockTopics: Self = this.set("whoCanLockTopics", js.undefined)
    @scala.inline
    def setWhoCanMakeTopicsSticky(value: String): Self = this.set("whoCanMakeTopicsSticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMakeTopicsSticky: Self = this.set("whoCanMakeTopicsSticky", js.undefined)
    @scala.inline
    def setWhoCanMarkDuplicate(value: String): Self = this.set("whoCanMarkDuplicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMarkDuplicate: Self = this.set("whoCanMarkDuplicate", js.undefined)
    @scala.inline
    def setWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = this.set("whoCanMarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMarkFavoriteReplyOnAnyTopic: Self = this.set("whoCanMarkFavoriteReplyOnAnyTopic", js.undefined)
    @scala.inline
    def setWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = this.set("whoCanMarkFavoriteReplyOnOwnTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMarkFavoriteReplyOnOwnTopic: Self = this.set("whoCanMarkFavoriteReplyOnOwnTopic", js.undefined)
    @scala.inline
    def setWhoCanMarkNoResponseNeeded(value: String): Self = this.set("whoCanMarkNoResponseNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMarkNoResponseNeeded: Self = this.set("whoCanMarkNoResponseNeeded", js.undefined)
    @scala.inline
    def setWhoCanModerateContent(value: String): Self = this.set("whoCanModerateContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanModerateContent: Self = this.set("whoCanModerateContent", js.undefined)
    @scala.inline
    def setWhoCanModerateMembers(value: String): Self = this.set("whoCanModerateMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanModerateMembers: Self = this.set("whoCanModerateMembers", js.undefined)
    @scala.inline
    def setWhoCanModifyMembers(value: String): Self = this.set("whoCanModifyMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanModifyMembers: Self = this.set("whoCanModifyMembers", js.undefined)
    @scala.inline
    def setWhoCanModifyTagsAndCategories(value: String): Self = this.set("whoCanModifyTagsAndCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanModifyTagsAndCategories: Self = this.set("whoCanModifyTagsAndCategories", js.undefined)
    @scala.inline
    def setWhoCanMoveTopicsIn(value: String): Self = this.set("whoCanMoveTopicsIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMoveTopicsIn: Self = this.set("whoCanMoveTopicsIn", js.undefined)
    @scala.inline
    def setWhoCanMoveTopicsOut(value: String): Self = this.set("whoCanMoveTopicsOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanMoveTopicsOut: Self = this.set("whoCanMoveTopicsOut", js.undefined)
    @scala.inline
    def setWhoCanPostAnnouncements(value: String): Self = this.set("whoCanPostAnnouncements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanPostAnnouncements: Self = this.set("whoCanPostAnnouncements", js.undefined)
    @scala.inline
    def setWhoCanPostMessage(value: String): Self = this.set("whoCanPostMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanPostMessage: Self = this.set("whoCanPostMessage", js.undefined)
    @scala.inline
    def setWhoCanTakeTopics(value: String): Self = this.set("whoCanTakeTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanTakeTopics: Self = this.set("whoCanTakeTopics", js.undefined)
    @scala.inline
    def setWhoCanUnassignTopic(value: String): Self = this.set("whoCanUnassignTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanUnassignTopic: Self = this.set("whoCanUnassignTopic", js.undefined)
    @scala.inline
    def setWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = this.set("whoCanUnmarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanUnmarkFavoriteReplyOnAnyTopic: Self = this.set("whoCanUnmarkFavoriteReplyOnAnyTopic", js.undefined)
    @scala.inline
    def setWhoCanViewGroup(value: String): Self = this.set("whoCanViewGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanViewGroup: Self = this.set("whoCanViewGroup", js.undefined)
    @scala.inline
    def setWhoCanViewMembership(value: String): Self = this.set("whoCanViewMembership", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanViewMembership: Self = this.set("whoCanViewMembership", js.undefined)
  }
  
}

