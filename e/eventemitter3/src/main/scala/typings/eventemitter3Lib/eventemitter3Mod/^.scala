package typings
package eventemitter3Lib.eventemitter3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Minimal `EventEmitter` interface that is molded against the Node.js
  * `EventEmitter` interface.
  */
@JSImport("eventemitter3", JSImport.Namespace)
@js.native
class ^[EventTypes /* <: java.lang.String | js.Symbol | (/* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof EventTypes ]: std.Array<any>}
  */ eventemitter3Lib.eventemitter3LibStrings.`_backtick^_backtick` with js.Any) */] () extends EventEmitter[EventTypes]

@JSImport("eventemitter3", JSImport.Namespace)
@js.native
object ^
  extends org.scalablytyped.runtime.TopLevel[EventEmitterStatic] {
  val EventEmitter: EventEmitterStatic = js.native
  var prefixed: java.lang.String | scala.Boolean = js.native
}

