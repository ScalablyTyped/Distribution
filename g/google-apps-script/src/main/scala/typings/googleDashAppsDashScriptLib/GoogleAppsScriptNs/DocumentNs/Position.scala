package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Position extends js.Object {
  def getElement(): Element
  def getOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSurroundingText(): Text
  def getSurroundingTextOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def insertBookmark(): Bookmark
  def insertInlineImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage
  def insertText(text: java.lang.String): Text
}

