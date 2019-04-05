package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gmail extends js.Object {
  var Users: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersCollection
  ] = js.undefined
  // Create a new instance of AutoForwarding
  def newAutoForwarding(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding
  // Create a new instance of BatchDeleteMessagesRequest
  def newBatchDeleteMessagesRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.BatchDeleteMessagesRequest
  // Create a new instance of BatchModifyMessagesRequest
  def newBatchModifyMessagesRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.BatchModifyMessagesRequest
  // Create a new instance of Delegate
  def newDelegate(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Delegate
  // Create a new instance of Draft
  def newDraft(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Draft
  // Create a new instance of Filter
  def newFilter(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter
  // Create a new instance of FilterAction
  def newFilterAction(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.FilterAction
  // Create a new instance of FilterCriteria
  def newFilterCriteria(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.FilterCriteria
  // Create a new instance of ForwardingAddress
  def newForwardingAddress(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ForwardingAddress
  // Create a new instance of ImapSettings
  def newImapSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings
  // Create a new instance of Label
  def newLabel(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label
  // Create a new instance of LabelColor
  def newLabelColor(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.LabelColor
  // Create a new instance of Message
  def newMessage(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Message
  // Create a new instance of MessagePart
  def newMessagePart(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePart
  // Create a new instance of MessagePartBody
  def newMessagePartBody(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePartBody
  // Create a new instance of MessagePartHeader
  def newMessagePartHeader(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePartHeader
  // Create a new instance of ModifyMessageRequest
  def newModifyMessageRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ModifyMessageRequest
  // Create a new instance of ModifyThreadRequest
  def newModifyThreadRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ModifyThreadRequest
  // Create a new instance of PopSettings
  def newPopSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings
  // Create a new instance of SendAs
  def newSendAs(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SendAs
  // Create a new instance of SmimeInfo
  def newSmimeInfo(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo
  // Create a new instance of SmtpMsa
  def newSmtpMsa(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmtpMsa
  // Create a new instance of VacationSettings
  def newVacationSettings(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings
  // Create a new instance of WatchRequest
  def newWatchRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchRequest
}

object Gmail {
  @scala.inline
  def apply(
    newAutoForwarding: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding,
    newBatchDeleteMessagesRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.BatchDeleteMessagesRequest,
    newBatchModifyMessagesRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.BatchModifyMessagesRequest,
    newDelegate: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Delegate,
    newDraft: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Draft,
    newFilter: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter,
    newFilterAction: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.FilterAction,
    newFilterCriteria: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.FilterCriteria,
    newForwardingAddress: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ForwardingAddress,
    newImapSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings,
    newLabel: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    newLabelColor: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.LabelColor,
    newMessage: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Message,
    newMessagePart: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePart,
    newMessagePartBody: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePartBody,
    newMessagePartHeader: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.MessagePartHeader,
    newModifyMessageRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ModifyMessageRequest,
    newModifyThreadRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ModifyThreadRequest,
    newPopSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings,
    newSendAs: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SendAs,
    newSmimeInfo: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmimeInfo,
    newSmtpMsa: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.SmtpMsa,
    newVacationSettings: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings,
    newWatchRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.WatchRequest,
    Users: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersCollection = null
  ): Gmail = {
    val __obj = js.Dynamic.literal(newAutoForwarding = js.Any.fromFunction0(newAutoForwarding), newBatchDeleteMessagesRequest = js.Any.fromFunction0(newBatchDeleteMessagesRequest), newBatchModifyMessagesRequest = js.Any.fromFunction0(newBatchModifyMessagesRequest), newDelegate = js.Any.fromFunction0(newDelegate), newDraft = js.Any.fromFunction0(newDraft), newFilter = js.Any.fromFunction0(newFilter), newFilterAction = js.Any.fromFunction0(newFilterAction), newFilterCriteria = js.Any.fromFunction0(newFilterCriteria), newForwardingAddress = js.Any.fromFunction0(newForwardingAddress), newImapSettings = js.Any.fromFunction0(newImapSettings), newLabel = js.Any.fromFunction0(newLabel), newLabelColor = js.Any.fromFunction0(newLabelColor), newMessage = js.Any.fromFunction0(newMessage), newMessagePart = js.Any.fromFunction0(newMessagePart), newMessagePartBody = js.Any.fromFunction0(newMessagePartBody), newMessagePartHeader = js.Any.fromFunction0(newMessagePartHeader), newModifyMessageRequest = js.Any.fromFunction0(newModifyMessageRequest), newModifyThreadRequest = js.Any.fromFunction0(newModifyThreadRequest), newPopSettings = js.Any.fromFunction0(newPopSettings), newSendAs = js.Any.fromFunction0(newSendAs), newSmimeInfo = js.Any.fromFunction0(newSmimeInfo), newSmtpMsa = js.Any.fromFunction0(newSmtpMsa), newVacationSettings = js.Any.fromFunction0(newVacationSettings), newWatchRequest = js.Any.fromFunction0(newWatchRequest))
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[Gmail]
  }
}

