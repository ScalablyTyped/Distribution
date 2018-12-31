package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraButtonsOptions extends js.Object {
  /**
    * The container element for the upload button
    *
    * @default `undefined`
    */
  var element: stdLib.HTMLElement
  /**
    * This value will be used when creating the `title` attribute for the underlying `<input type="file">`.
    *
    * If not provided, the `text.fileInputTitle` option will be used instead
    *
    * @default `'file input'`
    */
  var fileInputTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `true` to allow folders to be selected, `false` to allow files to be selected.
    *
    * @default `false`
    */
  var folders: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify to override the default `multiple` value
    *
    * @default `true`
    */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify to override the default `validation` option specified.
    *
    * Any `validation` properties not specified will be inherited from the default `validation` option
    *
    * @default `validation`
    */
  var validation: js.UndefOr[js.Any] = js.undefined
}

