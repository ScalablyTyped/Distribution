package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tab stop within a paragraph.
  */
@js.native
trait Schema$TabStop extends js.Object {
  /**
    * The alignment of this tab stop. If unset, the value defaults to START.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * The offset between this tab stop and the start margin.
    */
  var offset: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$TabStop {
  @scala.inline
  def apply(alignment: String = null, offset: Schema$Dimension = null): Schema$TabStop = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TabStop]
  }
}

