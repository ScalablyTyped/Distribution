package typings.figma.mod.global

import typings.figma.figmaStrings.CROP
import typings.figma.figmaStrings.FILL
import typings.figma.figmaStrings.FIT
import typings.figma.figmaStrings.IMAGE
import typings.figma.figmaStrings.TILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePaint extends Paint {
  
  val blendMode: js.UndefOr[BlendMode] = js.native
  
   // setting for "TILE"
  val filters: js.UndefOr[ImageFilters] = js.native
  
  val imageHash: String | Null = js.native
  
  val imageTransform: js.UndefOr[Transform] = js.native
  
  val opacity: js.UndefOr[Double] = js.native
  
  val scaleMode: FILL | FIT | CROP | TILE = js.native
  
   // setting for "CROP"
  val scalingFactor: js.UndefOr[Double] = js.native
  
  val `type`: IMAGE = js.native
  
  val visible: js.UndefOr[Boolean] = js.native
}
object ImagePaint {
  
  @scala.inline
  def apply(scaleMode: FILL | FIT | CROP | TILE, `type`: IMAGE): ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePaint]
  }
  
  @scala.inline
  implicit class ImagePaintOps[Self <: ImagePaint] (val x: Self) extends AnyVal {
    
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
    def setScaleMode(value: FILL | FIT | CROP | TILE): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IMAGE): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: BlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    
    @scala.inline
    def setFilters(value: ImageFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setImageHash(value: String): Self = this.set("imageHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHashNull: Self = this.set("imageHash", null)
    
    @scala.inline
    def setImageTransform(value: Transform): Self = this.set("imageTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTransform: Self = this.set("imageTransform", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setScalingFactor(value: Double): Self = this.set("scalingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingFactor: Self = this.set("scalingFactor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
