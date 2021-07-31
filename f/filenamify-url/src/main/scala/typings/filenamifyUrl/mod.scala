package typings.filenamifyUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(url: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("filenamify-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function filenamifyUrl(url: string, options?: Options): string;
  // export = filenamifyUrl;
  @JSImport("filenamify-url", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof filenamifyUrl */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof filenamifyUrl */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type Options = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilenamifyOptions */ js.Any
}
