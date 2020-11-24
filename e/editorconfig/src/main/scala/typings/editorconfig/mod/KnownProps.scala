package typings.editorconfig.mod

import typings.editorconfig.editorconfigBooleans.`false`
import typings.editorconfig.editorconfigBooleans.`true`
import typings.editorconfig.editorconfigStrings.crlf
import typings.editorconfig.editorconfigStrings.lf
import typings.editorconfig.editorconfigStrings.space
import typings.editorconfig.editorconfigStrings.tab
import typings.editorconfig.editorconfigStrings.unset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnownProps extends js.Object {
  
  var charset: js.UndefOr[String | unset] = js.native
  
  var end_of_line: js.UndefOr[lf | crlf | unset] = js.native
  
  var indent_size: js.UndefOr[Double | tab | unset] = js.native
  
  var indent_style: js.UndefOr[tab | space | unset] = js.native
  
  var insert_final_newline: js.UndefOr[`true` | `false` | unset] = js.native
  
  var tab_width: js.UndefOr[Double | unset] = js.native
  
  var trim_trailing_whitespace: js.UndefOr[`true` | `false` | unset] = js.native
}
object KnownProps {
  
  @scala.inline
  def apply(): KnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownProps]
  }
  
  @scala.inline
  implicit class KnownPropsOps[Self <: KnownProps] (val x: Self) extends AnyVal {
    
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
    def setCharset(value: String | unset): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setEnd_of_line(value: lf | crlf | unset): Self = this.set("end_of_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_of_line: Self = this.set("end_of_line", js.undefined)
    
    @scala.inline
    def setIndent_size(value: Double | tab | unset): Self = this.set("indent_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_size: Self = this.set("indent_size", js.undefined)
    
    @scala.inline
    def setIndent_style(value: tab | space | unset): Self = this.set("indent_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent_style: Self = this.set("indent_style", js.undefined)
    
    @scala.inline
    def setInsert_final_newline(value: `true` | `false` | unset): Self = this.set("insert_final_newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert_final_newline: Self = this.set("insert_final_newline", js.undefined)
    
    @scala.inline
    def setTab_width(value: Double | unset): Self = this.set("tab_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab_width: Self = this.set("tab_width", js.undefined)
    
    @scala.inline
    def setTrim_trailing_whitespace(value: `true` | `false` | unset): Self = this.set("trim_trailing_whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim_trailing_whitespace: Self = this.set("trim_trailing_whitespace", js.undefined)
  }
}
