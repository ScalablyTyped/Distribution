package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.FetchBody
import typings.gapiClientBlogger.anon.FetchImages
import typings.gapiClientBlogger.anon.OrderBy
import typings.gapiClientBlogger.anon.Path
import typings.gapiClientBlogger.anon.PostId
import typings.gapiClientBlogger.anon.PublishDate
import typings.gapiClientBlogger.anon.Q
import typings.gapiClientBlogger.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: PostId): Request[Unit]
  /** Get a post by ID. */
  def get(request: FetchBody): Request[Post]
  /** Retrieve a Post by Path. */
  def getByPath(request: Path): Request[Post]
  /** Add a post. */
  def insert(request: FetchImages): Request[Post]
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: OrderBy): Request[PostList]
  /** Update a post. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Post]
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: PublishDate): Request[Post]
  /** Revert a published or scheduled post to draft state. */
  def revert(request: PostId): Request[Post]
  /** Search for a post. */
  def search(request: Q): Request[PostList]
  /** Update a post. */
  def update(request: QuotaUser): Request[Post]
}

object PostsResource {
  @scala.inline
  def apply(
    delete: PostId => Request[Unit],
    get: FetchBody => Request[Post],
    getByPath: Path => Request[Post],
    insert: FetchImages => Request[Post],
    list: OrderBy => Request[PostList],
    patch: QuotaUser => Request[Post],
    publish: PublishDate => Request[Post],
    revert: PostId => Request[Post],
    search: Q => Request[PostList],
    update: QuotaUser => Request[Post]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getByPath = js.Any.fromFunction1(getByPath), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PostsResource]
  }
}

