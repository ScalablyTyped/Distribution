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
  def apply(): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceLocation]
  }
  @scala.inline
  implicit class SchemaSourceLocationOps[Self <: SchemaSourceLocation] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
  }
  
}

