package typings.fundamentalReact

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/TreeView/TreeView", JSImport.Namespace)
@js.native
object treeViewMod extends js.Object {
  @js.native
  trait TreeView
    extends Component[TreeViewProps, js.Object, js.Any] {
    var displayName: typings.fundamentalReact.fundamentalReactStrings.TreeView = js.native
  }
  
  @js.native
  class default () extends TreeView
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Branch: (ComponentClass[js.Object, ComponentState]) with AnonDisplayNameTreeViewBranch = js.native
    var Col: (ComponentClass[TreeColProps, ComponentState]) with AnonDisplayNameTreeViewCol = js.native
    var Head: (ComponentClass[TreeHeadProps, ComponentState]) with AnonDisplayNameTreeViewHead = js.native
    var Item: (ComponentClass[TreeItemProps, ComponentState]) with AnonDisplayNameTreeViewItem = js.native
    var Row: (ComponentClass[TreeRowProps, ComponentState]) with AnonDisplayNameTreeViewRow = js.native
    var Tree: (ComponentClass[js.Object, ComponentState]) with AnonDisplayNameTreeViewTree = js.native
  }
  
  type TreeColProps = AnonClassNameString with HTMLAttributes[HTMLDivElement]
  type TreeHeadProps = AnonButtonPropsClassNameX with HTMLAttributes[HTMLDivElement]
  type TreeItemProps = AnonIsExpanded with HTMLAttributes[HTMLLIElement]
  type TreeRowProps = js.Object with HTMLAttributes[HTMLDivElement]
  type TreeViewProps = AnonCustomStylesDisableStylesExpandData with HTMLAttributes[HTMLDivElement]
}

