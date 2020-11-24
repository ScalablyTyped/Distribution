package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snippet
  extends isAdGroupChild
     with AdWordsEntity
     with hasMobilePreferred
     with hasSchedules
     with hasStartAndEndDate
     with hasStats {
  
  def getHeader(): String = js.native
  
  def getId(): Double = js.native
  
  def getValues(): js.Array[String] = js.native
  
  def setHeader(header: String): Unit = js.native
  
  def setValues(values: js.Array[String]): Unit = js.native
}
