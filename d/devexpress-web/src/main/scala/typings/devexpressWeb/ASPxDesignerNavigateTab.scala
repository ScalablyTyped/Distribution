package typings.devexpressWeb

import typings.knockout.KnockoutComputed
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxDesignerNavigateTab")
@js.native
class ASPxDesignerNavigateTab () extends js.Object {
  @JSName("displayName")
  var displayName_Original: KnockoutComputed[String] = js.native
  @JSName("isModified")
  var isModified_Original: KnockoutObservable[Boolean] = js.native
  @JSName("report")
  var report_Original: KnockoutObservable[_] = js.native
  var undoEngine: ASPxDesignerUndoEngine = js.native
  @JSName("url")
  var url_Original: KnockoutObservable[String] = js.native
  def displayName(): String = js.native
  def displayName(value: String): Unit = js.native
  def isModified(): Boolean = js.native
  def isModified(value: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def report(): js.Any = js.native
  def report(value: js.Any): Unit = js.native
  def resetIsModified(): Unit = js.native
  def url(): String = js.native
  def url(value: String): Unit = js.native
}

