package typings.gapiDotClientDotToolresults.gapi.client.toolresults

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
  var defaultBucket: js.UndefOr[String] = js.undefined
  /**
    * The name of the project's settings.
    *
    * Always of the form: projects/{project-id}/settings
    *
    * In update request: never set In response: always set
    */
  var name: js.UndefOr[String] = js.undefined
}

object ProjectSettings {
  @scala.inline
  def apply(defaultBucket: String = null, name: String = null): ProjectSettings = {
    val __obj = js.Dynamic.literal()
    if (defaultBucket != null) __obj.updateDynamic("defaultBucket")(defaultBucket.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSettings]
  }
}

