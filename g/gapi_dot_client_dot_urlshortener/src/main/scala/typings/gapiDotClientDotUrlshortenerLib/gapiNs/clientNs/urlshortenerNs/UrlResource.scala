package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: gapiDotClientDotUrlshortenerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Url]
  /** Creates a new short URL. */
  def insert(request: gapiDotClientDotUrlshortenerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: gapiDotClientDotUrlshortenerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[UrlHistory]
}

object UrlResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotUrlshortenerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Url]
    ],
    insert: js.Function1[
      gapiDotClientDotUrlshortenerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Url]
    ],
    list: js.Function1[
      gapiDotClientDotUrlshortenerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlHistory]
    ]
  ): UrlResource = {
    val __obj = js.Dynamic.literal(get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[UrlResource]
  }
}

