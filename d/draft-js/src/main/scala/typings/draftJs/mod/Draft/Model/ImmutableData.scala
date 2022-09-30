package typings.draftJs.mod.Draft.Model

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.anon.PartialSelectionStateProp
import typings.draftJs.draftJsStrings.anchorKey
import typings.draftJs.draftJsStrings.anchorOffset
import typings.draftJs.draftJsStrings.focusKey
import typings.draftJs.draftJsStrings.focusOffset
import typings.draftJs.draftJsStrings.hasFocus
import typings.draftJs.draftJsStrings.isBackward
import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
import typings.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typings.draftJs.mod.Draft.Model.Entity.DraftEntityInstance
import typings.immutable.mod.Map
import typings.immutable.mod.OrderedMap
import typings.immutable.mod.OrderedSet
import typings.immutable.mod.Stack
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImmutableData {
  
  type BlockMap = OrderedMap[String, ContentBlock]
  
  trait BlockMapBuilder extends StObject
  
  trait CharacterMetadata extends StObject {
    
    def getEntity(): String
    
    def getStyle(): DraftInlineStyle
    
    def hasStyle(style: String): Boolean
  }
  object CharacterMetadata {
    
    inline def apply(getEntity: () => String, getStyle: () => DraftInlineStyle, hasStyle: String => Boolean): CharacterMetadata = {
      val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity), getStyle = js.Any.fromFunction0(getStyle), hasStyle = js.Any.fromFunction1(hasStyle))
      __obj.asInstanceOf[CharacterMetadata]
    }
    
    extension [Self <: CharacterMetadata](x: Self) {
      
      inline def setGetEntity(value: () => String): Self = StObject.set(x, "getEntity", js.Any.fromFunction0(value))
      
      inline def setGetStyle(value: () => DraftInlineStyle): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      inline def setHasStyle(value: String => Boolean): Self = StObject.set(x, "hasStyle", js.Any.fromFunction1(value))
    }
  }
  
  trait CharacterMetadataConfig extends StObject {
    
    var entity: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[DraftInlineStyle] = js.undefined
  }
  object CharacterMetadataConfig {
    
    inline def apply(): CharacterMetadataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CharacterMetadataConfig]
    }
    
    extension [Self <: CharacterMetadataConfig](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setStyle(value: DraftInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait ContentBlock extends StObject {
    
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
    
    def getCharacterList(): typings.immutable.mod.List[CharacterMetadata]
    
    def getData(): Map[Any, Any]
    
    def getDepth(): Double
    
    def getEntityAt(offset: Double): String
    
    def getInlineStyleAt(offset: Double): DraftInlineStyle
    
    def getKey(): String
    
    def getLength(): Double
    
    def getText(): String
    
    def getType(): DraftBlockType
  }
  object ContentBlock {
    
    inline def apply(
      findEntityRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit,
      findStyleRanges: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit,
      getCharacterList: () => typings.immutable.mod.List[CharacterMetadata],
      getData: () => Map[Any, Any],
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
    
    extension [Self <: ContentBlock](x: Self) {
      
      inline def setFindEntityRanges(
        value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "findEntityRanges", js.Any.fromFunction2(value))
      
      inline def setFindStyleRanges(
        value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "findStyleRanges", js.Any.fromFunction2(value))
      
      inline def setGetCharacterList(value: () => typings.immutable.mod.List[CharacterMetadata]): Self = StObject.set(x, "getCharacterList", js.Any.fromFunction0(value))
      
      inline def setGetData(value: () => Map[Any, Any]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetDepth(value: () => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction0(value))
      
      inline def setGetEntityAt(value: Double => String): Self = StObject.set(x, "getEntityAt", js.Any.fromFunction1(value))
      
      inline def setGetInlineStyleAt(value: Double => DraftInlineStyle): Self = StObject.set(x, "getInlineStyleAt", js.Any.fromFunction1(value))
      
      inline def setGetKey(value: () => String): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => DraftBlockType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait ContentState extends StObject {
    
    def addEntity(instance: DraftEntityInstance): ContentState = js.native
    
    def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability): ContentState = js.native
    def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability, data: js.Object): ContentState = js.native
    
    def getAllEntities(): OrderedMap[String, DraftEntityInstance] = js.native
    
    def getBlockAfter(key: String): js.UndefOr[ContentBlock] = js.native
    
    def getBlockBefore(key: String): js.UndefOr[ContentBlock] = js.native
    
    def getBlockForKey(key: String): ContentBlock = js.native
    
    def getBlockMap(): BlockMap = js.native
    
    def getBlocksAsArray(): js.Array[ContentBlock] = js.native
    
    def getEntity(key: String): Any = js.native
    
    def getEntityMap(): Any = js.native
    
    def getFirstBlock(): ContentBlock = js.native
    
    def getKeyAfter(key: String): String = js.native
    
    def getKeyBefore(key: String): String = js.native
    
    def getLastBlock(): ContentBlock = js.native
    
    def getLastCreatedEntityKey(): String = js.native
    
    def getPlainText(): String = js.native
    def getPlainText(delimiter: String): String = js.native
    
    def getSelectionAfter(): SelectionState = js.native
    
    def getSelectionBefore(): SelectionState = js.native
    
    def hasText(): Boolean = js.native
    
    def mergeEntityData(key: String, toMerge: StringDictionary[Any]): ContentState = js.native
    
    def replaceEntityData(key: String, toMerge: StringDictionary[Any]): ContentState = js.native
  }
  
  trait DraftBlockRenderConfig extends StObject {
    
    var element: String
    
    var wrapper: js.UndefOr[ReactNode] = js.undefined
  }
  object DraftBlockRenderConfig {
    
    inline def apply(element: String): DraftBlockRenderConfig = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraftBlockRenderConfig]
    }
    
    extension [Self <: DraftBlockRenderConfig](x: Self) {
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: ReactNode): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type DraftInlineStyle = OrderedSet[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.`adjust-depth`
    - typings.draftJs.draftJsStrings.`apply-entity`
    - typings.draftJs.draftJsStrings.`backspace-character`
    - typings.draftJs.draftJsStrings.`change-block-data`
    - typings.draftJs.draftJsStrings.`change-block-type`
    - typings.draftJs.draftJsStrings.`change-inline-style`
    - typings.draftJs.draftJsStrings.`move-block`
    - typings.draftJs.draftJsStrings.`delete-character`
    - typings.draftJs.draftJsStrings.`insert-characters`
    - typings.draftJs.draftJsStrings.`insert-fragment`
    - typings.draftJs.draftJsStrings.redo
    - typings.draftJs.draftJsStrings.`remove-range`
    - typings.draftJs.draftJsStrings.`spellcheck-change`
    - typings.draftJs.draftJsStrings.`split-block`
    - typings.draftJs.draftJsStrings.undo
  */
  trait EditorChangeType extends StObject
  object EditorChangeType {
    
    inline def `adjust-depth`: typings.draftJs.draftJsStrings.`adjust-depth` = "adjust-depth".asInstanceOf[typings.draftJs.draftJsStrings.`adjust-depth`]
    
    inline def `apply-entity`: typings.draftJs.draftJsStrings.`apply-entity` = "apply-entity".asInstanceOf[typings.draftJs.draftJsStrings.`apply-entity`]
    
    inline def `backspace-character`: typings.draftJs.draftJsStrings.`backspace-character` = "backspace-character".asInstanceOf[typings.draftJs.draftJsStrings.`backspace-character`]
    
    inline def `change-block-data`: typings.draftJs.draftJsStrings.`change-block-data` = "change-block-data".asInstanceOf[typings.draftJs.draftJsStrings.`change-block-data`]
    
    inline def `change-block-type`: typings.draftJs.draftJsStrings.`change-block-type` = "change-block-type".asInstanceOf[typings.draftJs.draftJsStrings.`change-block-type`]
    
    inline def `change-inline-style`: typings.draftJs.draftJsStrings.`change-inline-style` = "change-inline-style".asInstanceOf[typings.draftJs.draftJsStrings.`change-inline-style`]
    
    inline def `delete-character`: typings.draftJs.draftJsStrings.`delete-character` = "delete-character".asInstanceOf[typings.draftJs.draftJsStrings.`delete-character`]
    
    inline def `insert-characters`: typings.draftJs.draftJsStrings.`insert-characters` = "insert-characters".asInstanceOf[typings.draftJs.draftJsStrings.`insert-characters`]
    
    inline def `insert-fragment`: typings.draftJs.draftJsStrings.`insert-fragment` = "insert-fragment".asInstanceOf[typings.draftJs.draftJsStrings.`insert-fragment`]
    
    inline def `move-block`: typings.draftJs.draftJsStrings.`move-block` = "move-block".asInstanceOf[typings.draftJs.draftJsStrings.`move-block`]
    
    inline def redo: typings.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typings.draftJs.draftJsStrings.redo]
    
    inline def `remove-range`: typings.draftJs.draftJsStrings.`remove-range` = "remove-range".asInstanceOf[typings.draftJs.draftJsStrings.`remove-range`]
    
    inline def `spellcheck-change`: typings.draftJs.draftJsStrings.`spellcheck-change` = "spellcheck-change".asInstanceOf[typings.draftJs.draftJsStrings.`spellcheck-change`]
    
    inline def `split-block`: typings.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typings.draftJs.draftJsStrings.`split-block`]
    
    inline def undo: typings.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typings.draftJs.draftJsStrings.undo]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait EditorState extends StObject {
    
    def getAllowUndo(): Boolean
    
    def getBlockTree(blockKey: String): typings.immutable.mod.List[Any]
    
    def getCurrentContent(): ContentState
    
    /**
      * Get the appropriate inline style for the editor state. If an
      * override is in place, use it. Otherwise, the current style is
      * based on the location of the selection state.
      */
    def getCurrentInlineStyle(): DraftInlineStyle
    
    def getDecorator(): DraftDecoratorType
    
    def getDirectionMap(): OrderedMap[Any, Any]
    
    /**
      * While editing, the user may apply inline style commands with a collapsed
      * cursor, intending to type text that adopts the specified style. In this
      * case, we track the specified style as an "override" that takes precedence
      * over the inline style of the text adjacent to the cursor.
      *
      * If null, there is no override in place.
      */
    def getInlineStyleOverride(): DraftInlineStyle
    
    def getLastChangeType(): EditorChangeType
    
    def getNativelyRenderedContent(): ContentState
    
    def getRedoStack(): Stack[ContentState]
    
    def getSelection(): SelectionState
    
    def getUndoStack(): Stack[ContentState]
    
    def isInCompositionMode(): Boolean
    
    def isSelectionAtEndOfContent(): Boolean
    
    def isSelectionAtStartOfContent(): Boolean
    
    def mustForceSelection(): Boolean
    
    def toJS(): js.Object
  }
  object EditorState {
    
    inline def apply(
      getAllowUndo: () => Boolean,
      getBlockTree: String => typings.immutable.mod.List[Any],
      getCurrentContent: () => ContentState,
      getCurrentInlineStyle: () => DraftInlineStyle,
      getDecorator: () => DraftDecoratorType,
      getDirectionMap: () => OrderedMap[Any, Any],
      getInlineStyleOverride: () => DraftInlineStyle,
      getLastChangeType: () => EditorChangeType,
      getNativelyRenderedContent: () => ContentState,
      getRedoStack: () => Stack[ContentState],
      getSelection: () => SelectionState,
      getUndoStack: () => Stack[ContentState],
      isInCompositionMode: () => Boolean,
      isSelectionAtEndOfContent: () => Boolean,
      isSelectionAtStartOfContent: () => Boolean,
      mustForceSelection: () => Boolean,
      toJS: () => js.Object
    ): EditorState = {
      val __obj = js.Dynamic.literal(getAllowUndo = js.Any.fromFunction0(getAllowUndo), getBlockTree = js.Any.fromFunction1(getBlockTree), getCurrentContent = js.Any.fromFunction0(getCurrentContent), getCurrentInlineStyle = js.Any.fromFunction0(getCurrentInlineStyle), getDecorator = js.Any.fromFunction0(getDecorator), getDirectionMap = js.Any.fromFunction0(getDirectionMap), getInlineStyleOverride = js.Any.fromFunction0(getInlineStyleOverride), getLastChangeType = js.Any.fromFunction0(getLastChangeType), getNativelyRenderedContent = js.Any.fromFunction0(getNativelyRenderedContent), getRedoStack = js.Any.fromFunction0(getRedoStack), getSelection = js.Any.fromFunction0(getSelection), getUndoStack = js.Any.fromFunction0(getUndoStack), isInCompositionMode = js.Any.fromFunction0(isInCompositionMode), isSelectionAtEndOfContent = js.Any.fromFunction0(isSelectionAtEndOfContent), isSelectionAtStartOfContent = js.Any.fromFunction0(isSelectionAtStartOfContent), mustForceSelection = js.Any.fromFunction0(mustForceSelection), toJS = js.Any.fromFunction0(toJS))
      __obj.asInstanceOf[EditorState]
    }
    
    extension [Self <: EditorState](x: Self) {
      
      inline def setGetAllowUndo(value: () => Boolean): Self = StObject.set(x, "getAllowUndo", js.Any.fromFunction0(value))
      
      inline def setGetBlockTree(value: String => typings.immutable.mod.List[Any]): Self = StObject.set(x, "getBlockTree", js.Any.fromFunction1(value))
      
      inline def setGetCurrentContent(value: () => ContentState): Self = StObject.set(x, "getCurrentContent", js.Any.fromFunction0(value))
      
      inline def setGetCurrentInlineStyle(value: () => DraftInlineStyle): Self = StObject.set(x, "getCurrentInlineStyle", js.Any.fromFunction0(value))
      
      inline def setGetDecorator(value: () => DraftDecoratorType): Self = StObject.set(x, "getDecorator", js.Any.fromFunction0(value))
      
      inline def setGetDirectionMap(value: () => OrderedMap[Any, Any]): Self = StObject.set(x, "getDirectionMap", js.Any.fromFunction0(value))
      
      inline def setGetInlineStyleOverride(value: () => DraftInlineStyle): Self = StObject.set(x, "getInlineStyleOverride", js.Any.fromFunction0(value))
      
      inline def setGetLastChangeType(value: () => EditorChangeType): Self = StObject.set(x, "getLastChangeType", js.Any.fromFunction0(value))
      
      inline def setGetNativelyRenderedContent(value: () => ContentState): Self = StObject.set(x, "getNativelyRenderedContent", js.Any.fromFunction0(value))
      
      inline def setGetRedoStack(value: () => Stack[ContentState]): Self = StObject.set(x, "getRedoStack", js.Any.fromFunction0(value))
      
      inline def setGetSelection(value: () => SelectionState): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
      
      inline def setGetUndoStack(value: () => Stack[ContentState]): Self = StObject.set(x, "getUndoStack", js.Any.fromFunction0(value))
      
      inline def setIsInCompositionMode(value: () => Boolean): Self = StObject.set(x, "isInCompositionMode", js.Any.fromFunction0(value))
      
      inline def setIsSelectionAtEndOfContent(value: () => Boolean): Self = StObject.set(x, "isSelectionAtEndOfContent", js.Any.fromFunction0(value))
      
      inline def setIsSelectionAtStartOfContent(value: () => Boolean): Self = StObject.set(x, "isSelectionAtStartOfContent", js.Any.fromFunction0(value))
      
      inline def setMustForceSelection(value: () => Boolean): Self = StObject.set(x, "mustForceSelection", js.Any.fromFunction0(value))
      
      inline def setToJS(value: () => js.Object): Self = StObject.set(x, "toJS", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait SelectionState extends StObject {
    
    def getAnchorKey(): String = js.native
    
    def getAnchorOffset(): Double = js.native
    
    def getEndKey(): String = js.native
    
    def getEndOffset(): Double = js.native
    
    def getFocusKey(): String = js.native
    
    def getFocusOffset(): Double = js.native
    
    def getHasFocus(): Boolean = js.native
    
    def getIsBackward(): Boolean = js.native
    
    def getStartKey(): String = js.native
    
    def getStartOffset(): Double = js.native
    
    /**
      * Return whether the specified range overlaps with an edge of the
      * SelectionState.
      */
    def hasEdgeWithin(blockKey: String, start: Double, end: Double): Boolean = js.native
    
    def isCollapsed(): Boolean = js.native
    
    def merge(
      iterables: ((js.Iterable[anchorKey | anchorOffset | focusKey | focusOffset | isBackward | hasFocus]) | PartialSelectionStateProp)*
    ): SelectionState = js.native
    
    def serialize(): String = js.native
  }
  
  trait SelectionStateProperties extends StObject {
    
    var anchorKey: String
    
    var anchorOffset: Double
    
    var focusKey: String
    
    var focusOffset: Double
    
    var hasFocus: Boolean
    
    var isBackward: Boolean
  }
  object SelectionStateProperties {
    
    inline def apply(
      anchorKey: String,
      anchorOffset: Double,
      focusKey: String,
      focusOffset: Double,
      hasFocus: Boolean,
      isBackward: Boolean
    ): SelectionStateProperties = {
      val __obj = js.Dynamic.literal(anchorKey = anchorKey.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], focusKey = focusKey.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], hasFocus = hasFocus.asInstanceOf[js.Any], isBackward = isBackward.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionStateProperties]
    }
    
    extension [Self <: SelectionStateProperties](x: Self) {
      
      inline def setAnchorKey(value: String): Self = StObject.set(x, "anchorKey", value.asInstanceOf[js.Any])
      
      inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
      
      inline def setFocusKey(value: String): Self = StObject.set(x, "focusKey", value.asInstanceOf[js.Any])
      
      inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setIsBackward(value: Boolean): Self = StObject.set(x, "isBackward", value.asInstanceOf[js.Any])
    }
  }
}
