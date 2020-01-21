package typings.gapiClientUrlshortener.gapi.client

import typings.gapiClientUrlshortener.gapiClientUrlshortenerStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load URL Shortener API v1 */
  def apply(name: typings.gapiClientUrlshortener.gapiClientUrlshortenerStrings.urlshortener, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientUrlshortener.gapiClientUrlshortenerStrings.urlshortener,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

