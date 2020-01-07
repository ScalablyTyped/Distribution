package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents how a particular software package may be installed on a
  * system.
  */
@js.native
trait Schema$Installation extends js.Object {
  /**
    * Required. All of the places within the filesystem versions of this
    * package have been found.
    */
  var location: js.UndefOr[js.Array[Schema$Location]] = js.native
  /**
    * Output only. The name of the installed package.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Installation {
  @scala.inline
  def apply(location: js.Array[Schema$Location] = null, name: String = null): Schema$Installation = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Installation]
  }
}

