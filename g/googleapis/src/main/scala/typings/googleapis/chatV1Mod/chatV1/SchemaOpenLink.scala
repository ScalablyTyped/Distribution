package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link that opens a new window.
  */
@js.native
trait SchemaOpenLink extends js.Object {
  /**
    * The URL to open.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaOpenLink {
  @scala.inline
  def apply(url: String = null): SchemaOpenLink = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOpenLink]
  }
}

