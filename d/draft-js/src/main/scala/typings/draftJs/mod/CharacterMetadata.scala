package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadataConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "CharacterMetadata")
@js.native
class CharacterMetadata ()
  extends typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata

/* static members */
@JSImport("draft-js", "CharacterMetadata")
@js.native
object CharacterMetadata extends js.Object {
  def applyEntity(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def applyEntity(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, entityKey: String): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def applyStyle(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  /**
    * Use this function instead of the `CharacterMetadata` constructor.
    * Since most content generally uses only a very small number of
    * style/entity permutations, we can reuse these objects as often as
    * possible.
    */
  def create(): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def create(config: CharacterMetadataConfig): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def removeStyle(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
}

