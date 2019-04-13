package typings
package facepaintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object facepaintMod {
  type Arg = BaseArg | js.Array[BaseArg]
  type BaseArg = js.Object | js.Array[js.Object]
  type DynamicStyle = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]]
  type DynamicStyleFunction = js.Function1[/* repeated */ Arg, DynamicStyle]
  type Selector = java.lang.String
}
