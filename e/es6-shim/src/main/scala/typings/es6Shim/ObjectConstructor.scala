package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor extends js.Object {
  
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param sources One or more source objects to copy properties from.
    */
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  /**
    * Returns true if the values are the same value, false otherwise.
    * @param value1 The first value.
    * @param value2 The second value.
    */
  def is(value1: js.Any, value2: js.Any): Boolean = js.native
  
  /**
    * Sets the prototype of a specified object o to  object proto or null. Returns the object o.
    * @param o The object to change its prototype.
    * @param proto The value of the new prototype or null.
    * @remarks Requires `__proto__` support.
    */
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
}
object ObjectConstructor {
  
  @scala.inline
  def apply(
    assign: (js.Any, /* repeated */ js.Any) => js.Any,
    is: (js.Any, js.Any) => Boolean,
    setPrototypeOf: (js.Any, js.Any) => js.Any
  ): ObjectConstructor = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction2(assign), is = js.Any.fromFunction2(is), setPrototypeOf = js.Any.fromFunction2(setPrototypeOf))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  @scala.inline
  implicit class ObjectConstructorOps[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssign(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("assign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIs(value: (js.Any, js.Any) => Boolean): Self = this.set("is", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPrototypeOf(value: (js.Any, js.Any) => js.Any): Self = this.set("setPrototypeOf", js.Any.fromFunction2(value))
  }
}
