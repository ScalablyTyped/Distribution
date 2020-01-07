package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Variables Response.
  */
@js.native
trait Schema$ListVariablesResponse extends js.Object {
  /**
    * All GTM Variables of a GTM Container.
    */
  var variables: js.UndefOr[js.Array[Schema$Variable]] = js.native
}

object Schema$ListVariablesResponse {
  @scala.inline
  def apply(variables: js.Array[Schema$Variable] = null): Schema$ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVariablesResponse]
  }
}

