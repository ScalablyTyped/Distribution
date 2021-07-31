package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.anon.`2`
  - typings.figma.anon.Color
*/
trait OverlayBackground extends StObject
object OverlayBackground {
  
  @scala.inline
  def `2`(): typings.figma.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NONE")
    __obj.asInstanceOf[typings.figma.anon.`2`]
  }
  
  @scala.inline
  def Color(color: RGBA): typings.figma.anon.Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOLID_COLOR")
    __obj.asInstanceOf[typings.figma.anon.Color]
  }
}
