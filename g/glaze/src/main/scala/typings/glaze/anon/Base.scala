package typings.glaze.anon

import typings.glaze.glazeNumbers.`1.25`
import typings.glaze.glazeNumbers.`1.375`
import typings.glaze.glazeNumbers.`1.5`
import typings.glaze.glazeNumbers.`1.625`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends js.Object {
  
  val `1`: typings.glaze.glazeNumbers.`1` = js.native
  
  val base: `1.5` = js.native
  
  val loose: typings.glaze.glazeNumbers.`2` = js.native
  
  val relaxed: `1.625` = js.native
  
  val snug: `1.375` = js.native
  
  val tight: `1.25` = js.native
}
object Base {
  
  @scala.inline
  def apply(
    `1`: typings.glaze.glazeNumbers.`1`,
    base: `1.5`,
    loose: typings.glaze.glazeNumbers.`2`,
    relaxed: `1.625`,
    snug: `1.375`,
    tight: `1.25`
  ): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], relaxed = relaxed.asInstanceOf[js.Any], snug = snug.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    
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
    def setBase(value: `1.5`): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoose(value: typings.glaze.glazeNumbers.`2`): Self = this.set("loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelaxed(value: `1.625`): Self = this.set("relaxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnug(value: `1.375`): Self = this.set("snug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: `1.25`): Self = this.set("tight", value.asInstanceOf[js.Any])
  }
}
