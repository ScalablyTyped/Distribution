package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labelwithop extends StObject {
  
  var displayName: js.UndefOr[String] = js.native
  
  var label_with_op: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Labelwithop {
  
  @scala.inline
  def apply(): Labelwithop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labelwithop]
  }
  
  @scala.inline
  implicit class LabelwithopMutableBuilder[Self <: Labelwithop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabel_with_op(value: String): Self = StObject.set(x, "label_with_op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel_with_opUndefined: Self = StObject.set(x, "label_with_op", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
