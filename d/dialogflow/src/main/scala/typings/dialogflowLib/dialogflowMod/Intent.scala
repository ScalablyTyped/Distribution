package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Intent extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var defaultResponsePlatforms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var displayName: java.lang.String
  var events: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var followupIntentInfo: js.UndefOr[js.Array[FollowupIntentInfo]] = js.undefined
  var inputContextNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isFallback: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var mlEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var outputContexts: js.UndefOr[js.Array[Context]] = js.undefined
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFollowupIntentName: java.lang.String
  var priority: js.UndefOr[scala.Double] = js.undefined
  var resetContexts: js.UndefOr[scala.Boolean] = js.undefined
  var rootFollowupIntentName: java.lang.String
  var trainingPhrases: js.UndefOr[js.Array[TrainingPhrase]] = js.undefined
  var webhookState: java.lang.String
}

