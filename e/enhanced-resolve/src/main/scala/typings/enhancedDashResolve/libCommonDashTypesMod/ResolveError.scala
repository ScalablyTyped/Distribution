package typings.enhancedDashResolve.libCommonDashTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveError extends Error {
  var details: String
  var missing: js.Array[String]
  var recursion: Boolean
}

object ResolveError {
  @scala.inline
  def apply(
    details: String,
    message: String,
    missing: js.Array[String],
    name: String,
    recursion: Boolean,
    stack: String = null
  ): ResolveError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveError]
  }
}

