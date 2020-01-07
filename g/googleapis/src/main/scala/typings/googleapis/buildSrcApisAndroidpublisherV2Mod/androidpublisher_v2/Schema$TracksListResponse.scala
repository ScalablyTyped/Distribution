package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TracksListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#tracksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var tracks: js.UndefOr[js.Array[Schema$Track]] = js.native
}

object Schema$TracksListResponse {
  @scala.inline
  def apply(kind: String = null, tracks: js.Array[Schema$Track] = null): Schema$TracksListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TracksListResponse]
  }
}

