package typings.draftJs.mod.Draft.Model.ImmutableData

import typings.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typings.immutable.Immutable.List
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ @js.native
trait EditorState extends js.Object {
  
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
  implicit class EditorStateOps[Self <: EditorState] (val x: Self) extends AnyVal {
    
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
    def setGetAllowUndo(value: () => Boolean): Self = this.set("getAllowUndo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBlockTree(value: String => List[_]): Self = this.set("getBlockTree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentContent(value: () => ContentState): Self = this.set("getCurrentContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentInlineStyle(value: () => DraftInlineStyle): Self = this.set("getCurrentInlineStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDecorator(value: () => DraftDecoratorType): Self = this.set("getDecorator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionMap(value: () => OrderedMap[_, _]): Self = this.set("getDirectionMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInlineStyleOverride(value: () => DraftInlineStyle): Self = this.set("getInlineStyleOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastChangeType(value: () => EditorChangeType): Self = this.set("getLastChangeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNativelyRenderedContent(value: () => ContentState): Self = this.set("getNativelyRenderedContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRedoStack(value: () => Stack[ContentState]): Self = this.set("getRedoStack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelection(value: () => SelectionState): Self = this.set("getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUndoStack(value: () => Stack[ContentState]): Self = this.set("getUndoStack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInCompositionMode(value: () => Boolean): Self = this.set("isInCompositionMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSelectionAtEndOfContent(value: () => Boolean): Self = this.set("isSelectionAtEndOfContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSelectionAtStartOfContent(value: () => Boolean): Self = this.set("isSelectionAtStartOfContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMustForceSelection(value: () => Boolean): Self = this.set("mustForceSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJS(value: () => js.Object): Self = this.set("toJS", js.Any.fromFunction0(value))
  }
}
