package typings.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a parsed jsdoc comment.
  */
@js.native
trait Annotation extends js.Object {
  /** The overall description of the thing being documented. */
  var description: String = js.native
  var tags: js.Array[Tag] = js.native
}

object Annotation {
  @scala.inline
  def apply(description: String, tags: js.Array[Tag]): Annotation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

