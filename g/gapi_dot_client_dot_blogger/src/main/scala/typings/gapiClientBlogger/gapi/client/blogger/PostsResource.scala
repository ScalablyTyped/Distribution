package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonAltBlogIdEndDateFetchBodiesFetchImages
import typings.gapiClientBlogger.AnonAltBlogIdFetchBodiesFields
import typings.gapiClientBlogger.AnonAltBlogIdFetchBody
import typings.gapiClientBlogger.AnonAltBlogIdFetchBodyFetchImages
import typings.gapiClientBlogger.AnonAltBlogIdFetchBodyFetchImagesFields
import typings.gapiClientBlogger.AnonAltBlogIdFieldsKeyMaxCommentsOauthtoken
import typings.gapiClientBlogger.AnonAltBlogIdFieldsKeyOauthtokenPostId
import typings.gapiClientBlogger.AnonAltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: AnonAltBlogIdFieldsKeyOauthtokenPostId): Request_[Unit]
  /** Get a post by ID. */
  def get(request: AnonAltBlogIdFetchBody): Request_[Post]
  /** Retrieve a Post by Path. */
  def getByPath(request: AnonAltBlogIdFieldsKeyMaxCommentsOauthtoken): Request_[Post]
  /** Add a post. */
  def insert(request: AnonAltBlogIdFetchBodyFetchImages): Request_[Post]
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: AnonAltBlogIdEndDateFetchBodiesFetchImages): Request_[PostList]
  /** Update a post. This method supports patch semantics. */
  def patch(request: AnonAltBlogIdFetchBodyFetchImagesFields): Request_[Post]
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: AnonAltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint): Request_[Post]
  /** Revert a published or scheduled post to draft state. */
  def revert(request: AnonAltBlogIdFieldsKeyOauthtokenPostId): Request_[Post]
  /** Search for a post. */
  def search(request: AnonAltBlogIdFetchBodiesFields): Request_[PostList]
  /** Update a post. */
  def update(request: AnonAltBlogIdFetchBodyFetchImagesFields): Request_[Post]
}

object PostsResource {
  @scala.inline
  def apply(
    delete: AnonAltBlogIdFieldsKeyOauthtokenPostId => Request_[Unit],
    get: AnonAltBlogIdFetchBody => Request_[Post],
    getByPath: AnonAltBlogIdFieldsKeyMaxCommentsOauthtoken => Request_[Post],
    insert: AnonAltBlogIdFetchBodyFetchImages => Request_[Post],
    list: AnonAltBlogIdEndDateFetchBodiesFetchImages => Request_[PostList],
    patch: AnonAltBlogIdFetchBodyFetchImagesFields => Request_[Post],
    publish: AnonAltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint => Request_[Post],
    revert: AnonAltBlogIdFieldsKeyOauthtokenPostId => Request_[Post],
    search: AnonAltBlogIdFetchBodiesFields => Request_[PostList],
    update: AnonAltBlogIdFetchBodyFetchImagesFields => Request_[Post]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getByPath = js.Any.fromFunction1(getByPath), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PostsResource]
  }
}

