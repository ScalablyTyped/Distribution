package typings.googleDashAppsDashScript.GoogleAppsScript.Sites

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create and access Google Sites.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@js.native
trait SitesApp extends js.Object {
  var AttachmentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AttachmentType */ js.Any = js.native
  var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any = js.native
  def copySite(domain: String, name: String, title: String, summary: String, site: Site): Site = js.native
  def createSite(domain: String, name: String, title: String, summary: String): Site = js.native
  def getActivePage(): Page = js.native
  def getActiveSite(): Site = js.native
  def getAllSites(domain: String): js.Array[Site] = js.native
  def getAllSites(domain: String, start: Integer, max: Integer): js.Array[Site] = js.native
  def getPageByUrl(url: String): Page = js.native
  def getSite(domain: String, name: String): Site = js.native
  def getSite(name: String): Site = js.native
  def getSiteByUrl(url: String): Site = js.native
  def getSites(): js.Array[Site] = js.native
  def getSites(domain: String): js.Array[Site] = js.native
  def getSites(domain: String, start: Integer, max: Integer): js.Array[Site] = js.native
  def getSites(start: Integer, max: Integer): js.Array[Site] = js.native
}

