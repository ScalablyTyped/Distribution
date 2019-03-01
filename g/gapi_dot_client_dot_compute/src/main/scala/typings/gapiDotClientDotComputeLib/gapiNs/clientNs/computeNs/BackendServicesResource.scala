package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceAggregatedList]
  /** Deletes the specified BackendService resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltBackendService): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFields): gapiDotClientLib.gapiNs.clientNs.Request[BackendService]
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: gapiDotClientDotComputeLib.Anon_AltBackendServiceFields): gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceGroupHealth]
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceList]
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltBackendService): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: gapiDotClientDotComputeLib.Anon_AltBackendService): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendService, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendService]
    ],
    getHealth: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendServiceFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceGroupHealth]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BackendServiceList]
    ],
    patch: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendService, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltBackendService, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(aggregatedList)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getHealth")(getHealth)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[BackendServicesResource]
  }
}

