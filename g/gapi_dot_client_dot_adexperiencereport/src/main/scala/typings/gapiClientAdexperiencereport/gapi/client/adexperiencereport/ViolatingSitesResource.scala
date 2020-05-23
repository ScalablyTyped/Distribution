package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexperiencereport.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolatingSitesResource extends js.Object {
  /** Lists sites with Ad Experience Report statuses of "Failing" or "Warning". */
  def list(request: Alt): Request[ViolatingSitesResponse]
}

object ViolatingSitesResource {
  @scala.inline
  def apply(list: Alt => Request[ViolatingSitesResponse]): ViolatingSitesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ViolatingSitesResource]
  }
}

