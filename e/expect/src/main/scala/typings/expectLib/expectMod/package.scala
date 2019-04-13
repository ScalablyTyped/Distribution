package typings
package expectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expectMod {
  type Comparator = js.Function2[/* target */ js.Object, /* key */ java.lang.String, scala.Boolean]
  type CompareValues[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  type Extension = org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.UndefOr[js.Array[js.Any]], scala.Unit]]
  type KeyType = java.lang.String | scala.Double
}
