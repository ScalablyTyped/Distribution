package typings.dogapi

import typings.dogapi.dogapiStrings.low
import typings.dogapi.dogapiStrings.normal
import typings.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datehappened extends js.Object {
  var date_happened: Double
  var handle: js.Any
  var id: BigInt
  var priority: normal | low
  var related_event_id: Double | Null
  var tags: js.Array[String]
  var text: String
  var title: String
  var url: String
}

object Anon_Datehappened {
  @scala.inline
  def apply(
    date_happened: Double,
    handle: js.Any,
    id: BigInt,
    priority: normal | low,
    tags: js.Array[String],
    text: String,
    title: String,
    url: String,
    related_event_id: Int | Double = null
  ): Anon_Datehappened = {
    val __obj = js.Dynamic.literal(date_happened = date_happened, handle = handle, id = id, priority = priority.asInstanceOf[js.Any], tags = tags, text = text, title = title, url = url)
    if (related_event_id != null) __obj.updateDynamic("related_event_id")(related_event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Datehappened]
  }
}

