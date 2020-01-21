package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlgorithm extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var hash: js.UndefOr[String] = js.native
  var length: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var timeCreated: js.UndefOr[String] = js.native
}

object AnonAlgorithm {
  @scala.inline
  def apply(
    algorithm: String = null,
    contentType: String = null,
    data: String = null,
    hash: String = null,
    length: String = null,
    link: String = null,
    timeCreated: String = null
  ): AnonAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

