package typings.googleGax.mod.fallback.protobuf.util

import typings.protobufjs.mod.Codegen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.util.codegen")
@js.native
object codegen extends js.Object {
  /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
  var verbose: Boolean = js.native
  /**
    * Begins generating a function.
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(): Codegen = js.native
  def apply(functionName: String): Codegen = js.native
  /**
    * Begins generating a function.
    * @param functionParams Function parameter names
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(functionParams: js.Array[String]): Codegen = js.native
  def apply(functionParams: js.Array[String], functionName: String): Codegen = js.native
}

