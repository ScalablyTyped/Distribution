package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * The column number where the function call appears, if available.
    * This is important in JavaScript because of its anonymous functions.
    */
  var columnNumber: js.UndefOr[java.lang.String] = js.undefined
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
  var lineNumber: js.UndefOr[java.lang.String] = js.undefined
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

