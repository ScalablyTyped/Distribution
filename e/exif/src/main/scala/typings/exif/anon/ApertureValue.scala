package typings.exif.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApertureValue extends js.Object {
  
  var ApertureValue: js.UndefOr[Double] = js.native
  
  var BrightnessValue: js.UndefOr[Double] = js.native
  
  var ColorSpace: js.UndefOr[Double] = js.native
  
  var ComponentsConfiguration: js.UndefOr[Buffer] = js.native
  
  var CompressedBitsPerPixel: js.UndefOr[Double] = js.native
  
  var CreateDate: js.UndefOr[String] = js.native
  
  var DateTimeOriginal: js.UndefOr[String] = js.native
  
  var ExifImageHeight: js.UndefOr[Double] = js.native
  
  var ExifImageWidth: js.UndefOr[Double] = js.native
  
  var ExifVersion: js.UndefOr[Buffer] = js.native
  
  var ExposureCompensation: js.UndefOr[Double] = js.native
  
  var ExposureMode: js.UndefOr[Double] = js.native
  
  var ExposureProgram: js.UndefOr[Double] = js.native
  
  var ExposureTime: js.UndefOr[Double] = js.native
  
  var FNumber: js.UndefOr[Double] = js.native
  
  var FileSource: js.UndefOr[Buffer] = js.native
  
  var Flash: js.UndefOr[Double] = js.native
  
  var FlashpixVersion: js.UndefOr[Buffer] = js.native
  
  var FocalLength: js.UndefOr[Double] = js.native
  
  var FocalLengthIn35mmFormat: js.UndefOr[Double] = js.native
  
  var FocalPlaneResolutionUnit: js.UndefOr[Double] = js.native
  
  var FocalPlaneXResolution: js.UndefOr[Double] = js.native
  
  var FocalPlaneYResolution: js.UndefOr[Double] = js.native
  
  var ISO: js.UndefOr[Double] = js.native
  
  var ImageUniqueID: js.UndefOr[String] = js.native
  
  var InteropOffset: js.UndefOr[Double] = js.native
  
  var MakerNote: js.UndefOr[Buffer] = js.native
  
  var MaxApertureValue: js.UndefOr[Double] = js.native
  
  var MeteringMode: js.UndefOr[Double] = js.native
  
  var SceneCaptureType: js.UndefOr[Double] = js.native
  
  var SceneType: js.UndefOr[Buffer] = js.native
  
  var SensingMethod: js.UndefOr[Double] = js.native
  
  var ShutterSpeedValue: js.UndefOr[Double] = js.native
  
  var UserComment: js.UndefOr[Buffer] = js.native
  
  var WhiteBalance: js.UndefOr[Double] = js.native
}
object ApertureValue {
  
  @scala.inline
  def apply(): ApertureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApertureValue]
  }
  
  @scala.inline
  implicit class ApertureValueOps[Self <: ApertureValue] (val x: Self) extends AnyVal {
    
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
    def setApertureValue(value: Double): Self = this.set("ApertureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApertureValue: Self = this.set("ApertureValue", js.undefined)
    
    @scala.inline
    def setBrightnessValue(value: Double): Self = this.set("BrightnessValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightnessValue: Self = this.set("BrightnessValue", js.undefined)
    
    @scala.inline
    def setColorSpace(value: Double): Self = this.set("ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpace: Self = this.set("ColorSpace", js.undefined)
    
    @scala.inline
    def setComponentsConfiguration(value: Buffer): Self = this.set("ComponentsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentsConfiguration: Self = this.set("ComponentsConfiguration", js.undefined)
    
    @scala.inline
    def setCompressedBitsPerPixel(value: Double): Self = this.set("CompressedBitsPerPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressedBitsPerPixel: Self = this.set("CompressedBitsPerPixel", js.undefined)
    
    @scala.inline
    def setCreateDate(value: String): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setDateTimeOriginal(value: String): Self = this.set("DateTimeOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeOriginal: Self = this.set("DateTimeOriginal", js.undefined)
    
    @scala.inline
    def setExifImageHeight(value: Double): Self = this.set("ExifImageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExifImageHeight: Self = this.set("ExifImageHeight", js.undefined)
    
    @scala.inline
    def setExifImageWidth(value: Double): Self = this.set("ExifImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExifImageWidth: Self = this.set("ExifImageWidth", js.undefined)
    
    @scala.inline
    def setExifVersion(value: Buffer): Self = this.set("ExifVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExifVersion: Self = this.set("ExifVersion", js.undefined)
    
    @scala.inline
    def setExposureCompensation(value: Double): Self = this.set("ExposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureCompensation: Self = this.set("ExposureCompensation", js.undefined)
    
    @scala.inline
    def setExposureMode(value: Double): Self = this.set("ExposureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureMode: Self = this.set("ExposureMode", js.undefined)
    
    @scala.inline
    def setExposureProgram(value: Double): Self = this.set("ExposureProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureProgram: Self = this.set("ExposureProgram", js.undefined)
    
    @scala.inline
    def setExposureTime(value: Double): Self = this.set("ExposureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureTime: Self = this.set("ExposureTime", js.undefined)
    
    @scala.inline
    def setFNumber(value: Double): Self = this.set("FNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFNumber: Self = this.set("FNumber", js.undefined)
    
    @scala.inline
    def setFileSource(value: Buffer): Self = this.set("FileSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSource: Self = this.set("FileSource", js.undefined)
    
    @scala.inline
    def setFlash(value: Double): Self = this.set("Flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlash: Self = this.set("Flash", js.undefined)
    
    @scala.inline
    def setFlashpixVersion(value: Buffer): Self = this.set("FlashpixVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashpixVersion: Self = this.set("FlashpixVersion", js.undefined)
    
    @scala.inline
    def setFocalLength(value: Double): Self = this.set("FocalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocalLength: Self = this.set("FocalLength", js.undefined)
    
    @scala.inline
    def setFocalLengthIn35mmFormat(value: Double): Self = this.set("FocalLengthIn35mmFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocalLengthIn35mmFormat: Self = this.set("FocalLengthIn35mmFormat", js.undefined)
    
    @scala.inline
    def setFocalPlaneResolutionUnit(value: Double): Self = this.set("FocalPlaneResolutionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocalPlaneResolutionUnit: Self = this.set("FocalPlaneResolutionUnit", js.undefined)
    
    @scala.inline
    def setFocalPlaneXResolution(value: Double): Self = this.set("FocalPlaneXResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocalPlaneXResolution: Self = this.set("FocalPlaneXResolution", js.undefined)
    
    @scala.inline
    def setFocalPlaneYResolution(value: Double): Self = this.set("FocalPlaneYResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocalPlaneYResolution: Self = this.set("FocalPlaneYResolution", js.undefined)
    
    @scala.inline
    def setISO(value: Double): Self = this.set("ISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteISO: Self = this.set("ISO", js.undefined)
    
    @scala.inline
    def setImageUniqueID(value: String): Self = this.set("ImageUniqueID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUniqueID: Self = this.set("ImageUniqueID", js.undefined)
    
    @scala.inline
    def setInteropOffset(value: Double): Self = this.set("InteropOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteropOffset: Self = this.set("InteropOffset", js.undefined)
    
    @scala.inline
    def setMakerNote(value: Buffer): Self = this.set("MakerNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMakerNote: Self = this.set("MakerNote", js.undefined)
    
    @scala.inline
    def setMaxApertureValue(value: Double): Self = this.set("MaxApertureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxApertureValue: Self = this.set("MaxApertureValue", js.undefined)
    
    @scala.inline
    def setMeteringMode(value: Double): Self = this.set("MeteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeteringMode: Self = this.set("MeteringMode", js.undefined)
    
    @scala.inline
    def setSceneCaptureType(value: Double): Self = this.set("SceneCaptureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneCaptureType: Self = this.set("SceneCaptureType", js.undefined)
    
    @scala.inline
    def setSceneType(value: Buffer): Self = this.set("SceneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneType: Self = this.set("SceneType", js.undefined)
    
    @scala.inline
    def setSensingMethod(value: Double): Self = this.set("SensingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensingMethod: Self = this.set("SensingMethod", js.undefined)
    
    @scala.inline
    def setShutterSpeedValue(value: Double): Self = this.set("ShutterSpeedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutterSpeedValue: Self = this.set("ShutterSpeedValue", js.undefined)
    
    @scala.inline
    def setUserComment(value: Buffer): Self = this.set("UserComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserComment: Self = this.set("UserComment", js.undefined)
    
    @scala.inline
    def setWhiteBalance(value: Double): Self = this.set("WhiteBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteBalance: Self = this.set("WhiteBalance", js.undefined)
  }
}
