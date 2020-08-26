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

@js.native
trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: PostId): Request[Unit] = js.native
  /** Get a post by ID. */
  def get(request: FetchBody): Request[Post] = js.native
  /** Retrieve a Post by Path. */
  def getByPath(request: Path): Request[Post] = js.native
  /** Add a post. */
  def insert(request: FetchImages): Request[Post] = js.native
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: OrderBy): Request[PostList] = js.native
  /** Update a post. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Post] = js.native
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: PublishDate): Request[Post] = js.native
  /** Revert a published or scheduled post to draft state. */
  def revert(request: PostId): Request[Post] = js.native
  /** Search for a post. */
  def search(request: Q): Request[PostList] = js.native
  /** Update a post. */
  def update(request: QuotaUser): Request[Post] = js.native
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
  @scala.inline
  implicit class PostsResourceOps[Self <: PostsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: PostId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FetchBody => Request[Post]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetByPath(value: Path => Request[Post]): Self = this.set("getByPath", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: FetchImages => Request[Post]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: OrderBy => Request[PostList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: QuotaUser => Request[Post]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setPublish(value: PublishDate => Request[Post]): Self = this.set("publish", js.Any.fromFunction1(value))
    @scala.inline
    def setRevert(value: PostId => Request[Post]): Self = this.set("revert", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Q => Request[PostList]): Self = this.set("search", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: QuotaUser => Request[Post]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

