package typings.eventemitter3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventArgs[T /* <: java.lang.String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any>}
    */ typings.eventemitter3.eventemitter3Strings.EventArgs with org.scalablytyped.runtime.TopLevel[js.Any]) */, K /* <: typings.eventemitter3.mod.EventNames[T] */] = (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | js.Array[js.Any]
  type EventNames[T /* <: java.lang.String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any>}
    */ typings.eventemitter3.eventemitter3Strings.EventNames with org.scalablytyped.runtime.TopLevel[js.Any]) */] = (/* keyof T */ java.lang.String) | T
  type ListenerFn[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, scala.Unit]
}
