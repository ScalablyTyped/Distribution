package typings.draftJs.mod.Draft.Model.ImmutableData

import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
trait ContentBlock extends js.Object {
  /**
    * Execute a callback for every contiguous range of entities within the block.
    */
  def findEntityRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  /**
    * Execute a callback for every contiguous range of styles within the block.
    */
  def findStyleRanges(
    filterFn: js.Function1[/* value */ CharacterMetadata, Boolean],
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit]
  ): Unit = js.native
  def getCharacterList(): List[CharacterMetadata] = js.native
  def getData(): Map[_, _] = js.native
  def getDepth(): Double = js.native
  def getEntityAt(offset: Double): String = js.native
  def getInlineStyleAt(offset: Double): DraftInlineStyle = js.native
  def getKey(): String = js.native
  def getLength(): Double = js.native
  def getText(): String = js.native
  def getType(): DraftBlockType = js.native
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
  @scala.inline
  implicit class ContentBlockOps[Self <: ContentBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindEntityRanges(
      value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
    ): Self = this.set("findEntityRanges", js.Any.fromFunction2(value))
    @scala.inline
    def setFindStyleRanges(
      value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
    ): Self = this.set("findStyleRanges", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCharacterList(value: () => List[CharacterMetadata]): Self = this.set("getCharacterList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetData(value: () => Map[_, _]): Self = this.set("getData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDepth(value: () => Double): Self = this.set("getDepth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEntityAt(value: Double => String): Self = this.set("getEntityAt", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInlineStyleAt(value: Double => DraftInlineStyle): Self = this.set("getInlineStyleAt", js.Any.fromFunction1(value))
    @scala.inline
    def setGetKey(value: () => String): Self = this.set("getKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => DraftBlockType): Self = this.set("getType", js.Any.fromFunction0(value))
  }
  
}

