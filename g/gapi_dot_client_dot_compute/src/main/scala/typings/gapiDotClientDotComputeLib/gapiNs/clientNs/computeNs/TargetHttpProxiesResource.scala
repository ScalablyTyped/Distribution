package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpProxy]
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpProxyList]
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpProxy]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpProxyList]
    ],
    setUrlMap: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, setUrlMap = setUrlMap)
  
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
}

