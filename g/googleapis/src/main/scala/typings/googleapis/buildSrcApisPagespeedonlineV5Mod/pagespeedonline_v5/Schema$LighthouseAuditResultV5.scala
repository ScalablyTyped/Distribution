package typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LighthouseAuditResultV5 extends js.Object {
  /**
    * The description of the audit.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Freeform details section of the audit.
    */
  var details: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The value that should be displayed on the UI for this audit.
    */
  var displayValue: js.UndefOr[String] = js.native
  /**
    * An error message from a thrown error inside the audit.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * An explanation of the errors in the audit.
    */
  var explanation: js.UndefOr[String] = js.native
  /**
    * The audit&#39;s id.
    */
  var id: js.UndefOr[String] = js.native
  var score: js.UndefOr[js.Any] = js.native
  /**
    * The enumerated score display mode.
    */
  var scoreDisplayMode: js.UndefOr[String] = js.native
  /**
    * The human readable title.
    */
  var title: js.UndefOr[String] = js.native
  var warnings: js.UndefOr[js.Any] = js.native
}

object Schema$LighthouseAuditResultV5 {
  @scala.inline
  def apply(
    description: String = null,
    details: StringDictionary[js.Any] = null,
    displayValue: String = null,
    errorMessage: String = null,
    explanation: String = null,
    id: String = null,
    score: js.Any = null,
    scoreDisplayMode: String = null,
    title: String = null,
    warnings: js.Any = null
  ): Schema$LighthouseAuditResultV5 = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (scoreDisplayMode != null) __obj.updateDynamic("scoreDisplayMode")(scoreDisplayMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LighthouseAuditResultV5]
  }
}

