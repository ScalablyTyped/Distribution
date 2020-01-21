package typings.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Dexie = typings.dexie.mod.Dexie_
  type IndexableType = typings.dexie.mod.IndexableTypePart | typings.dexie.mod.IndexableTypeArrayReadonly
  type IndexableTypeArray = js.Array[typings.dexie.mod.IndexableTypePart]
  type IndexableTypeArrayReadonly = js.Array[typings.dexie.mod.IndexableTypePart]
  type IndexableTypePart = java.lang.String | scala.Double | typings.std.Date | typings.std.ArrayBuffer | typings.std.ArrayBufferView | typings.std.DataView | js.Array[js.Array[scala.Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
  type default = typings.dexie.mod.default_
}
