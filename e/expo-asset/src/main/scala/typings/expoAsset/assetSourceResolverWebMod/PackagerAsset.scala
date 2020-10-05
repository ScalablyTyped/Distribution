package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackagerAsset extends js.Object {
  var __packager_asset: Boolean = js.native
  var fileSystemLocation: String = js.native
  var hash: String = js.native
  var height: js.UndefOr[Double] = js.native
  var httpServerLocation: String = js.native
  var name: String = js.native
  var scales: js.Array[Double] = js.native
  var `type`: String = js.native
  var width: js.UndefOr[Double] = js.native
}

object PackagerAsset {
  @scala.inline
  def apply(
    __packager_asset: Boolean,
    fileSystemLocation: String,
    hash: String,
    httpServerLocation: String,
    name: String,
    scales: js.Array[Double],
    `type`: String
  ): PackagerAsset = {
    val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagerAsset]
  }
  @scala.inline
  implicit class PackagerAssetOps[Self <: PackagerAsset] (val x: Self) extends AnyVal {
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
    def set__packager_asset(value: Boolean): Self = this.set("__packager_asset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemLocation(value: String): Self = this.set("fileSystemLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpServerLocation(value: String): Self = this.set("httpServerLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalesVarargs(value: Double*): Self = this.set("scales", js.Array(value :_*))
    @scala.inline
    def setScales(value: js.Array[Double]): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

