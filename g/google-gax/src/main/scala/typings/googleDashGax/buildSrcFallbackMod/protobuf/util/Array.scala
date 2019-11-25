package typings.googleDashGax.buildSrcFallbackMod.protobuf.util

import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.protobufjsMod.Constructor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "protobuf.util.Array")
@js.native
class Array protected ()
  extends typings.protobufjs.protobufjsMod.util.Array {
  def this(params: js.Any*) = this()
}

/** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
@JSImport("google-gax/build/src/fallback", "protobuf.util.Array")
@js.native
object Array extends TopLevel[Constructor[Uint8Array]]

