package typings.enhancedDashResolve.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveParseResult extends js.Object {
  var directory: Boolean
  var file: Boolean
  var module: Boolean
  var query: String
  var request: String
}

object ResolveParseResult {
  @scala.inline
  def apply(directory: Boolean, file: Boolean, module: Boolean, query: String, request: String): ResolveParseResult = {
    val __obj = js.Dynamic.literal(directory = directory, file = file, module = module, query = query, request = request)
  
    __obj.asInstanceOf[ResolveParseResult]
  }
}

