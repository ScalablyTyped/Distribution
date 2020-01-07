package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of a list which describe the look and feel of bullets
  * belonging to paragraphs associated with a list.
  */
@js.native
trait Schema$ListProperties extends js.Object {
  /**
    * Describes the properties of the bullets at the associated level.  A list
    * has at most nine levels of nesting with nesting level 0 corresponding to
    * the top-most level and nesting level 8 corresponding to the most nested
    * level. The nesting levels are returned in ascending order with the least
    * nested returned first.
    */
  var nestingLevels: js.UndefOr[js.Array[Schema$NestingLevel]] = js.native
}

object Schema$ListProperties {
  @scala.inline
  def apply(nestingLevels: js.Array[Schema$NestingLevel] = null): Schema$ListProperties = {
    val __obj = js.Dynamic.literal()
    if (nestingLevels != null) __obj.updateDynamic("nestingLevels")(nestingLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProperties]
  }
}

