package typings
package expectLib.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expectNs {
  type Comparator = js.Function2[/* target */ js.Object, /* key */ java.lang.String, scala.Boolean]
  type CompareValues[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  type KeyType = java.lang.String | scala.Double
}
