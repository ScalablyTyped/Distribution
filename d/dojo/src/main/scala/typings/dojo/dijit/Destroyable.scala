package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Destroyable.html
  *
  * Mixin to track handles and release them when instance is destroyed.
  * Call this.own(...) on list of handles (returned from dojo/aspect, dojo/on,
  * dojo/Stateful::watch, or any class (including widgets) with a destroyRecursive() or destroy() method.
  * Then call destroy() later to destroy this instance and release the resources.
  * 
  */
@JSGlobal("dijit.Destroyable")
@js.native
class Destroyable () extends js.Object {
  /**
    * Destroy this class, releasing any resources registered via own().
    * 
    * @param preserveDom             
    */
  def destroy(): Unit = js.native
  def destroy(preserveDom: Boolean): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(handle: js.Any): js.Any = js.native
}

