package typings.filenamifyUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("filenamify-url", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Convert a URL to a valid filename.
  	@param url - A URL to convert to a valid filename.
  	@returns A valid filename for `url`.
  	@example
  	```
  	import filenamifyUrl = require('filenamify-url');
  	filenamifyUrl('http://sindresorhus.com/foo?bar=baz');
  	//=> 'sindresorhus.com!foo!bar=baz'
  	filenamifyUrl('http://sindresorhus.com/foo', {replacement: '🐴'});
  	//=> 'sindresorhus.com🐴foo'
  	```
  	*/
  def apply(url: String): String = js.native
  def apply(url: String, options: Options): String = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function filenamifyUrl(url: string, options?: Options): string;
  // export = filenamifyUrl;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof filenamifyUrl */ js.Any = js.native
  
  type Options = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilenamifyOptions */ js.Any
}
