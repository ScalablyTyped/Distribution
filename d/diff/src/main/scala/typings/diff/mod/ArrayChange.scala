package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayChange[T] extends StObject {
  
  var added: js.UndefOr[Boolean] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var removed: js.UndefOr[Boolean] = js.native
  
  var value: js.Array[T] = js.native
}
object ArrayChange {
  
  @scala.inline
  def apply[T](value: js.Array[T]): ArrayChange[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChange[T]]
  }
  
  @scala.inline
  implicit class ArrayChangeMutableBuilder[Self <: ArrayChange[_], T] (val x: Self with ArrayChange[T]) extends AnyVal {
    
    @scala.inline
    def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: T*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
