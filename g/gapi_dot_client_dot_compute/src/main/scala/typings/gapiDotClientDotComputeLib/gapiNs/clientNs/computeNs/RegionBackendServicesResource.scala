package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified regional BackendService resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[BackendService]
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceGroupHealth]
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceList]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendService]
    ],
    getHealth: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceGroupHealth]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceList]
    ],
    patch: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, getHealth = getHealth, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
}

