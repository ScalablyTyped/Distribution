package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Labels
trait Label extends AdWordsEntity {
  def adGroups(): AdWordsSelector[AdGroup]
  def ads(): AdWordsSelector[Ad]
  def campaigns(): AdWordsSelector[Campaign]
  def getColor(): java.lang.String
  def getDescription(): java.lang.String
  def getId(): java.lang.String
  def getName(): java.lang.String
  def keywords(): AdWordsSelector[Keyword]
  def remove(): scala.Unit
  def setColor(color: java.lang.String): scala.Unit
  def setDescription(description: java.lang.String): scala.Unit
  def setName(name: java.lang.String): scala.Unit
}

