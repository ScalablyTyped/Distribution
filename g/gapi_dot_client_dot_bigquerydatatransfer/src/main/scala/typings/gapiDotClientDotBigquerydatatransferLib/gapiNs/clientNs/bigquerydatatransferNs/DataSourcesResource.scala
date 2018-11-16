package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

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
  def checkValidCreds(request: gapiDotClientDotBigquerydatatransferLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[CheckValidCredsResponse]
  /**
               * Retrieves a supported data source and returns its settings,
               * which can be used for UI rendering.
               */
  def get(request: gapiDotClientDotBigquerydatatransferLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[DataSource]
  /**
               * Lists supported data sources and returns their settings,
               * which can be used for UI rendering.
               */
  def list(request: gapiDotClientDotBigquerydatatransferLib.Anon_ParentAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListDataSourcesResponse]
}

