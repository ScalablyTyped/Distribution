package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Display
trait DisplayBuilder[T] extends AdWordsBuilder[T] {
  def exclude(): AdWordsOperation[T]
  def withCpc(cpc: scala.Double): T
  def withCpm(cpm: scala.Double): T
}

