package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitesApp extends js.Object {
  var AttachmentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AttachmentType */ js.Any = js.native
  var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any = js.native
  def copySite(
    domain: java.lang.String,
    name: java.lang.String,
    title: java.lang.String,
    summary: java.lang.String,
    site: Site
  ): Site = js.native
  def createSite(
    domain: java.lang.String,
    name: java.lang.String,
    title: java.lang.String,
    summary: java.lang.String
  ): Site = js.native
  def getActivePage(): Page = js.native
  def getActiveSite(): Site = js.native
  def getAllSites(domain: java.lang.String): js.Array[Site] = js.native
  def getAllSites(
    domain: java.lang.String,
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[Site] = js.native
  def getPageByUrl(url: java.lang.String): Page = js.native
  def getSite(domain: java.lang.String, name: java.lang.String): Site = js.native
  def getSite(name: java.lang.String): Site = js.native
  def getSiteByUrl(url: java.lang.String): Site = js.native
  def getSites(): js.Array[Site] = js.native
  def getSites(domain: java.lang.String): js.Array[Site] = js.native
  def getSites(
    domain: java.lang.String,
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[Site] = js.native
  def getSites(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[Site] = js.native
}

