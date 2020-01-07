package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a tag that fires after another tag in order to tear down
  * dependencies.
  */
@js.native
trait Schema$TeardownTag extends js.Object {
  /**
    * If true, fire the teardown tag if and only if the main tag fires
    * successfully. If false, fire the teardown tag regardless of main tag
    * firing status.
    */
  var stopTeardownOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * The name of the teardown tag.
    */
  var tagName: js.UndefOr[String] = js.native
}

object Schema$TeardownTag {
  @scala.inline
  def apply(stopTeardownOnFailure: js.UndefOr[Boolean] = js.undefined, tagName: String = null): Schema$TeardownTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopTeardownOnFailure)) __obj.updateDynamic("stopTeardownOnFailure")(stopTeardownOnFailure.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TeardownTag]
  }
}

