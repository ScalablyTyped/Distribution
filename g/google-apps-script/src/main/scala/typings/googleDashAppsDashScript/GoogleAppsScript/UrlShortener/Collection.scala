package typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener

import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema.Url
import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema.UrlHistory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.UrlShortener.Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait UrlCollection extends js.Object {
    // Expands a short URL or gets creation time and analytics.
    def get(shortUrl: String): Url = js.native
    // Expands a short URL or gets creation time and analytics.
    def get(shortUrl: String, optionalArgs: js.Object): Url = js.native
    // Creates a new short URL.
    def insert(resource: Url): Url = js.native
    // Retrieves a list of URLs shortened by a user.
    def list(): UrlHistory = js.native
    // Retrieves a list of URLs shortened by a user.
    def list(optionalArgs: js.Object): UrlHistory = js.native
  }
  
}

