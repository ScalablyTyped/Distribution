package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("filenamify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Convert a string to a valid filename.
  	@example
  	```
  	import filenamify = require('filenamify');
  	filenamify('<foo/bar>');
  	//=> 'foo!bar'
  	filenamify('foo:"bar"', {replacement: '🐴'});
  	//=> 'foo🐴bar'
  	```
  	*/
  def apply(string: String): String = js.native
  def apply(string: String, options: Options): String = js.native
  
  def path(path: String): String = js.native
  def path(path: String, options: Options): String = js.native
  @JSName("path")
  var path_Original: js.Function2[/* path */ String, /* options */ js.UndefOr[Options], String] = js.native
}
