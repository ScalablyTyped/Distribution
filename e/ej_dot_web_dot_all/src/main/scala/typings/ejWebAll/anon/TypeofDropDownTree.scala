package typings.ejWebAll.anon

import typings.ejWebAll.ej.DropDownTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDropDownTree extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: DropDownTree = js.native
}
object TypeofDropDownTree {
  
  @scala.inline
  def apply(Locale: js.Any, fn: DropDownTree): TypeofDropDownTree = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDropDownTree]
  }
  
  @scala.inline
  implicit class TypeofDropDownTreeMutableBuilder[Self <: TypeofDropDownTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: DropDownTree): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
