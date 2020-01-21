package typings.fundamentalReact.mod

import typings.fundamentalReact.AnonDisplayNameTreeViewBranch
import typings.fundamentalReact.AnonDisplayNameTreeViewCol
import typings.fundamentalReact.AnonDisplayNameTreeViewHead
import typings.fundamentalReact.AnonDisplayNameTreeViewItem
import typings.fundamentalReact.AnonDisplayNameTreeViewRow
import typings.fundamentalReact.AnonDisplayNameTreeViewTree
import typings.fundamentalReact.treeViewMod.TreeColProps
import typings.fundamentalReact.treeViewMod.TreeHeadProps
import typings.fundamentalReact.treeViewMod.TreeItemProps
import typings.fundamentalReact.treeViewMod.TreeRowProps
import typings.fundamentalReact.treeViewMod.default
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "TreeView")
@js.native
class TreeView () extends default

/* static members */
@JSImport("fundamental-react", "TreeView")
@js.native
object TreeView extends js.Object {
  var Branch: (ComponentClass[js.Object, ComponentState]) with AnonDisplayNameTreeViewBranch = js.native
  var Col: (ComponentClass[TreeColProps, ComponentState]) with AnonDisplayNameTreeViewCol = js.native
  var Head: (ComponentClass[TreeHeadProps, ComponentState]) with AnonDisplayNameTreeViewHead = js.native
  var Item: (ComponentClass[TreeItemProps, ComponentState]) with AnonDisplayNameTreeViewItem = js.native
  var Row: (ComponentClass[TreeRowProps, ComponentState]) with AnonDisplayNameTreeViewRow = js.native
  var Tree: (ComponentClass[js.Object, ComponentState]) with AnonDisplayNameTreeViewTree = js.native
}

