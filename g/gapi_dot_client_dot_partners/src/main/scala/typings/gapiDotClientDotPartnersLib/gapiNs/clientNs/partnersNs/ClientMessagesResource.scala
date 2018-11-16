package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientMessagesResource extends js.Object {
  /**
               * Logs a generic message from the client, such as
               * `Failed to render component`, `Profile page is running slow`,
               * `More than 500 users have accessed this result.`, etc.
               */
  def log(request: gapiDotClientDotPartnersLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[LogMessageResponse]
}

