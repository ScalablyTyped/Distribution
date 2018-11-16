package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snippet
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats {
  def getHeader(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getValues(): js.Array[java.lang.String] = js.native
  def setHeader(header: java.lang.String): scala.Unit = js.native
  def setValues(values: js.Array[java.lang.String]): scala.Unit = js.native
}

