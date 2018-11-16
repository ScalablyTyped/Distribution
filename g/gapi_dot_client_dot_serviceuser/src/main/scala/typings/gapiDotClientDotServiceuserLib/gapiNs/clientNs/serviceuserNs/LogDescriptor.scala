package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LogDescriptor extends js.Object {
  /**
               * A human-readable description of this log. This information appears in
               * the documentation and can contain details.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The human-readable name for this log. This information appears on
               * the user interface and should be concise.
               */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The set of labels that are available to describe a specific log entry.
               * Runtime requests that contain labels not specified here are
               * considered invalid.
               */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  /**
               * The name of the log. It must be less than 512 characters long and can
               * include the following characters: upper- and lower-case alphanumeric
               * characters [A-Za-z0-9], and punctuation characters including
               * slash, underscore, hyphen, period [/_-.].
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

