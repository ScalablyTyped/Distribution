package typings.gapiDotClientDotClouderrorreporting.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  /**
    * The source code filename, which can include a truncated relative
    * path, or a full path from a production machine.
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * Human-readable name of a function or method.
    * The value can include optional context like the class or package name.
    * For example, `my.package.MyClass.method` in case of Java.
    */
  var functionName: js.UndefOr[String] = js.undefined
  /** 1-based. 0 indicates that the line number is unknown. */
  var lineNumber: js.UndefOr[Double] = js.undefined
}

object SourceLocation {
  @scala.inline
  def apply(filePath: String = null, functionName: String = null, lineNumber: Int | Double = null): SourceLocation = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

