package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAdWordsLinkEntity extends js.Object {
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.undefined
}

object EntityAdWordsLinkEntity {
  @scala.inline
  def apply(webPropertyRef: WebPropertyRef = null): EntityAdWordsLinkEntity = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityAdWordsLinkEntity]
  }
}

