package typings.googleGax.fallbackMod.protobuf.util

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error subclass indicating a protocol specifc error. */
@JSImport("google-gax/build/src/fallback", "protobuf.util.ProtocolError")
@js.native
class ProtocolError[T /* <: Message[T] */] protected ()
  extends typings.protobufjs.mod.util.ProtocolError[T] {
  /**
    * Constructs a new protocol error.
    * @param message Error message
    * @param [properties] Additional properties
    */
  def this(message: String) = this()
  def this(message: String, properties: StringDictionary[js.Any]) = this()
}

