package typings.gapiDotClientDotCloudtrace.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * The column number where the function call appears, if available.
    * This is important in JavaScript because of its anonymous functions.
    */
  var columnNumber: js.UndefOr[String] = js.undefined
  /**
    * The name of the source file where the function call appears (up to 256
    * bytes).
    */
  var fileName: js.UndefOr[TruncatableString] = js.undefined
  /**
    * The fully-qualified name that uniquely identifies the function or
    * method that is active in this frame (up to 1024 bytes).
    */
  var functionName: js.UndefOr[TruncatableString] = js.undefined
  /** The line number in `file_name` where the function call appears. */
  var lineNumber: js.UndefOr[String] = js.undefined
  /** The binary module from where the code was loaded. */
  var loadModule: js.UndefOr[Module] = js.undefined
  /**
    * An un-mangled function name, if `function_name` is
    * [mangled](http://www.avabodh.com/cxxin/namemangling.html). The name can
    * be fully-qualified (up to 1024 bytes).
    */
  var originalFunctionName: js.UndefOr[TruncatableString] = js.undefined
  /** The version of the deployed source code (up to 128 bytes). */
  var sourceVersion: js.UndefOr[TruncatableString] = js.undefined
}

object StackFrame {
  @scala.inline
  def apply(
    columnNumber: String = null,
    fileName: TruncatableString = null,
    functionName: TruncatableString = null,
    lineNumber: String = null,
    loadModule: Module = null,
    originalFunctionName: TruncatableString = null,
    sourceVersion: TruncatableString = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber)
    if (loadModule != null) __obj.updateDynamic("loadModule")(loadModule)
    if (originalFunctionName != null) __obj.updateDynamic("originalFunctionName")(originalFunctionName)
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion)
    __obj.asInstanceOf[StackFrame]
  }
}

