package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: gapiDotClientDotUrlshortenerLib.Anon_Projection): gapiDotClientLib.gapiNs.clientNs.Request[Url]
  /** Creates a new short URL. */
  def insert(request: gapiDotClientDotUrlshortenerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Url]
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: gapiDotClientDotUrlshortenerLib.Anon_ProjectionPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[UrlHistory]
}

