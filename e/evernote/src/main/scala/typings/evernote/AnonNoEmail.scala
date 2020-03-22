package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoEmail extends js.Object {
  var noEmail: js.UndefOr[Boolean] = js.undefined
  var noShare: js.UndefOr[Boolean] = js.undefined
  var noSharePublicly: js.UndefOr[Boolean] = js.undefined
  var noUpdateContent: js.UndefOr[Boolean] = js.undefined
  var noUpdateTitle: js.UndefOr[Boolean] = js.undefined
}

object AnonNoEmail {
  @scala.inline
  def apply(
    noEmail: js.UndefOr[Boolean] = js.undefined,
    noShare: js.UndefOr[Boolean] = js.undefined,
    noSharePublicly: js.UndefOr[Boolean] = js.undefined,
    noUpdateContent: js.UndefOr[Boolean] = js.undefined,
    noUpdateTitle: js.UndefOr[Boolean] = js.undefined
  ): AnonNoEmail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noEmail)) __obj.updateDynamic("noEmail")(noEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(noShare)) __obj.updateDynamic("noShare")(noShare.asInstanceOf[js.Any])
    if (!js.isUndefined(noSharePublicly)) __obj.updateDynamic("noSharePublicly")(noSharePublicly.asInstanceOf[js.Any])
    if (!js.isUndefined(noUpdateContent)) __obj.updateDynamic("noUpdateContent")(noUpdateContent.asInstanceOf[js.Any])
    if (!js.isUndefined(noUpdateTitle)) __obj.updateDynamic("noUpdateTitle")(noUpdateTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoEmail]
  }
}

