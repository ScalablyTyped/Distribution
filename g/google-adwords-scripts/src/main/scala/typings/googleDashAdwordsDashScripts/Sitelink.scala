package typings.googleDashAdwordsDashScripts

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
  def clearDescription1(): Unit = js.native
  def clearDescription2(): Unit = js.native
  def clearLinkUrl(): Unit = js.native
  def getDescription1(): String = js.native
  def getDescription2(): String = js.native
  def getId(): Double = js.native
  def getLinkText(): String = js.native
  def setDescription1(description1: String): Unit = js.native
  def setDescription2(description2: String): Unit = js.native
  def setLinkText(linkText: String): Unit = js.native
  def urls(): SitelinkUrls = js.native
}

