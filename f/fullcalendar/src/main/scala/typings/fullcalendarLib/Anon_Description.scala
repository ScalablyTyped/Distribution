package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.Any
  var end: js.Any
  var id: js.Any
  var location: js.Any
  var start: js.Any
  var title: js.Any
  var url: js.Any
}

object Anon_Description {
  @scala.inline
  def apply(
    description: js.Any,
    end: js.Any,
    id: js.Any,
    location: js.Any,
    start: js.Any,
    title: js.Any,
    url: js.Any
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Description]
  }
}

