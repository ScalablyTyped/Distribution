package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get a post by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBody): gapiDotClientLib.gapiNs.clientNs.Request[Post]
  /** Retrieve a Post by Path. */
  def getByPath(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyMaxCommentsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Post]
  /** Add a post. */
  def insert(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImages): gapiDotClientLib.gapiNs.clientNs.Request[Post]
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodiesFetchImages): gapiDotClientLib.gapiNs.clientNs.Request[PostList]
  /** Update a post. This method supports patch semantics. */
  def patch(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImagesFields): gapiDotClientLib.gapiNs.clientNs.Request[Post]
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Post]
  /** Revert a published or scheduled post to draft state. */
  def revert(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostId): gapiDotClientLib.gapiNs.clientNs.Request[Post]
  /** Search for a post. */
  def search(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodiesFields): gapiDotClientLib.gapiNs.clientNs.Request[PostList]
  /** Update a post. */
  def update(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImagesFields): gapiDotClientLib.gapiNs.clientNs.Request[Post]
}

object PostsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBody => gapiDotClientLib.gapiNs.clientNs.Request[Post],
    getByPath: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyMaxCommentsOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Post],
    insert: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImages => gapiDotClientLib.gapiNs.clientNs.Request[Post],
    list: gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodiesFetchImages => gapiDotClientLib.gapiNs.clientNs.Request[PostList],
    patch: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImagesFields => gapiDotClientLib.gapiNs.clientNs.Request[Post],
    publish: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Post],
    revert: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostId => gapiDotClientLib.gapiNs.clientNs.Request[Post],
    search: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodiesFields => gapiDotClientLib.gapiNs.clientNs.Request[PostList],
    update: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImagesFields => gapiDotClientLib.gapiNs.clientNs.Request[Post]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getByPath = js.Any.fromFunction1(getByPath), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PostsResource]
  }
}

