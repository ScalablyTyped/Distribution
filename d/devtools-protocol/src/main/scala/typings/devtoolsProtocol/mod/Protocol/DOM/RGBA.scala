package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RGBA extends js.Object {
  
  /**
    * The alpha component, in the [0-1] range (default: 1).
    */
  var a: js.UndefOr[Double] = js.native
  
  /**
    * The blue component, in the [0-255] range.
    */
  var b: integer = js.native
  
  /**
    * The green component, in the [0-255] range.
    */
  var g: integer = js.native
  
  /**
    * The red component, in the [0-255] range.
    */
  var r: integer = js.native
}
object RGBA {
  
  @scala.inline
  def apply(b: integer, g: integer, r: integer): RGBA = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
  
  @scala.inline
  implicit class RGBAOps[Self <: RGBA] (val x: Self) extends AnyVal {
    
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
    def setB(value: integer): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: integer): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: integer): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
  }
}
