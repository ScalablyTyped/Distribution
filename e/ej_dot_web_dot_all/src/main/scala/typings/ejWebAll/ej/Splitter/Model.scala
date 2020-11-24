package typings.ejWebAll.ej.Splitter

import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
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
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setBeforeExpandCollapse(value: /* e */ BeforeExpandCollapseEventArgs => Unit): Self = this.set("beforeExpandCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeExpandCollapse: Self = this.set("beforeExpandCollapse", js.undefined)
    
    @scala.inline
    def setClickOnExpander(value: /* e */ ClickOnExpanderEventArgs => Unit): Self = this.set("clickOnExpander", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClickOnExpander: Self = this.set("clickOnExpander", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setExpandCollapse(value: /* e */ ExpandCollapseEventArgs => Unit): Self = this.set("expandCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandCollapse: Self = this.set("expandCollapse", js.undefined)
    
    @scala.inline
    def setExpanderTemplate(value: String): Self = this.set("expanderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanderTemplate: Self = this.set("expanderTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: js.Any*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ ResizeEventArgs => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
