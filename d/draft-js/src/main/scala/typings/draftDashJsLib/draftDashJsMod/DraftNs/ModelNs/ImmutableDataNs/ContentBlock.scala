package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: any} */ @js.native
trait ContentBlock extends js.Object {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  def findEntityRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, scala.Boolean],
    callback: js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  def findStyleRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, scala.Boolean],
    callback: js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def getCharacterList(): immutableLib.immutableMod.List[CharacterMetadata] = js.native
  def getData(): immutableLib.immutableMod.Map[_, _] = js.native
  def getDepth(): scala.Double = js.native
  def getEntityAt(offset: scala.Double): java.lang.String = js.native
  def getInlineStyleAt(offset: scala.Double): DraftInlineStyle = js.native
  def getKey(): java.lang.String = js.native
  def getLength(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def getType(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftBlockType = js.native
  @JSName("getType")
  def getType_String(): java.lang.String = js.native
}

