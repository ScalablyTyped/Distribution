package typings.dexie

import typings.dexie.IndexableTypeArrayReadonly
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.DataView
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dexieMod {
  type IndexableType = IndexableTypePart | IndexableTypeArrayReadonly
  type IndexableTypePart = String | Double | Date | ArrayBuffer | ArrayBufferView | DataView | js.Array[js.Array[Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
}
