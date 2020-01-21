package typings.draftConvert.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertToHTMLConfig extends js.Object {
  // Block styles:
  var blockToHTML: js.UndefOr[js.Function1[/* block */ ContentBlock, Tag]] = js.undefined
  // Entity styling:
  var entityToHTML: js.UndefOr[
    js.Function2[/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String, Tag]
  ] = js.undefined
  // Inline styles:
  var styleToHTML: js.UndefOr[js.Function1[/* style */ DraftInlineStyleType, Tag | Unit]] = js.undefined
}

object IConvertToHTMLConfig {
  @scala.inline
  def apply(
    blockToHTML: /* block */ ContentBlock => Tag = null,
    entityToHTML: (/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String) => Tag = null,
    styleToHTML: /* style */ DraftInlineStyleType => Tag | Unit = null
  ): IConvertToHTMLConfig = {
    val __obj = js.Dynamic.literal()
    if (blockToHTML != null) __obj.updateDynamic("blockToHTML")(js.Any.fromFunction1(blockToHTML))
    if (entityToHTML != null) __obj.updateDynamic("entityToHTML")(js.Any.fromFunction2(entityToHTML))
    if (styleToHTML != null) __obj.updateDynamic("styleToHTML")(js.Any.fromFunction1(styleToHTML))
    __obj.asInstanceOf[IConvertToHTMLConfig]
  }
}

