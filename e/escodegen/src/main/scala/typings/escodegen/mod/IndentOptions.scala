package typings.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentOptions extends js.Object {
  
  /**
    * Adjust the indentation of multiline comments to keep asterisks vertically aligned. Default is false.
    */
  var adjustMultilineComment: js.UndefOr[Boolean] = js.native
  
  /**
    * Base indent level. Default is 0.
    */
  var base: js.UndefOr[Double] = js.native
  
  /**
    * Indent string. Default is 4 spaces ('    ').
    */
  var style: js.UndefOr[String] = js.native
}
object IndentOptions {
  
  @scala.inline
  def apply(): IndentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndentOptions]
  }
  
  @scala.inline
  implicit class IndentOptionsOps[Self <: IndentOptions] (val x: Self) extends AnyVal {
    
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
    def setAdjustMultilineComment(value: Boolean): Self = this.set("adjustMultilineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustMultilineComment: Self = this.set("adjustMultilineComment", js.undefined)
    
    @scala.inline
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
