package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attests to accuracy of composition
  */
@js.native
trait CompositionAttester extends BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.native
  
  /**
    * personal | professional | legal | official
    */
  var mode: js.Array[code] = js.native
  
  /**
    * Who attested the composition
    */
  var party: js.UndefOr[Reference] = js.native
  
  /**
    * When the composition was attested
    */
  var time: js.UndefOr[dateTime] = js.native
}
object CompositionAttester {
  
  @scala.inline
  def apply(mode: js.Array[code]): CompositionAttester = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionAttester]
  }
  
  @scala.inline
  implicit class CompositionAttesterMutableBuilder[Self <: CompositionAttester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: js.Array[code]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeVarargs(value: code*): Self = StObject.set(x, "mode", js.Array(value :_*))
    
    @scala.inline
    def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    @scala.inline
    def setTime(value: dateTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def set_mode(value: js.Array[Element]): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    @scala.inline
    def set_modeVarargs(value: Element*): Self = StObject.set(x, "_mode", js.Array(value :_*))
    
    @scala.inline
    def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
  }
}
