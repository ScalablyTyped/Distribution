package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a package occurrence.
  */
@js.native
trait Schema$GrafeasV1beta1PackageDetails extends js.Object {
  /**
    * Required. Where the package was installed.
    */
  var installation: js.UndefOr[Schema$Installation] = js.native
}

object Schema$GrafeasV1beta1PackageDetails {
  @scala.inline
  def apply(installation: Schema$Installation = null): Schema$GrafeasV1beta1PackageDetails = {
    val __obj = js.Dynamic.literal()
    if (installation != null) __obj.updateDynamic("installation")(installation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GrafeasV1beta1PackageDetails]
  }
}

