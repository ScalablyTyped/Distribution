package typings.esfxTypeModel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  def next(): DoneBoolean
}
object `13` {
  
  @scala.inline
  def apply(next: () => DoneBoolean): `13` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: () => DoneBoolean): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
