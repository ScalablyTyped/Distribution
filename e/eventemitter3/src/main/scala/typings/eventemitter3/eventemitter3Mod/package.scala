package typings.eventemitter3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventemitter3Mod {
  type EventArgs[T /* <: String | js.Symbol | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any>}
    */ typings.eventemitter3.eventemitter3Strings.EventArgs with js.Any) */, K /* <: EventNames[T] */] = (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | js.Array[js.Any]
  type EventNames[T /* <: String | js.Symbol | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any>}
    */ typings.eventemitter3.eventemitter3Strings.EventNames with js.Any) */] = String | T
  type ListenerFn[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, Unit]
}
