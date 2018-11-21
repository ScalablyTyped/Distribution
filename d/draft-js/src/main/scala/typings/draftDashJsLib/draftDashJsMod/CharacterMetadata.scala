package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "CharacterMetadata")
@js.native
class CharacterMetadata ()
  extends draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata {
  /* CompleteClass */
  override def getEntity(): java.lang.String = js.native
  /* CompleteClass */
  override def getStyle(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle = js.native
  /* CompleteClass */
  override def hasStyle(style: java.lang.String): scala.Boolean = js.native
}

@JSImport("draft-js", "CharacterMetadata")
@js.native
object CharacterMetadata extends js.Object {
  def applyEntity(record: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def applyEntity(
    record: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata,
    entityKey: java.lang.String
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def applyStyle(
    record: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata,
    style: java.lang.String
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  /**
                   * Use this function instead of the `CharacterMetadata` constructor.
                   * Since most content generally uses only a very small number of
                   * style/entity permutations, we can reuse these objects as often as
                   * possible.
                   */
  def create(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  /**
                   * Use this function instead of the `CharacterMetadata` constructor.
                   * Since most content generally uses only a very small number of
                   * style/entity permutations, we can reuse these objects as often as
                   * possible.
                   */
  def create(config: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadataConfig): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
  def removeStyle(
    record: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata,
    style: java.lang.String
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.CharacterMetadata = js.native
}

