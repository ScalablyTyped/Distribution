package typings.ejWebAll.ej.Button

import typings.ejWebAll.ej.ButtonSize
import typings.ejWebAll.ej.ButtonType
import typings.ejWebAll.ej.ContentType
import typings.ejWebAll.ej.ImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires when Button control is clicked successfully.Consider the scenario to perform any validation,modification of content or any other operations click on button,we can make use
    * of this click event to achieve the scenario.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Specifies the contentType of the Button. See below to know available ContentType
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[ContentType | String] = js.native
  /** Fires after Button control is created.If the user want to perform any operation after the button control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for Button theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when the button is destroyed successfully.If the user want to perform any operation after the destroy button control then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specify the Right to Left direction to button
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies the button control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the height of the Button.
    * @Default {28}
    */
  var height: js.UndefOr[Double] = js.native
  /** It allows to define the characteristics of the Button control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specifies the image position of the Button. This image position is applicable only with the textandimage contentType property. The images can be positioned in both imageLeft and
    * imageRight options. See below to know about available ImagePosition
    * @Default {ej.ImagePosition.ImageLeft}
    */
  var imagePosition: js.UndefOr[ImagePosition | String] = js.native
  /** Specifies the primary icon for Button. This icon will be displayed from the left margin of the button.
    * @Default {null}
    */
  var prefixIcon: js.UndefOr[String] = js.native
  /** Convert the button as repeat button. It raises the 'Click' event repeatedly from the it is pressed until it is released.
    * @Default {false}
    */
  var repeatButton: js.UndefOr[Boolean] = js.native
  /** Displays the Button with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies the size of the Button. See below to know available ButtonSize
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[ButtonSize | String] = js.native
  /** Specifies the secondary icon for Button. This icon will be displayed from the right margin of the button.
    * @Default {null}
    */
  var suffixIcon: js.UndefOr[String] = js.native
  /** Specifies the text content for Button.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specified the time interval between two consecutive 'click' event on the button.
    * @Default {150}
    */
  var timeInterval: js.UndefOr[String] = js.native
  /** Specifies the Type of the Button. See below to know available ButtonType
    * @Default {ej.ButtonType.Submit}
    */
  var `type`: js.UndefOr[ButtonType | String] = js.native
  /** Specifies the width of the Button.
    * @Default {100px}
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setContentType(value: ContentType | String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
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
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setImagePosition(value: ImagePosition | String): Self = this.set("imagePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePosition: Self = this.set("imagePosition", js.undefined)
    @scala.inline
    def setPrefixIcon(value: String): Self = this.set("prefixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixIcon: Self = this.set("prefixIcon", js.undefined)
    @scala.inline
    def setRepeatButton(value: Boolean): Self = this.set("repeatButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatButton: Self = this.set("repeatButton", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setSize(value: ButtonSize | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuffixIcon(value: String): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTimeInterval(value: String): Self = this.set("timeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeInterval: Self = this.set("timeInterval", js.undefined)
    @scala.inline
    def setType(value: ButtonType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

