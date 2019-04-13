package typings
package detectiveLib.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detective extends js.Object {
  /**
    * Give some source body src, return an array of all the require() calls with string arguments.
    * The options parameter opts is passed along to detective.find().
    */
  def apply(src: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(src: java.lang.String, opts: Options): js.Array[java.lang.String] = js.native
  /**
    * Give some source body 'src', return 'found' DetectiveResults
    */
  def find(src: java.lang.String): DetectiveResults = js.native
  def find(src: java.lang.String, opts: Options): DetectiveResults = js.native
}

