package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Per resource and severity counts of fixable and total vulnerabilities.
  */
@js.native
trait Schema$FixableTotalByDigest extends js.Object {
  /**
    * The number of fixable vulnerabilities associated with this resource.
    */
  var fixableCount: js.UndefOr[String] = js.native
  /**
    * The affected resource.
    */
  var resource: js.UndefOr[Schema$Resource] = js.native
  /**
    * The severity for this count. SEVERITY_UNSPECIFIED indicates total across
    * all severities.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The total number of vulnerabilities associated with this resource.
    */
  var totalCount: js.UndefOr[String] = js.native
}

object Schema$FixableTotalByDigest {
  @scala.inline
  def apply(
    fixableCount: String = null,
    resource: Schema$Resource = null,
    severity: String = null,
    totalCount: String = null
  ): Schema$FixableTotalByDigest = {
    val __obj = js.Dynamic.literal()
    if (fixableCount != null) __obj.updateDynamic("fixableCount")(fixableCount.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FixableTotalByDigest]
  }
}

