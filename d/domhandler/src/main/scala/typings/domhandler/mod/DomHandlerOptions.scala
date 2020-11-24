package typings.domhandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomHandlerOptions extends js.Object {
  
  /***
    * Indicates whether the whitespace in text nodes should be normalized
    * (= all whitespace should be replaced with single spaces). The default value is "false".
    */
  var normalizeWhitespace: js.UndefOr[Boolean] = js.native
  
  /***
    * Adds DOM level 1 properties to all elements.
    */
  var withDomLvl1: js.UndefOr[Boolean] = js.native
  
  /***
    * Indicates whether a endIndex property will be added to nodes.
    * When the parser is used in a non-streaming fashion, endIndex is an integer
    * indicating the position of the end of the node in the document.
    * The default value is "false".
    */
  var withEndIndices: js.UndefOr[Boolean] = js.native
  
  /***
    * Indicates whether a startIndex property will be added to nodes.
    * When the parser is used in a non-streaming fashion, startIndex is an integer
    * indicating the position of the start of the node in the document.
    * The default value is "false".
    */
  var withStartIndices: js.UndefOr[Boolean] = js.native
}
object DomHandlerOptions {
  
  @scala.inline
  def apply(): DomHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomHandlerOptions]
  }
  
  @scala.inline
  implicit class DomHandlerOptionsOps[Self <: DomHandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setNormalizeWhitespace(value: Boolean): Self = this.set("normalizeWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeWhitespace: Self = this.set("normalizeWhitespace", js.undefined)
    
    @scala.inline
    def setWithDomLvl1(value: Boolean): Self = this.set("withDomLvl1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithDomLvl1: Self = this.set("withDomLvl1", js.undefined)
    
    @scala.inline
    def setWithEndIndices(value: Boolean): Self = this.set("withEndIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithEndIndices: Self = this.set("withEndIndices", js.undefined)
    
    @scala.inline
    def setWithStartIndices(value: Boolean): Self = this.set("withStartIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithStartIndices: Self = this.set("withStartIndices", js.undefined)
  }
}
