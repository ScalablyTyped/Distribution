package typings.filenamifyDashUrl

import typings.filenamifyDashUrl.filenamifyDashUrlMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Convert a URL to a valid filename.
  	@param input - A URL to convert to a valid filename.
  	@returns A valid filename for `input`.
  	@example
  	```
  	import filenamifyUrl = require('filenamify-url');
  	filenamifyUrl('http://sindresorhus.com/foo?bar=baz');
  	//=> 'sindresorhus.com!foo!bar=baz'
  	filenamifyUrl('http://sindresorhus.com/foo', {replacement: '🐴'});
  	//=> 'sindresorhus.com🐴foo'
  	```
  	*/
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
}

