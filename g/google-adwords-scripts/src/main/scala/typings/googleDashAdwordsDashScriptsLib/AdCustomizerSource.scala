package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSource extends AdWordsEntity {
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem]
  def getAttributes(): js.Object
  def getName(): java.lang.String
  def items(): AdWordsSelector[AdCustomizerItem]
}

