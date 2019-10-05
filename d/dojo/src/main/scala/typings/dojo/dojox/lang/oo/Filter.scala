package typings.dojo.dojox.lang.oo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/Filter.html
  *
  * Filter to control mixing in objects by skipping
  * properties and renaming them.
  * This object is used as a holder of an original object
  * (whose properties are to be copied), and a filter
  * function used while copying by dojox.lang.oo.mixin.
  *
  * @param bag object to be filtered
  * @param filter a function to handle the name filtering,or an object with exec() method
  */
@js.native
trait Filter extends js.Object {
  def apply(bag: js.Object, filter: js.Function): Unit = js.native
  def apply(bag: js.Object, filter: js.Object): Unit = js.native
}

@JSGlobal("dojox.lang.oo.Filter")
@js.native
object Filter extends js.Object {
  /**
    * object to be filtered
    *
    */
  var bag: js.Object = js.native
  /**
    * a function to handle the name filtering,
    * or an object with exec() method
    *
    */
  var filter: js.Function = js.native
}

