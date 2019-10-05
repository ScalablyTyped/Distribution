package typings.gapiDotClientDotSearchconsole.gapi.client.searchconsole

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSearchconsole.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileFriendlyTestResource extends js.Object {
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: Anon_Accesstoken): Request[RunMobileFriendlyTestResponse]
}

object MobileFriendlyTestResource {
  @scala.inline
  def apply(run: Anon_Accesstoken => Request[RunMobileFriendlyTestResponse]): MobileFriendlyTestResource = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[MobileFriendlyTestResource]
  }
}

