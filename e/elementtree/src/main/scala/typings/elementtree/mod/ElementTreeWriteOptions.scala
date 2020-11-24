package typings.elementtree.mod

import typings.elementtree.elementtreeStrings.text
import typings.elementtree.elementtreeStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementTreeWriteOptions extends js.Object {
  
  var default_namespace: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
   // default is 'utf-8'
  var indent: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[xml | text] = js.native
  
   // default is 'xml'
  var xml_declaration: js.UndefOr[Boolean] = js.native
}
object ElementTreeWriteOptions {
  
  @scala.inline
  def apply(): ElementTreeWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementTreeWriteOptions]
  }
  
  @scala.inline
  implicit class ElementTreeWriteOptionsOps[Self <: ElementTreeWriteOptions] (val x: Self) extends AnyVal {
    
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
    def setDefault_namespace(value: String): Self = this.set("default_namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_namespace: Self = this.set("default_namespace", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMethod(value: xml | text): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setXml_declaration(value: Boolean): Self = this.set("xml_declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXml_declaration: Self = this.set("xml_declaration", js.undefined)
  }
}
