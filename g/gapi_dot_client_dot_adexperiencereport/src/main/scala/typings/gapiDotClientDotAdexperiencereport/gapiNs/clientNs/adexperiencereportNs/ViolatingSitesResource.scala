package typings.gapiDotClientDotAdexperiencereport.gapiNs.clientNs.adexperiencereportNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexperiencereport.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolatingSitesResource extends js.Object {
  /** Lists sites with Ad Experience Report statuses of "Failing" or "Warning". */
  def list(request: Anon_AccesstokenAlt): Request[ViolatingSitesResponse]
}

object ViolatingSitesResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAlt => Request[ViolatingSitesResponse]): ViolatingSitesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ViolatingSitesResource]
  }
}

