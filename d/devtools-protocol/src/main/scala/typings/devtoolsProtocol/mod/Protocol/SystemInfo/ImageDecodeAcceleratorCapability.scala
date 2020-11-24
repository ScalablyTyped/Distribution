package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDecodeAcceleratorCapability extends js.Object {
  
  /**
    * Image coded, e.g. Jpeg.
    */
  var imageType: ImageType = js.native
  
  /**
    * Maximum supported dimensions of the image in pixels.
    */
  var maxDimensions: Size = js.native
  
  /**
    * Minimum supported dimensions of the image in pixels.
    */
  var minDimensions: Size = js.native
  
  /**
    * Optional array of supported subsampling formats, e.g. 4:2:0, if known.
    */
  var subsamplings: js.Array[SubsamplingFormat] = js.native
}
object ImageDecodeAcceleratorCapability {
  
  @scala.inline
  def apply(
    imageType: ImageType,
    maxDimensions: Size,
    minDimensions: Size,
    subsamplings: js.Array[SubsamplingFormat]
  ): ImageDecodeAcceleratorCapability = {
    val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], maxDimensions = maxDimensions.asInstanceOf[js.Any], minDimensions = minDimensions.asInstanceOf[js.Any], subsamplings = subsamplings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDecodeAcceleratorCapability]
  }
  
  @scala.inline
  implicit class ImageDecodeAcceleratorCapabilityOps[Self <: ImageDecodeAcceleratorCapability] (val x: Self) extends AnyVal {
    
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
    def setImageType(value: ImageType): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDimensions(value: Size): Self = this.set("maxDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDimensions(value: Size): Self = this.set("minDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsamplingsVarargs(value: SubsamplingFormat*): Self = this.set("subsamplings", js.Array(value :_*))
    
    @scala.inline
    def setSubsamplings(value: js.Array[SubsamplingFormat]): Self = this.set("subsamplings", value.asInstanceOf[js.Any])
  }
}
