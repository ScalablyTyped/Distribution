package typings.draftjsToHtml.mod

import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draftjs-to-html", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(editorContent: RawDraftContentState): String = js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: js.UndefOr[scala.Nothing],
    directional: js.UndefOr[scala.Nothing],
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: js.UndefOr[scala.Nothing],
    directional: Boolean
  ): String = js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: js.UndefOr[scala.Nothing],
    directional: Boolean,
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  def apply(editorContent: RawDraftContentState, hashtagConfig: HashtagConfig): String = js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: HashtagConfig,
    directional: js.UndefOr[scala.Nothing],
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  def apply(editorContent: RawDraftContentState, hashtagConfig: HashtagConfig, directional: Boolean): String = js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: HashtagConfig,
    directional: Boolean,
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
}
