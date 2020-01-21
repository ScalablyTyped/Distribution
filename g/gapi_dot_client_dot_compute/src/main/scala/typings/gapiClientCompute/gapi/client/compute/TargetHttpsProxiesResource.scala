package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy): Request_[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy): Request_[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy): Request_[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy): Request_[Operation]
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy => Request_[TargetHttpsProxy],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[TargetHttpsProxyList],
    setSslCertificates: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy => Request_[Operation],
    setUrlMap: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy => Request_[Operation]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setSslCertificates = js.Any.fromFunction1(setSslCertificates), setUrlMap = js.Any.fromFunction1(setUrlMap))
  
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
}

