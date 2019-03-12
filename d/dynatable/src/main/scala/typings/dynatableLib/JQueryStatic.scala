package typings
package dynatableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static members of jQuery (those on $ and jQuery themselves) */
trait JQueryStatic extends js.Object {
  /**
    * Global dynatable plugin setting defaults
    *
    * @param options The configuration options to be set globally
    */
  def dynatableSetup(options: dynatableLib.JQueryDynatableNs.Options): scala.Unit
}

object JQueryStatic {
  @scala.inline
  def apply(dynatableSetup: dynatableLib.JQueryDynatableNs.Options => scala.Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(dynatableSetup = js.Any.fromFunction1(dynatableSetup))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

