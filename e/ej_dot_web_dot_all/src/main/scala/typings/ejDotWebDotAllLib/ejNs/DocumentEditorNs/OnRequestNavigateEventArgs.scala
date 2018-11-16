package typings
package ejDotWebDotAllLib.ejNs.DocumentEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnRequestNavigateEventArgs extends js.Object {
  /** true, if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the link type and navigation link.
               */
  var hyperlink: js.UndefOr[js.Any] = js.undefined
  /** Returns the document editor model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

