package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties that apply to a section&#39;s column.
  */
@js.native
trait Schema$SectionColumnProperties extends js.Object {
  /**
    * The padding at the end of the column.
    */
  var paddingEnd: js.UndefOr[Schema$Dimension] = js.native
  /**
    * The width of the column.
    */
  var width: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$SectionColumnProperties {
  @scala.inline
  def apply(paddingEnd: Schema$Dimension = null, width: Schema$Dimension = null): Schema$SectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (paddingEnd != null) __obj.updateDynamic("paddingEnd")(paddingEnd.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SectionColumnProperties]
  }
}

