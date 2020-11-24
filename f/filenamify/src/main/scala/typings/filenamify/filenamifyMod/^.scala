package typings.filenamify.filenamifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("filenamify/filenamify", JSImport.Namespace)
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
  def apply(string: String): String = js.native
  def apply(string: String, options: Options): String = js.native
}
