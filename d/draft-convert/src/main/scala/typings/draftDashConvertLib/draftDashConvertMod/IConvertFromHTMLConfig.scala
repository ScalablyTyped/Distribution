package typings
package draftDashConvertLib.draftDashConvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertFromHTMLConfig extends js.Object {
  // Block styles:
  var htmlToBlock: js.UndefOr[
    js.Function2[
      /* nodeName */ java.lang.String, 
      /* node */ stdLib.HTMLElement, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftBlockType | draftDashConvertLib.Anon_Data | draftDashConvertLib.draftDashConvertLibNumbers.`false`
    ]
  ] = js.undefined
  // Html entities
  var htmlToEntity: js.UndefOr[
    js.Function6[
      /* nodeName */ java.lang.String, 
      /* node */ stdLib.HTMLElement, 
      /* createEntity */ js.Function3[
        /* type */ java.lang.String, 
        /* mutability */ java.lang.String, 
        /* data */ js.Object, 
        EntityKey
      ], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], 
      /* replaceEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  // Inline styles:
  var htmlToStyle: js.UndefOr[
    js.Function2[
      /* nodeName */ java.lang.String, 
      /* node */ stdLib.HTMLElement, 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType
    ]
  ] = js.undefined
  // Text entities
  var textToEntity: js.UndefOr[
    js.Function5[
      /* text */ java.lang.String, 
      /* createEntity */ js.Function3[
        /* type */ java.lang.String, 
        /* mutability */ java.lang.String, 
        /* data */ js.Object, 
        EntityKey
      ], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], 
      /* replaceEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], 
      js.Array[draftDashConvertLib.Anon_Entity]
    ]
  ] = js.undefined
}

object IConvertFromHTMLConfig {
  @scala.inline
  def apply(
    htmlToBlock: (/* nodeName */ java.lang.String, /* node */ stdLib.HTMLElement) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftBlockType | draftDashConvertLib.Anon_Data | draftDashConvertLib.draftDashConvertLibNumbers.`false` = null,
    htmlToEntity: (/* nodeName */ java.lang.String, /* node */ stdLib.HTMLElement, /* createEntity */ js.Function3[
      /* type */ java.lang.String, 
      /* mutability */ java.lang.String, 
      /* data */ js.Object, 
      EntityKey
    ], /* getEntity */ js.Function1[
      /* key */ EntityKey, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Entity */ _
    ], /* mergeEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], /* replaceEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit]) => scala.Unit = null,
    htmlToStyle: (/* nodeName */ java.lang.String, /* node */ stdLib.HTMLElement) => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType = null,
    textToEntity: (/* text */ java.lang.String, /* createEntity */ js.Function3[
      /* type */ java.lang.String, 
      /* mutability */ java.lang.String, 
      /* data */ js.Object, 
      EntityKey
    ], /* getEntity */ js.Function1[
      /* key */ EntityKey, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Entity */ _
    ], /* mergeEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], /* replaceEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit]) => js.Array[draftDashConvertLib.Anon_Entity] = null
  ): IConvertFromHTMLConfig = {
    val __obj = js.Dynamic.literal()
    if (htmlToBlock != null) __obj.updateDynamic("htmlToBlock")(js.Any.fromFunction2(htmlToBlock))
    if (htmlToEntity != null) __obj.updateDynamic("htmlToEntity")(js.Any.fromFunction6(htmlToEntity))
    if (htmlToStyle != null) __obj.updateDynamic("htmlToStyle")(js.Any.fromFunction2(htmlToStyle))
    if (textToEntity != null) __obj.updateDynamic("textToEntity")(js.Any.fromFunction5(textToEntity))
    __obj.asInstanceOf[IConvertFromHTMLConfig]
  }
}

