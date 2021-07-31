package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.PartialTreeColProps
import typings.fundamentalReact.anon.PartialTreeHeadProps
import typings.fundamentalReact.anon.PartialTreeItemProps
import typings.fundamentalReact.anon.PartialTreeRowProps
import typings.fundamentalReact.anon.WeakValidationMapTreeColP
import typings.fundamentalReact.anon.WeakValidationMapTreeHead
import typings.fundamentalReact.anon.WeakValidationMapTreeItem
import typings.fundamentalReact.anon.WeakValidationMapTreeRowP
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotBranch
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotCol
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotHead
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotItem
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotRow
import typings.fundamentalReact.fundamentalReactStrings.TreeViewDotTree
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ValidationMap
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewMod {
  
  @JSImport("fundamental-react/lib/TreeView/TreeView", JSImport.Default)
  @js.native
  class default () extends TreeView
  object default {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch")
    @js.native
    class Branch protected ()
      extends Component[js.Object, ComponentState, js.Any] {
      def this(props: js.Object) = this()
      def this(props: js.Object, context: js.Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName :'TreeView.Branch'} */
    object Branch {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[js.Object] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotBranch] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[String | TreeViewDotBranch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[js.Object, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[js.Object, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.propTypes")
      @js.native
      def propTypes: js.UndefOr[js.Object] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col")
    @js.native
    class Col protected ()
      extends Component[TreeColProps, ComponentState, js.Any] {
      def this(props: TreeColProps) = this()
      def this(props: TreeColProps, context: js.Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeColProps, react.react.ComponentState> & {  displayName :'TreeView.Col'} */
    object Col {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeColProps] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[PartialTreeColProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotCol] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[String | TreeViewDotCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeColProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeColProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeColProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeColProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeColP] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[WeakValidationMapTreeColP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head")
    @js.native
    class Head protected ()
      extends Component[TreeHeadProps, ComponentState, js.Any] {
      def this(props: TreeHeadProps) = this()
      def this(props: TreeHeadProps, context: js.Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeHeadProps, react.react.ComponentState> & {  displayName :'TreeView.Head'} */
    object Head {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeHeadProps] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[PartialTreeHeadProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotHead] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[String | TreeViewDotHead]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeHead] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[WeakValidationMapTreeHead]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item")
    @js.native
    class Item protected ()
      extends Component[TreeItemProps, ComponentState, js.Any] {
      def this(props: TreeItemProps) = this()
      def this(props: TreeItemProps, context: js.Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeItemProps, react.react.ComponentState> & {  displayName :'TreeView.Item'} */
    object Item {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeItemProps] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[PartialTreeItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotItem] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[String | TreeViewDotItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeItemProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeItemProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeItem] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[WeakValidationMapTreeItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row")
    @js.native
    class Row protected ()
      extends Component[TreeRowProps, ComponentState, js.Any] {
      def this(props: TreeRowProps) = this()
      def this(props: TreeRowProps, context: js.Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeRowProps, react.react.ComponentState> & {  displayName :'TreeView.Row'} */
    object Row {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeRowProps] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[PartialTreeRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotRow] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[String | TreeViewDotRow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeRowProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeRowProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeRowP] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[WeakValidationMapTreeRowP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree")
    @js.native
    class Tree protected ()
      extends Component[js.Object, ComponentState, js.Any] {
      def this(props: js.Object) = this()
      def this(props: js.Object, context: js.Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName :'TreeView.Tree'} */
    object Tree {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[js.Object] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotTree] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[String | TreeViewDotTree]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[js.Object, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, ComponentState]] = js.native
      @scala.inline
      def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[js.Object, ComponentState]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.propTypes")
      @js.native
      def propTypes: js.UndefOr[js.Object] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
  }
  
  trait TreeColProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
  object TreeColProps {
    
    @scala.inline
    def apply(): TreeColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeColProps]
    }
  }
  
  trait TreeHeadProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onExpandAll: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object TreeHeadProps {
    
    @scala.inline
    def apply(): TreeHeadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeHeadProps]
    }
    
    @scala.inline
    implicit class TreeHeadPropsMutableBuilder[Self <: TreeHeadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setOnExpandAll(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onExpandAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandAllUndefined: Self = StObject.set(x, "onExpandAll", js.undefined)
    }
  }
  
  trait TreeItemProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var rowId: js.UndefOr[String] = js.undefined
  }
  object TreeItemProps {
    
    @scala.inline
    def apply(): TreeItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeItemProps]
    }
    
    @scala.inline
    implicit class TreeItemPropsMutableBuilder[Self <: TreeItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    }
  }
  
  trait TreeRowProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var isParent: js.UndefOr[Boolean] = js.undefined
    
    var onExpandClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var rowId: js.UndefOr[String] = js.undefined
  }
  object TreeRowProps {
    
    @scala.inline
    def apply(): TreeRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeRowProps]
    }
    
    @scala.inline
    implicit class TreeRowPropsMutableBuilder[Self <: TreeRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsParentUndefined: Self = StObject.set(x, "isParent", js.undefined)
      
      @scala.inline
      def setOnExpandClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onExpandClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandClickUndefined: Self = StObject.set(x, "onExpandClick", js.undefined)
      
      @scala.inline
      def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    }
  }
  
  @js.native
  trait TreeView
    extends Component[TreeViewProps, js.Object, js.Any] {
    
    var displayName: typings.fundamentalReact.fundamentalReactStrings.TreeView = js.native
  }
  
  trait TreeViewProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var expandData: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var isExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var onExpandChange: js.UndefOr[js.Function1[/* expandData */ StringDictionary[Boolean], Unit]] = js.undefined
  }
  object TreeViewProps {
    
    @scala.inline
    def apply(): TreeViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeViewProps]
    }
    
    @scala.inline
    implicit class TreeViewPropsMutableBuilder[Self <: TreeViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setExpandData(value: StringDictionary[Boolean]): Self = StObject.set(x, "expandData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandDataUndefined: Self = StObject.set(x, "expandData", js.undefined)
      
      @scala.inline
      def setIsExpandAll(value: Boolean): Self = StObject.set(x, "isExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandAllUndefined: Self = StObject.set(x, "isExpandAll", js.undefined)
      
      @scala.inline
      def setOnExpandChange(value: /* expandData */ StringDictionary[Boolean] => Unit): Self = StObject.set(x, "onExpandChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandChangeUndefined: Self = StObject.set(x, "onExpandChange", js.undefined)
    }
  }
}
