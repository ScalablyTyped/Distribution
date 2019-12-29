package typings.fundamentalDashReact

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/TreeView/TreeView", JSImport.Namespace)
@js.native
object libTreeViewTreeViewMod extends js.Object {
  @js.native
  trait TreeView
    extends Component[TreeViewProps, js.Object, js.Any] {
    var displayName: typings.fundamentalDashReact.fundamentalDashReactStrings.TreeView = js.native
  }
  
  @js.native
  class default () extends TreeView
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Branch: (ComponentClass[js.Object, ComponentState]) with Anon_DisplayNameTreeViewBranch = js.native
    var Col: (ComponentClass[TreeColProps, ComponentState]) with Anon_DisplayNameTreeViewCol = js.native
    var Head: (ComponentClass[TreeHeadProps, ComponentState]) with Anon_DisplayNameTreeViewHead = js.native
    var Item: (ComponentClass[TreeItemProps, ComponentState]) with Anon_DisplayNameTreeViewItem = js.native
    var Row: (ComponentClass[TreeRowProps, ComponentState]) with Anon_DisplayNameTreeViewRow = js.native
    var Tree: (ComponentClass[js.Object, ComponentState]) with Anon_DisplayNameTreeViewTree = js.native
  }
  
  type TreeColProps = Anon_ClassNameString with HTMLAttributes[HTMLDivElement]
  type TreeHeadProps = Anon_ButtonPropsClassNameX with HTMLAttributes[HTMLDivElement]
  type TreeItemProps = Anon_IsExpanded with HTMLAttributes[HTMLLIElement]
  type TreeRowProps = js.Object with HTMLAttributes[HTMLDivElement]
  type TreeViewProps = Anon_CustomStylesDisableStylesExpandData with HTMLAttributes[HTMLDivElement]
}

