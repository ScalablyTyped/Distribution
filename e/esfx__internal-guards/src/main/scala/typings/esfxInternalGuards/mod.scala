package typings.esfxInternalGuards

import typings.esfxTypeModel.distMod.AbstractConstructor
import typings.esfxTypeModel.distMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-guards", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBoolean(value: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDefined[T](value: T): /* is std.NonNullable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.NonNullable<T> */ Boolean]
  
  inline def isFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInstance[C /* <: Constructor[js.Object, js.Array[js.Any]] */](value: js.Any, ctor: C): /* is std.InstanceType<C> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[/* is std.InstanceType<C> */ Boolean]
  
  inline def isInstance_C_AbstractConstructorObject[C /* <: AbstractConstructor[js.Object] */](value: js.Any, ctor: C): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIterable(value: js.Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]
  
  inline def isMissing(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMissing")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(value: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPropertyKey(value: js.Any): /* is std.PropertyKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyKey")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PropertyKey */ Boolean]
}
