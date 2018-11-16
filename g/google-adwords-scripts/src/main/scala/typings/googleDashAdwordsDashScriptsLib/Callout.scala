package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callout
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules
     with hasStats {
  def getId(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

