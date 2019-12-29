package typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T * / any} */ trait ContentBlock extends js.Object {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  def findEntityRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  def findStyleRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit
  def getCharacterList(): List[CharacterMetadata]
  def getData(): Map[_, _]
  def getDepth(): Double
  def getEntityAt(offset: Double): String
  def getInlineStyleAt(offset: Double): DraftInlineStyle
  def getKey(): String
  def getLength(): Double
  def getText(): String
  def getType(): DraftBlockType
}

object ContentBlock {
  @scala.inline
  def apply(
    findEntityRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit,
    findStyleRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit,
    getCharacterList: () => List[CharacterMetadata],
    getData: () => Map[_, _],
    getDepth: () => Double,
    getEntityAt: Double => String,
    getInlineStyleAt: Double => DraftInlineStyle,
    getKey: () => String,
    getLength: () => Double,
    getText: () => String,
    getType: () => DraftBlockType
  ): ContentBlock = {
    val __obj = js.Dynamic.literal(findEntityRanges = js.Any.fromFunction2(findEntityRanges), findStyleRanges = js.Any.fromFunction2(findStyleRanges), getCharacterList = js.Any.fromFunction0(getCharacterList), getData = js.Any.fromFunction0(getData), getDepth = js.Any.fromFunction0(getDepth), getEntityAt = js.Any.fromFunction1(getEntityAt), getInlineStyleAt = js.Any.fromFunction1(getInlineStyleAt), getKey = js.Any.fromFunction0(getKey), getLength = js.Any.fromFunction0(getLength), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[ContentBlock]
  }
}

