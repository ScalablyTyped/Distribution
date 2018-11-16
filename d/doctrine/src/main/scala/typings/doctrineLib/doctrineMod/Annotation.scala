package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a parsed jsdoc comment.
 */

trait Annotation extends js.Object {
  /** The overall description of the thing being documented. */
  var description: java.lang.String
  var tags: js.Array[Tag]
}

