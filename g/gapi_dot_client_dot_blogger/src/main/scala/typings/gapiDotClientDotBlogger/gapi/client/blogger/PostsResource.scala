package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdEndDateFetchBodiesFetchImages
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFetchBodiesFields
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFetchBody
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFetchBodyFetchImages
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFetchBodyFetchImagesFields
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKeyMaxCommentsOauthtoken
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKeyOauthtokenPostId
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: Anon_AltBlogIdFieldsKeyOauthtokenPostId): Request[Unit]
  /** Get a post by ID. */
  def get(request: Anon_AltBlogIdFetchBody): Request[Post]
  /** Retrieve a Post by Path. */
  def getByPath(request: Anon_AltBlogIdFieldsKeyMaxCommentsOauthtoken): Request[Post]
  /** Add a post. */
  def insert(request: Anon_AltBlogIdFetchBodyFetchImages): Request[Post]
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: Anon_AltBlogIdEndDateFetchBodiesFetchImages): Request[PostList]
  /** Update a post. This method supports patch semantics. */
  def patch(request: Anon_AltBlogIdFetchBodyFetchImagesFields): Request[Post]
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint): Request[Post]
  /** Revert a published or scheduled post to draft state. */
  def revert(request: Anon_AltBlogIdFieldsKeyOauthtokenPostId): Request[Post]
  /** Search for a post. */
  def search(request: Anon_AltBlogIdFetchBodiesFields): Request[PostList]
  /** Update a post. */
  def update(request: Anon_AltBlogIdFetchBodyFetchImagesFields): Request[Post]
}

object PostsResource {
  @scala.inline
  def apply(
    delete: Anon_AltBlogIdFieldsKeyOauthtokenPostId => Request[Unit],
    get: Anon_AltBlogIdFetchBody => Request[Post],
    getByPath: Anon_AltBlogIdFieldsKeyMaxCommentsOauthtoken => Request[Post],
    insert: Anon_AltBlogIdFetchBodyFetchImages => Request[Post],
    list: Anon_AltBlogIdEndDateFetchBodiesFetchImages => Request[PostList],
    patch: Anon_AltBlogIdFetchBodyFetchImagesFields => Request[Post],
    publish: Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint => Request[Post],
    revert: Anon_AltBlogIdFieldsKeyOauthtokenPostId => Request[Post],
    search: Anon_AltBlogIdFetchBodiesFields => Request[PostList],
    update: Anon_AltBlogIdFetchBodyFetchImagesFields => Request[Post]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getByPath = js.Any.fromFunction1(getByPath), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PostsResource]
  }
}

