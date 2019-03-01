package typings
package ejDotWebDotAllLib.ejNs.WaitingPopupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Waitingpopup element append to given container element.
    * @Default {null}
    */
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  /** Fires after Create WaitingPopup successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root class for the WaitingPopup control theme
    * @Default {null}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires after Destroy WaitingPopup successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the list of HTML attributes to be added to waitingpopup control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enables or disables the default loading icon.
    * @Default {true}
    */
  var showImage: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the visibility of the WaitingPopup control
    * @Default {false}
    */
  var showOnInit: js.UndefOr[scala.Boolean] = js.undefined
  /** Specified a selector for elements, within the container.
    * @Default {null}
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** Loads HTML content inside the popup panel instead of the default icon
    * @Default {null}
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /** Sets the custom text in the pop-up panel to notify the waiting process
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    appendTo: java.lang.String = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    htmlAttributes: js.Any = null,
    showImage: js.UndefOr[scala.Boolean] = js.undefined,
    showOnInit: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null,
    template: js.Any = null,
    text: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (!js.isUndefined(showImage)) __obj.updateDynamic("showImage")(showImage)
    if (!js.isUndefined(showOnInit)) __obj.updateDynamic("showOnInit")(showOnInit)
    if (target != null) __obj.updateDynamic("target")(target)
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Model]
  }
}

