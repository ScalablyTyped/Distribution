package typings.gapiClientSearchconsole.gapi.client.searchconsole

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSearchconsole.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileFriendlyTestResource extends js.Object {
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: Accesstoken): Request[RunMobileFriendlyTestResponse]
}

object MobileFriendlyTestResource {
  @scala.inline
  def apply(run: Accesstoken => Request[RunMobileFriendlyTestResponse]): MobileFriendlyTestResource = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[MobileFriendlyTestResource]
  }
}

