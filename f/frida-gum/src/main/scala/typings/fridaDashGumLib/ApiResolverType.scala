package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.module
  - fridaDashGumLib.fridaDashGumLibStrings.objc
*/
trait ApiResolverType extends js.Object

object ApiResolverType {
  /**
    * Resolves exported and imported functions of shared libraries
    * currently loaded.
    *
    * Always available.
    *
    * Example query: `"exports:*!open*"`
    * Which may resolve to: `"/usr/lib/libSystem.B.dylib!opendir$INODE64"`
    */
  @scala.inline
  def Module: fridaDashGumLib.fridaDashGumLibStrings.module = this.cast("module")
  /**
    * Resolves Objective-C methods of classes currently loaded.
    *
    * Available on macOS and iOS in processes that have the Objective-C
    * runtime loaded. Use `ObjC.available` to check at runtime, or wrap
    * your `new ApiResolver(ApiResolverType.ObjC)` call in a try-catch.
    *
    * Example query: `"-[NSURL* *HTTP*]"`
    * Which may resolve to: `"-[NSURLRequest valueForHTTPHeaderField:]"`
    */
  @scala.inline
  def ObjC: fridaDashGumLib.fridaDashGumLibStrings.objc = this.cast("objc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

