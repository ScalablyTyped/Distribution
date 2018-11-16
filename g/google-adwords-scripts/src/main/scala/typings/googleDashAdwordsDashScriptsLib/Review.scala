package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Review
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats {
  def getId(): scala.Double = js.native
  def getSourceName(): java.lang.String = js.native
  def getSourceUrl(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  def isExactlyQuoted(): scala.Boolean = js.native
  def setExactlyQuoted(isExactlyQuoted: scala.Boolean): scala.Unit = js.native
  def setSourceName(sourceName: java.lang.String): scala.Unit = js.native
  def setSourceUrl(sourceUrl: java.lang.String): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

