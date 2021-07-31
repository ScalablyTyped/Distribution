package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("filenamify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("filenamify", "path")
  @js.native
  def path: js.Function2[/* path */ String, /* options */ js.UndefOr[Options], String] = js.native
  @scala.inline
  def path(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def path(path: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def path_=(x: js.Function2[/* path */ String, /* options */ js.UndefOr[Options], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
}
