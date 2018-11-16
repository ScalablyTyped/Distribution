package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UIMessages
  extends fineDashUploaderLib.libCoreMod.Messages {
  /**
           * Text sent to `showMessage` when `multiple` is `false` and more than one file is dropped at once
           *
           * @default `'You may only drop one file.'`
           */
  var tooManyFilesError: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Text displayed to users who have ancient browsers
           *
           * @default `'Unrecoverable error - the browser does not permit uploading of any kind.'`
           */
  var unsupportedBrowser: js.UndefOr[java.lang.String] = js.undefined
}

