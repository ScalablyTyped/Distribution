package typings.ejWebAll.ej.WaitingPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Waitingpopup element append to given container element.
    * @Default {null}
    */
  var appendTo: js.UndefOr[String] = js.undefined
  /** Fires after Create WaitingPopup successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root class for the WaitingPopup control theme
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires after Destroy WaitingPopup successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the list of HTML attributes to be added to waitingpopup control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enables or disables the default loading icon.
    * @Default {true}
    */
  var showImage: js.UndefOr[Boolean] = js.undefined
  /** Enables the visibility of the WaitingPopup control
    * @Default {false}
    */
  var showOnInit: js.UndefOr[Boolean] = js.undefined
  /** Specified a selector for elements, within the container.
    * @Default {null}
    */
  var target: js.UndefOr[String] = js.undefined
  /** Loads HTML content inside the popup panel instead of the default icon
    * @Default {null}
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /** Sets the custom text in the pop-up panel to notify the waiting process
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    appendTo: String = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    htmlAttributes: js.Any = null,
    showImage: js.UndefOr[Boolean] = js.undefined,
    showOnInit: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    template: js.Any = null,
    text: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(showImage)) __obj.updateDynamic("showImage")(showImage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnInit)) __obj.updateDynamic("showOnInit")(showOnInit.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

