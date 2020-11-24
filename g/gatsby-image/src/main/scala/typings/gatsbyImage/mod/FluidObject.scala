package typings.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidObject extends js.Object {
  
  var aspectRatio: Double = js.native
  
  var base64: js.UndefOr[String] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var sizes: String = js.native
  
  var src: String = js.native
  
  var srcSet: String = js.native
  
  var srcSetWebp: js.UndefOr[String] = js.native
  
  var srcWebp: js.UndefOr[String] = js.native
  
  var tracedSVG: js.UndefOr[String] = js.native
}
object FluidObject {
  
  @scala.inline
  def apply(aspectRatio: Double, sizes: String, src: String, srcSet: String): FluidObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluidObject]
  }
  
  @scala.inline
  implicit class FluidObjectOps[Self <: FluidObject] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64(value: String): Self = this.set("base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase64: Self = this.set("base64", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setSrcSetWebp(value: String): Self = this.set("srcSetWebp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcSetWebp: Self = this.set("srcSetWebp", js.undefined)
    
    @scala.inline
    def setSrcWebp(value: String): Self = this.set("srcWebp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcWebp: Self = this.set("srcWebp", js.undefined)
    
    @scala.inline
    def setTracedSVG(value: String): Self = this.set("tracedSVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracedSVG: Self = this.set("tracedSVG", js.undefined)
  }
}
