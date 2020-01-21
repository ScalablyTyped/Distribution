package typings.fileUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Convert a file path to a file URL.
  @param filePath - File path to convert.
  @returns The `filePath` converted to a file URL.
  @example
  ```
  import fileUrl = require('file-url');
  fileUrl('unicorn.jpg');
  //=> 'file:///Users/sindresorhus/dev/file-url/unicorn.jpg'
  fileUrl('/Users/pony/pics/unicorn.jpg');
  //=> 'file:///Users/pony/pics/unicorn.jpg'
  fileUrl('unicorn.jpg', {resolve: false});
  //=> 'file:///unicorn.jpg'
  ```
  */
  def apply(filePath: String): String = js.native
  def apply(filePath: String, options: Options): String = js.native
}

