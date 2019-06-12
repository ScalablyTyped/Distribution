package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ObjCNs {
  type ChooseSpecifier = SimpleChooseSpecifier | DetailedChooseSpecifier
  type EnumerateLoadedClassesResult = /**
    * Class names grouped by name of owner module.
    */
  org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /**
    * User-defined data that can be accessed from method implementations.
    */
  type InstanceData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ObjectMethods = org.scalablytyped.runtime.StringDictionary[ObjectMethod]
  type ProtocolPropertyAttributes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Constructor for instantiating a proxy object.
    *
    * @param target Target object to proxy to.
    * @param data Object with arbitrary data.
    */
  type ProxyConstructor = js.Function2[
    /* target */ Object | fridaDashGumLib.NativePointer, 
    /* data */ InstanceData, 
    scala.Unit
  ]
  type SimpleChooseSpecifier = Object
}
