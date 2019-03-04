package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheck): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheckKey): gapiDotClientLib.gapiNs.clientNs.Request[HttpsHealthCheck]
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[HttpsHealthCheckList]
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheck): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheck): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheck, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheckKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[HttpsHealthCheck]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[HttpsHealthCheckList]
    ],
    patch: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheck, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsHttpsHealthCheck, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): HttpsHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[HttpsHealthChecksResource]
  }
}

