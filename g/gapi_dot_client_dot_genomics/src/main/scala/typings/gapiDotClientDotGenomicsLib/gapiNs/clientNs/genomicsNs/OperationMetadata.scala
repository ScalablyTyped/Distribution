package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationMetadata extends js.Object {
  /**
               * This field is deprecated. Use `labels` instead. Optionally provided by the
               * caller when submitting the request that creates the operation.
               */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the job was submitted to the Genomics service. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the job stopped running. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional event messages that were generated during the job's execution.
               * This also contains any warnings that were generated during import
               * or export.
               */
  var events: js.UndefOr[js.Array[OperationEvent]] = js.undefined
  /**
               * Optionally provided by the caller when submitting the request that creates
               * the operation.
               */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The Google Cloud Project in which the job is scoped. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The original request that started the operation. Note that this will be in
               * current version of the API. If the operation was started with v1beta2 API
               * and a GetOperation is performed on v1 API, a v1 request will be returned.
               */
  var request: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** Runtime metadata on this Operation. */
  var runtimeMetadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** The time at which the job began to run. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

