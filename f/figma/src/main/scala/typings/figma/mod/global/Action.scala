package typings.figma.mod.global

import typings.figma.figmaStrings.BACK
import typings.figma.figmaStrings.CLOSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.anon.Type
  - typings.figma.anon.Url
  - typings.figma.anon.DestinationId
*/
trait Action extends StObject
object Action {
  
  @scala.inline
  def DestinationId(navigation: Navigation, preserveScrollPosition: Boolean): typings.figma.anon.DestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any], destinationId = null, transition = null)
    __obj.updateDynamic("type")("NODE")
    __obj.asInstanceOf[typings.figma.anon.DestinationId]
  }
  
  @scala.inline
  def Type(`type`: BACK | CLOSE): typings.figma.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.Type]
  }
  
  @scala.inline
  def Url(url: String): typings.figma.anon.Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("URL")
    __obj.asInstanceOf[typings.figma.anon.Url]
  }
}
