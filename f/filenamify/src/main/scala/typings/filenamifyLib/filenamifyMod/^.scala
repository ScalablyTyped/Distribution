package typings
package filenamifyLib.filenamifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("filenamify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(string: java.lang.String): java.lang.String = js.native
  def apply(string: java.lang.String, options: Options): java.lang.String = js.native
  /**
  	Convert the filename in a path a valid filename and return the augmented path.
  	*/
  def path(path: java.lang.String): java.lang.String = js.native
  def path(path: java.lang.String, options: Options): java.lang.String = js.native
}

