package typings.enhancedResolve.commonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveParseResult extends js.Object {
  var directory: Boolean = js.native
  var file: Boolean = js.native
  var module: Boolean = js.native
  var query: String = js.native
  var request: String = js.native
}

object ResolveParseResult {
  @scala.inline
  def apply(directory: Boolean, file: Boolean, module: Boolean, query: String, request: String): ResolveParseResult = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveParseResult]
  }
  @scala.inline
  implicit class ResolveParseResultOps[Self <: ResolveParseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: Boolean): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

