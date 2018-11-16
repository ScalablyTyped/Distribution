package typings
package gapiDotPlusLib.gapiNs.clientNs.plusNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search response

trait PeopleFeed extends js.Object {
  var etag: java.lang.String
  var items: js.Array[Person]
  var kind: gapiDotPlusLib.gapiDotPlusLibStrings.`plus#peopleFeed`
  var nextPageToken: java.lang.String
  var selfLink: java.lang.String
  var title: java.lang.String
  var totalItems: scala.Double
}

