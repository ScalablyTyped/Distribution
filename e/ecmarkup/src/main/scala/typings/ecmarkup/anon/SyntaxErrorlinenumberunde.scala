package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.SyntaxError & {  line :number | undefined,   column :number | undefined} */
@js.native
trait SyntaxErrorlinenumberunde extends StObject {
  
  var column: js.UndefOr[Double] = js.native
  
  var line: js.UndefOr[Double] = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object SyntaxErrorlinenumberunde {
  
  @scala.inline
  def apply(message: String, name: String): SyntaxErrorlinenumberunde = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxErrorlinenumberunde]
  }
  
  @scala.inline
  implicit class SyntaxErrorlinenumberundeMutableBuilder[Self <: SyntaxErrorlinenumberunde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
