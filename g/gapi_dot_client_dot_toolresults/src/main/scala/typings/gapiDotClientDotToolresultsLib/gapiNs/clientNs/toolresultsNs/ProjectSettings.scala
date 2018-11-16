package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProjectSettings extends js.Object {
  /**
               * The name of the Google Cloud Storage bucket to which results are written.
               *
               * By default, this is unset.
               *
               * In update request: optional In response: optional
               */
  var defaultBucket: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The name of the project's settings.
               *
               * Always of the form: projects/{project-id}/settings
               *
               * In update request: never set In response: always set
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

