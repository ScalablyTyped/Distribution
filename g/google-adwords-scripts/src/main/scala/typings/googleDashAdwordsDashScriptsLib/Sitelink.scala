package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sitelink
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats {
  def clearDescription1(): scala.Unit = js.native
  def clearDescription2(): scala.Unit = js.native
  def clearLinkUrl(): scala.Unit = js.native
  def getDescription1(): java.lang.String = js.native
  def getDescription2(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getLinkText(): java.lang.String = js.native
  def setDescription1(description1: java.lang.String): scala.Unit = js.native
  def setDescription2(description2: java.lang.String): scala.Unit = js.native
  def setLinkText(linkText: java.lang.String): scala.Unit = js.native
  def urls(): SitelinkUrls = js.native
}

