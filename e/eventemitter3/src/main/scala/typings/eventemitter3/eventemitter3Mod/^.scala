package typings.eventemitter3.eventemitter3Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Minimal `EventEmitter` interface that is molded against the Node.js
  * `EventEmitter` interface.
  */
@JSImport("eventemitter3", JSImport.Namespace)
@js.native
class ^[EventTypes /* <: String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof EventTypes ]: std.Array<any>}
  */ typings.eventemitter3.eventemitter3Strings.^  with js.Any) */] () extends EventEmitter[EventTypes]

@JSImport("eventemitter3", JSImport.Namespace)
@js.native
object ^ extends TopLevel[EventEmitterStatic] {
  var prefixed: String | Boolean = js.native
}

