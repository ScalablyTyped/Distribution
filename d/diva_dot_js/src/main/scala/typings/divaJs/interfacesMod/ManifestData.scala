package typings.divaJs.interfacesMod

import typings.divaJs.anon.Ahei
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestData extends js.Object {
  var dims: Ahei = js.native
  var item_title: String = js.native
  var max_zoom: Double = js.native
  var metadata: js.Object = js.native
  var paged: Boolean = js.native
  var pgs: js.Array[Page] = js.native
  var version: js.UndefOr[Double] = js.native
}

object ManifestData {
  @scala.inline
  def apply(
    dims: Ahei,
    item_title: String,
    max_zoom: Double,
    metadata: js.Object,
    paged: Boolean,
    pgs: js.Array[Page]
  ): ManifestData = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any], item_title = item_title.asInstanceOf[js.Any], max_zoom = max_zoom.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], pgs = pgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestData]
  }
  @scala.inline
  implicit class ManifestDataOps[Self <: ManifestData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDims(value: Ahei): Self = this.set("dims", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_title(value: String): Self = this.set("item_title", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_zoom(value: Double): Self = this.set("max_zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaged(value: Boolean): Self = this.set("paged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPgsVarargs(value: Page*): Self = this.set("pgs", js.Array(value :_*))
    @scala.inline
    def setPgs(value: js.Array[Page]): Self = this.set("pgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

