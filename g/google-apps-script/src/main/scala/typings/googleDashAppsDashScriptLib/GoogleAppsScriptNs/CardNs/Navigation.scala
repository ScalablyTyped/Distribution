package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Navigation extends js.Object {
  def popCard(): Navigation
  def popToNamedCard(cardName: java.lang.String): Navigation
  def popToRoot(): Navigation
  def printJson(): java.lang.String
  def pushCard(card: Card): Navigation
  def updateCard(card: Card): Navigation
}

