package typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadMod

import typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadStrings.full
import typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadStrings.noAcl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters extends js.Object {
  var contentEncoding: js.UndefOr[String] = js.undefined
  var ifGenerationMatch: js.UndefOr[Double] = js.undefined
  var ifGenerationNotMatch: js.UndefOr[Double] = js.undefined
  var ifMetagenerationMatch: js.UndefOr[Double] = js.undefined
  var ifMetagenerationNotMatch: js.UndefOr[Double] = js.undefined
  var kmsKeyName: js.UndefOr[String] = js.undefined
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.undefined
  var projection: js.UndefOr[full | noAcl] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object QueryParameters {
  @scala.inline
  def apply(
    contentEncoding: String = null,
    ifGenerationMatch: Int | Double = null,
    ifGenerationNotMatch: Int | Double = null,
    ifMetagenerationMatch: Int | Double = null,
    ifMetagenerationNotMatch: Int | Double = null,
    kmsKeyName: String = null,
    predefinedAcl: PredefinedAcl = null,
    projection: full | noAcl = null,
    userProject: String = null
  ): QueryParameters = {
    val __obj = js.Dynamic.literal()
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    if (ifGenerationNotMatch != null) __obj.updateDynamic("ifGenerationNotMatch")(ifGenerationNotMatch.asInstanceOf[js.Any])
    if (ifMetagenerationMatch != null) __obj.updateDynamic("ifMetagenerationMatch")(ifMetagenerationMatch.asInstanceOf[js.Any])
    if (ifMetagenerationNotMatch != null) __obj.updateDynamic("ifMetagenerationNotMatch")(ifMetagenerationNotMatch.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[QueryParameters]
  }
}

