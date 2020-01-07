package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Issues include warnings, errors, and deprecation notices.
  */
@js.native
trait Schema$Issue extends js.Object {
  /**
    * Short error description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Position of the issue in the `Source`.
    */
  var sourcePosition: js.UndefOr[Schema$SourcePosition] = js.native
}

object Schema$Issue {
  @scala.inline
  def apply(description: String = null, severity: String = null, sourcePosition: Schema$SourcePosition = null): Schema$Issue = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (sourcePosition != null) __obj.updateDynamic("sourcePosition")(sourcePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Issue]
  }
}

