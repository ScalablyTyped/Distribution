package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy): Request_[Operation]
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy): Request_[TargetHttpProxy]
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpProxyList]
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy): Request_[Operation]
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy => Request_[TargetHttpProxy],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[TargetHttpProxyList],
    setUrlMap: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy => Request_[Operation]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setUrlMap = js.Any.fromFunction1(setUrlMap))
  
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
}

