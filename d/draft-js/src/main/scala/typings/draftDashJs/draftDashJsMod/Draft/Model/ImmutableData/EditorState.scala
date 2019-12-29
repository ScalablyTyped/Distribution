package typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData

import typings.draftDashJs.draftDashJsMod.Draft.Model.Decorators.DraftDecoratorType
import typings.immutable.Immutable.List
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T * / any} */ trait EditorState extends js.Object {
  def getAllowUndo(): Boolean
  def getBlockTree(blockKey: String): List[_]
  def getCurrentContent(): ContentState
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  def getCurrentInlineStyle(): DraftInlineStyle
  def getDecorator(): DraftDecoratorType
  def getDirectionMap(): OrderedMap[_, _]
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
}

