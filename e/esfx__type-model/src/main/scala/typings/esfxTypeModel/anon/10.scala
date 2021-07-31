package typings.esfxTypeModel.anon

import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var done: `false`
}
object `10` {
  
  @scala.inline
  def apply(): `10` = {
    val __obj = js.Dynamic.literal(done = false)
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
  }
}
