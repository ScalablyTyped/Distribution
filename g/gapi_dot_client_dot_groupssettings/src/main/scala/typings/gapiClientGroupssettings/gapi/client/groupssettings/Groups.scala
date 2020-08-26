package typings.gapiClientGroupssettings.gapi.client.groupssettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  /** Are external members allowed to join the group. */
  var allowExternalMembers: js.UndefOr[String] = js.native
  /** Is google allowed to contact admins. */
  var allowGoogleCommunication: js.UndefOr[String] = js.native
  /** If posting from web is allowed. */
  var allowWebPosting: js.UndefOr[String] = js.native
  /** If the group is archive only */
  var archiveOnly: js.UndefOr[String] = js.native
  /** Custom footer text. */
  var customFooterText: js.UndefOr[String] = js.native
  /** Default email to which reply to any message should go. */
  var customReplyTo: js.UndefOr[String] = js.native
  /** Default message deny notification message */
  var defaultMessageDenyNotificationText: js.UndefOr[String] = js.native
  /** Description of the group */
  var description: js.UndefOr[String] = js.native
  /** Email id of the group */
  var email: js.UndefOr[String] = js.native
  /** Whether to include custom footer. */
  var includeCustomFooter: js.UndefOr[String] = js.native
  /** If this groups should be included in global address list or not. */
  var includeInGlobalAddressList: js.UndefOr[String] = js.native
  /** If the contents of the group are archived. */
  var isArchived: js.UndefOr[String] = js.native
  /** The type of the resource. */
  var kind: js.UndefOr[String] = js.native
  /** Maximum message size allowed. */
  var maxMessageBytes: js.UndefOr[Double] = js.native
  /** Can members post using the group email address. */
  var membersCanPostAsTheGroup: js.UndefOr[String] = js.native
  /** Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT */
  var messageDisplayFont: js.UndefOr[String] = js.native
  /** Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS MODERATE_NEW_MEMBERS MODERATE_NONE */
  var messageModerationLevel: js.UndefOr[String] = js.native
  /** Name of the Group */
  var name: js.UndefOr[String] = js.native
  /** Primary language for the group. */
  var primaryLanguage: js.UndefOr[String] = js.native
  /**
    * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE
    * REPLY_TO_MANAGERS
    */
  var replyTo: js.UndefOr[String] = js.native
  /** Should the member be notified if their message is denied by owner. */
  var sendMessageDenyNotification: js.UndefOr[String] = js.native
  /** Is the group listed in groups directory */
  var showInGroupDirectory: js.UndefOr[String] = js.native
  /** Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE SILENTLY_MODERATE REJECT */
  var spamModerationLevel: js.UndefOr[String] = js.native
  /** Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_MEMBERS_CAN_ADD NONE_CAN_ADD */
  var whoCanAdd: js.UndefOr[String] = js.native
  /**
    * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT
    * ALL_MANAGERS_CAN_CONTACT
    */
  var whoCanContactOwner: js.UndefOr[String] = js.native
  /** Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE ALL_MANAGERS_CAN_INVITE NONE_CAN_INVITE */
  var whoCanInvite: js.UndefOr[String] = js.native
  /** Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN */
  var whoCanJoin: js.UndefOr[String] = js.native
  /** Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE */
  var whoCanLeaveGroup: js.UndefOr[String] = js.native
  /**
    * Permissions to post messages to the group. Possible values are: NONE_CAN_POST ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST
    * ALL_IN_DOMAIN_CAN_POST ANYONE_CAN_POST
    */
  var whoCanPostMessage: js.UndefOr[String] = js.native
  /** Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewGroup: js.UndefOr[String] = js.native
  /** Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
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
    def setWhoCanContactOwner(value: String): Self = this.set("whoCanContactOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanContactOwner: Self = this.set("whoCanContactOwner", js.undefined)
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
    def setWhoCanPostMessage(value: String): Self = this.set("whoCanPostMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoCanPostMessage: Self = this.set("whoCanPostMessage", js.undefined)
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

