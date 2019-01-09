package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthChecksResource extends js.Object {
  /** Deletes the specified HealthCheck resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsHealthCheck): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsHealthCheckKey): gapiDotClientLib.gapiNs.clientNs.Request[HealthCheck]
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[HealthCheckList]
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltFieldsHealthCheck): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: gapiDotClientDotComputeLib.Anon_AltFieldsHealthCheck): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

