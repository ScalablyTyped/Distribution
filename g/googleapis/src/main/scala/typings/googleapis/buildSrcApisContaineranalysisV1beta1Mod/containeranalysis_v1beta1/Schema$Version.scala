package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Version contains structured information about the version of a package.
  */
@js.native
trait Schema$Version extends js.Object {
  /**
    * Used to correct mistakes in the version numbering scheme.
    */
  var epoch: js.UndefOr[Double] = js.native
  /**
    * Required. Distinguishes between sentinel MIN/MAX versions and normal
    * versions.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Required only when version kind is NORMAL. The main part of the version
    * name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The iteration of the package build from the above version.
    */
  var revision: js.UndefOr[String] = js.native
}

object Schema$Version {
  @scala.inline
  def apply(epoch: Int | Double = null, kind: String = null, name: String = null, revision: String = null): Schema$Version = {
    val __obj = js.Dynamic.literal()
    if (epoch != null) __obj.updateDynamic("epoch")(epoch.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Version]
  }
}

