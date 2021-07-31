package typings.esfxTypeModel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def next(): `0`
}
object `1` {
  
  @scala.inline
  def apply(next: () => `0`): `1` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: () => `0`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
