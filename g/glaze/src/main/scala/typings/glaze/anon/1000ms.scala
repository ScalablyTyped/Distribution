package typings.glaze.anon

import typings.glaze.glazeStrings.Dot15s
import typings.glaze.glazeStrings.Dot1s
import typings.glaze.glazeStrings.Dot2s
import typings.glaze.glazeStrings.Dot3s
import typings.glaze.glazeStrings.Dot5s
import typings.glaze.glazeStrings.Dot7s
import typings.glaze.glazeStrings.`1s`
import typings.glaze.glazeStrings.`75ms`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1000ms` extends js.Object {
  
  val `1000ms`: `1s` = js.native
  
  val `100ms`: Dot1s = js.native
  
  val `150ms`: Dot15s = js.native
  
  val `200ms`: Dot2s = js.native
  
  val `300ms`: Dot3s = js.native
  
  val `500ms`: Dot5s = js.native
  
  val `700ms`: Dot7s = js.native
  
  val `75ms`: typings.glaze.glazeStrings.`75ms` = js.native
}
object `1000ms` {
  
  @scala.inline
  def apply(
    `1000ms`: `1s`,
    `100ms`: Dot1s,
    `150ms`: Dot15s,
    `200ms`: Dot2s,
    `300ms`: Dot3s,
    `500ms`: Dot5s,
    `700ms`: Dot7s,
    `75ms`: `75ms`
  ): `1000ms` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1000ms")(`1000ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("100ms")(`100ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("150ms")(`150ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("200ms")(`200ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("300ms")(`300ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("500ms")(`500ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("700ms")(`700ms`.asInstanceOf[js.Any])
    __obj.updateDynamic("75ms")(`75ms`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1000ms`]
  }
  
  @scala.inline
  implicit class `1000msOps`[Self <: `1000ms`] (val x: Self) extends AnyVal {
    
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
    def set1000ms(value: `1s`): Self = this.set("1000ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set100ms(value: Dot1s): Self = this.set("100ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set150ms(value: Dot15s): Self = this.set("150ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set200ms(value: Dot2s): Self = this.set("200ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set300ms(value: Dot3s): Self = this.set("300ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set500ms(value: Dot5s): Self = this.set("500ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set700ms(value: Dot7s): Self = this.set("700ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set75ms(value: `75ms`): Self = this.set("75ms", value.asInstanceOf[js.Any])
  }
}
