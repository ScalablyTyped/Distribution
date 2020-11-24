package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasStartAndEndDate extends js.Object {
  
  def getEndDate(): AdWordsDate = js.native
  
  def getStartDate(): AdWordsDate = js.native
  
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: AdWordsDate): Unit = js.native
  
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: AdWordsDate): Unit = js.native
}
