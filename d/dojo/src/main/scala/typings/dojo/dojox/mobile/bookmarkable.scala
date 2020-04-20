package typings.dojo.dojox.mobile

import typings.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bookmarkable.html
  *
  * Utilities to make the view transitions bookmarkable.
  *
  */
trait bookmarkable extends js.Object {
  /**
    * An array containing information about the transition.
    *
    */
  var transitionInfo: js.Array[_]
  /**
    * Adds transition information.
    *
    * @param fromViewId
    * @param toViewId
    * @param args
    */
  def addTransitionInfo(fromViewId: String, toViewId: String, args: js.Object): Unit
  /**
    * Searches for a starting view and a destination view.
    *
    * @param moveTo
    */
  def findTransitionViews(moveTo: String): js.Array[_]
  /**
    * Returns an array containing the transition information.
    *
    * @param fromViewId
    * @param toViewId
    */
  def getTransitionInfo(fromViewId: String, toViewId: String): js.Any
  /**
    * Analyzes the given hash (fragment id).
    * Given a comma-separated list of view IDs, this method
    * searches for a transition destination, and makes all the
    * views in the hash visible.
    *
    * @param fragIds
    */
  def handleFragIds(fragIds: String): js.Object
  /**
    * Updates the hash (fragment id) in the browser URL.
    * The hash value consists of one or more visible view ids
    * separated with commas.
    *
    * @param toView
    */
  def setFragIds(toView: WidgetBase): Unit
}

object bookmarkable {
  @scala.inline
  def apply(
    addTransitionInfo: (String, String, js.Object) => Unit,
    findTransitionViews: String => js.Array[_],
    getTransitionInfo: (String, String) => js.Any,
    handleFragIds: String => js.Object,
    setFragIds: WidgetBase => Unit,
    transitionInfo: js.Array[_]
  ): bookmarkable = {
    val __obj = js.Dynamic.literal(addTransitionInfo = js.Any.fromFunction3(addTransitionInfo), findTransitionViews = js.Any.fromFunction1(findTransitionViews), getTransitionInfo = js.Any.fromFunction2(getTransitionInfo), handleFragIds = js.Any.fromFunction1(handleFragIds), setFragIds = js.Any.fromFunction1(setFragIds), transitionInfo = transitionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[bookmarkable]
  }
}

