package typings.draftDashJs.draftDashJsMod

import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadataConfig
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "CharacterMetadata")
@js.native
class CharacterMetadata ()
  extends typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata {
  /* CompleteClass */
  override def getEntity(): String = js.native
  /* CompleteClass */
  override def getStyle(): DraftInlineStyle = js.native
  /* CompleteClass */
  override def hasStyle(style: String): Boolean = js.native
}

/* static members */
@JSImport("draft-js", "CharacterMetadata")
@js.native
object CharacterMetadata extends js.Object {
  def applyEntity(record: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def applyEntity(
    record: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata,
    entityKey: String
  ): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def applyStyle(
    record: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata,
    style: String
  ): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  /**
    * Use this function instead of the `CharacterMetadata` constructor.
    * Since most content generally uses only a very small number of
    * style/entity permutations, we can reuse these objects as often as
    * possible.
    */
  def create(): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def create(config: CharacterMetadataConfig): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def removeStyle(
    record: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata,
    style: String
  ): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
}

