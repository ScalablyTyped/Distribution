package typings
package fsDashPromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashPromiseMod {
  type JsonReplacer = JsonReplacerArray | JsonReplacerFunction
  type JsonReplacerArray = js.Array[scala.Double | java.lang.String]
  type JsonReplacerFunction = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
