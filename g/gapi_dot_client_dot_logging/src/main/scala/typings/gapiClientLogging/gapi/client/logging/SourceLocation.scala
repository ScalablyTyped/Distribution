package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceLocation extends js.Object {
  /** Source file name. Depending on the runtime environment, this might be a simple name or a fully-qualified name. */
  var file: js.UndefOr[String] = js.native
  /**
    * Human-readable name of the function or method being invoked, with optional context such as the class or package name. This information is used in
    * contexts such as the logs viewer, where a file and line number are less meaningful. The format can vary by language. For example:
    * qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
    */
  var functionName: js.UndefOr[String] = js.native
  /** Line within the source file. */
  var line: js.UndefOr[String] = js.native
}

object SourceLocation {
  @scala.inline
  def apply(): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceLocation]
  }
  @scala.inline
  implicit class SourceLocationOps[Self <: SourceLocation] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

