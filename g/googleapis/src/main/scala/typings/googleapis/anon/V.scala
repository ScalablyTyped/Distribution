package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V extends StObject {
  
  var v: js.UndefOr[String] = js.native
}
object V {
  
  @scala.inline
  def apply(): V = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V]
  }
  
  @scala.inline
  implicit class VMutableBuilder[Self <: V] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
