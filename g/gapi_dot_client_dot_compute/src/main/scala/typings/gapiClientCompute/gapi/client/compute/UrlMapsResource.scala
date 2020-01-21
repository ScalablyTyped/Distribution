package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapsResource extends js.Object {
  /** Deletes the specified UrlMap resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request_[Operation]
  /** Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap): Request_[UrlMap]
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. */
  def invalidateCache(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request_[Operation]
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(request: AnonAlt): Request_[UrlMapList]
  /**
    * Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request_[Operation]
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap): Request_[Operation]
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap): Request_[UrlMapsValidateResponse]
}

object UrlMapsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap => Request_[UrlMap],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    invalidateCache: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request_[Operation],
    list: AnonAlt => Request_[UrlMapList],
    patch: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request_[Operation],
    update: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdUrlMap => Request_[Operation],
    validate: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUrlMap => Request_[UrlMapsValidateResponse]
  ): UrlMapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), invalidateCache = js.Any.fromFunction1(invalidateCache), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[UrlMapsResource]
  }
}

