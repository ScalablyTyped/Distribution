package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular package that is distributed over various
  * channels. E.g., glibc (aka libc6) is distributed by many, at various
  * versions.
  */
@js.native
trait Schema$Package extends js.Object {
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[Schema$Distribution]] = js.native
  /**
    * Required. Immutable. The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Package {
  @scala.inline
  def apply(distribution: js.Array[Schema$Distribution] = null, name: String = null): Schema$Package = {
    val __obj = js.Dynamic.literal()
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Package]
  }
}

