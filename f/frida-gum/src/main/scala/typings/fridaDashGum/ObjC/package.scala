package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ObjC {
  import org.scalablytyped.runtime.StringDictionary

  type BlockMethodImplementation = js.ThisFunction1[/* this */ Block, /* repeated */ js.Any, js.Any]
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
  type SimpleChooseSpecifier = Object
  type UserMethodImplementation[D, T, S] = js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* repeated */ js.Any, js.Any]
}
