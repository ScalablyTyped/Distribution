package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Splitter extends Widget_ {
  
  /** To add a new pane to splitter control.
    * @param {string} content of pane.
    * @param {any} pane properties.
    * @param {number} index of pane.
    * @returns {HTMLElement}
    */
  def addItem(content: String, property: js.Any, index: Double): HTMLElement = js.native
  
  /** To collapse the splitter control pane.
    * @param {number} index number of pane.
    * @returns {void}
    */
  def collapse(paneIndex: Double): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To expand the splitter control pane.
    * @param {number} index number of pane.
    * @returns {void}
    */
  def expand(paneIndex: Double): Unit = js.native
  
  @JSName("model")
  var model_Splitter: Model = js.native
  
  /** To refresh the splitter control pane resizing.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** To remove a specified pane from the splitter control.
    * @param {number} index of pane.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
}
object Splitter {
  
  @js.native
  trait BeforeExpandCollapseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns collapsed pane details.
      */
    var collapsed: js.UndefOr[js.Any] = js.native
    
    /** returns expanded pane details.
      */
    var expanded: js.UndefOr[js.Any] = js.native
    
    /** returns the splitter model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the current split bar index.
      */
    var splitbarIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeExpandCollapseEventArgs {
    
    @scala.inline
    def apply(): BeforeExpandCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeExpandCollapseEventArgs]
    }
    
    @scala.inline
    implicit class BeforeExpandCollapseEventArgsMutableBuilder[Self <: BeforeExpandCollapseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCollapsed(value: js.Any): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setExpanded(value: js.Any): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSplitbarIndex(value: Double): Self = StObject.set(x, "splitbarIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitbarIndexUndefined: Self = StObject.set(x, "splitbarIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ClickOnExpanderEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the splitter model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element from which click action is triggered.
      */
    var targetElement: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ClickOnExpanderEventArgs {
    
    @scala.inline
    def apply(): ClickOnExpanderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickOnExpanderEventArgs]
    }
    
    @scala.inline
    implicit class ClickOnExpanderEventArgsMutableBuilder[Self <: ClickOnExpanderEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTargetElement(value: js.Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the splitter model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the splitter model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExpandCollapseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns collapsed pane details.
      */
    var collapsed: js.UndefOr[js.Any] = js.native
    
    /** returns expanded pane details.
      */
    var expanded: js.UndefOr[js.Any] = js.native
    
    /** returns the splitter model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the current split bar index.
      */
    var splitbarIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ExpandCollapseEventArgs {
    
    @scala.inline
    def apply(): ExpandCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandCollapseEventArgs]
    }
    
    @scala.inline
    implicit class ExpandCollapseEventArgsMutableBuilder[Self <: ExpandCollapseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCollapsed(value: js.Any): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setExpanded(value: js.Any): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSplitbarIndex(value: Double): Self = StObject.set(x, "splitbarIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitbarIndexUndefined: Self = StObject.set(x, "splitbarIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Turns on keyboard interaction with the Splitter panes. You must set this property to true to access the keyboard shortcuts of ejSplitter.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Specify animation speed for the Splitter pane movement, while collapsing and expanding.
      * @Default {300}
      */
    var animationSpeed: js.UndefOr[Double] = js.native
    
    /** Fires before expanding / collapsing the split pane of splitter control.
      */
    var beforeExpandCollapse: js.UndefOr[js.Function1[/* e */ BeforeExpandCollapseEventArgs, Unit]] = js.native
    
    /** Triggered when we click on the template icon. (Note: This will work only when expanderTemplate is defined.)
      */
    var clickOnExpander: js.UndefOr[js.Function1[/* e */ ClickOnExpanderEventArgs, Unit]] = js.native
    
    /** Fires when splitter control pane has been created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Specify the CSS class to splitter control to achieve custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires when splitter control pane has been destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Specifies the animation behavior of the splitter.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Specifies the splitter control to be displayed in right to left direction.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Fires when expand / collapse operation in splitter control pane has been performed successfully.
      */
    var expandCollapse: js.UndefOr[js.Function1[/* e */ ExpandCollapseEventArgs, Unit]] = js.native
    
    /** Specifies HTML element string to replace the existing expand/collapse icons.
      * @Default {null}
      */
    var expanderTemplate: js.UndefOr[String] = js.native
    
    /** Specify height for splitter control.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Specifies the HTML Attributes of the Splitter.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Specify window resizing behavior for splitter control.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Specify the orientation for splitter control. See orientation
      * @Default {ej.orientation.Horizontal or â€œhorizontalâ€}
      */
    var orientation: js.UndefOr[Orientation | String] = js.native
    
    /** Specify properties for each pane like paneSize, minSize, maxSize, collapsible, expandable, resizable.
      * @Default {[]}
      */
    var properties: js.UndefOr[js.Array[_]] = js.native
    
    /** Fires when resize in splitter control pane.
      */
    var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
    
    /** Specify width for splitter control.
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Splitter.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Splitter.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Splitter.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setBeforeExpandCollapse(value: /* e */ BeforeExpandCollapseEventArgs => Unit): Self = StObject.set(x, "beforeExpandCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeExpandCollapseUndefined: Self = StObject.set(x, "beforeExpandCollapse", js.undefined)
      
      @scala.inline
      def setClickOnExpander(value: /* e */ ClickOnExpanderEventArgs => Unit): Self = StObject.set(x, "clickOnExpander", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnExpanderUndefined: Self = StObject.set(x, "clickOnExpander", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setExpandCollapse(value: /* e */ ExpandCollapseEventArgs => Unit): Self = StObject.set(x, "expandCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandCollapseUndefined: Self = StObject.set(x, "expandCollapse", js.undefined)
      
      @scala.inline
      def setExpanderTemplate(value: String): Self = StObject.set(x, "expanderTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderTemplateUndefined: Self = StObject.set(x, "expanderTemplate", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: js.Any*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setResize(value: /* e */ ResizeEventArgs => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ResizeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the splitter model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns next pane details.
      */
    var nextPane: js.UndefOr[js.Any] = js.native
    
    /** returns previous pane details.
      */
    var prevPane: js.UndefOr[js.Any] = js.native
    
    /** returns the current split bar index.
      */
    var splitbarIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeEventArgs {
    
    @scala.inline
    def apply(): ResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventArgs]
    }
    
    @scala.inline
    implicit class ResizeEventArgsMutableBuilder[Self <: ResizeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNextPane(value: js.Any): Self = StObject.set(x, "nextPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPaneUndefined: Self = StObject.set(x, "nextPane", js.undefined)
      
      @scala.inline
      def setPrevPane(value: js.Any): Self = StObject.set(x, "prevPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPaneUndefined: Self = StObject.set(x, "prevPane", js.undefined)
      
      @scala.inline
      def setSplitbarIndex(value: Double): Self = StObject.set(x, "splitbarIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitbarIndexUndefined: Self = StObject.set(x, "splitbarIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
