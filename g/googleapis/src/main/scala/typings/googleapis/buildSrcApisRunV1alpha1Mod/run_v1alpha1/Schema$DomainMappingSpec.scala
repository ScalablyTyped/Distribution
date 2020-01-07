package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired state of the Domain Mapping.
  */
@js.native
trait Schema$DomainMappingSpec extends js.Object {
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[String] = js.native
  /**
    * If set, the mapping will override any mapping set before this spec was
    * set. It is recommended that the user leaves this empty to receive an
    * error warning about a potential conflict and only set it once the
    * respective UI has given such a warning.
    */
  var forceOverride: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Knative Route that this DomainMapping applies to. The
    * route must exist.
    */
  var routeName: js.UndefOr[String] = js.native
}

object Schema$DomainMappingSpec {
  @scala.inline
  def apply(
    certificateMode: String = null,
    forceOverride: js.UndefOr[Boolean] = js.undefined,
    routeName: String = null
  ): Schema$DomainMappingSpec = {
    val __obj = js.Dynamic.literal()
    if (certificateMode != null) __obj.updateDynamic("certificateMode")(certificateMode.asInstanceOf[js.Any])
    if (!js.isUndefined(forceOverride)) __obj.updateDynamic("forceOverride")(forceOverride.asInstanceOf[js.Any])
    if (routeName != null) __obj.updateDynamic("routeName")(routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainMappingSpec]
  }
}

