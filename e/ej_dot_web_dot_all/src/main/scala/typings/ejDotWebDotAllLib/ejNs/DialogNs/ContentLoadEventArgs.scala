package typings
package ejDotWebDotAllLib.ejNs.DialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContentLoadEventArgs extends js.Object {
  /** URL of the content.
               */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Content type
               */
  var contentType: js.UndefOr[js.Any] = js.undefined
  /** Instance of the dialog model object.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

