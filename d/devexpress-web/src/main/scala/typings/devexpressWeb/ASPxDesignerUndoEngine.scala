package typings.devexpressWeb

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxDesignerUndoEngine")
@js.native
class ASPxDesignerUndoEngine () extends js.Object {
  @JSName("isDirty")
  var isDirty_Original: KnockoutObservable[Boolean] = js.native
  @JSName("redoEnabled")
  var redoEnabled_Original: KnockoutObservable[Boolean] = js.native
  @JSName("undoEnabled")
  var undoEnabled_Original: KnockoutObservable[Boolean] = js.native
  def clearHistory(): Unit = js.native
  def isDirty(): Boolean = js.native
  def isDirty(value: Boolean): Unit = js.native
  def redo(): Unit = js.native
  def redoEnabled(): Boolean = js.native
  def redoEnabled(value: Boolean): Unit = js.native
  def undo(): Unit = js.native
  def undoAll(): Unit = js.native
  def undoEnabled(): Boolean = js.native
  def undoEnabled(value: Boolean): Unit = js.native
}

