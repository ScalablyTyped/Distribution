package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("filenamify", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("filenamify", JSImport.Namespace)
  @js.native
  def apply(string: String, options: Options): String = js.native
  
  @JSImport("filenamify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("filenamify", "path")
  @js.native
  def path: js.Function2[/* path */ String, /* options */ js.UndefOr[Options], String] = js.native
  @JSImport("filenamify", "path")
  @js.native
  def path(path: String): String = js.native
  @JSImport("filenamify", "path")
  @js.native
  def path(path: String, options: Options): String = js.native
  @scala.inline
  def path_=(x: js.Function2[/* path */ String, /* options */ js.UndefOr[Options], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
}
