package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Source Repositories configuration of a project.
  */
@js.native
trait Schema$ProjectConfig extends js.Object {
  /**
    * Reject a Git push that contains a private key.
    */
  var enablePrivateKeyCheck: js.UndefOr[Boolean] = js.native
  /**
    * The name of the project. Values are of the form
    * `projects/&lt;project&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * How this project publishes a change in the repositories through Cloud
    * Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[Schema$PubsubConfig]] = js.native
}

object Schema$ProjectConfig {
  @scala.inline
  def apply(
    enablePrivateKeyCheck: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pubsubConfigs: StringDictionary[Schema$PubsubConfig] = null
  ): Schema$ProjectConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePrivateKeyCheck)) __obj.updateDynamic("enablePrivateKeyCheck")(enablePrivateKeyCheck.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pubsubConfigs != null) __obj.updateDynamic("pubsubConfigs")(pubsubConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectConfig]
  }
}

