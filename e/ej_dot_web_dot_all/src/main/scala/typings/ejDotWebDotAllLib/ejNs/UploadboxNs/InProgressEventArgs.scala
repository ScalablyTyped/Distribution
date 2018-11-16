package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InProgressEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** AJAX event argument for reference.
               */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns Selected FileList objects
               */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the current progress percentage.
               */
  var percentage: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

