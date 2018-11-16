package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BackendBucketsResource extends js.Object {
  /** Deletes the specified BackendBucket resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenBackendBucket
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified BackendBucket resource. Get a list of available backend buckets by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenBackendBucketAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[BackendBucket]
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[BackendBucketList]
  /**
               * Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch
               * format and processing rules.
               */
  def patch(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenBackendBucket
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenBackendBucket
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

