package typings.ejWebAll.ej.WaitingPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Waitingpopup element append to given container element.
    * @Default {null}
    */
  var appendTo: js.UndefOr[String] = js.native
  /** Fires after Create WaitingPopup successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root class for the WaitingPopup control theme
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires after Destroy WaitingPopup successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the list of HTML attributes to be added to waitingpopup control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Enables or disables the default loading icon.
    * @Default {true}
    */
  var showImage: js.UndefOr[Boolean] = js.native
  /** Enables the visibility of the WaitingPopup control
    * @Default {false}
    */
  var showOnInit: js.UndefOr[Boolean] = js.native
  /** Specified a selector for elements, within the container.
    * @Default {null}
    */
  var target: js.UndefOr[String] = js.native
  /** Loads HTML content inside the popup panel instead of the default icon
    * @Default {null}
    */
  var template: js.UndefOr[js.Any] = js.native
  /** Sets the custom text in the pop-up panel to notify the waiting process
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
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
    def setAppendTo(value: String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setShowImage(value: Boolean): Self = this.set("showImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowImage: Self = this.set("showImage", js.undefined)
    @scala.inline
    def setShowOnInit(value: Boolean): Self = this.set("showOnInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnInit: Self = this.set("showOnInit", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

