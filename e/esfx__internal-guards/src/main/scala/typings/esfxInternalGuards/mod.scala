package typings.esfxInternalGuards

import typings.esfxTypeModel.distMod.AbstractConstructor
import typings.esfxTypeModel.distMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/internal-guards", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isBoolean(value: js.Any): /* is boolean */ Boolean = js.native
  
  def isDefined[T](value: T): /* is std.NonNullable<T> */ Boolean = js.native
  
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  def isInstance[C /* <: Constructor[js.Object, js.Array[_]] */](value: js.Any, ctor: C): /* is std.InstanceType<C> */ Boolean = js.native
  @JSName("isInstance")
  def isInstance_C_AbstractConstructorObject[C /* <: AbstractConstructor[js.Object] */](value: js.Any, ctor: C): Boolean = js.native
  
  def isIterable(value: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  
  def isMissing(value: js.Any): Boolean = js.native
  
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  
  def isPropertyKey(value: js.Any): /* is std.PropertyKey */ Boolean = js.native
}
