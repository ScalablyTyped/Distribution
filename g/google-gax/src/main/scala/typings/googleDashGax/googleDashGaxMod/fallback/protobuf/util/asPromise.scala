package typings.googleDashGax.googleDashGaxMod.fallback.protobuf.util

import typings.protobufjs.protobufjsMod.asPromiseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.util.asPromise")
@js.native
object asPromise extends js.Object {
  /**
    * Returns a promise from a node-style callback function.
    * @param fn Function to call
    * @param ctx Function context
    * @param params Function arguments
    * @returns Promisified function
    */
  def apply(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[_] = js.native
}

