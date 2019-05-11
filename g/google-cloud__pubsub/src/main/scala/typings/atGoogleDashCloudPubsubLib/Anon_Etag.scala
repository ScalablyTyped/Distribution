package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Etag extends js.Object {
  var etag: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
}

object Anon_Etag {
  @scala.inline
  def apply(etag: java.lang.String | nodeLib.Buffer = null): Anon_Etag = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Etag]
  }
}

