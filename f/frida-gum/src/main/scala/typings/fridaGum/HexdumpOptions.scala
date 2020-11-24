package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexdumpOptions extends js.Object {
  
  /**
    * Whether ANSI colors should be used. Defaults to false.
    */
  var ansi: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether a header should be included. Defaults to true.
    */
  var header: js.UndefOr[Boolean] = js.native
  
  /**
    * Limits how many bytes to dump.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * Specifies byte offset of where to start dumping. Defaults to 0.
    */
  var offset: js.UndefOr[Double] = js.native
}
object HexdumpOptions {
  
  @scala.inline
  def apply(): HexdumpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexdumpOptions]
  }
  
  @scala.inline
  implicit class HexdumpOptionsOps[Self <: HexdumpOptions] (val x: Self) extends AnyVal {
    
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
    def setAnsi(value: Boolean): Self = this.set("ansi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnsi: Self = this.set("ansi", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
