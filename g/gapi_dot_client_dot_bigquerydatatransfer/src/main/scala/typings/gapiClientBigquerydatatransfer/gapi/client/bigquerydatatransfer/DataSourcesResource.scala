package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquerydatatransfer.anon.Accesstoken
import typings.gapiClientBigquerydatatransfer.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcesResource extends js.Object {
  /**
    * Returns true if valid credentials exist for the given data source and
    * requesting user.
    * Some data sources doesn't support service account, so we need to talk to
    * them on behalf of the end user. This API just checks whether we have OAuth
    * token for the particular user, which is a pre-requisite before user can
    * create a transfer config.
    */
  def checkValidCreds(request: Accesstoken): Request[CheckValidCredsResponse]
  /**
    * Retrieves a supported data source and returns its settings,
    * which can be used for UI rendering.
    */
  def get(request: Accesstoken): Request[DataSource]
  /**
    * Lists supported data sources and returns their settings,
    * which can be used for UI rendering.
    */
  def list(request: Alt): Request[ListDataSourcesResponse]
}

object DataSourcesResource {
  @scala.inline
  def apply(
    checkValidCreds: Accesstoken => Request[CheckValidCredsResponse],
    get: Accesstoken => Request[DataSource],
    list: Alt => Request[ListDataSourcesResponse]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal(checkValidCreds = js.Any.fromFunction1(checkValidCreds), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DataSourcesResource]
  }
}

