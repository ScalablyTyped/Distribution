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
import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.OrderedSet
import typings.immutable.Immutable.Stack
import typings.react.mod.ReactNode
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImmutableData {
  
  type BlockMap = OrderedMap[String, ContentBlock]
  
  @js.native
  trait BlockMapBuilder extends StObject
  
  @js.native
  trait CharacterMetadata extends StObject {
    
    def getEntity(): String = js.native
    
    def getStyle(): DraftInlineStyle = js.native
    
    def hasStyle(style: String): Boolean = js.native
  }
  object CharacterMetadata {
    
    @scala.inline
    def apply(getEntity: () => String, getStyle: () => DraftInlineStyle, hasStyle: String => Boolean): CharacterMetadata = {
      val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity), getStyle = js.Any.fromFunction0(getStyle), hasStyle = js.Any.fromFunction1(hasStyle))
      __obj.asInstanceOf[CharacterMetadata]
    }
    
    @scala.inline
    implicit class CharacterMetadataMutableBuilder[Self <: CharacterMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEntity(value: () => String): Self = StObject.set(x, "getEntity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStyle(value: () => DraftInlineStyle): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasStyle(value: String => Boolean): Self = StObject.set(x, "hasStyle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CharacterMetadataConfig extends StObject {
    
    var entity: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[DraftInlineStyle] = js.native
  }
  object CharacterMetadataConfig {
    
    @scala.inline
    def apply(): CharacterMetadataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CharacterMetadataConfig]
    }
    
    @scala.inline
    implicit class CharacterMetadataConfigMutableBuilder[Self <: CharacterMetadataConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setStyle(value: DraftInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait ContentBlock extends StObject {
    
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
    implicit class ContentBlockMutableBuilder[Self <: ContentBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindEntityRanges(
        value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "findEntityRanges", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindStyleRanges(
        value: (js.Function1[/* value */ CharacterMetadata, Boolean], js.Function2[/* start */ Double, /* end */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "findStyleRanges", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCharacterList(value: () => List[CharacterMetadata]): Self = StObject.set(x, "getCharacterList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetData(value: () => Map[_, _]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDepth(value: () => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEntityAt(value: Double => String): Self = StObject.set(x, "getEntityAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetInlineStyleAt(value: Double => DraftInlineStyle): Self = StObject.set(x, "getInlineStyleAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetKey(value: () => String): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => DraftBlockType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait ContentState extends StObject {
    
    def addEntity(instance: DraftEntityInstance): ContentState = js.native
    
    def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability): ContentState = js.native
    def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability, data: js.Object): ContentState = js.native
    
    def getBlockAfter(key: String): ContentBlock = js.native
    
    def getBlockBefore(key: String): ContentBlock = js.native
    
    def getBlockForKey(key: String): ContentBlock = js.native
    
    def getBlockMap(): BlockMap = js.native
    
    def getBlocksAsArray(): js.Array[ContentBlock] = js.native
    
    def getEntity(key: String): js.Any = js.native
    
    def getEntityMap(): js.Any = js.native
    
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
    
    def mergeEntityData(key: String, toMerge: StringDictionary[js.Any]): ContentState = js.native
    
    def replaceEntityData(key: String, toMerge: StringDictionary[js.Any]): ContentState = js.native
  }
  
  @js.native
  trait DraftBlockRenderConfig extends StObject {
    
    var element: String = js.native
    
    var wrapper: js.UndefOr[ReactNode] = js.native
  }
  object DraftBlockRenderConfig {
    
    @scala.inline
    def apply(element: String): DraftBlockRenderConfig = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraftBlockRenderConfig]
    }
    
    @scala.inline
    implicit class DraftBlockRenderConfigMutableBuilder[Self <: DraftBlockRenderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ReactNode): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
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
    
    @scala.inline
    def `adjust-depth`: typings.draftJs.draftJsStrings.`adjust-depth` = "adjust-depth".asInstanceOf[typings.draftJs.draftJsStrings.`adjust-depth`]
    
    @scala.inline
    def `apply-entity`: typings.draftJs.draftJsStrings.`apply-entity` = "apply-entity".asInstanceOf[typings.draftJs.draftJsStrings.`apply-entity`]
    
    @scala.inline
    def `backspace-character`: typings.draftJs.draftJsStrings.`backspace-character` = "backspace-character".asInstanceOf[typings.draftJs.draftJsStrings.`backspace-character`]
    
    @scala.inline
    def `change-block-data`: typings.draftJs.draftJsStrings.`change-block-data` = "change-block-data".asInstanceOf[typings.draftJs.draftJsStrings.`change-block-data`]
    
    @scala.inline
    def `change-block-type`: typings.draftJs.draftJsStrings.`change-block-type` = "change-block-type".asInstanceOf[typings.draftJs.draftJsStrings.`change-block-type`]
    
    @scala.inline
    def `change-inline-style`: typings.draftJs.draftJsStrings.`change-inline-style` = "change-inline-style".asInstanceOf[typings.draftJs.draftJsStrings.`change-inline-style`]
    
    @scala.inline
    def `delete-character`: typings.draftJs.draftJsStrings.`delete-character` = "delete-character".asInstanceOf[typings.draftJs.draftJsStrings.`delete-character`]
    
    @scala.inline
    def `insert-characters`: typings.draftJs.draftJsStrings.`insert-characters` = "insert-characters".asInstanceOf[typings.draftJs.draftJsStrings.`insert-characters`]
    
    @scala.inline
    def `insert-fragment`: typings.draftJs.draftJsStrings.`insert-fragment` = "insert-fragment".asInstanceOf[typings.draftJs.draftJsStrings.`insert-fragment`]
    
    @scala.inline
    def redo: typings.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typings.draftJs.draftJsStrings.redo]
    
    @scala.inline
    def `remove-range`: typings.draftJs.draftJsStrings.`remove-range` = "remove-range".asInstanceOf[typings.draftJs.draftJsStrings.`remove-range`]
    
    @scala.inline
    def `spellcheck-change`: typings.draftJs.draftJsStrings.`spellcheck-change` = "spellcheck-change".asInstanceOf[typings.draftJs.draftJsStrings.`spellcheck-change`]
    
    @scala.inline
    def `split-block`: typings.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typings.draftJs.draftJsStrings.`split-block`]
    
    @scala.inline
    def undo: typings.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typings.draftJs.draftJsStrings.undo]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
  trait EditorState extends StObject {
    
    def getAllowUndo(): Boolean = js.native
    
    def getBlockTree(blockKey: String): List[_] = js.native
    
    def getCurrentContent(): ContentState = js.native
    
    /**
      * Get the appropriate inline style for the editor state. If an
      * override is in place, use it. Otherwise, the current style is
      * based on the location of the selection state.
      */
    def getCurrentInlineStyle(): DraftInlineStyle = js.native
    
    def getDecorator(): DraftDecoratorType = js.native
    
    def getDirectionMap(): OrderedMap[_, _] = js.native
    
    /**
      * While editing, the user may apply inline style commands with a collapsed
      * cursor, intending to type text that adopts the specified style. In this
      * case, we track the specified style as an "override" that takes precedence
      * over the inline style of the text adjacent to the cursor.
      *
      * If null, there is no override in place.
      */
    def getInlineStyleOverride(): DraftInlineStyle = js.native
    
    def getLastChangeType(): EditorChangeType = js.native
    
    def getNativelyRenderedContent(): ContentState = js.native
    
    def getRedoStack(): Stack[ContentState] = js.native
    
    def getSelection(): SelectionState = js.native
    
    def getUndoStack(): Stack[ContentState] = js.native
    
    def isInCompositionMode(): Boolean = js.native
    
    def isSelectionAtEndOfContent(): Boolean = js.native
    
    def isSelectionAtStartOfContent(): Boolean = js.native
    
    def mustForceSelection(): Boolean = js.native
    
    def toJS(): js.Object = js.native
  }
  object EditorState {
    
    @scala.inline
    def apply(
      getAllowUndo: () => Boolean,
      getBlockTree: String => List[_],
      getCurrentContent: () => ContentState,
      getCurrentInlineStyle: () => DraftInlineStyle,
      getDecorator: () => DraftDecoratorType,
      getDirectionMap: () => OrderedMap[_, _],
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
    
    @scala.inline
    implicit class EditorStateMutableBuilder[Self <: EditorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllowUndo(value: () => Boolean): Self = StObject.set(x, "getAllowUndo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBlockTree(value: String => List[_]): Self = StObject.set(x, "getBlockTree", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentContent(value: () => ContentState): Self = StObject.set(x, "getCurrentContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentInlineStyle(value: () => DraftInlineStyle): Self = StObject.set(x, "getCurrentInlineStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDecorator(value: () => DraftDecoratorType): Self = StObject.set(x, "getDecorator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDirectionMap(value: () => OrderedMap[_, _]): Self = StObject.set(x, "getDirectionMap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInlineStyleOverride(value: () => DraftInlineStyle): Self = StObject.set(x, "getInlineStyleOverride", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastChangeType(value: () => EditorChangeType): Self = StObject.set(x, "getLastChangeType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNativelyRenderedContent(value: () => ContentState): Self = StObject.set(x, "getNativelyRenderedContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRedoStack(value: () => Stack[ContentState]): Self = StObject.set(x, "getRedoStack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelection(value: () => SelectionState): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUndoStack(value: () => Stack[ContentState]): Self = StObject.set(x, "getUndoStack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsInCompositionMode(value: () => Boolean): Self = StObject.set(x, "isInCompositionMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSelectionAtEndOfContent(value: () => Boolean): Self = StObject.set(x, "isSelectionAtEndOfContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSelectionAtStartOfContent(value: () => Boolean): Self = StObject.set(x, "isSelectionAtStartOfContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMustForceSelection(value: () => Boolean): Self = StObject.set(x, "mustForceSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJS(value: () => js.Object): Self = StObject.set(x, "toJS", js.Any.fromFunction0(value))
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
      iterables: ((Iterable[anchorKey | anchorOffset | focusKey | focusOffset | isBackward | hasFocus]) | PartialSelectionStateProp)*
    ): SelectionState = js.native
    
    def serialize(): String = js.native
  }
  
  @js.native
  trait SelectionStateProperties extends StObject {
    
    var anchorKey: String = js.native
    
    var anchorOffset: Double = js.native
    
    var focusKey: String = js.native
    
    var focusOffset: Double = js.native
    
    var hasFocus: Boolean = js.native
    
    var isBackward: Boolean = js.native
  }
  object SelectionStateProperties {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SelectionStatePropertiesMutableBuilder[Self <: SelectionStateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorKey(value: String): Self = StObject.set(x, "anchorKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusKey(value: String): Self = StObject.set(x, "focusKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBackward(value: Boolean): Self = StObject.set(x, "isBackward", value.asInstanceOf[js.Any])
    }
  }
}
