package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a video.
  */
@js.native
trait Schema$Video extends js.Object {
  /**
    * The video source&#39;s unique identifier for this video.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * An URL to a video. The URL is valid as long as the source video exists
    * and sharing settings do not change.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The properties of the video.
    */
  var videoProperties: js.UndefOr[Schema$VideoProperties] = js.native
}

object Schema$Video {
  @scala.inline
  def apply(
    id: String = null,
    source: String = null,
    url: String = null,
    videoProperties: Schema$VideoProperties = null
  ): Schema$Video = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (videoProperties != null) __obj.updateDynamic("videoProperties")(videoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Video]
  }
}

