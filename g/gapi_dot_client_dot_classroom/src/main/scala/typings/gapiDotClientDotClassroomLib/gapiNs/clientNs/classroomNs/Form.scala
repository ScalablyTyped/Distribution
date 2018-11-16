package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Form extends js.Object {
  /** URL of the form. */
  var formUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * URL of the form responses document.
               * Only set if respsonses have been recorded and only when the
               * requesting user is an editor of the form.
               *
               * Read-only.
               */
  var responseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * URL of a thumbnail image of the Form.
               *
               * Read-only.
               */
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Title of the Form.
               *
               * Read-only.
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

