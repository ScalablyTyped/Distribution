package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified autoscaler. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Autoscaler]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[RegionAutoscalerList]
    ],
    patch: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
}

