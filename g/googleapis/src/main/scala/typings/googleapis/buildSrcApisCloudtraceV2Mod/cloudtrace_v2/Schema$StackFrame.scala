package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single stack frame in a stack trace.
  */
@js.native
trait Schema$StackFrame extends js.Object {
  /**
    * The column number where the function call appears, if available. This is
    * important in JavaScript because of its anonymous functions.
    */
  var columnNumber: js.UndefOr[String] = js.native
  /**
    * The name of the source file where the function call appears (up to 256
    * bytes).
    */
  var fileName: js.UndefOr[Schema$TruncatableString] = js.native
  /**
    * The fully-qualified name that uniquely identifies the function or method
    * that is active in this frame (up to 1024 bytes).
    */
  var functionName: js.UndefOr[Schema$TruncatableString] = js.native
  /**
    * The line number in `file_name` where the function call appears.
    */
  var lineNumber: js.UndefOr[String] = js.native
  /**
    * The binary module from where the code was loaded.
    */
  var loadModule: js.UndefOr[Schema$Module] = js.native
  /**
    * An un-mangled function name, if `function_name` is
    * [mangled](http://www.avabodh.com/cxxin/namemangling.html). The name can
    * be fully-qualified (up to 1024 bytes).
    */
  var originalFunctionName: js.UndefOr[Schema$TruncatableString] = js.native
  /**
    * The version of the deployed source code (up to 128 bytes).
    */
  var sourceVersion: js.UndefOr[Schema$TruncatableString] = js.native
}

object Schema$StackFrame {
  @scala.inline
  def apply(
    columnNumber: String = null,
    fileName: Schema$TruncatableString = null,
    functionName: Schema$TruncatableString = null,
    lineNumber: String = null,
    loadModule: Schema$Module = null,
    originalFunctionName: Schema$TruncatableString = null,
    sourceVersion: Schema$TruncatableString = null
  ): Schema$StackFrame = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (loadModule != null) __obj.updateDynamic("loadModule")(loadModule.asInstanceOf[js.Any])
    if (originalFunctionName != null) __obj.updateDynamic("originalFunctionName")(originalFunctionName.asInstanceOf[js.Any])
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StackFrame]
  }
}

