package typings.esfxInternalGuards

import typings.esfxTypeModel.distMod.AbstractConstructor
import typings.esfxTypeModel.distMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-guards", "isBoolean")
  @js.native
  def isBoolean(value: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isDefined")
  @js.native
  def isDefined[T](value: T): /* is std.NonNullable<T> */ Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isFunction")
  @js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isInstance")
  @js.native
  def isInstance[C /* <: Constructor[js.Object, js.Array[_]] */](value: js.Any, ctor: C): /* is std.InstanceType<C> */ Boolean = js.native
  @JSImport("@esfx/internal-guards", "isInstance")
  @js.native
  def isInstance_C_AbstractConstructorObject[C /* <: AbstractConstructor[js.Object] */](value: js.Any, ctor: C): Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isIterable")
  @js.native
  def isIterable(value: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isMissing")
  @js.native
  def isMissing(value: js.Any): Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isNumber")
  @js.native
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isObject")
  @js.native
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("@esfx/internal-guards", "isPropertyKey")
  @js.native
  def isPropertyKey(value: js.Any): /* is std.PropertyKey */ Boolean = js.native
}
