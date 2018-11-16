package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DocumentApp extends js.Object {
  var Attribute: js.Any
  var ElementType: js.Any
  var FontFamily: js.Any
  var GlyphType: js.Any
  var HorizontalAlignment: js.Any
  var ParagraphHeading: js.Any
  var PositionedLayout: js.Any
  var TextAlignment: js.Any
  var VerticalAlignment: js.Any
  def create(name: java.lang.String): Document
  def getActiveDocument(): Document
  def getUi(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui
  def openById(id: java.lang.String): Document
  def openByUrl(url: java.lang.String): Document
}

