package typings
package draftDashConvertLib.draftDashConvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertToHTMLConfig extends js.Object {
  // Block styles:
  var blockToHTML: js.UndefOr[js.Function1[/* block */ draftDashJsLib.draftDashJsMod.ContentBlock, Tag]] = js.undefined
  // Entity styling:
  var entityToHTML: js.UndefOr[
    js.Function2[
      /* entity */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftEntity[org.scalablytyped.runtime.StringDictionary[_]], 
      /* originalText */ java.lang.String, 
      Tag
    ]
  ] = js.undefined
  // Inline styles:
  var styleToHTML: js.UndefOr[
    js.Function1[
      /* style */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType, 
      Tag | scala.Unit
    ]
  ] = js.undefined
}

object IConvertToHTMLConfig {
  @scala.inline
  def apply(
    blockToHTML: /* block */ draftDashJsLib.draftDashJsMod.ContentBlock => Tag = null,
    entityToHTML: (/* entity */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftEntity[org.scalablytyped.runtime.StringDictionary[_]], /* originalText */ java.lang.String) => Tag = null,
    styleToHTML: /* style */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType => Tag | scala.Unit = null
  ): IConvertToHTMLConfig = {
    val __obj = js.Dynamic.literal()
    if (blockToHTML != null) __obj.updateDynamic("blockToHTML")(js.Any.fromFunction1(blockToHTML))
    if (entityToHTML != null) __obj.updateDynamic("entityToHTML")(js.Any.fromFunction2(entityToHTML))
    if (styleToHTML != null) __obj.updateDynamic("styleToHTML")(js.Any.fromFunction1(styleToHTML))
    __obj.asInstanceOf[IConvertToHTMLConfig]
  }
}

