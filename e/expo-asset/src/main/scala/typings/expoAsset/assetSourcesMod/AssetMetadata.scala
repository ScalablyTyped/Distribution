package typings.expoAsset.assetSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetMetadata extends js.Object {
  var fileHashes: js.UndefOr[js.Array[String]] = js.native
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  var hash: String = js.native
  var height: js.UndefOr[Double] = js.native
  var httpServerLocation: String = js.native
  var name: String = js.native
  var scales: js.Array[Double] = js.native
  var `type`: String = js.native
  var uri: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AssetMetadata {
  @scala.inline
  def apply(hash: String, httpServerLocation: String, name: String, scales: js.Array[Double], `type`: String): AssetMetadata = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetMetadata]
  }
  @scala.inline
  implicit class AssetMetadataOps[Self <: AssetMetadata] (val x: Self) extends AnyVal {
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
    def setFileHashesVarargs(value: String*): Self = this.set("fileHashes", js.Array(value :_*))
    @scala.inline
    def setFileHashes(value: js.Array[String]): Self = this.set("fileHashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileHashes: Self = this.set("fileHashes", js.undefined)
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = this.set("fileUris", js.Array(value :_*))
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = this.set("fileUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileUris: Self = this.set("fileUris", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

