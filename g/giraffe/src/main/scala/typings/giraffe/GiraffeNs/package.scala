package typings.giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GiraffeNs {
  import org.scalablytyped.runtime.StringDictionary

  type AppMap = StringDictionary[App]
  type StringMap = StringDictionary[String]
  type ViewMap[TModel /* <: Model */] = StringDictionary[View[TModel]]
}
