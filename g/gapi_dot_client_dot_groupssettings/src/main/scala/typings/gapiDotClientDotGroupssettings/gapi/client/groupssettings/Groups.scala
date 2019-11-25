package typings.gapiDotClientDotGroupssettings.gapi.client.groupssettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  /** Are external members allowed to join the group. */
  var allowExternalMembers: js.UndefOr[String] = js.undefined
  /** Is google allowed to contact admins. */
  var allowGoogleCommunication: js.UndefOr[String] = js.undefined
  /** If posting from web is allowed. */
  var allowWebPosting: js.UndefOr[String] = js.undefined
  /** If the group is archive only */
  var archiveOnly: js.UndefOr[String] = js.undefined
  /** Custom footer text. */
  var customFooterText: js.UndefOr[String] = js.undefined
  /** Default email to which reply to any message should go. */
  var customReplyTo: js.UndefOr[String] = js.undefined
  /** Default message deny notification message */
  var defaultMessageDenyNotificationText: js.UndefOr[String] = js.undefined
  /** Description of the group */
  var description: js.UndefOr[String] = js.undefined
  /** Email id of the group */
  var email: js.UndefOr[String] = js.undefined
  /** Whether to include custom footer. */
  var includeCustomFooter: js.UndefOr[String] = js.undefined
  /** If this groups should be included in global address list or not. */
  var includeInGlobalAddressList: js.UndefOr[String] = js.undefined
  /** If the contents of the group are archived. */
  var isArchived: js.UndefOr[String] = js.undefined
  /** The type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  /** Maximum message size allowed. */
  var maxMessageBytes: js.UndefOr[Double] = js.undefined
  /** Can members post using the group email address. */
  var membersCanPostAsTheGroup: js.UndefOr[String] = js.undefined
  /** Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT */
  var messageDisplayFont: js.UndefOr[String] = js.undefined
  /** Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS MODERATE_NEW_MEMBERS MODERATE_NONE */
  var messageModerationLevel: js.UndefOr[String] = js.undefined
  /** Name of the Group */
  var name: js.UndefOr[String] = js.undefined
  /** Primary language for the group. */
  var primaryLanguage: js.UndefOr[String] = js.undefined
  /**
    * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE
    * REPLY_TO_MANAGERS
    */
  var replyTo: js.UndefOr[String] = js.undefined
  /** Should the member be notified if their message is denied by owner. */
  var sendMessageDenyNotification: js.UndefOr[String] = js.undefined
  /** Is the group listed in groups directory */
  var showInGroupDirectory: js.UndefOr[String] = js.undefined
  /** Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE SILENTLY_MODERATE REJECT */
  var spamModerationLevel: js.UndefOr[String] = js.undefined
  /** Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_MEMBERS_CAN_ADD NONE_CAN_ADD */
  var whoCanAdd: js.UndefOr[String] = js.undefined
  /**
    * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT
    * ALL_MANAGERS_CAN_CONTACT
    */
  var whoCanContactOwner: js.UndefOr[String] = js.undefined
  /** Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE ALL_MANAGERS_CAN_INVITE NONE_CAN_INVITE */
  var whoCanInvite: js.UndefOr[String] = js.undefined
  /** Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN */
  var whoCanJoin: js.UndefOr[String] = js.undefined
  /** Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE */
  var whoCanLeaveGroup: js.UndefOr[String] = js.undefined
  /**
    * Permissions to post messages to the group. Possible values are: NONE_CAN_POST ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST
    * ALL_IN_DOMAIN_CAN_POST ANYONE_CAN_POST
    */
  var whoCanPostMessage: js.UndefOr[String] = js.undefined
  /** Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewGroup: js.UndefOr[String] = js.undefined
  /** Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewMembership: js.UndefOr[String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(
    allowExternalMembers: String = null,
    allowGoogleCommunication: String = null,
    allowWebPosting: String = null,
    archiveOnly: String = null,
    customFooterText: String = null,
    customReplyTo: String = null,
    defaultMessageDenyNotificationText: String = null,
    description: String = null,
    email: String = null,
    includeCustomFooter: String = null,
    includeInGlobalAddressList: String = null,
    isArchived: String = null,
    kind: String = null,
    maxMessageBytes: Int | Double = null,
    membersCanPostAsTheGroup: String = null,
    messageDisplayFont: String = null,
    messageModerationLevel: String = null,
    name: String = null,
    primaryLanguage: String = null,
    replyTo: String = null,
    sendMessageDenyNotification: String = null,
    showInGroupDirectory: String = null,
    spamModerationLevel: String = null,
    whoCanAdd: String = null,
    whoCanContactOwner: String = null,
    whoCanInvite: String = null,
    whoCanJoin: String = null,
    whoCanLeaveGroup: String = null,
    whoCanPostMessage: String = null,
    whoCanViewGroup: String = null,
    whoCanViewMembership: String = null
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (allowExternalMembers != null) __obj.updateDynamic("allowExternalMembers")(allowExternalMembers.asInstanceOf[js.Any])
    if (allowGoogleCommunication != null) __obj.updateDynamic("allowGoogleCommunication")(allowGoogleCommunication.asInstanceOf[js.Any])
    if (allowWebPosting != null) __obj.updateDynamic("allowWebPosting")(allowWebPosting.asInstanceOf[js.Any])
    if (archiveOnly != null) __obj.updateDynamic("archiveOnly")(archiveOnly.asInstanceOf[js.Any])
    if (customFooterText != null) __obj.updateDynamic("customFooterText")(customFooterText.asInstanceOf[js.Any])
    if (customReplyTo != null) __obj.updateDynamic("customReplyTo")(customReplyTo.asInstanceOf[js.Any])
    if (defaultMessageDenyNotificationText != null) __obj.updateDynamic("defaultMessageDenyNotificationText")(defaultMessageDenyNotificationText.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (includeCustomFooter != null) __obj.updateDynamic("includeCustomFooter")(includeCustomFooter.asInstanceOf[js.Any])
    if (includeInGlobalAddressList != null) __obj.updateDynamic("includeInGlobalAddressList")(includeInGlobalAddressList.asInstanceOf[js.Any])
    if (isArchived != null) __obj.updateDynamic("isArchived")(isArchived.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxMessageBytes != null) __obj.updateDynamic("maxMessageBytes")(maxMessageBytes.asInstanceOf[js.Any])
    if (membersCanPostAsTheGroup != null) __obj.updateDynamic("membersCanPostAsTheGroup")(membersCanPostAsTheGroup.asInstanceOf[js.Any])
    if (messageDisplayFont != null) __obj.updateDynamic("messageDisplayFont")(messageDisplayFont.asInstanceOf[js.Any])
    if (messageModerationLevel != null) __obj.updateDynamic("messageModerationLevel")(messageModerationLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (primaryLanguage != null) __obj.updateDynamic("primaryLanguage")(primaryLanguage.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sendMessageDenyNotification != null) __obj.updateDynamic("sendMessageDenyNotification")(sendMessageDenyNotification.asInstanceOf[js.Any])
    if (showInGroupDirectory != null) __obj.updateDynamic("showInGroupDirectory")(showInGroupDirectory.asInstanceOf[js.Any])
    if (spamModerationLevel != null) __obj.updateDynamic("spamModerationLevel")(spamModerationLevel.asInstanceOf[js.Any])
    if (whoCanAdd != null) __obj.updateDynamic("whoCanAdd")(whoCanAdd.asInstanceOf[js.Any])
    if (whoCanContactOwner != null) __obj.updateDynamic("whoCanContactOwner")(whoCanContactOwner.asInstanceOf[js.Any])
    if (whoCanInvite != null) __obj.updateDynamic("whoCanInvite")(whoCanInvite.asInstanceOf[js.Any])
    if (whoCanJoin != null) __obj.updateDynamic("whoCanJoin")(whoCanJoin.asInstanceOf[js.Any])
    if (whoCanLeaveGroup != null) __obj.updateDynamic("whoCanLeaveGroup")(whoCanLeaveGroup.asInstanceOf[js.Any])
    if (whoCanPostMessage != null) __obj.updateDynamic("whoCanPostMessage")(whoCanPostMessage.asInstanceOf[js.Any])
    if (whoCanViewGroup != null) __obj.updateDynamic("whoCanViewGroup")(whoCanViewGroup.asInstanceOf[js.Any])
    if (whoCanViewMembership != null) __obj.updateDynamic("whoCanViewMembership")(whoCanViewMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

