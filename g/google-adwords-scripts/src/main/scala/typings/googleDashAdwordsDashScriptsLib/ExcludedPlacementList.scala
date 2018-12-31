package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Shared Sets
trait ExcludedPlacementList extends AdWordsEntity {
  def addExcludedPlacement(url: java.lang.String): scala.Unit
  def addExcludedPlacements(urls: js.Array[java.lang.String]): scala.Unit
  def campaigns(): AdWordsSelector[Campaign]
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement]
  def getId(): scala.Double
  def getName(): java.lang.String
  def setName(name: java.lang.String): scala.Unit
}

