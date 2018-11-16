package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Negative Keywords

trait NegativeKeyword
  extends isAdGroupChild
     with AdWordsEntity {
  def getMatchType(): MatchType
  def getText(): java.lang.String
  def remove(): scala.Unit
}

