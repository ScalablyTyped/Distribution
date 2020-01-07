package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of occurrences created for a specific severity.
  */
@js.native
trait Schema$SeverityCount extends js.Object {
  /**
    * The number of occurrences with the severity.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The severity of the occurrences.
    */
  var severity: js.UndefOr[String] = js.native
}

object Schema$SeverityCount {
  @scala.inline
  def apply(count: String = null, severity: String = null): Schema$SeverityCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SeverityCount]
  }
}

