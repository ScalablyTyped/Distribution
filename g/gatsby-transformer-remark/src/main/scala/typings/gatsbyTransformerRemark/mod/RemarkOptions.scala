package typings.gatsbyTransformerRemark.mod

import typings.gatsbyTransformerRemark.anon.Absolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarkOptions extends js.Object {
  
  /** CommonMark mode (default: true) */
  var commonmark: js.UndefOr[Boolean] = js.native
  
  /**
    * @see https://www.gatsbyjs.com/plugins/gatsby-transformer-remark/#example-excerpts
    */
  var excerpt_separator: js.UndefOr[String] = js.native
  
  /** Footnotes mode (default: true) */
  var footnotes: js.UndefOr[Boolean] = js.native
  
  /** GitHub Flavored Markdown mode (default: true) */
  var gfm: js.UndefOr[Boolean] = js.native
  
  /** Pedantic mode (default: true) */
  var pedantic: js.UndefOr[Boolean] = js.native
  
  /** Plugins configs */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Pass default options to the plugin generating tableOfContents
    * @see https://www.gatsbyjs.com/plugins/gatsby-transformer-remark/#configuring-the-tableofcontents
    */
  var tableOfContents: js.UndefOr[Absolute] = js.native
}
object RemarkOptions {
  
  @scala.inline
  def apply(): RemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarkOptions]
  }
  
  @scala.inline
  implicit class RemarkOptionsOps[Self <: RemarkOptions] (val x: Self) extends AnyVal {
    
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
    def setCommonmark(value: Boolean): Self = this.set("commonmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonmark: Self = this.set("commonmark", js.undefined)
    
    @scala.inline
    def setExcerpt_separator(value: String): Self = this.set("excerpt_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcerpt_separator: Self = this.set("excerpt_separator", js.undefined)
    
    @scala.inline
    def setFootnotes(value: Boolean): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnotes: Self = this.set("footnotes", js.undefined)
    
    @scala.inline
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setTableOfContents(value: Absolute): Self = this.set("tableOfContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOfContents: Self = this.set("tableOfContents", js.undefined)
  }
}
