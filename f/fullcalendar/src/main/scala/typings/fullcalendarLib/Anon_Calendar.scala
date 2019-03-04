package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendar extends js.Object {
  var sourceClasses: js.Array[_]
  def parse(rawInput: js.Any, calendar: js.Any): js.Any
  def registerClass(EventSourceClass: js.Any): scala.Unit
}

object Anon_Calendar {
  @scala.inline
  def apply(
    parse: js.Function2[js.Any, js.Any, js.Any],
    registerClass: js.Function1[js.Any, scala.Unit],
    sourceClasses: js.Array[_]
  ): Anon_Calendar = {
    val __obj = js.Dynamic.literal(parse = parse, registerClass = registerClass, sourceClasses = sourceClasses)
  
    __obj.asInstanceOf[Anon_Calendar]
  }
}

