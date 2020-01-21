package typings.enhancedResolve.commonTypesMod

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
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveParseResult]
  }
}

