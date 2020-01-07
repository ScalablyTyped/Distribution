package typings.googleapis.buildSrcApisLanguageV1beta1Mod.language_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mention for an entity in the text. Currently, proper noun
  * mentions are supported.
  */
@js.native
trait Schema$EntityMention extends js.Object {
  /**
    * The mention text.
    */
  var text: js.UndefOr[Schema$TextSpan] = js.native
  /**
    * The type of the entity mention.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$EntityMention {
  @scala.inline
  def apply(text: Schema$TextSpan = null, `type`: String = null): Schema$EntityMention = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EntityMention]
  }
}

