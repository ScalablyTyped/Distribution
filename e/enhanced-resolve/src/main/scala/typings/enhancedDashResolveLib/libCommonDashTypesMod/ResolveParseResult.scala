package typings
package enhancedDashResolveLib.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveParseResult extends js.Object {
  var directory: scala.Boolean
  var file: scala.Boolean
  var module: scala.Boolean
  var query: java.lang.String
  var request: java.lang.String
}

object ResolveParseResult {
  @scala.inline
  def apply(
    directory: scala.Boolean,
    file: scala.Boolean,
    module: scala.Boolean,
    query: java.lang.String,
    request: java.lang.String
  ): ResolveParseResult = {
    val __obj = js.Dynamic.literal(directory = directory, file = file, module = module, query = query, request = request)
  
    __obj.asInstanceOf[ResolveParseResult]
  }
}

