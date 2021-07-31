package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  var anchor: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var label_with_op: js.UndefOr[String] = js.undefined
}
object Anchor {
  
  @scala.inline
  def apply(): Anchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabel_with_op(value: String): Self = StObject.set(x, "label_with_op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel_with_opUndefined: Self = StObject.set(x, "label_with_op", js.undefined)
  }
}
