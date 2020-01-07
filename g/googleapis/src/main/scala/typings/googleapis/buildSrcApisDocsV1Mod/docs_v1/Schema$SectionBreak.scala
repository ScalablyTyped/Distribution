package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a section break. A section is a range of
  * content which has the same SectionStyle. A section break represents the
  * start of a new section, and the section style applies to the section after
  * the section break.  The document body always begins with a section break.
  */
@js.native
trait Schema$SectionBreak extends js.Object {
  /**
    * The style of the section after this section break.
    */
  var sectionStyle: js.UndefOr[Schema$SectionStyle] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A SectionBreak may have multiple insertion
    * IDs if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$SectionBreak {
  @scala.inline
  def apply(
    sectionStyle: Schema$SectionStyle = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null
  ): Schema$SectionBreak = {
    val __obj = js.Dynamic.literal()
    if (sectionStyle != null) __obj.updateDynamic("sectionStyle")(sectionStyle.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SectionBreak]
  }
}

