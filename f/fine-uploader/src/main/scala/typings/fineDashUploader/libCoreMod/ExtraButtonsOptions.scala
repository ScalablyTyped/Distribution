package typings.fineDashUploader.libCoreMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraButtonsOptions extends js.Object {
  /**
    * The container element for the upload button
    *
    * @default `undefined`
    */
  var element: HTMLElement
  /**
    * This value will be used when creating the `title` attribute for the underlying `<input type="file">`.
    *
    * If not provided, the `text.fileInputTitle` option will be used instead
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[String] = js.undefined
  /**
    * `true` to allow folders to be selected, `false` to allow files to be selected.
    *
    * @default `false`
    */
  var folders: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify to override the default `multiple` value
    *
    * @default `true`
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify to override the default `validation` option specified.
    *
    * Any `validation` properties not specified will be inherited from the default `validation` option
    *
    * @default `validation`
    */
  var validation: js.UndefOr[js.Any] = js.undefined
}

object ExtraButtonsOptions {
  @scala.inline
  def apply(
    element: HTMLElement,
    fileInputTitle: String = null,
    folders: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    validation: js.Any = null
  ): ExtraButtonsOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (fileInputTitle != null) __obj.updateDynamic("fileInputTitle")(fileInputTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(folders)) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraButtonsOptions]
  }
}

