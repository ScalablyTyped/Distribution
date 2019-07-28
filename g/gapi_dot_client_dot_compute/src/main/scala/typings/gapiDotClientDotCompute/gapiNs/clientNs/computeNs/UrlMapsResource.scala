package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapsResource extends js.Object {
  /** Deletes the specified UrlMap resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request[Operation]
  /** Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap): Request[UrlMap]
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. */
  def invalidateCache(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request[Operation]
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(request: Anon_Alt): Request[UrlMapList]
  /**
    * Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request[Operation]
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request[Operation]
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap): Request[UrlMapsValidateResponse]
}

object UrlMapsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap => Request[UrlMap],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    invalidateCache: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request[Operation],
    list: Anon_Alt => Request[UrlMapList],
    patch: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request[Operation],
    update: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request[Operation],
    validate: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap => Request[UrlMapsValidateResponse]
  ): UrlMapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), invalidateCache = js.Any.fromFunction1(invalidateCache), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[UrlMapsResource]
  }
}

