package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of functions. No duplicates are permitted.
  */
@js.native
trait Schema$GoogleAppsScriptTypeFunctionSet extends js.Object {
  /**
    * A list of functions composing the set.
    */
  var values: js.UndefOr[js.Array[Schema$GoogleAppsScriptTypeFunction]] = js.native
}

object Schema$GoogleAppsScriptTypeFunctionSet {
  @scala.inline
  def apply(values: js.Array[Schema$GoogleAppsScriptTypeFunction] = null): Schema$GoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleAppsScriptTypeFunctionSet]
  }
}

