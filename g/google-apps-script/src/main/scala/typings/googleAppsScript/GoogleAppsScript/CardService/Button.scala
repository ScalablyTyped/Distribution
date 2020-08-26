package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base class for all buttons.
  */
@js.native
trait Button extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): Button = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button = js.native
  def setOnClickAction(action: Action): Button = js.native
  def setOnClickOpenLinkAction(action: Action): Button = js.native
  def setOpenLink(openLink: OpenLink): Button = js.native
}

object Button {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => Button,
    setComposeAction: (Action, ComposedEmailType) => Button,
    setOnClickAction: Action => Button,
    setOnClickOpenLinkAction: Action => Button,
    setOpenLink: OpenLink => Button
  ): Button = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
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
    def setSetAuthorizationAction(value: AuthorizationAction => Button): Self = this.set("setAuthorizationAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => Button): Self = this.set("setComposeAction", js.Any.fromFunction2(value))
    @scala.inline
    def setSetOnClickAction(value: Action => Button): Self = this.set("setOnClickAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => Button): Self = this.set("setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOpenLink(value: OpenLink => Button): Self = this.set("setOpenLink", js.Any.fromFunction1(value))
  }
  
}

