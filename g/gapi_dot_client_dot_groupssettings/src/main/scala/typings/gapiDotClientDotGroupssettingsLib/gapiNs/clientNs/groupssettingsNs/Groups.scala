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

