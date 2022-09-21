package typings.esfxInternalGuards

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-guards", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAsyncIterable(value: Any): /* is std.AsyncIterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncIterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.AsyncIterable<any> */ Boolean]
  
  inline def isBoolean(value: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDefined[T](value: T): /* is std.NonNullable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.NonNullable<T> */ Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isFunctionOrUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInstance[C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any */](value: Any, ctor: C): /* is std.InstanceType<C> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(value.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[/* is std.InstanceType<C> */ Boolean]
  
  inline def isIterable(value: Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]
  
  inline def isIterator(value: Any): /* is std.Iterator<unknown, any, undefined> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterator")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterator<unknown, any, undefined> */ Boolean]
  
  inline def isMissing(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMissing")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPrimitive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPropertyKey(value: Any): /* is std.PropertyKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyKey")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PropertyKey */ Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  type AbstractInstanceType[T /* <: Instantiable1[/* args */ Any, Any] */] = Any
}
