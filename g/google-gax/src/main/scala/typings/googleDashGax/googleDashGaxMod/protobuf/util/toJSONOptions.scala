package typings.googleDashGax.googleDashGaxMod.protobuf.util

import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.protobufjsMod.IConversionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("google-gax", "protobuf.util.toJSONOptions")
@js.native
object toJSONOptions extends TopLevel[IConversionOptions]

