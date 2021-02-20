package typings.divaJs.anon

import typings.divaJs.interfacesMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorPage extends StObject {
  
  var anchorPage: Double = js.native
  
  var offset: Offset = js.native
}
object AnchorPage {
  
  @scala.inline
  def apply(anchorPage: Double, offset: Offset): AnchorPage = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorPage]
  }
  
  @scala.inline
  implicit class AnchorPageMutableBuilder[Self <: AnchorPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorPage(value: Double): Self = StObject.set(x, "anchorPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
