package typings.glaze.anon

import typings.glaze.glazeStrings.Dot025em
import typings.glaze.glazeStrings.Dot05em
import typings.glaze.glazeStrings.Dot1em
import typings.glaze.glazeStrings.`-0Dot025em`
import typings.glaze.glazeStrings.`-0Dot05em`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Normal extends js.Object {
  
  val normal: typings.glaze.glazeNumbers.`0` = js.native
  
  val tight: `-0Dot025em` = js.native
  
  val tighter: `-0Dot05em` = js.native
  
  val wide: Dot025em = js.native
  
  val wider: Dot05em = js.native
  
  val widest: Dot1em = js.native
}
object Normal {
  
  @scala.inline
  def apply(
    normal: typings.glaze.glazeNumbers.`0`,
    tight: `-0Dot025em`,
    tighter: `-0Dot05em`,
    wide: Dot025em,
    wider: Dot05em,
    widest: Dot1em
  ): Normal = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tighter = tighter.asInstanceOf[js.Any], wide = wide.asInstanceOf[js.Any], wider = wider.asInstanceOf[js.Any], widest = widest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normal]
  }
  
  @scala.inline
  implicit class NormalOps[Self <: Normal] (val x: Self) extends AnyVal {
    
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
    def setNormal(value: typings.glaze.glazeNumbers.`0`): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: `-0Dot025em`): Self = this.set("tight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTighter(value: `-0Dot05em`): Self = this.set("tighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWide(value: Dot025em): Self = this.set("wide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWider(value: Dot05em): Self = this.set("wider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidest(value: Dot1em): Self = this.set("widest", value.asInstanceOf[js.Any])
  }
}
