package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a location in the source code of the service for which errors are
  * reported. `functionName` must be provided by the application when reporting
  * an error, unless the error report contains a `message` with a supported
  * exception stack trace. All fields are optional for the later case.
  */
@js.native
trait SchemaSourceLocation extends js.Object {
  /**
    * The source code filename, which can include a truncated relative path, or
    * a full path from a production machine.
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * Human-readable name of a function or method. The value can include
    * optional context like the class or package name. For example,
    * `my.package.MyClass.method` in case of Java.
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * 1-based. 0 indicates that the line number is unknown.
    */
  var lineNumber: js.UndefOr[Double] = js.native
}

object SchemaSourceLocation {
  @scala.inline
  def apply(
    filePath: String = null,
    functionName: String = null,
    lineNumber: js.UndefOr[Double] = js.undefined
  ): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceLocation]
  }
}

