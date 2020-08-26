package typings.ejWebAll.ej.NavigationDrawer

import typings.ejWebAll.ej.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event triggers after the AJAX content loaded completely.
    */
  var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.native
  /** Event triggers when the AJAX request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the content to the NavigationDrawer control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Event triggers after the AJAX content loaded successfully.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Event triggers before the control gets closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  /** Specifies the contentId for navigation drawer, where the AJAX content need to updated
    * @Default {null}
    */
  var contentId: js.UndefOr[String] = js.native
  /** Sets the root class for NavigationDrawer theme. This cssClass API helps to use custom skinning option for NavigationDrawer control. By defining the root class using this API, we
    * need to include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the Direction for the control. See Direction
    * @Default {left}
    */
  var direction: js.UndefOr[Direction | String] = js.native
  /** Sets the listview to be enabled or not
    * @Default {false}
    */
  var enableListView: js.UndefOr[Boolean] = js.native
  /** Navigation pane opened initially when isPaneOpen property is true.
    * @Default {false}
    */
  var isPaneOpen: js.UndefOr[Boolean] = js.native
  /** Specifies the listview items as an array of object.
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /** Sets all the properties of listview to render in navigation drawer
    */
  var listViewSettings: js.UndefOr[js.Any] = js.native
  /** Event triggers when the control open.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Specifies position whether it is in fixed or relative to the page. See Position
    * @Default {normal}
    */
  var position: js.UndefOr[String] = js.native
  /** Event triggers when the Swipe happens.
    */
  var swipe: js.UndefOr[js.Function1[/* e */ SwipeEventArgs, Unit]] = js.native
  /** Specifies the targetId for navigation drawer
    */
  var targetId: js.UndefOr[String] = js.native
  /** Sets the rendering type of the control. See Type
    * @Default {overlay}
    */
  var `type`: js.UndefOr[String] = js.native
  /** Specifies the width of the control
    * @Default {auto}
    */
  var width: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAjaxComplete(value: /* e */ AjaxCompleteEventArgs => Unit): Self = this.set("ajaxComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxComplete: Self = this.set("ajaxComplete", js.undefined)
    @scala.inline
    def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = this.set("ajaxError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    @scala.inline
    def setAjaxSettings(value: AjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    @scala.inline
    def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = this.set("ajaxSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxSuccess: Self = this.set("ajaxSuccess", js.undefined)
    @scala.inline
    def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDirection(value: Direction | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEnableListView(value: Boolean): Self = this.set("enableListView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableListView: Self = this.set("enableListView", js.undefined)
    @scala.inline
    def setIsPaneOpen(value: Boolean): Self = this.set("isPaneOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPaneOpen: Self = this.set("isPaneOpen", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setListViewSettings(value: js.Any): Self = this.set("listViewSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListViewSettings: Self = this.set("listViewSettings", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSwipe(value: /* e */ SwipeEventArgs => Unit): Self = this.set("swipe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

