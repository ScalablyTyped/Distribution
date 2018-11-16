package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-shim", JSImport.Namespace)
@js.native
object es6DashShimMod extends js.Object {
  var Array: es6DashShimLib.ArrayConstructor = js.native
  var Map: es6DashShimLib.MapConstructor = js.native
  var Math: es6DashShimLib.Math = js.native
  var Number: es6DashShimLib.NumberConstructor = js.native
  var Object: es6DashShimLib.ObjectConstructor = js.native
  var Promise: es6DashShimLib.PromiseConstructor = js.native
  var Set: es6DashShimLib.SetConstructor = js.native
  var String: es6DashShimLib.StringConstructor = js.native
  var WeakMap: es6DashShimLib.WeakMapConstructor = js.native
  var WeakSet: es6DashShimLib.WeakSetConstructor = js.native
  @JSName("Reflect")
  @js.native
  object ReflectNs extends js.Object {
    @JSName("apply")
    def apply(target: js.Function, thisArgument: js.Any, argumentsList: stdLib.ArrayLike[_]): js.Any = js.native
    def construct(target: js.Function, argumentsList: stdLib.ArrayLike[_]): js.Any = js.native
    def defineProperty(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty, attributes: stdLib.PropertyDescriptor): scala.Boolean = js.native
    def deleteProperty(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty): scala.Boolean = js.native
    def enumerate(target: js.Any): es6DashShimLib.Iterator[_] = js.native
    def get(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty): js.Any = js.native
    def get(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty, receiver: js.Any): js.Any = js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty): stdLib.PropertyDescriptor = js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    def has(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty): scala.Boolean = js.native
    def isExtensible(target: js.Any): scala.Boolean = js.native
    def ownKeys(target: js.Any): es6DashShimLib.Array[es6DashShimLib.KeyOfProperty] = js.native
    def preventExtensions(target: js.Any): scala.Boolean = js.native
    def set(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty, value: js.Any): scala.Boolean = js.native
    def set(target: js.Any, propertyKey: es6DashShimLib.KeyOfProperty, value: js.Any, receiver: js.Any): scala.Boolean = js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): scala.Boolean = js.native
  }
  
}

