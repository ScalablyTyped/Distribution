package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonFetchBody
import typings.gapiClientBlogger.AnonFetchImages
import typings.gapiClientBlogger.AnonOrderBy
import typings.gapiClientBlogger.AnonPath
import typings.gapiClientBlogger.AnonPostId
import typings.gapiClientBlogger.AnonPublishDate
import typings.gapiClientBlogger.AnonQ
import typings.gapiClientBlogger.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: AnonPostId): Request_[Unit]
  /** Get a post by ID. */
  def get(request: AnonFetchBody): Request_[Post]
  /** Retrieve a Post by Path. */
  def getByPath(request: AnonPath): Request_[Post]
  /** Add a post. */
  def insert(request: AnonFetchImages): Request_[Post]
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: AnonOrderBy): Request_[PostList]
  /** Update a post. This method supports patch semantics. */
  def patch(request: AnonQuotaUser): Request_[Post]
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: AnonPublishDate): Request_[Post]
  /** Revert a published or scheduled post to draft state. */
  def revert(request: AnonPostId): Request_[Post]
  /** Search for a post. */
  def search(request: AnonQ): Request_[PostList]
  /** Update a post. */
  def update(request: AnonQuotaUser): Request_[Post]
}

object PostsResource {
  @scala.inline
  def apply(
    delete: AnonPostId => Request_[Unit],
    get: AnonFetchBody => Request_[Post],
    getByPath: AnonPath => Request_[Post],
    insert: AnonFetchImages => Request_[Post],
    list: AnonOrderBy => Request_[PostList],
    patch: AnonQuotaUser => Request_[Post],
    publish: AnonPublishDate => Request_[Post],
    revert: AnonPostId => Request_[Post],
    search: AnonQ => Request_[PostList],
    update: AnonQuotaUser => Request_[Post]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getByPath = js.Any.fromFunction1(getByPath), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PostsResource]
  }
}

