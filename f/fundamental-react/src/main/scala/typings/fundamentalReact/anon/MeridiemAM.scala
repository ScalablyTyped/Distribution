package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeridiemAM extends StObject {
  
  var meridiemAM: js.UndefOr[String] = js.undefined
  
  var meridiemPM: js.UndefOr[String] = js.undefined
}
object MeridiemAM {
  
  @scala.inline
  def apply(): MeridiemAM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeridiemAM]
  }
  
  @scala.inline
  implicit class MeridiemAMMutableBuilder[Self <: MeridiemAM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeridiemAM(value: String): Self = StObject.set(x, "meridiemAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiemAMUndefined: Self = StObject.set(x, "meridiemAM", js.undefined)
    
    @scala.inline
    def setMeridiemPM(value: String): Self = StObject.set(x, "meridiemPM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiemPMUndefined: Self = StObject.set(x, "meridiemPM", js.undefined)
  }
}
