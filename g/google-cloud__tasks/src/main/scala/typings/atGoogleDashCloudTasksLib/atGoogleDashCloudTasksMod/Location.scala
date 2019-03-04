package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var displayName: java.lang.String
  var labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var locationId: java.lang.String
  var metadata: js.Object
  var name: java.lang.String
}

object Location {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    locationId: java.lang.String,
    metadata: js.Object,
    name: java.lang.String
  ): Location = {
    val __obj = js.Dynamic.literal(displayName = displayName, labels = labels, locationId = locationId, metadata = metadata, name = name)
  
    __obj.asInstanceOf[Location]
  }
}

