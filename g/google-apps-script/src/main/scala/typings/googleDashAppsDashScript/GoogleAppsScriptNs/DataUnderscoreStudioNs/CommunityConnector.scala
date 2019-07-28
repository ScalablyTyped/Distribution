package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommunityConnector extends js.Object {
  var AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any
  var AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any
  var BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any
  var FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any
  def getConfig(): Config
  def getFields(): Fields
  def newAuthTypeResponse(): GetAuthTypeResponse
  def newBigQueryConfig(): BigQueryConfig
  def newDebugError(): DebugError
  def newUserError(): UserError
}

object CommunityConnector {
  @scala.inline
  def apply(
    AggregationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AggregationType */ js.Any,
    AuthType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AuthType */ js.Any,
    BigQueryParameterType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BigQueryParameterType */ js.Any,
    FieldType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldType */ js.Any,
    getConfig: () => Config,
    getFields: () => Fields,
    newAuthTypeResponse: () => GetAuthTypeResponse,
    newBigQueryConfig: () => BigQueryConfig,
    newDebugError: () => DebugError,
    newUserError: () => UserError
  ): CommunityConnector = {
    val __obj = js.Dynamic.literal(AggregationType = AggregationType, AuthType = AuthType, BigQueryParameterType = BigQueryParameterType, FieldType = FieldType, getConfig = js.Any.fromFunction0(getConfig), getFields = js.Any.fromFunction0(getFields), newAuthTypeResponse = js.Any.fromFunction0(newAuthTypeResponse), newBigQueryConfig = js.Any.fromFunction0(newBigQueryConfig), newDebugError = js.Any.fromFunction0(newDebugError), newUserError = js.Any.fromFunction0(newUserError))
  
    __obj.asInstanceOf[CommunityConnector]
  }
}

