package typings.glaze.anon

import typings.glaze.glazeNumbers.`9999`
import typings.glaze.glazeStrings.Dot125rem
import typings.glaze.glazeStrings.Dot25rem
import typings.glaze.glazeStrings.Dot5rem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends StObject {
  
  val full: `9999` = js.native
  
  val lg: Dot5rem = js.native
  
  val md: Dot25rem = js.native
  
  val sm: Dot125rem = js.native
}
object Full {
  
  @scala.inline
  def apply(full: `9999`, lg: Dot5rem, md: Dot25rem, sm: Dot125rem): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: `9999`): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLg(value: Dot5rem): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd(value: Dot25rem): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSm(value: Dot125rem): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
  }
}
