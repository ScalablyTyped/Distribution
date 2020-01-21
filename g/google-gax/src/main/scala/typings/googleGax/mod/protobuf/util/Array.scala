package typings.googleGax.mod.protobuf.util

import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.Constructor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "protobuf.util.Array")
@js.native
class Array protected ()
  extends typings.protobufjs.mod.util.Array {
  def this(params: js.Any*) = this()
}

/** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
@JSImport("google-gax", "protobuf.util.Array")
@js.native
object Array extends TopLevel[Constructor[Uint8Array]]

