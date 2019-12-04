package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/viewRegistry.html
  *
  * A registry of existing views.
  *
  */
@JSName("viewRegistry")
trait viewRegistry_ extends js.Object {
  /**
    *
    */
  var initialView: js.Object
  /**
    * The number of registered views.
    *
    */
  var length: Double
  /**
    * Adds a view to the registry.
    *
    * @param view
    */
  def add(view: View): Unit
  /**
    * Gets the children views of the specified view.
    *
    * @param parent
    */
  def getChildViews(parent: View): js.Array[_]
  /**
    * Gets the dojox/mobile/scrollable object containing the specified DOM node.
    *
    * @param node
    */
  def getEnclosingScrollable(node: HTMLElement): scrollable
  /**
    * Gets the view containing the specified DOM node.
    *
    * @param node
    */
  def getEnclosingView(node: HTMLElement): View
  /**
    * Gets the parent view of the specified view.
    *
    * @param view
    */
  def getParentView(view: View): View
  /**
    * Gets all registered views.
    *
    */
  def getViews(): js.Array[_]
  /**
    * Removes a view from the registry.
    *
    * @param id
    */
  def remove(id: String): Unit
}

object viewRegistry_ {
  @scala.inline
  def apply(
    add: View => Unit,
    getChildViews: View => js.Array[_],
    getEnclosingScrollable: HTMLElement => scrollable,
    getEnclosingView: HTMLElement => View,
    getParentView: View => View,
    getViews: () => js.Array[_],
    initialView: js.Object,
    length: Double,
    remove: String => Unit
  ): viewRegistry_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getChildViews = js.Any.fromFunction1(getChildViews), getEnclosingScrollable = js.Any.fromFunction1(getEnclosingScrollable), getEnclosingView = js.Any.fromFunction1(getEnclosingView), getParentView = js.Any.fromFunction1(getParentView), getViews = js.Any.fromFunction0(getViews), initialView = initialView.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[viewRegistry_]
  }
}

