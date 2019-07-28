package typings.expect

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expectMod {
  type Comparator = js.Function2[/* target */ js.Object, /* key */ String, Boolean]
  type CompareValues[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  type Extension = StringDictionary[js.Function1[/* args */ js.UndefOr[js.Array[js.Any]], Unit]]
  type KeyType = String | Double
}
