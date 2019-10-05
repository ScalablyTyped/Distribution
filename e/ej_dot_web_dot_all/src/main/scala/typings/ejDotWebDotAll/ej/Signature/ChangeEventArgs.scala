package typings.ejDotWebDotAll.ej.Signature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Gives the last stored image
    */
  var lastImage: js.UndefOr[String] = js.undefined
  /** Instance of the signature model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Signature.Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    lastImage: String = null,
    model: typings.ejDotWebDotAll.ej.Signature.Model = null,
    `type`: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (lastImage != null) __obj.updateDynamic("lastImage")(lastImage)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

