package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.Gmail.GmailDraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for ComposeActionResponse objects.
  *
  * Note: This object isn't related to compose actions that are
  * used to extend the compose UI. Rather,
  * this builder creates responses to an Action that composes draft messages when a specific
  * UI element is selected.
  */
trait ComposeActionResponseBuilder extends js.Object {
  def build(): ComposeActionResponse
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder
}

object ComposeActionResponseBuilder {
  @scala.inline
  def apply(build: () => ComposeActionResponse, setGmailDraft: GmailDraft => ComposeActionResponseBuilder): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setGmailDraft = js.Any.fromFunction1(setGmailDraft))
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
}

