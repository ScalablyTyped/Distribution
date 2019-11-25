package typings.atGoogleDashCloudPubsub

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Etag extends js.Object {
  var etag: js.UndefOr[String | Buffer] = js.undefined
}

object Anon_Etag {
  @scala.inline
  def apply(etag: String | Buffer = null): Anon_Etag = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Etag]
  }
}

