package typings
package durandalLib.compositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionTransation extends js.Object {
  /**
    * Registers a callback which will be invoked when the current composition transaction has completed. The transaction includes all parent and children compositions.
    * @param {function} callback The callback to be invoked when composition is complete.
    */
  def complete(callback: js.Function): scala.Unit
}

object CompositionTransation {
  @scala.inline
  def apply(complete: js.Function1[js.Function, scala.Unit]): CompositionTransation = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[CompositionTransation]
  }
}

