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

object Annotation {
  @scala.inline
  def apply(description: java.lang.String, tags: js.Array[Tag]): Annotation = {
    val __obj = js.Dynamic.literal(description = description, tags = tags)
  
    __obj.asInstanceOf[Annotation]
  }
}

