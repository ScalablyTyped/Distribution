package typings.giraffe

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GiraffeNs {
  type AppMap = StringDictionary[App]
  type StringMap = StringDictionary[String]
  type ViewMap[TModel /* <: Model */] = StringDictionary[View[TModel]]
}
