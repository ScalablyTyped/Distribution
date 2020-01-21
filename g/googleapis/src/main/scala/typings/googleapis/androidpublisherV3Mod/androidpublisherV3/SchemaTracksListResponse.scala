package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTracksListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#tracksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var tracks: js.UndefOr[js.Array[SchemaTrack]] = js.native
}

object SchemaTracksListResponse {
  @scala.inline
  def apply(kind: String = null, tracks: js.Array[SchemaTrack] = null): SchemaTracksListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTracksListResponse]
  }
}

