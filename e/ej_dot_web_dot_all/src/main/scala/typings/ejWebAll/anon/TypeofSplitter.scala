package typings.ejWebAll.anon

import typings.ejWebAll.ej.Splitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSplitter extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Splitter = js.native
}
object TypeofSplitter {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Splitter): TypeofSplitter = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitter]
  }
  
  @scala.inline
  implicit class TypeofSplitterMutableBuilder[Self <: TypeofSplitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Splitter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
