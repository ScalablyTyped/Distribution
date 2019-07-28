package typings.googleDashAdwordsDashScripts

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
  def getId(): Double = js.native
  def getText(): String = js.native
  def setText(text: String): Unit = js.native
}

