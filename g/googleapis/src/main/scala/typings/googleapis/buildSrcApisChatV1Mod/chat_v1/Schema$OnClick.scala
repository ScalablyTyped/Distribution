package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An onclick action (e.g. open a link).
  */
@js.native
trait Schema$OnClick extends js.Object {
  /**
    * A form action will be trigger by this onclick if specified.
    */
  var action: js.UndefOr[Schema$FormAction] = js.native
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[Schema$OpenLink] = js.native
}

object Schema$OnClick {
  @scala.inline
  def apply(action: Schema$FormAction = null, openLink: Schema$OpenLink = null): Schema$OnClick = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (openLink != null) __obj.updateDynamic("openLink")(openLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OnClick]
  }
}

