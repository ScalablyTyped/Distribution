package typings.dogapi

import typings.dogapi.dogapiStrings.low
import typings.dogapi.dogapiStrings.normal
import typings.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatehappened extends js.Object {
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

object AnonDatehappened {
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
  ): AnonDatehappened = {
    val __obj = js.Dynamic.literal(date_happened = date_happened.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (related_event_id != null) __obj.updateDynamic("related_event_id")(related_event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatehappened]
  }
}

