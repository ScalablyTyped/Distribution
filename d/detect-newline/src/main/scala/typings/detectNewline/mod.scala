package typings.detectNewline

import typings.detectNewline.detectNewlineStrings.CarriagereturnLinefeed
import typings.detectNewline.detectNewlineStrings.Linefeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("detect-newline", JSImport.Namespace)
  @js.native
  def apply(string: String): js.UndefOr[CarriagereturnLinefeed | Linefeed] = js.native
  
  @JSImport("detect-newline", "graceful")
  @js.native
  def graceful(): Linefeed = js.native
  /**
  	Detect the dominant newline character of a string.
  	@returns The detected newline or `\n` when no newline character is found or the input is not a string.
  	*/
  @JSImport("detect-newline", "graceful")
  @js.native
  def graceful(string: String): CarriagereturnLinefeed | Linefeed = js.native
  @JSImport("detect-newline", "graceful")
  @js.native
  def graceful(string: js.Any): Linefeed = js.native
}
