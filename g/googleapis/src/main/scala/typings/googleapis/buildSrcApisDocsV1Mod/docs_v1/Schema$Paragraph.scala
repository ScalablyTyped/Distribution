package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a paragraph. A paragraph is a range of
  * content that is terminated with a newline character.
  */
@js.native
trait Schema$Paragraph extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[Schema$Bullet] = js.native
  /**
    * The content of the paragraph broken down into its component parts.
    */
  var elements: js.UndefOr[js.Array[Schema$ParagraphElement]] = js.native
  /**
    * The style of this paragraph.
    */
  var paragraphStyle: js.UndefOr[Schema$ParagraphStyle] = js.native
  /**
    * The IDs of the positioned objects tethered to this paragraph.
    */
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested changes to this paragraph&#39;s bullet.
    */
  var suggestedBulletChanges: js.UndefOr[StringDictionary[Schema$SuggestedBullet]] = js.native
  /**
    * The suggested paragraph style changes to this paragraph, keyed by
    * suggestion ID.
    */
  var suggestedParagraphStyleChanges: js.UndefOr[StringDictionary[Schema$SuggestedParagraphStyle]] = js.native
  /**
    * The IDs of the positioned objects that are suggested to be attached to
    * this paragraph, keyed by suggestion ID.
    */
  var suggestedPositionedObjectIds: js.UndefOr[StringDictionary[Schema$ObjectReferences]] = js.native
}

object Schema$Paragraph {
  @scala.inline
  def apply(
    bullet: Schema$Bullet = null,
    elements: js.Array[Schema$ParagraphElement] = null,
    paragraphStyle: Schema$ParagraphStyle = null,
    positionedObjectIds: js.Array[String] = null,
    suggestedBulletChanges: StringDictionary[Schema$SuggestedBullet] = null,
    suggestedParagraphStyleChanges: StringDictionary[Schema$SuggestedParagraphStyle] = null,
    suggestedPositionedObjectIds: StringDictionary[Schema$ObjectReferences] = null
  ): Schema$Paragraph = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (positionedObjectIds != null) __obj.updateDynamic("positionedObjectIds")(positionedObjectIds.asInstanceOf[js.Any])
    if (suggestedBulletChanges != null) __obj.updateDynamic("suggestedBulletChanges")(suggestedBulletChanges.asInstanceOf[js.Any])
    if (suggestedParagraphStyleChanges != null) __obj.updateDynamic("suggestedParagraphStyleChanges")(suggestedParagraphStyleChanges.asInstanceOf[js.Any])
    if (suggestedPositionedObjectIds != null) __obj.updateDynamic("suggestedPositionedObjectIds")(suggestedPositionedObjectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Paragraph]
  }
}

