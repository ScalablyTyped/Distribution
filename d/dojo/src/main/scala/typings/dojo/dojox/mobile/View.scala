package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.keepScrollPos
import typings.dojo.dojoStrings.selected
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tag
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/View.html
  *
  * A widget that represents a view that occupies the full screen
  * View is a container widget for any HTML element and/or Dojo widgets.
  * As a Dojo widget container it can itself contain View widgets
  * forming a set of nested views. A Dojo Mobile application is usually
  * made of multiple View widgets and the user can navigate through
  * the views back and forth with animated transition effects.
  *
  * When using several sibling views (direct children of the same
  * element), you can use the 'selected' attribute to define whether
  * the view should be displayed when the application is launched.
  * If no view has selected=true, the first sibling view is displayed
  * at startup time.
  *
  * @param params Contains the parameters.
  * @param node       OptionalThe DOM node. If none is specified, it is automatically created.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.View")
@js.native
class View protected () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, node: HTMLElement) = this()
  /**
    * If true, the scroll position is kept when transition occurs between views.
    *
    */
  var keepScrollPos: Boolean = js.native
  /**
    * If true, the view is displayed at startup time.
    *
    */
  var selected: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_View: String = js.native
  /**
    * The name of the HTML tag to create as domNode. The default value is "div".
    *
    */
  var tag: String = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    *
    */
  def addTransitionInfo(): Unit = js.native
  /**
    *
    * @param moveTo
    */
  def convertToId(moveTo: js.Any): js.Any = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: WidgetBase): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  /**
    * Find the currently showing view from my sibling views.
    * Note that depending on the ancestor views' visibility,
    * the found view may not be actually shown.
    *
    */
  def getShowingView(): js.Any = js.native
  /**
    * Returns an array of the sibling views.
    *
    */
  def getSiblingViews(): js.Any = js.native
  /**
    *
    */
  def getTransitionInfo(): Unit = js.native
  @JSName("get")
  def get_keepScrollPos(property: keepScrollPos): Boolean = js.native
  @JSName("get")
  def get_selected(property: selected): Boolean = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  /**
    *
    */
  def handleFragIds(): Unit = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    *
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Hides this view without a transition animation.
    *
    */
  def hide(): Unit = js.native
  /**
    * A function to be called after performing a transition to
    * call a specified callback.
    *
    */
  def invokeCallback(): Unit = js.native
  /**
    * Return true if this view is visible
    *
    * @param checkAncestors               OptionalIf true, in addition to its own visibility, also checks theancestors visibility to see if the view is actually beingshown or not.
    */
  def isVisible(checkAncestors: Boolean): js.Any = js.native
  /**
    * Stub function to connect to from your application.
    * Called after the arriving transition occurs.
    *
    * @param moveTo
    * @param dir
    * @param transition
    * @param context
    * @param method
    */
  def onAfterTransitionIn(moveTo: js.Any, dir: js.Any, transition: js.Any, context: js.Any, method: js.Any): Unit = js.native
  /**
    * Stub function to connect to from your application.
    * Called after the leaving transition occurs.
    *
    * @param moveTo
    * @param dir
    * @param transition
    * @param context
    * @param method
    */
  def onAfterTransitionOut(moveTo: js.Any, dir: js.Any, transition: js.Any, context: js.Any, method: js.Any): Unit = js.native
  /**
    * A handler that is called after transition animation ends.
    *
    * @param e
    */
  def onAnimationEnd(e: js.Any): Unit = js.native
  /**
    * A handler that is called when transition animation starts.
    *
    * @param e
    */
  def onAnimationStart(e: js.Any): Unit = js.native
  /**
    * Stub function to connect to from your application.
    * Called before the arriving transition occurs.
    *
    * @param moveTo
    * @param dir
    * @param transition
    * @param context
    * @param method
    */
  def onBeforeTransitionIn(moveTo: js.Any, dir: js.Any, transition: js.Any, context: js.Any, method: js.Any): Unit = js.native
  /**
    * Stub function to connect to from your application.
    * Called before the leaving transition occurs.
    *
    * @param moveTo
    * @param dir
    * @param transition
    * @param context
    * @param method
    */
  def onBeforeTransitionOut(moveTo: js.Any, dir: js.Any, transition: js.Any, context: js.Any, method: js.Any): Unit = js.native
  /**
    * Stub function to connect to from your application.
    * Called only when this view is shown at startup time.
    *
    */
  def onStartView(): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Function to perform the various types of view transitions, such as fade, slide, and flip.
    *
    * @param moveTo The id of the transition destination view which resides inthe current page.If the value has a hash sign ('#') before the id(e.g. #view1) and the dojo/hash module is loaded by the userapplication, the view transition updates the hash in thebrowser URL so that the user can bookmark the destinationview. In this case, the user can also use the browser'sback/forward button to navigate through the views in thebrowser history.If null, transitions to a blank view.If '#', returns immediately without transition.
    * @param transitionDir The transition direction. If 1, transition forward. If -1, transition backward.For example, the slide transition slides the view from right to left when transitionDir == 1,and from left to right when transitionDir == -1.
    * @param transition A type of animated transition effect. You can choose fromthe standard transition types, "slide", "fade", "flip", orfrom the extended transition types, "cover", "coverv","dissolve", "reveal", "revealv", "scaleIn", "scaleOut","slidev", "swirl", "zoomIn", "zoomOut", "cube", and"swap". If "none" is specified, transition occursimmediately without animation.
    * @param context The object that the callback function will receive as "this".
    * @param method A callback function that is called when the transition has finished.A function reference, or name of a function in context.
    */
  def performTransition(moveTo: String, transitionDir: Double, transition: String, context: js.Object, method: String): Unit = js.native
  /**
    * Function to perform the various types of view transitions, such as fade, slide, and flip.
    *
    * @param moveTo The id of the transition destination view which resides inthe current page.If the value has a hash sign ('#') before the id(e.g. #view1) and the dojo/hash module is loaded by the userapplication, the view transition updates the hash in thebrowser URL so that the user can bookmark the destinationview. In this case, the user can also use the browser'sback/forward button to navigate through the views in thebrowser history.If null, transitions to a blank view.If '#', returns immediately without transition.
    * @param transitionDir The transition direction. If 1, transition forward. If -1, transition backward.For example, the slide transition slides the view from right to left when transitionDir == 1,and from left to right when transitionDir == -1.
    * @param transition A type of animated transition effect. You can choose fromthe standard transition types, "slide", "fade", "flip", orfrom the extended transition types, "cover", "coverv","dissolve", "reveal", "revealv", "scaleIn", "scaleOut","slidev", "swirl", "zoomIn", "zoomOut", "cube", and"swap". If "none" is specified, transition occursimmediately without animation.
    * @param context The object that the callback function will receive as "this".
    * @param method A callback function that is called when the transition has finished.A function reference, or name of a function in context.
    */
  def performTransition(moveTo: String, transitionDir: Double, transition: String, context: js.Object, method: js.Function): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: WidgetBase): Unit = js.native
  /**
    * Calls resize() of each child widget.
    *
    */
  def resize(): Unit = js.native
  /**
    *
    */
  def setFragIds(): Unit = js.native
  @JSName("set")
  def set_keepScrollPos(property: keepScrollPos, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  /**
    * Shows this view without a transition animation.
    *
    * @param noEvent               Optional
    * @param doNotHideOthers               Optional
    */
  def show(noEvent: Boolean, doNotHideOthers: Boolean): Unit = js.native
  /**
    * Function to force IE to redraw a node since its layout
    * code tends to misrender in partial draws.
    *
    * @param node The node to forcibly redraw.
    */
  def wakeUp(node: HTMLElement): Unit = js.native
  @JSName("watch")
  def watch_keepScrollPos(
    property: keepScrollPos,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selected(
    property: selected,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tag(
    property: tag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

