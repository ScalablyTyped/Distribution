package typings.googleGax.pathTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/pathTemplate", "PathTemplate")
@js.native
class PathTemplate protected () extends js.Object {
  /**
    * @param {String} data the of the template
    *
    * @constructor
    */
  def this(data: String) = this()
  val parseResult: js.Any = js.native
  val segments: js.Array[Segment] = js.native
  val size: Double = js.native
  /**
    * Renders the path template.
    *
    * @return {string} contains const names matched to binding values
    */
  def inspect(): String = js.native
  /**
    * Matches a fully-qualified path template string.
    *
    * @param {String} path a fully-qualified path template string
    * @return {Object} contains const names matched to binding values
    * @throws {TypeError} if path can't be matched to this template
    */
  def `match`(path: String): Bindings = js.native
  /**
    * Renders a path template using the provided bindings.
    *
    * @param {Object} bindings a mapping of const names to binding strings
    * @return {String} a rendered representation of the path template
    * @throws {TypeError} if a key is missing, or if a sub-template cannot be
    *   parsed
    */
  def render(bindings: Bindings): String = js.native
}

