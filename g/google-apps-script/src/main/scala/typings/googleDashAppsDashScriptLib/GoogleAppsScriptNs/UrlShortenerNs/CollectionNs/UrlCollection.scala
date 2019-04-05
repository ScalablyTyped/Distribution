package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlCollection extends js.Object {
  // Expands a short URL or gets creation time and analytics.
  def get(shortUrl: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url = js.native
  // Expands a short URL or gets creation time and analytics.
  def get(shortUrl: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url = js.native
  // Creates a new short URL.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url = js.native
  // Retrieves a list of URLs shortened by a user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.UrlHistory = js.native
  // Retrieves a list of URLs shortened by a user.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.UrlHistory = js.native
}

