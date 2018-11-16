package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Display extends js.Object {
  def audiences(): AdWordsSelector[Audience]
  def keywords(): AdWordsSelector[DisplayKeyword]
  def placements(): AdWordsSelector[Placement]
  def topics(): AdWordsSelector[Topic]
}

