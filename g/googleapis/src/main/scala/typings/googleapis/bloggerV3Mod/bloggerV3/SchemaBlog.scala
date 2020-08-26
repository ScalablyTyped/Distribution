package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Country
import typings.googleapis.anon.Items
import typings.googleapis.anon.SelfLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlog extends js.Object {
  /**
    * The JSON custom meta-data for the Blog
    */
  var customMetaData: js.UndefOr[String] = js.native
  /**
    * The description of this blog. This is displayed underneath the title.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The identifier for this resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of this entry. Always blogger#blog
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The locale this Blog is set to.
    */
  var locale: js.UndefOr[Country] = js.native
  /**
    * The name of this blog. This is displayed as the title.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The container of pages in this blog.
    */
  var pages: js.UndefOr[SelfLink] = js.native
  /**
    * The container of posts in this blog.
    */
  var posts: js.UndefOr[Items] = js.native
  /**
    * RFC 3339 date-time when this blog was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The status of the blog.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this blog was last updated.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The URL where this blog is published.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaBlog {
  @scala.inline
  def apply(): SchemaBlog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlog]
  }
  @scala.inline
  implicit class SchemaBlogOps[Self <: SchemaBlog] (val x: Self) extends AnyVal {
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
    def setCustomMetaData(value: String): Self = this.set("customMetaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetaData: Self = this.set("customMetaData", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocale(value: Country): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPages(value: SelfLink): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setPosts(value: Items): Self = this.set("posts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosts: Self = this.set("posts", js.undefined)
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

