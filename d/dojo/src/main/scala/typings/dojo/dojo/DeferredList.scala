package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/DeferredList.html
  *
  * Deprecated, use dojo/promise/all instead.
  * Provides event handling for a group of Deferred objects.
  * DeferredList takes an array of existing deferreds and returns a new deferred of its own
  * this new deferred will typically have its callback fired when all of the deferreds in
  * the given list have fired their own deferreds.  The parameters fireOnOneCallback and
  * fireOnOneErrback, will fire before all the deferreds as appropriate
  *
  */
@JSGlobal("dojo.DeferredList")
@js.native
class DeferredList () extends js.Object {
  /**
    * Gathers the results of the deferreds for packaging
    * as the parameters to the Deferred Lists' callback
    *
    * @param deferredList The deferred list from which this function gathers results.
    */
  def gatherResults(deferredList: DeferredList): js.Any = js.native
}

