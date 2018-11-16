package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IFloating because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IComponent extends IAbstractComponent {
  /** [Method] Called by the layout system after the Component has been laid out  */
  @JSName("afterComponentLayout")
  var afterComponentLayout_IComponent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Invoked after the Component has been hidden
  		* @param callback Function
  		* @param scope Object
  		*/
  var afterHide: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Template method called after a Component has been positioned
  		* @param ax Object
  		* @param ay Object
  		*/
  @JSName("afterSetPosition")
  var afterSetPosition_IComponent: js.UndefOr[
    js.Function2[/* ax */ js.UndefOr[js.Any], /* ay */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Invoked after the Component is shown after onShow is called
  		* @param animateTarget String/Ext.Element
  		* @param callback Function
  		* @param scope Object
  		*/
  var afterShow: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Invoked before the Component is shown  */
  var beforeShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Bubbles up the component container heirarchy calling the specified function with each component
  		* @param fn Function The function to call
  		* @param scope Object The scope of the function. Defaults to current node.
  		* @param args Array The args to call the function with. Defaults to passing the current component.
  		* @returns Ext.Component this
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Cancel any deferred focus on this component */
  var cancelFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Clone the current component using the original config values passed into this instance by default
  		* @param overrides Object A new config containing any properties to override in the cloned version. An id property can be passed on this object, otherwise one will be generated to avoid duplicates.
  		* @returns Ext.Component clone The cloned copy of this component
  		*/
  var cloneConfig: js.UndefOr[js.Function1[/* overrides */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Number/String) */
  var columnWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/String) */
  var constraintInsets: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Moves this floating Component into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
  		*/
  var doConstrain: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Find a container above this component at any level by a custom function
  		* @param fn Function The custom function to call with the arguments (container, this component).
  		* @returns Ext.container.Container The first Container for which the custom function returns true
  		*/
  var findParentBy: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], extjsLib.ExtNs.containerNs.IContainer]] = js.undefined
  /** [Method] Find a container above this component at any level by xtype or class See also the up method
  		* @param xtype String/Ext.Class The xtype string for a component, or the class of the component directly
  		* @returns Ext.container.Container The first Container which matches the given xtype or class
  		*/
  var findParentByType: js.UndefOr[
    js.Function1[/* xtype */ js.UndefOr[js.Any], extjsLib.ExtNs.containerNs.IContainer]
  ] = js.undefined
  /** [Property] (Ext.Container) */
  var floatParent: js.UndefOr[IContainer] = js.undefined
  /** [Method] Try to focus this component
  		* @param selectText Boolean If applicable, true to also select the text in this component
  		* @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds).
  		* @param callback Function Only needed if the delay parameter is used. A function to call upon focus.
  		* @param scope Function Only needed if the delay parameter is used. The scope (this reference) in which to execute the callback.
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  var focus: js.UndefOr[
    js.Function4[
      /* selectText */ js.UndefOr[scala.Boolean], 
      /* delay */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var formBind: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Gets the current XY position of the component s underlying element
  		* @param local Boolean If true the element's left and top are returned instead of page XY.
  		* @returns Number[] The XY position of the element (e.g., [100, 200])
  		*/
  var getPosition: js.UndefOr[js.Function1[/* local */ js.UndefOr[scala.Boolean], Array]] = js.undefined
  /** [Method] Gets the xtype for this component as registered with Ext ComponentManager
  		* @returns String The xtype
  		*/
  var getXType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @param animateTarget String/Ext.Element/Ext.Component only valid for floating Components such as Windows or ToolTips, or regular Components which have been configured with floating: true.. The target to which the Component should animate while hiding.
  		* @param callback Function A callback function to call after the Component is hidden.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to this Component.
  		* @returns Ext.Component this
  		*/
  var hide: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] The initComponent template method is an important initialization step for a Component  */
  var initComponent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event  */
  @JSName("onAdded")
  var onAdded_IComponent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the destroy operation  */
  var onDestroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Possibly animates down to a target element
  		* @param animateTarget String/Ext.Element/Ext.Component
  		* @param callback Function
  		* @param scope Object
  		*/
  var onHide: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Allows addition of behavior to the show operation
  		* @param animateTarget String/Ext.Element
  		* @param callback Function
  		* @param scope Object
  		*/
  var onShow: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Invoked after the afterShow method is complete
  		* @param callback Function
  		* @param scope Object
  		*/
  var onShowComplete: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var overflowX: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var overflowY: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] ("north"/"south"/"east"/"west"/"center") */
  var region: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var resizable: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var resizeHandles: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Scrolls this Component s target element by the passed delta values optionally animating
  		* @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
  		* @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
  		* @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* deltaX */ js.UndefOr[js.Any], 
      /* deltaY */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var scrollFlags: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  var setActive: js.UndefOr[
    js.Function2[
      /* active */ js.UndefOr[scala.Boolean], 
      /* newActive */ js.UndefOr[this.type], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the overflow on the content element of the component
  		* @param scroll Boolean True to allow the Component to auto scroll.
  		* @returns Ext.Component this
  		*/
  var setAutoScroll: js.UndefOr[js.Function1[/* scroll */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] This method changes the region config property for this border region
  		* @param region String The new region value ("north", "south", "east" or "west").
  		* @returns String The previous value of the region property.
  		*/
  var setBorderRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Method] This method allows you to show or hide a LoadMask on top of this component
  		* @param load Boolean/Object/String True to show the default LoadMask, a config object that will be passed to the LoadMask constructor, or a message String to show. False to hide the current LoadMask.
  		* @param targetEl Boolean True to mask the targetEl of this Component instead of the this.el. For example, setting this to true on a Panel will cause only the body to be masked.
  		* @returns Ext.LoadMask The LoadMask instance that has just been shown.
  		*/
  var setLoading: js.UndefOr[
    js.Function2[/* load */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[scala.Boolean], ILoadMask]
  ] = js.undefined
  /** [Method] Sets the overflow x y on the content element of the component
  		* @param overflowX String The overflow-x value.
  		* @param overflowY String The overflow-y value.
  		* @returns Ext.Component this
  		*/
  var setOverflowXY: js.UndefOr[
    js.Function2[
      /* overflowX */ js.UndefOr[java.lang.String], 
      /* overflowY */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the page XY position of the component
  		* @param x Number/Number[] The new x position or an array of [x,y].
  		* @param y Number The new y position.
  		* @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
  		* @returns Ext.Component this
  		*/
  var setPagePosition: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the left and top of the component
  		* @param x Number/Number[]/Object The new left, an array of [x,y], or animation config object containing x and y properties.
  		* @param y Number The new top.
  		* @param animate Boolean/Object If true, the Component is animated into its new position. You may also pass an animation configuration.
  		* @returns Ext.Component this
  		*/
  var setPosition: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the weight config property for this component
  		* @param weight Number The new weight value.
  		* @returns Number The previous value of the weight property.
  		*/
  var setRegionWeight: js.UndefOr[js.Function1[/* weight */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @param animateTarget String/Ext.Element only valid for floating Components such as Windows or ToolTips, or regular Components which have been configured with floating: true. The target from which the Component should animate from while opening.
  		* @param callback Function A callback function to call after the Component is displayed. Only necessary if animation was specified.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to this Component.
  		* @returns Ext.Component this
  		*/
  var show: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays component at specific xy position
  		* @param x Number/Number[] The new x position or array of [x,y].
  		* @param y Number The new y position
  		* @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
  		* @returns Ext.Component this
  		*/
  var showAt: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Shows this component by the specified Component or Element
  		* @param component Ext.Component/Ext.dom.Element The Ext.Component or Ext.Element to show the component by.
  		* @param position String Alignment position as used by Ext.util.Positionable.getAlignToXY. Defaults to defaultAlign.
  		* @param offsets Number[] Alignment offsets as used by Ext.util.Positionable.getAlignToXY.
  		* @returns Ext.Component this
  		*/
  var showBy: js.UndefOr[
    js.Function3[
      /* component */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[Array], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
  		* @returns Ext.Component this
  		*/
  var toBack: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
  		* @param preventFocus Boolean Specify true to prevent the Component from being focused.
  		* @returns Ext.Component this
  		*/
  var toFront: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var toFrontOnShow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the current box measurements of the component s underlying element
  		* @param box Object An object in the format {x, y, width, height}
  		* @returns Ext.Component this
  		*/
  var updateBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Ext.ZIndexManager) */
  var zIndexManager: js.UndefOr[IZIndexManager] = js.undefined
  /** [Property] (Ext.Container) */
  var zIndexParent: js.UndefOr[IContainer] = js.undefined
}

