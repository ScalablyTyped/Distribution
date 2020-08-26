package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType
import typings.dwt.webTwainAcquireMod.TiffTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compression extends js.Object {
  var compression: js.UndefOr[EnumDWTTIFFCompressionType | Double] = js.native
  var quality: js.UndefOr[Double] = js.native
  /**
    * Specify Tiff custom tags.
    */
  var tiffTags: js.UndefOr[js.Array[TiffTag]] = js.native
}

object Compression {
  @scala.inline
  def apply(): Compression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compression]
  }
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
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
    def setCompression(value: EnumDWTTIFFCompressionType | Double): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setTiffTagsVarargs(value: TiffTag*): Self = this.set("tiffTags", js.Array(value :_*))
    @scala.inline
    def setTiffTags(value: js.Array[TiffTag]): Self = this.set("tiffTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiffTags: Self = this.set("tiffTags", js.undefined)
  }
  
}

