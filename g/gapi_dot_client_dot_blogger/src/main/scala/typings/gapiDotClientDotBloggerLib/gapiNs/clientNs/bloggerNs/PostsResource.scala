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
    delete: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBody, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ],
    getByPath: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyMaxCommentsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ],
    insert: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImages, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ],
    list: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdEndDateFetchBodiesFetchImages, 
      gapiDotClientLib.gapiNs.clientNs.Request[PostList]
    ],
    patch: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImagesFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ],
    publish: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostIdPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ],
    revert: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPostId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ],
    search: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodiesFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PostList]
    ],
    update: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodyFetchImagesFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Post]
    ]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, getByPath = getByPath, insert = insert, list = list, patch = patch, publish = publish, revert = revert, search = search, update = update)
  
    __obj.asInstanceOf[PostsResource]
  }
}

