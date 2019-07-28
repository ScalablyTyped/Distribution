package typings.gapiDotClientDotAdexperiencereport.gapiNs.clientNs

import typings.gapiDotClientDotAdexperiencereport.gapiDotClientDotAdexperiencereportStrings.adexperiencereport
import typings.gapiDotClientDotAdexperiencereport.gapiDotClientDotAdexperiencereportStrings.v1
import typings.gapiDotClientDotAdexperiencereport.gapiNs.clientNs.adexperiencereportNs.SitesResource
import typings.gapiDotClientDotAdexperiencereport.gapiNs.clientNs.adexperiencereportNs.ViolatingSitesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val sites: SitesResource = js.native
  val violatingSites: ViolatingSitesResource = js.native
  /** Load Google Ad Experience Report API v1 */
  def load(name: adexperiencereport, version: v1): js.Thenable[Unit] = js.native
  def load(name: adexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
}

