package typings.docdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    *  The language indicator for code blocks.
    * @default 'js'
    */
  var lang: js.UndefOr[String] = js.native
  
  /**
    * the input file pat
    */
  var path: String = js.native
  
  /**
    * Specify whether entries are sorted.
    * @default true
    */
  var sort: js.UndefOr[Boolean] = js.native
  
  /**
    * The hash style for links ('default' or 'github').
    * @default 'default'
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * The documentation title.
    * @default '<%= basename(options.path) %> API documentation'
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The table of contents organization style ('categories' or 'properties').
    * @default 'properties'
    */
  var toc: js.UndefOr[String] = js.native
  
  /**
    * The source URL.
    */
  var url: String = js.native
}
object Options {
  
  @scala.inline
  def apply(path: String, url: String): Options = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToc(value: String): Self = this.set("toc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToc: Self = this.set("toc", js.undefined)
  }
}
