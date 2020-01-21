package typings.divaJs.interfacesMod

import typings.divaJs.AnonAhei
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestData extends js.Object {
  var dims: AnonAhei
  var item_title: String
  var max_zoom: Double
  var metadata: js.Object
  var paged: Boolean
  var pgs: js.Array[Page]
  var version: js.UndefOr[Double] = js.undefined
}

object ManifestData {
  @scala.inline
  def apply(
    dims: AnonAhei,
    item_title: String,
    max_zoom: Double,
    metadata: js.Object,
    paged: Boolean,
    pgs: js.Array[Page],
    version: Int | Double = null
  ): ManifestData = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any], item_title = item_title.asInstanceOf[js.Any], max_zoom = max_zoom.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], pgs = pgs.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestData]
  }
}

