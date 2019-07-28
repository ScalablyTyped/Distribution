package typings.fridaDashGum

import org.scalablytyped.runtime.StringDictionary
import typings.fridaDashGum.NativePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ObjCNs {
  type ChooseSpecifier = SimpleChooseSpecifier | DetailedChooseSpecifier
  type EnumerateLoadedClassesResult = /**
    * Class names grouped by name of owner module.
    */
  StringDictionary[js.Array[String]]
  /**
    * User-defined data that can be accessed from method implementations.
    */
  type InstanceData = StringDictionary[js.Any]
  type ObjectMethods = StringDictionary[ObjectMethod]
  type ProtocolPropertyAttributes = StringDictionary[String]
  /**
    * Constructor for instantiating a proxy object.
    *
    * @param target Target object to proxy to.
    * @param data Object with arbitrary data.
    */
  type ProxyConstructor = js.Function2[/* target */ Object | NativePointer, /* data */ InstanceData, Unit]
  type SimpleChooseSpecifier = Object
}
