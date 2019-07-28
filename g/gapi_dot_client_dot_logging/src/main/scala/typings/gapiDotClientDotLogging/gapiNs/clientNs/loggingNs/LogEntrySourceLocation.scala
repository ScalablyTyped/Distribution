package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntrySourceLocation extends js.Object {
  /** Optional. Source file name. Depending on the runtime environment, this might be a simple name or a fully-qualified name. */
  var file: js.UndefOr[String] = js.undefined
  /**
    * Optional. Human-readable name of the function or method being invoked, with optional context such as the class or package name. This information may be
    * used in contexts such as the logs viewer, where a file and line number are less meaningful. The format can vary by language. For example:
    * qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
    */
  var function: js.UndefOr[String] = js.undefined
  /** Optional. Line within the source file. 1-based; 0 indicates no line number available. */
  var line: js.UndefOr[String] = js.undefined
}

object LogEntrySourceLocation {
  @scala.inline
  def apply(file: String = null, function: String = null, line: String = null): LogEntrySourceLocation = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (function != null) __obj.updateDynamic("function")(function)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[LogEntrySourceLocation]
  }
}

