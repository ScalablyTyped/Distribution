package typings.dialogflow.mod.google.api

import typings.dialogflow.mod.google.api.ResourceDescriptor.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResourceDescriptor. */
trait IResourceDescriptor extends js.Object {
  /** ResourceDescriptor history */
  var history: js.UndefOr[
    History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String) | Null
  ] = js.undefined
  /** ResourceDescriptor nameField */
  var nameField: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor pattern */
  var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ResourceDescriptor plural */
  var plural: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor singular */
  var singular: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object IResourceDescriptor {
  @scala.inline
  def apply(
    history: js.UndefOr[
      Null | History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String)
    ] = js.undefined,
    nameField: js.UndefOr[Null | String] = js.undefined,
    pattern: js.UndefOr[Null | js.Array[String]] = js.undefined,
    plural: js.UndefOr[Null | String] = js.undefined,
    singular: js.UndefOr[Null | String] = js.undefined,
    `type`: js.UndefOr[Null | String] = js.undefined
  ): IResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(nameField)) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    if (!js.isUndefined(pattern)) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(plural)) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (!js.isUndefined(singular)) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceDescriptor]
  }
}

