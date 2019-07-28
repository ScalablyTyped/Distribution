package typings.detective.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detective extends js.Object {
  /**
    * Give some source body src, return an array of all the require() calls with string arguments.
    * The options parameter opts is passed along to detective.find().
    */
  def apply(src: String): js.Array[String] = js.native
  def apply(src: String, opts: Options): js.Array[String] = js.native
  /**
    * Give some source body 'src', return 'found' DetectiveResults
    */
  def find(src: String): DetectiveResults = js.native
  def find(src: String, opts: Options): DetectiveResults = js.native
}

