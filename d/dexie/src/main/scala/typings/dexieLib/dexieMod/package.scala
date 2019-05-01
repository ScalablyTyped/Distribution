package typings
package dexieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dexieMod {
  type IndexableType = IndexableTypePart | dexieLib.IndexableTypeArrayReadonly
  type IndexableTypePart = java.lang.String | scala.Double | stdLib.Date | stdLib.ArrayBuffer | stdLib.ArrayBufferView | stdLib.DataView | js.Array[js.Array[scala.Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
}
