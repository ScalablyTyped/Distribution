package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryItemClickEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the gallery model.
    */
  var galleryModel: js.UndefOr[js.Any] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the item clicked in the gallery.
    */
  var target: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object GalleryItemClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    galleryModel: js.Any = null,
    model: js.Any = null,
    target: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): GalleryItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (galleryModel != null) __obj.updateDynamic("galleryModel")(galleryModel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GalleryItemClickEventArgs]
  }
}

