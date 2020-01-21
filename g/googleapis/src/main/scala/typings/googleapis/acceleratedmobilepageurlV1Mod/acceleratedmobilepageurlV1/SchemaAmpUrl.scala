package typings.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AMP URL response for a requested URL.
  */
@js.native
trait SchemaAmpUrl extends js.Object {
  /**
    * The AMP URL pointing to the publisher&#39;s web server.
    */
  var ampUrl: js.UndefOr[String] = js.native
  /**
    * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to
    * the cached document in the Google AMP Cache.
    */
  var cdnAmpUrl: js.UndefOr[String] = js.native
  /**
    * The original non-AMP URL.
    */
  var originalUrl: js.UndefOr[String] = js.native
}

object SchemaAmpUrl {
  @scala.inline
  def apply(ampUrl: String = null, cdnAmpUrl: String = null, originalUrl: String = null): SchemaAmpUrl = {
    val __obj = js.Dynamic.literal()
    if (ampUrl != null) __obj.updateDynamic("ampUrl")(ampUrl.asInstanceOf[js.Any])
    if (cdnAmpUrl != null) __obj.updateDynamic("cdnAmpUrl")(cdnAmpUrl.asInstanceOf[js.Any])
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAmpUrl]
  }
}

