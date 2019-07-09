package typings
package eventemitter3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventemitter3Mod {
  type EventArgs[T /* <: java.lang.String | js.Symbol | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any>}
    */ eventemitter3Lib.eventemitter3LibStrings.EventArgs with js.Any) */, K /* <: EventNames[T] */] = (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any) | js.Array[js.Any]
  type EventNames[T /* <: java.lang.String | js.Symbol | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any>}
    */ eventemitter3Lib.eventemitter3LibStrings.EventNames with js.Any) */] = java.lang.String | T
  type ListenerFn[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, scala.Unit]
}
