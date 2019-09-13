package typings.facepaint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object facepaintMod {
  import org.scalablytyped.runtime.StringDictionary

  type Arg = BaseArg | js.Array[BaseArg]
  type BaseArg = js.Object | js.Array[js.Object]
  type DynamicStyle = StringDictionary[StringDictionary[String | Double]]
  type DynamicStyleFunction = js.Function1[/* repeated */ Arg, js.Array[DynamicStyle]]
  type Selector = String
}
