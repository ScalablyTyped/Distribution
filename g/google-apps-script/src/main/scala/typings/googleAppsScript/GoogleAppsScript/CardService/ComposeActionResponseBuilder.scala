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
@js.native
trait ComposeActionResponseBuilder extends js.Object {
  def build(): ComposeActionResponse = js.native
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder = js.native
}

object ComposeActionResponseBuilder {
  @scala.inline
  def apply(build: () => ComposeActionResponse, setGmailDraft: GmailDraft => ComposeActionResponseBuilder): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setGmailDraft = js.Any.fromFunction1(setGmailDraft))
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
  @scala.inline
  implicit class ComposeActionResponseBuilderOps[Self <: ComposeActionResponseBuilder] (val x: Self) extends AnyVal {
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
    def setBuild(value: () => ComposeActionResponse): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetGmailDraft(value: GmailDraft => ComposeActionResponseBuilder): Self = this.set("setGmailDraft", js.Any.fromFunction1(value))
  }
  
}

