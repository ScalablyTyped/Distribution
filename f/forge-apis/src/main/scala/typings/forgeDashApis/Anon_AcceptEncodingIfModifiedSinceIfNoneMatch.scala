package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptEncodingIfModifiedSinceIfNoneMatch extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
  var ifModifiedSince: js.UndefOr[String] = js.undefined
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object Anon_AcceptEncodingIfModifiedSinceIfNoneMatch {
  @scala.inline
  def apply(
    acceptEncoding: String = null,
    ifModifiedSince: String = null,
    ifNoneMatch: String = null,
    range: String = null,
    region: String = null
  ): Anon_AcceptEncodingIfModifiedSinceIfNoneMatch = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding.asInstanceOf[js.Any])
    if (ifModifiedSince != null) __obj.updateDynamic("ifModifiedSince")(ifModifiedSince.asInstanceOf[js.Any])
    if (ifNoneMatch != null) __obj.updateDynamic("ifNoneMatch")(ifNoneMatch.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceptEncodingIfModifiedSinceIfNoneMatch]
  }
}

