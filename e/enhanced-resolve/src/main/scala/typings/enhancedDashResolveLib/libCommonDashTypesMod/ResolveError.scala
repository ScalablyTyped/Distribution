package typings
package enhancedDashResolveLib.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveError
  extends nodeLib.Error {
  var details: java.lang.String
  var missing: js.Array[java.lang.String]
  var recursion: scala.Boolean
}

object ResolveError {
  @scala.inline
  def apply(
    details: java.lang.String,
    missing: js.Array[java.lang.String],
    recursion: scala.Boolean,
    stack: java.lang.String = null
  ): ResolveError = {
    val __obj = js.Dynamic.literal(details = details, missing = missing, recursion = recursion)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResolveError]
  }
}

