package typings.detectDashNewline

import typings.detectDashNewline.detectDashNewlineStrings.BACKSLASHn
import typings.detectDashNewline.detectDashNewlineStrings.BACKSLASHrBACKSLASHn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-newline", JSImport.Namespace)
@js.native
object detectDashNewlineMod extends js.Object {
  /**
  	Detect the dominant newline character of a string.
  	@returns The detected newline or `undefined` when no newline character is found.
  	@example
  	```
  	import detectNewline = require('detect-newline');
  	detectNewline('foo\nbar\nbaz\r\n');
  	//=> '\n'
  	```
  	*/
  def apply(string: String): js.UndefOr[BACKSLASHrBACKSLASHn | BACKSLASHn] = js.native
  /**
  	Detect the dominant newline character of a string.
  	@returns Returns detected newline or `\n` when no newline character is found.
  	*/
  def graceful(string: String): BACKSLASHrBACKSLASHn | BACKSLASHn = js.native
}

