package typings.extjs.Ext.dd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDDTarget extends IDragDrop {
  
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDDTarget: js.UndefOr[js.Function0[String]] = js.native
}
object IDDTarget {
  
  @scala.inline
  def apply(): IDDTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDDTarget]
  }
  
  @scala.inline
  implicit class IDDTargetMutableBuilder[Self <: IDDTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
