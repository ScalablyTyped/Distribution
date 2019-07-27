package typings
package dogapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datehappened extends js.Object {
  var date_happened: scala.Double
  var handle: js.Any
  var id: stdLib.BigInt
  var priority: dogapiLib.dogapiLibStrings.normal | dogapiLib.dogapiLibStrings.low
  var related_event_id: scala.Double | scala.Null
  var tags: js.Array[java.lang.String]
  var text: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
}

object Anon_Datehappened {
  @scala.inline
  def apply(
    date_happened: scala.Double,
    handle: js.Any,
    id: stdLib.BigInt,
    priority: dogapiLib.dogapiLibStrings.normal | dogapiLib.dogapiLibStrings.low,
    tags: js.Array[java.lang.String],
    text: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    related_event_id: scala.Int | scala.Double = null
  ): Anon_Datehappened = {
    val __obj = js.Dynamic.literal(date_happened = date_happened, handle = handle, id = id, priority = priority.asInstanceOf[js.Any], tags = tags, text = text, title = title, url = url)
    if (related_event_id != null) __obj.updateDynamic("related_event_id")(related_event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Datehappened]
  }
}

