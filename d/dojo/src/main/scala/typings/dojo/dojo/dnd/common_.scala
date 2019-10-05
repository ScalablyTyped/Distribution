package typings.dojo.dojo.dnd

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/common.html
  *
  * TODOC
  *
  */
@JSName("common")
trait common_ extends js.Object {
  /**
    *
    * @param evt
    */
  def getCopyKeyState(evt: js.Any): js.Any
  /**
    * returns a unique string for use with any DOM element
    *
    */
  def getUniqueId(): String
  /**
    * returns true if user clicked on a form element
    *
    * @param e
    */
  def isFormElement(e: Event): Unit
  /**
    * Returns the current DnD manager.  Creates one if it is not created yet.
    *
    */
  def manager(): js.Any
}

object common_ {
  @scala.inline
  def apply(
    getCopyKeyState: js.Any => js.Any,
    getUniqueId: () => String,
    isFormElement: Event => Unit,
    manager: () => js.Any
  ): common_ = {
    val __obj = js.Dynamic.literal(getCopyKeyState = js.Any.fromFunction1(getCopyKeyState), getUniqueId = js.Any.fromFunction0(getUniqueId), isFormElement = js.Any.fromFunction1(isFormElement), manager = js.Any.fromFunction0(manager))
  
    __obj.asInstanceOf[common_]
  }
}

