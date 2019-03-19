package typings
package filenamifyLib.filenamifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filenamify extends js.Object {
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, options: Options): java.lang.String = js.native
  /**
  	 * Accepts a path and returns the path with a valid filename.
  	 *
  	 * @param input - A string to convert to a valid path with a filename.
  	 */
  def path(input: java.lang.String): java.lang.String = js.native
  def path(input: java.lang.String, options: Options): java.lang.String = js.native
}

