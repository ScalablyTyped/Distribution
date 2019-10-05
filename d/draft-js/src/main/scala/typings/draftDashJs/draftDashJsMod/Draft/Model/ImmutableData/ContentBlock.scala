package typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T * / any} */ @js.native
trait ContentBlock extends js.Object {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  def findEntityRanges(
    filterFn: js.Function1[
      /* value */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata, 
      Boolean
    ],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  def findStyleRanges(
    filterFn: js.Function1[
      /* value */ typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata, 
      Boolean
    ],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  def getCharacterList(): List[typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata] = js.native
  def getData(): Map[_, _] = js.native
  def getDepth(): Double = js.native
  def getEntityAt(offset: Double): String = js.native
  def getInlineStyleAt(offset: Double): DraftInlineStyle = js.native
  def getKey(): String = js.native
  def getLength(): Double = js.native
  def getText(): String = js.native
  def getType(): DraftBlockType = js.native
  @JSName("getType")
  def getType_String(): String = js.native
}

