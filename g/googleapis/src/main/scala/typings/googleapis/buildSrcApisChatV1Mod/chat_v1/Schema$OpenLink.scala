package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link that opens a new window.
  */
@js.native
trait Schema$OpenLink extends js.Object {
  /**
    * The URL to open.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$OpenLink {
  @scala.inline
  def apply(url: String = null): Schema$OpenLink = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OpenLink]
  }
}

