package typings
package gapiDotClientDotGroupssettingsLib.gapiNs.clientNs.groupssettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  /** Are external members allowed to join the group. */
  var allowExternalMembers: js.UndefOr[java.lang.String] = js.undefined
  /** Is google allowed to contact admins. */
  var allowGoogleCommunication: js.UndefOr[java.lang.String] = js.undefined
  /** If posting from web is allowed. */
  var allowWebPosting: js.UndefOr[java.lang.String] = js.undefined
  /** If the group is archive only */
  var archiveOnly: js.UndefOr[java.lang.String] = js.undefined
  /** Custom footer text. */
  var customFooterText: js.UndefOr[java.lang.String] = js.undefined
  /** Default email to which reply to any message should go. */
  var customReplyTo: js.UndefOr[java.lang.String] = js.undefined
  /** Default message deny notification message */
  var defaultMessageDenyNotificationText: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the group */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Email id of the group */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to include custom footer. */
  var includeCustomFooter: js.UndefOr[java.lang.String] = js.undefined
  /** If this groups should be included in global address list or not. */
  var includeInGlobalAddressList: js.UndefOr[java.lang.String] = js.undefined
  /** If the contents of the group are archived. */
  var isArchived: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum message size allowed. */
  var maxMessageBytes: js.UndefOr[scala.Double] = js.undefined
  /** Can members post using the group email address. */
  var membersCanPostAsTheGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Default message display font. Possible values are: DEFAULT_FONT FIXED_WIDTH_FONT */
  var messageDisplayFont: js.UndefOr[java.lang.String] = js.undefined
  /** Moderation level for messages. Possible values are: MODERATE_ALL_MESSAGES MODERATE_NON_MEMBERS MODERATE_NEW_MEMBERS MODERATE_NONE */
  var messageModerationLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the Group */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Primary language for the group. */
  var primaryLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whome should the default reply to a message go to. Possible values are: REPLY_TO_CUSTOM REPLY_TO_SENDER REPLY_TO_LIST REPLY_TO_OWNER REPLY_TO_IGNORE
    * REPLY_TO_MANAGERS
    */
  var replyTo: js.UndefOr[java.lang.String] = js.undefined
  /** Should the member be notified if his message is denied by owner. */
  var sendMessageDenyNotification: js.UndefOr[java.lang.String] = js.undefined
  /** Is the group listed in groups directory */
  var showInGroupDirectory: js.UndefOr[java.lang.String] = js.undefined
  /** Moderation level for messages detected as spam. Possible values are: ALLOW MODERATE SILENTLY_MODERATE REJECT */
  var spamModerationLevel: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions to add members. Possible values are: ALL_MANAGERS_CAN_ADD ALL_MEMBERS_CAN_ADD NONE_CAN_ADD */
  var whoCanAdd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Permission to contact owner of the group via web UI. Possible values are: ANYONE_CAN_CONTACT ALL_IN_DOMAIN_CAN_CONTACT ALL_MEMBERS_CAN_CONTACT
    * ALL_MANAGERS_CAN_CONTACT
    */
  var whoCanContactOwner: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions to invite members. Possible values are: ALL_MEMBERS_CAN_INVITE ALL_MANAGERS_CAN_INVITE NONE_CAN_INVITE */
  var whoCanInvite: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions to join the group. Possible values are: ANYONE_CAN_JOIN ALL_IN_DOMAIN_CAN_JOIN INVITED_CAN_JOIN CAN_REQUEST_TO_JOIN */
  var whoCanJoin: js.UndefOr[java.lang.String] = js.undefined
  /** Permission to leave the group. Possible values are: ALL_MANAGERS_CAN_LEAVE ALL_MEMBERS_CAN_LEAVE NONE_CAN_LEAVE */
  var whoCanLeaveGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Permissions to post messages to the group. Possible values are: NONE_CAN_POST ALL_MANAGERS_CAN_POST ALL_MEMBERS_CAN_POST ALL_OWNERS_CAN_POST
    * ALL_IN_DOMAIN_CAN_POST ANYONE_CAN_POST
    */
  var whoCanPostMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions to view group. Possible values are: ANYONE_CAN_VIEW ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions to view membership. Possible values are: ALL_IN_DOMAIN_CAN_VIEW ALL_MEMBERS_CAN_VIEW ALL_MANAGERS_CAN_VIEW */
  var whoCanViewMembership: js.UndefOr[java.lang.String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(
    allowExternalMembers: java.lang.String = null,
    allowGoogleCommunication: java.lang.String = null,
    allowWebPosting: java.lang.String = null,
    archiveOnly: java.lang.String = null,
    customFooterText: java.lang.String = null,
    customReplyTo: java.lang.String = null,
    defaultMessageDenyNotificationText: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    includeCustomFooter: java.lang.String = null,
    includeInGlobalAddressList: java.lang.String = null,
    isArchived: java.lang.String = null,
    kind: java.lang.String = null,
    maxMessageBytes: scala.Int | scala.Double = null,
    membersCanPostAsTheGroup: java.lang.String = null,
    messageDisplayFont: java.lang.String = null,
    messageModerationLevel: java.lang.String = null,
    name: java.lang.String = null,
    primaryLanguage: java.lang.String = null,
    replyTo: java.lang.String = null,
    sendMessageDenyNotification: java.lang.String = null,
    showInGroupDirectory: java.lang.String = null,
    spamModerationLevel: java.lang.String = null,
    whoCanAdd: java.lang.String = null,
    whoCanContactOwner: java.lang.String = null,
    whoCanInvite: java.lang.String = null,
    whoCanJoin: java.lang.String = null,
    whoCanLeaveGroup: java.lang.String = null,
    whoCanPostMessage: java.lang.String = null,
    whoCanViewGroup: java.lang.String = null,
    whoCanViewMembership: java.lang.String = null
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (allowExternalMembers != null) __obj.updateDynamic("allowExternalMembers")(allowExternalMembers)
    if (allowGoogleCommunication != null) __obj.updateDynamic("allowGoogleCommunication")(allowGoogleCommunication)
    if (allowWebPosting != null) __obj.updateDynamic("allowWebPosting")(allowWebPosting)
    if (archiveOnly != null) __obj.updateDynamic("archiveOnly")(archiveOnly)
    if (customFooterText != null) __obj.updateDynamic("customFooterText")(customFooterText)
    if (customReplyTo != null) __obj.updateDynamic("customReplyTo")(customReplyTo)
    if (defaultMessageDenyNotificationText != null) __obj.updateDynamic("defaultMessageDenyNotificationText")(defaultMessageDenyNotificationText)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (includeCustomFooter != null) __obj.updateDynamic("includeCustomFooter")(includeCustomFooter)
    if (includeInGlobalAddressList != null) __obj.updateDynamic("includeInGlobalAddressList")(includeInGlobalAddressList)
    if (isArchived != null) __obj.updateDynamic("isArchived")(isArchived)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxMessageBytes != null) __obj.updateDynamic("maxMessageBytes")(maxMessageBytes.asInstanceOf[js.Any])
    if (membersCanPostAsTheGroup != null) __obj.updateDynamic("membersCanPostAsTheGroup")(membersCanPostAsTheGroup)
    if (messageDisplayFont != null) __obj.updateDynamic("messageDisplayFont")(messageDisplayFont)
    if (messageModerationLevel != null) __obj.updateDynamic("messageModerationLevel")(messageModerationLevel)
    if (name != null) __obj.updateDynamic("name")(name)
    if (primaryLanguage != null) __obj.updateDynamic("primaryLanguage")(primaryLanguage)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (sendMessageDenyNotification != null) __obj.updateDynamic("sendMessageDenyNotification")(sendMessageDenyNotification)
    if (showInGroupDirectory != null) __obj.updateDynamic("showInGroupDirectory")(showInGroupDirectory)
    if (spamModerationLevel != null) __obj.updateDynamic("spamModerationLevel")(spamModerationLevel)
    if (whoCanAdd != null) __obj.updateDynamic("whoCanAdd")(whoCanAdd)
    if (whoCanContactOwner != null) __obj.updateDynamic("whoCanContactOwner")(whoCanContactOwner)
    if (whoCanInvite != null) __obj.updateDynamic("whoCanInvite")(whoCanInvite)
    if (whoCanJoin != null) __obj.updateDynamic("whoCanJoin")(whoCanJoin)
    if (whoCanLeaveGroup != null) __obj.updateDynamic("whoCanLeaveGroup")(whoCanLeaveGroup)
    if (whoCanPostMessage != null) __obj.updateDynamic("whoCanPostMessage")(whoCanPostMessage)
    if (whoCanViewGroup != null) __obj.updateDynamic("whoCanViewGroup")(whoCanViewGroup)
    if (whoCanViewMembership != null) __obj.updateDynamic("whoCanViewMembership")(whoCanViewMembership)
    __obj.asInstanceOf[Groups]
  }
}

