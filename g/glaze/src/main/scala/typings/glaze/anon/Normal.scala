package typings.glaze.anon

import typings.glaze.glazeStrings.Dot025em
import typings.glaze.glazeStrings.Dot05em
import typings.glaze.glazeStrings.Dot1em
import typings.glaze.glazeStrings.`-0Dot025em`
import typings.glaze.glazeStrings.`-0Dot05em`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Normal extends StObject {
  
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
  implicit class NormalMutableBuilder[Self <: Normal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormal(value: typings.glaze.glazeNumbers.`0`): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: `-0Dot025em`): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTighter(value: `-0Dot05em`): Self = StObject.set(x, "tighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWide(value: Dot025em): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWider(value: Dot05em): Self = StObject.set(x, "wider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidest(value: Dot1em): Self = StObject.set(x, "widest", value.asInstanceOf[js.Any])
  }
}
