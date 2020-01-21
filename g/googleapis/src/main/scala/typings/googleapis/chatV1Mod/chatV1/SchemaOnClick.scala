package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An onclick action (e.g. open a link).
  */
@js.native
trait SchemaOnClick extends js.Object {
  /**
    * A form action will be trigger by this onclick if specified.
    */
  var action: js.UndefOr[SchemaFormAction] = js.native
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[SchemaOpenLink] = js.native
}

object SchemaOnClick {
  @scala.inline
  def apply(action: SchemaFormAction = null, openLink: SchemaOpenLink = null): SchemaOnClick = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (openLink != null) __obj.updateDynamic("openLink")(openLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOnClick]
  }
}

