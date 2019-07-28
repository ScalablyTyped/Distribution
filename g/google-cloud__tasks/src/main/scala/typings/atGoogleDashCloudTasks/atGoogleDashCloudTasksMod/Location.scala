package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var displayName: String
  var labels: StringDictionary[String]
  var locationId: String
  var metadata: js.Object
  var name: String
}

object Location {
  @scala.inline
  def apply(
    displayName: String,
    labels: StringDictionary[String],
    locationId: String,
    metadata: js.Object,
    name: String
  ): Location = {
    val __obj = js.Dynamic.literal(displayName = displayName, labels = labels, locationId = locationId, metadata = metadata, name = name)
  
    __obj.asInstanceOf[Location]
  }
}

