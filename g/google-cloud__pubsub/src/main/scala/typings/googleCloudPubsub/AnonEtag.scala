package typings.googleCloudPubsub

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEtag extends js.Object {
  var etag: js.UndefOr[String | Buffer] = js.undefined
}

object AnonEtag {
  @scala.inline
  def apply(etag: String | Buffer = null): AnonEtag = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEtag]
  }
}

