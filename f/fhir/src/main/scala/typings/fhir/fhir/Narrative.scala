package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A human-readable formatted text, including images
  */
@js.native
trait Narrative extends Element {
  
  /**
    * Contains extended information for property 'div'.
    */
  var _div: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Limited xhtml content
    */
  var div: String = js.native
  
  /**
    * generated | extensions | additional | empty
    */
  var status: code = js.native
}
object Narrative {
  
  @scala.inline
  def apply(div: String, status: code): Narrative = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Narrative]
  }
  
  @scala.inline
  implicit class NarrativeMutableBuilder[Self <: Narrative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiv(value: String): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_div(value: Element): Self = StObject.set(x, "_div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_divUndefined: Self = StObject.set(x, "_div", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
