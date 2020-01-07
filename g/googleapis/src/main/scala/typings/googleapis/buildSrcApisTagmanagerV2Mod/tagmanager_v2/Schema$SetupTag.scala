package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a reference to atag that fires before another tag in order to
  * set up dependencies.
  */
@js.native
trait Schema$SetupTag extends js.Object {
  /**
    * If true, fire the main tag if and only if the setup tag fires
    * successfully. If false, fire the main tag regardless of setup tag firing
    * status.
    */
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.native
  /**
    * The name of the setup tag.
    */
  var tagName: js.UndefOr[String] = js.native
}

object Schema$SetupTag {
  @scala.inline
  def apply(stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined, tagName: String = null): Schema$SetupTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopOnSetupFailure)) __obj.updateDynamic("stopOnSetupFailure")(stopOnSetupFailure.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetupTag]
  }
}

