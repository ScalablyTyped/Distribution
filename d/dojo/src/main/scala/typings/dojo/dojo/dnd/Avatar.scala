package typings.dojo.dojo.dnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Avatar.html
  *
  * Object that represents transferred DnD items visually
  *
  * @param manager
  */
@JSGlobal("dojo.dnd.Avatar")
@js.native
class Avatar protected () extends js.Object {
  def this(manager: js.Any) = this()
  /**
    * a DnD manager object
    *
    */
  var manager: js.Object = js.native
  /**
    * constructor function;
    * it is separate so it can be (dynamically) overwritten in case of need
    *
    */
  def construct(): Unit = js.native
  /**
    * destructor for the avatar; called to remove all references so it can be garbage-collected
    *
    */
  def destroy(): Unit = js.native
  /**
    * updates the avatar to reflect the current DnD state
    *
    */
  def update(): Unit = js.native
}

