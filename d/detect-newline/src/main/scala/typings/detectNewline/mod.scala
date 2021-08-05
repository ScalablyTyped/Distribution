package typings.detectNewline

import typings.detectNewline.detectNewlineStrings.CarriagereturnLinefeed
import typings.detectNewline.detectNewlineStrings.Linefeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(string: String): js.UndefOr[CarriagereturnLinefeed | Linefeed] = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CarriagereturnLinefeed | Linefeed]]
  
  @JSImport("detect-newline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def graceful(): Linefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("graceful")().asInstanceOf[Linefeed]
  /**
  	Detect the dominant newline character of a string.
  	@returns The detected newline or `\n` when no newline character is found or the input is not a string.
  	*/
  inline def graceful(string: String): CarriagereturnLinefeed | Linefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("graceful")(string.asInstanceOf[js.Any]).asInstanceOf[CarriagereturnLinefeed | Linefeed]
  inline def graceful(string: js.Any): Linefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("graceful")(string.asInstanceOf[js.Any]).asInstanceOf[Linefeed]
}
