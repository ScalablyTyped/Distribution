package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publish container version response.
  */
@js.native
trait Schema$PublishContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[Schema$ContainerVersion] = js.native
}

object Schema$PublishContainerVersionResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: Schema$ContainerVersion = null
  ): Schema$PublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishContainerVersionResponse]
  }
}

