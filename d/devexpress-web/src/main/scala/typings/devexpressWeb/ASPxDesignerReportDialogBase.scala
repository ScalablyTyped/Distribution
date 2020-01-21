package typings.devexpressWeb

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxDesignerReportDialogBase")
@js.native
class ASPxDesignerReportDialogBase () extends js.Object {
  var buttons: js.Array[_] = js.native
  @JSName("height")
  var height_Original: KnockoutObservable[_] = js.native
  @JSName("model")
  var model_Original: KnockoutObservable[ASPxDesignerDialogModel] = js.native
  @JSName("tab")
  var tab_Original: KnockoutObservable[ASPxDesignerNavigateTab] = js.native
  @JSName("template")
  var template_Original: KnockoutObservable[String] = js.native
  var title: String = js.native
  @JSName("visible")
  var visible_Original: KnockoutObservable[Boolean] = js.native
  @JSName("width")
  var width_Original: KnockoutObservable[_] = js.native
  def cancel(): Unit = js.native
  def customize(template: String, model: ASPxDesignerDialogModel): Unit = js.native
  def height(): js.Any = js.native
  def height(value: js.Any): Unit = js.native
  def model(): ASPxDesignerDialogModel = js.native
  def model(value: ASPxDesignerDialogModel): Unit = js.native
  def show(tab: ASPxDesignerNavigateTab): Unit = js.native
  def tab(): ASPxDesignerNavigateTab = js.native
  def tab(value: ASPxDesignerNavigateTab): Unit = js.native
  def template(): String = js.native
  def template(value: String): Unit = js.native
  def visible(): Boolean = js.native
  def visible(value: Boolean): Unit = js.native
  def width(): js.Any = js.native
  def width(value: js.Any): Unit = js.native
}

