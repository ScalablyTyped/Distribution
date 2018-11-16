package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeUploadSendEventArgs extends js.Object {
  /** if the event is cancelled; otherwise, false
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** selected FileList Object
               */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the upload model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** XHR-AJAX Object for reference
               */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

