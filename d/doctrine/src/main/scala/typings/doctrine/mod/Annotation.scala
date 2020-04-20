package typings.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a parsed jsdoc comment.
  */
trait Annotation extends js.Object {
  /** The overall description of the thing being documented. */
  var description: String
  var tags: js.Array[Tag]
}

object Annotation {
  @scala.inline
  def apply(description: String, tags: js.Array[Tag]): Annotation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

