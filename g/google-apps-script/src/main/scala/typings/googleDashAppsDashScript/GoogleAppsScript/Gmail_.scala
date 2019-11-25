package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.UsersCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.BatchDeleteMessagesRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.BatchModifyMessagesRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.Delegate
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.Draft
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.Filter
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.FilterAction
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.FilterCriteria
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.Label
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.LabelColor
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.Message
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.MessagePart
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.MessagePartHeader
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ModifyMessageRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ModifyThreadRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.SendAs
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.SmimeInfo
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.SmtpMsa
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Gmail")
trait Gmail_ extends js.Object {
  var Users: js.UndefOr[UsersCollection] = js.undefined
  // Create a new instance of AutoForwarding
  def newAutoForwarding(): AutoForwarding
  // Create a new instance of BatchDeleteMessagesRequest
  def newBatchDeleteMessagesRequest(): BatchDeleteMessagesRequest
  // Create a new instance of BatchModifyMessagesRequest
  def newBatchModifyMessagesRequest(): BatchModifyMessagesRequest
  // Create a new instance of Delegate
  def newDelegate(): Delegate
  // Create a new instance of Draft
  def newDraft(): Draft
  // Create a new instance of Filter
  def newFilter(): Filter
  // Create a new instance of FilterAction
  def newFilterAction(): FilterAction
  // Create a new instance of FilterCriteria
  def newFilterCriteria(): FilterCriteria
  // Create a new instance of ForwardingAddress
  def newForwardingAddress(): ForwardingAddress
  // Create a new instance of ImapSettings
  def newImapSettings(): ImapSettings
  // Create a new instance of Label
  def newLabel(): Label
  // Create a new instance of LabelColor
  def newLabelColor(): LabelColor
  // Create a new instance of Message
  def newMessage(): Message
  // Create a new instance of MessagePart
  def newMessagePart(): MessagePart
  // Create a new instance of MessagePartBody
  def newMessagePartBody(): MessagePartBody
  // Create a new instance of MessagePartHeader
  def newMessagePartHeader(): MessagePartHeader
  // Create a new instance of ModifyMessageRequest
  def newModifyMessageRequest(): ModifyMessageRequest
  // Create a new instance of ModifyThreadRequest
  def newModifyThreadRequest(): ModifyThreadRequest
  // Create a new instance of PopSettings
  def newPopSettings(): PopSettings
  // Create a new instance of SendAs
  def newSendAs(): SendAs
  // Create a new instance of SmimeInfo
  def newSmimeInfo(): SmimeInfo
  // Create a new instance of SmtpMsa
  def newSmtpMsa(): SmtpMsa
  // Create a new instance of VacationSettings
  def newVacationSettings(): VacationSettings
  // Create a new instance of WatchRequest
  def newWatchRequest(): WatchRequest
}

object Gmail_ {
  @scala.inline
  def apply(
    newAutoForwarding: () => AutoForwarding,
    newBatchDeleteMessagesRequest: () => BatchDeleteMessagesRequest,
    newBatchModifyMessagesRequest: () => BatchModifyMessagesRequest,
    newDelegate: () => Delegate,
    newDraft: () => Draft,
    newFilter: () => Filter,
    newFilterAction: () => FilterAction,
    newFilterCriteria: () => FilterCriteria,
    newForwardingAddress: () => ForwardingAddress,
    newImapSettings: () => ImapSettings,
    newLabel: () => Label,
    newLabelColor: () => LabelColor,
    newMessage: () => Message,
    newMessagePart: () => MessagePart,
    newMessagePartBody: () => MessagePartBody,
    newMessagePartHeader: () => MessagePartHeader,
    newModifyMessageRequest: () => ModifyMessageRequest,
    newModifyThreadRequest: () => ModifyThreadRequest,
    newPopSettings: () => PopSettings,
    newSendAs: () => SendAs,
    newSmimeInfo: () => SmimeInfo,
    newSmtpMsa: () => SmtpMsa,
    newVacationSettings: () => VacationSettings,
    newWatchRequest: () => WatchRequest,
    Users: UsersCollection = null
  ): Gmail_ = {
    val __obj = js.Dynamic.literal(newAutoForwarding = js.Any.fromFunction0(newAutoForwarding), newBatchDeleteMessagesRequest = js.Any.fromFunction0(newBatchDeleteMessagesRequest), newBatchModifyMessagesRequest = js.Any.fromFunction0(newBatchModifyMessagesRequest), newDelegate = js.Any.fromFunction0(newDelegate), newDraft = js.Any.fromFunction0(newDraft), newFilter = js.Any.fromFunction0(newFilter), newFilterAction = js.Any.fromFunction0(newFilterAction), newFilterCriteria = js.Any.fromFunction0(newFilterCriteria), newForwardingAddress = js.Any.fromFunction0(newForwardingAddress), newImapSettings = js.Any.fromFunction0(newImapSettings), newLabel = js.Any.fromFunction0(newLabel), newLabelColor = js.Any.fromFunction0(newLabelColor), newMessage = js.Any.fromFunction0(newMessage), newMessagePart = js.Any.fromFunction0(newMessagePart), newMessagePartBody = js.Any.fromFunction0(newMessagePartBody), newMessagePartHeader = js.Any.fromFunction0(newMessagePartHeader), newModifyMessageRequest = js.Any.fromFunction0(newModifyMessageRequest), newModifyThreadRequest = js.Any.fromFunction0(newModifyThreadRequest), newPopSettings = js.Any.fromFunction0(newPopSettings), newSendAs = js.Any.fromFunction0(newSendAs), newSmimeInfo = js.Any.fromFunction0(newSmimeInfo), newSmtpMsa = js.Any.fromFunction0(newSmtpMsa), newVacationSettings = js.Any.fromFunction0(newVacationSettings), newWatchRequest = js.Any.fromFunction0(newWatchRequest))
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gmail_]
  }
}

