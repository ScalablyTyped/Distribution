package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.error
import typings.fundamentalReact.fundamentalReactStrings.left
import typings.fundamentalReact.fundamentalReactStrings.multi
import typings.fundamentalReact.fundamentalReactStrings.right
import typings.fundamentalReact.fundamentalReactStrings.single
import typings.fundamentalReact.fundamentalReactStrings.success
import typings.fundamentalReact.fundamentalReactStrings.warning
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeTreeMod {
  
  @JSImport("fundamental-react/lib/Tree/Tree", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TreeProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/Tree/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/Tree/Tree", "default.Node")
    @js.native
    open class Node protected () extends Component[TreeNodeProps, ComponentState, Any] {
      def this(props: TreeNodeProps) = this()
      def this(props: TreeNodeProps, context: Any) = this()
    }
    /* static member */
    @JSImport("fundamental-react/lib/Tree/Tree", "default.Node")
    @js.native
    def Node: ComponentClass[TreeNodeProps, ComponentState] = js.native
    inline def Node_=(x: ComponentClass[TreeNodeProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
  }
  
  type Tree = Component[TreeProps, js.Object, Any]
  
  trait TreeNodeProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    /** React nodes to render as TreeNodes actions. Expecting Buttons here. */
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    /** Set to true to make this particular TreeNode have styles for interaction states (hover, selected, active). */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An Array of string values to representing icon names to display before node contents. */
    var glyphsAfter: js.UndefOr[js.Array[String]] = js.undefined
    
    /** An Array of string values to representing icon names to display before after contents. */
    var glyphsBefore: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set to one of the valid values to highlight the row with the corresponding semantic color. */
    var highlight: js.UndefOr[
        typings.fundamentalReact.fundamentalReactStrings.default | error | success | warning
      ] = js.undefined
    
    /** Set to true to show styles representing that the node has been navigate to. */
    var isNavigated: js.UndefOr[Boolean] = js.undefined
    
    /** Set to a String value to use as href and make this node an <a> tag with appropriate styles. */
    var link: js.UndefOr[String] = js.undefined
    
    /** Object to be received in the onExpandToggle and onSelectionChange callbacks of this node. */
    var nodeData: js.UndefOr[js.Object] = js.undefined
    
    /** Callback function; triggered when a node's expansion button is clicked. */
    var onExpandToggle: js.UndefOr[
        js.Function3[
          /* event */ SyntheticEvent[Element, Event], 
          /* expansion */ Boolean, 
          /* nodeData */ js.Object, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback function; triggered when a node is selected (if selection is enabled)
      * <br>
      * multi: selection state changes
      * <br>
      * single: is selected
      */
    var onSelectionChange: js.UndefOr[
        js.Function3[
          /* event */ SyntheticEvent[Element, Event], 
          /* checked */ Boolean, 
          /* nodeData */ js.Object, 
          Unit
        ]
      ] = js.undefined
    
    /** Additional props to be spread to the selection control, if any. */
    var selectionProps: js.UndefOr[js.Object] = js.undefined
    
    /** Set to true to make node contents wrap to next line(s). */
    var wrapContent: js.UndefOr[Boolean] = js.undefined
  }
  object TreeNodeProps {
    
    inline def apply(): TreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNodeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNodeProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setGlyphsAfter(value: js.Array[String]): Self = StObject.set(x, "glyphsAfter", value.asInstanceOf[js.Any])
      
      inline def setGlyphsAfterUndefined: Self = StObject.set(x, "glyphsAfter", js.undefined)
      
      inline def setGlyphsAfterVarargs(value: String*): Self = StObject.set(x, "glyphsAfter", js.Array(value*))
      
      inline def setGlyphsBefore(value: js.Array[String]): Self = StObject.set(x, "glyphsBefore", value.asInstanceOf[js.Any])
      
      inline def setGlyphsBeforeUndefined: Self = StObject.set(x, "glyphsBefore", js.undefined)
      
      inline def setGlyphsBeforeVarargs(value: String*): Self = StObject.set(x, "glyphsBefore", js.Array(value*))
      
      inline def setHighlight(value: typings.fundamentalReact.fundamentalReactStrings.default | error | success | warning): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setIsNavigated(value: Boolean): Self = StObject.set(x, "isNavigated", value.asInstanceOf[js.Any])
      
      inline def setIsNavigatedUndefined: Self = StObject.set(x, "isNavigated", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setNodeData(value: js.Object): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
      
      inline def setNodeDataUndefined: Self = StObject.set(x, "nodeData", js.undefined)
      
      inline def setOnExpandToggle(
        value: (/* event */ SyntheticEvent[Element, Event], /* expansion */ Boolean, /* nodeData */ js.Object) => Unit
      ): Self = StObject.set(x, "onExpandToggle", js.Any.fromFunction3(value))
      
      inline def setOnExpandToggleUndefined: Self = StObject.set(x, "onExpandToggle", js.undefined)
      
      inline def setOnSelectionChange(
        value: (/* event */ SyntheticEvent[Element, Event], /* checked */ Boolean, /* nodeData */ js.Object) => Unit
      ): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction3(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setSelectionProps(value: js.Object): Self = StObject.set(x, "selectionProps", value.asInstanceOf[js.Any])
      
      inline def setSelectionPropsUndefined: Self = StObject.set(x, "selectionProps", js.undefined)
      
      inline def setWrapContent(value: Boolean): Self = StObject.set(x, "wrapContent", value.asInstanceOf[js.Any])
      
      inline def setWrapContentUndefined: Self = StObject.set(x, "wrapContent", js.undefined)
    }
  }
  
  trait TreeProps extends StObject {
    
    /** Set to true to make all TreeNodes have styles for interaction states (hover, selected, active). */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** React nodes to render within. Nest TreeNodes to create multiple levels in the Tree. */
    var children: ReactNode
    
    /** Set to true to apply compact styles. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Set to a String value to display when Tree is empty, i.e. has no children. */
    var emptyText: js.UndefOr[String] = js.undefined
    
    /** Set to a String value to use as id for root node which is an <ul>. If unset, a generate value will be used. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Set to true to remove borders from all level 1 nodes. */
    var noBorders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to multi to enable selecting multiple selection of TreeNodes with Checkboxes.
      * <br>
      * Set to single to enable selecting only one of the TreeNodes at a time, with radio buttons.
      */
    var selection: js.UndefOr[multi | single] = js.undefined
    
    /**
      * Set to left to show selection control before node contents.
      * <br>
      * Set to right to show selection control after node contents.
      * default is "left"
      */
    var selectionPosition: js.UndefOr[left | right] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNoBorders(value: Boolean): Self = StObject.set(x, "noBorders", value.asInstanceOf[js.Any])
      
      inline def setNoBordersUndefined: Self = StObject.set(x, "noBorders", js.undefined)
      
      inline def setSelection(value: multi | single): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionPosition(value: left | right): Self = StObject.set(x, "selectionPosition", value.asInstanceOf[js.Any])
      
      inline def setSelectionPositionUndefined: Self = StObject.set(x, "selectionPosition", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    }
  }
}
