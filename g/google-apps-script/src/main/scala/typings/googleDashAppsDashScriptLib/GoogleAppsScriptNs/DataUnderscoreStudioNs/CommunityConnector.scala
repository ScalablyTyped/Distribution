package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommunityConnector extends js.Object {
  var AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any
  var AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any
  var FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any
  def getConfig(): Config
  def getFields(): Fields
  def newAuthTypeResponse(): GetAuthTypeResponse
  def newDebugError(): DebugError
  def newUserError(): UserError
}

object CommunityConnector {
  @scala.inline
  def apply(
    AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any,
    AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any,
    FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any,
    getConfig: js.Function0[Config],
    getFields: js.Function0[Fields],
    newAuthTypeResponse: js.Function0[GetAuthTypeResponse],
    newDebugError: js.Function0[DebugError],
    newUserError: js.Function0[UserError]
  ): CommunityConnector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AggregationType")(AggregationType)
    __obj.updateDynamic("AuthType")(AuthType)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("getConfig")(getConfig)
    __obj.updateDynamic("getFields")(getFields)
    __obj.updateDynamic("newAuthTypeResponse")(newAuthTypeResponse)
    __obj.updateDynamic("newDebugError")(newDebugError)
    __obj.updateDynamic("newUserError")(newUserError)
    __obj.asInstanceOf[CommunityConnector]
  }
}

