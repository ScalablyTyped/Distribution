package typings.googleDashGax.googleDashGaxMod.fallback.protobuf.util

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error subclass indicating a protocol specifc error. */
@JSImport("google-gax", "fallback.protobuf.util.ProtocolError")
@js.native
class ProtocolError[T /* <: typings.protobufjs.protobufjsMod.Message[T] */] protected ()
  extends typings.googleDashGax.buildSrcFallbackMod.protobuf.util.ProtocolError[T] {
  /**
    * Constructs a new protocol error.
    * @param message Error message
    * @param [properties] Additional properties
    */
  def this(message: String) = this()
  def this(message: String, properties: StringDictionary[js.Any]) = this()
}

