package typings.elasticMaki.anon

import typings.elasticMaki.mod.SpriteSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends js.Object {
  
  var `1`: SpriteSheet = js.native
  
  var `2`: SpriteSheet = js.native
  
  var `4`: SpriteSheet = js.native
}
object `1` {
  
  @scala.inline
  def apply(`1`: SpriteSheet, `2`: SpriteSheet, `4`: SpriteSheet): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    
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
    def set1(value: SpriteSheet): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: SpriteSheet): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: SpriteSheet): Self = this.set("4", value.asInstanceOf[js.Any])
  }
}
