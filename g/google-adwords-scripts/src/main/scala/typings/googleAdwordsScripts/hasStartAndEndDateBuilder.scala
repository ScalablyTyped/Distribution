package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasStartAndEndDateBuilder[B] extends js.Object {
  
  def withEndDate(date: String): B = js.native
  def withEndDate(date: AdWordsDate): B = js.native
  
  def withStartDate(date: String): B = js.native
  def withStartDate(date: AdWordsDate): B = js.native
}
