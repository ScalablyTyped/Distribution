package typings.devexpressWeb

import typings.knockout.KnockoutObservable
import typings.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientReportPreview extends js.Object {
  @JSName("documentBuilding")
  var documentBuilding_Original: KnockoutObservable[Boolean] = js.native
  @JSName("pageIndex")
  var pageIndex_Original: KnockoutObservable[Double] = js.native
  @JSName("pages")
  var pages_Original: KnockoutObservableArray[_] = js.native
  @JSName("showMultipagePreview")
  var showMultipagePreview_Original: KnockoutObservable[Boolean] = js.native
  @JSName("zoom")
  var zoom_Original: KnockoutObservable[Double] = js.native
  def documentBuilding(): Boolean = js.native
  def documentBuilding(value: Boolean): Unit = js.native
  def pageIndex(): Double = js.native
  def pageIndex(value: Double): Unit = js.native
  def pages(): js.Array[_] = js.native
  def pages(value: js.Array[_]): Unit = js.native
  def showMultipagePreview(): Boolean = js.native
  def showMultipagePreview(value: Boolean): Unit = js.native
  def zoom(): Double = js.native
  def zoom(value: Double): Unit = js.native
}

