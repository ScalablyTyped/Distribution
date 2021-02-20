package typings.figma.mod.global

import typings.figma.figmaStrings.CROP
import typings.figma.figmaStrings.FILL
import typings.figma.figmaStrings.FIT
import typings.figma.figmaStrings.GRADIENT_ANGULAR
import typings.figma.figmaStrings.GRADIENT_DIAMOND
import typings.figma.figmaStrings.GRADIENT_LINEAR
import typings.figma.figmaStrings.GRADIENT_RADIAL
import typings.figma.figmaStrings.IMAGE
import typings.figma.figmaStrings.SOLID
import typings.figma.figmaStrings.TILE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod.global.SolidPaint
  - typings.figma.mod.global.GradientPaint
  - typings.figma.mod.global.ImagePaint
*/
trait Paint extends StObject
object Paint {
  
  @scala.inline
  def GradientPaint(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): typings.figma.mod.global.GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.GradientPaint]
  }
  
  @scala.inline
  def ImagePaint(scaleMode: FILL | FIT | CROP | TILE, `type`: IMAGE): typings.figma.mod.global.ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.ImagePaint]
  }
  
  @scala.inline
  def SolidPaint(color: RGB, `type`: SOLID): typings.figma.mod.global.SolidPaint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.SolidPaint]
  }
}
