package typings.gapiDotClientDotUrlshortener.gapiNs.clientNs

import typings.gapiDotClientDotUrlshortener.gapiDotClientDotUrlshortenerStrings.urlshortener
import typings.gapiDotClientDotUrlshortener.gapiDotClientDotUrlshortenerStrings.v1
import typings.gapiDotClientDotUrlshortener.gapiNs.clientNs.urlshortenerNs.UrlResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val url: UrlResource = js.native
  /** Load URL Shortener API v1 */
  def load(name: urlshortener, version: v1): js.Thenable[Unit] = js.native
  def load(name: urlshortener, version: v1, callback: js.Function0[_]): Unit = js.native
}

