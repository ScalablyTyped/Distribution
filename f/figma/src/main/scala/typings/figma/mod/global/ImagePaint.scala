package typings.figma.mod.global

import typings.figma.figmaStrings.CROP
import typings.figma.figmaStrings.FILL
import typings.figma.figmaStrings.FIT
import typings.figma.figmaStrings.IMAGE
import typings.figma.figmaStrings.TILE
import org.scalablytyped.runtime.StObject
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
  implicit class ImagePaintMutableBuilder[Self <: ImagePaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    @scala.inline
    def setFilters(value: ImageFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setImageHash(value: String): Self = StObject.set(x, "imageHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHashNull: Self = StObject.set(x, "imageHash", null)
    
    @scala.inline
    def setImageTransform(value: Transform): Self = StObject.set(x, "imageTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTransformUndefined: Self = StObject.set(x, "imageTransform", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setScaleMode(value: FILL | FIT | CROP | TILE): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingFactor(value: Double): Self = StObject.set(x, "scalingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingFactorUndefined: Self = StObject.set(x, "scalingFactor", js.undefined)
    
    @scala.inline
    def setType(value: IMAGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
