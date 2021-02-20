package typings.figma.mod.global

import typings.figma.figmaStrings.NONE
import typings.figma.figmaStrings.SOLID_COLOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.anon.`2`
  - typings.figma.anon.Color
*/
trait OverlayBackground extends StObject
object OverlayBackground {
  
  @scala.inline
  def `2`(`type`: NONE): typings.figma.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.`2`]
  }
  
  @scala.inline
  def Color(color: RGBA, `type`: SOLID_COLOR): typings.figma.anon.Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.Color]
  }
}
