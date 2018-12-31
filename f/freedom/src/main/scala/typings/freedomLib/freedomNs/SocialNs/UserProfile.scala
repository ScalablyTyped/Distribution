package typings
package freedomLib.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The profile of a user on a social network.
trait UserProfile extends js.Object {
  // Image URI (e.g. data:image/png;base64,adkwe329...)
  var imageData: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var status: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var userId: java.lang.String
}

