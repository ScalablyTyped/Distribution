package typings.exif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExifOptions extends js.Object {
  var agfaMaxEntries: js.UndefOr[Double] = js.native
  var epsonMaxEntries: js.UndefOr[Double] = js.native
  /** node-exif corrects the thumbnail offset in order to have an offset from the start of the buffer/file. */
  var fixThumbnailOffset: js.UndefOr[Boolean] = js.native
  var fujifilmMaxEntries: js.UndefOr[Double] = js.native
  var ifd0MaxEntries: js.UndefOr[Double] = js.native
  var ifd1MaxEntries: js.UndefOr[Double] = js.native
  /**
    * The image to get Exif data from can be either a filesystem path or a Buffer.
    *
    * If `image` is not specified, the developer must call `loadImage()` to parse the image.
    */
  var image: js.UndefOr[String | Buffer] = js.native
  /** Specifies the maximum entries to be parsed */
  var maxEntries: js.UndefOr[Double] = js.native
  var maxGpsEntries: js.UndefOr[Double] = js.native
  var maxInteroperabilityEntries: js.UndefOr[Double] = js.native
  var noPadding: js.UndefOr[Boolean] = js.native
  var olympusMaxEntries: js.UndefOr[Double] = js.native
  var panasonicMaxEntries: js.UndefOr[Double] = js.native
  var sanyoMaxEntries: js.UndefOr[Double] = js.native
  /** An object named "offsets" is added to exifData and contains lot of offsets needed to get thumbnail and other things. */
  var tiffOffsets: js.UndefOr[Double] = js.native
}

object ExifOptions {
  @scala.inline
  def apply(): ExifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExifOptions]
  }
  @scala.inline
  implicit class ExifOptionsOps[Self <: ExifOptions] (val x: Self) extends AnyVal {
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
    def setAgfaMaxEntries(value: Double): Self = this.set("agfaMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgfaMaxEntries: Self = this.set("agfaMaxEntries", js.undefined)
    @scala.inline
    def setEpsonMaxEntries(value: Double): Self = this.set("epsonMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpsonMaxEntries: Self = this.set("epsonMaxEntries", js.undefined)
    @scala.inline
    def setFixThumbnailOffset(value: Boolean): Self = this.set("fixThumbnailOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixThumbnailOffset: Self = this.set("fixThumbnailOffset", js.undefined)
    @scala.inline
    def setFujifilmMaxEntries(value: Double): Self = this.set("fujifilmMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFujifilmMaxEntries: Self = this.set("fujifilmMaxEntries", js.undefined)
    @scala.inline
    def setIfd0MaxEntries(value: Double): Self = this.set("ifd0MaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfd0MaxEntries: Self = this.set("ifd0MaxEntries", js.undefined)
    @scala.inline
    def setIfd1MaxEntries(value: Double): Self = this.set("ifd1MaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfd1MaxEntries: Self = this.set("ifd1MaxEntries", js.undefined)
    @scala.inline
    def setImage(value: String | Buffer): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setMaxEntries(value: Double): Self = this.set("maxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEntries: Self = this.set("maxEntries", js.undefined)
    @scala.inline
    def setMaxGpsEntries(value: Double): Self = this.set("maxGpsEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxGpsEntries: Self = this.set("maxGpsEntries", js.undefined)
    @scala.inline
    def setMaxInteroperabilityEntries(value: Double): Self = this.set("maxInteroperabilityEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInteroperabilityEntries: Self = this.set("maxInteroperabilityEntries", js.undefined)
    @scala.inline
    def setNoPadding(value: Boolean): Self = this.set("noPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPadding: Self = this.set("noPadding", js.undefined)
    @scala.inline
    def setOlympusMaxEntries(value: Double): Self = this.set("olympusMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOlympusMaxEntries: Self = this.set("olympusMaxEntries", js.undefined)
    @scala.inline
    def setPanasonicMaxEntries(value: Double): Self = this.set("panasonicMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanasonicMaxEntries: Self = this.set("panasonicMaxEntries", js.undefined)
    @scala.inline
    def setSanyoMaxEntries(value: Double): Self = this.set("sanyoMaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanyoMaxEntries: Self = this.set("sanyoMaxEntries", js.undefined)
    @scala.inline
    def setTiffOffsets(value: Double): Self = this.set("tiffOffsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiffOffsets: Self = this.set("tiffOffsets", js.undefined)
  }
  
}

