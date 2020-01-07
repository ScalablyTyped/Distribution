package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create container versions response.
  */
@js.native
trait Schema$CreateContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[Schema$ContainerVersion] = js.native
}

object Schema$CreateContainerVersionResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: Schema$ContainerVersion = null
  ): Schema$CreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateContainerVersionResponse]
  }
}

