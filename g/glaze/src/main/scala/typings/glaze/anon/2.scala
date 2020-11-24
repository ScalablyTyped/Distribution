package typings.glaze.anon

import typings.glaze.glazeNumbers.`4`
import typings.glaze.glazeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  val `1`: typings.glaze.glazeNumbers.`1` = js.native
  
  val `2`: typings.glaze.glazeNumbers.`2` = js.native
  
  val `4`: typings.glaze.glazeNumbers.`4` = js.native
  
  val `8`: typings.glaze.glazeNumbers.`8` = js.native
}
object `2` {
  
  @scala.inline
  def apply(`1`: typings.glaze.glazeNumbers.`1`, `2`: typings.glaze.glazeNumbers.`2`, `4`: `4`, `8`: `8`): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def set1(value: typings.glaze.glazeNumbers.`1`): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: typings.glaze.glazeNumbers.`2`): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: `4`): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set8(value: `8`): Self = this.set("8", value.asInstanceOf[js.Any])
  }
}
