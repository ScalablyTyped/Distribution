package typings.eventemitter3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentMap[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): void? std.Parameters<T[K]> : T[K] extends std.Array<any>? T[K] : std.Array<any>}
    */ typings.eventemitter3.eventemitter3Strings.ArgumentMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type EventArgs[T /* <: typings.eventemitter3.mod.ValidEventTypes */, K /* <: typings.eventemitter3.mod.EventNames[T] */] = typings.std.Parameters[typings.eventemitter3.mod.EventListener[T, K]]
  type EventListener[T /* <: typings.eventemitter3.mod.ValidEventTypes */, K /* <: typings.eventemitter3.mod.EventNames[T] */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: eventemitter3.eventemitter3.ArgumentMap<std.Exclude<T, string | symbol>>[K] */ /* args */ js.Any, 
    scala.Unit
  ]
  type EventNames[T /* <: typings.eventemitter3.mod.ValidEventTypes */] = (/* keyof T */ java.lang.String) | T
  type ListenerFn[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, scala.Unit]
  type ValidEventTypes = java.lang.String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in string | symbol ]: std.Array<any> | (args : ...any): void}
    */ typings.eventemitter3.eventemitter3Strings.ValidEventTypes with org.scalablytyped.runtime.TopLevel[js.Any])
}
