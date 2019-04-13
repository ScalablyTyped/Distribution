package typings
package filenamifyDashUrlLib.filenamifyDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("filenamify-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function filenamifyUrl(input: string, options?: Options): string;
  // export = filenamifyUrl;
  @JSName("default")
  var default_Original: filenamifyDashUrlLib.Anon_Default = js.native
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
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, options: Options): java.lang.String = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function filenamifyUrl(input: string, options?: Options): string;
  // export = filenamifyUrl;
  def default(input: java.lang.String): java.lang.String = js.native
  def default(input: java.lang.String, options: Options): java.lang.String = js.native
}

