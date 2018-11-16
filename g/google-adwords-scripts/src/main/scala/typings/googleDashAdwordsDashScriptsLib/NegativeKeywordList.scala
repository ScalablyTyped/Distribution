package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NegativeKeywordList extends AdWordsEntity {
  def addNegativeKeyword(keywordText: java.lang.String): scala.Unit
  def addNegativeKeywords(keywordTexts: js.Array[java.lang.String]): scala.Unit
  def campaigns(): AdWordsSelector[Campaign]
  def getId(): scala.Double
  def getName(): java.lang.String
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword]
  def setName(): java.lang.String
}

