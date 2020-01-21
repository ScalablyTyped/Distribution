package typings.googleGax.fallbackMod.protobuf.util

import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Root
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "protobuf.util")
@js.native
object ^ extends js.Object {
  /** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
  var Array: Constructor[Uint8Array] = js.native
  /** Node's Buffer class if available. */
  var Buffer: Constructor[typings.protobufjs.mod.Buffer] = js.native
  /** Long.js's Long class if available. */
  var Long: Constructor[typings.protobufjs.mod.Long] = js.native
  /** Decorator root (TypeScript). */
  var decorateRoot: Root = js.native
  /**
    * Default conversion options used for {@link Message#toJSON} implementations.
    *
    * These options are close to proto3's JSON mapping with the exception that internal types like Any are handled just like messages. More precisely:
    *
    * - Longs become strings
    * - Enums become string keys
    * - Bytes become base64 encoded strings
    * - (Sub-)Messages become plain objects
    * - Maps become plain objects with all string keys
    * - Repeated fields become arrays
    * - NaN and Infinity for float and double fields become strings
    *
    * @see https://developers.google.com/protocol-buffers/docs/proto3?hl=en#json
    */
  var toJSONOptions: IConversionOptions = js.native
}

