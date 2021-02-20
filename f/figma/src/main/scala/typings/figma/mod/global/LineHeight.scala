package typings.figma.mod.global

import typings.figma.figmaStrings.AUTO
import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.anon.Unit
  - typings.figma.anon.`0`
*/
trait LineHeight extends StObject
object LineHeight {
  
  @scala.inline
  def `0`(unit: AUTO): typings.figma.anon.`0` = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.`0`]
  }
  
  @scala.inline
  def Unit(unit: PIXELS | PERCENT, value: Double): typings.figma.anon.Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.Unit]
  }
}
