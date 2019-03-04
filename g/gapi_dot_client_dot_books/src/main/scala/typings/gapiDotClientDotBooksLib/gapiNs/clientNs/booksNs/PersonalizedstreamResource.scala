package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating): gapiDotClientLib.gapiNs.clientNs.Request[Discoveryclusters]
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating, 
      gapiDotClientLib.gapiNs.clientNs.Request[Discoveryclusters]
    ]
  ): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
}

