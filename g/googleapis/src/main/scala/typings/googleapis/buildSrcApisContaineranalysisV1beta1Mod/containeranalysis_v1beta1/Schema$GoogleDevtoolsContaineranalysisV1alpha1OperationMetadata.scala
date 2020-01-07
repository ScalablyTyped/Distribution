package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for all operations used and required for all operations that
  * created by Container Analysis Providers
  */
@js.native
trait Schema$GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata extends js.Object {
  /**
    * Output only. The time this operation was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time that this operation was marked completed or failed.
    */
  var endTime: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata {
  @scala.inline
  def apply(createTime: String = null, endTime: String = null): Schema$GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata]
  }
}

