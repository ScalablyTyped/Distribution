package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Local extends StObject {
  
  var effective: js.UndefOr[js.Array[String]] = js.native
  
  var local: js.UndefOr[js.Array[String]] = js.native
}
object Local {
  
  @scala.inline
  def apply(): Local = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Local]
  }
  
  @scala.inline
  implicit class LocalMutableBuilder[Self <: Local] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffective(value: js.Array[String]): Self = StObject.set(x, "effective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveUndefined: Self = StObject.set(x, "effective", js.undefined)
    
    @scala.inline
    def setEffectiveVarargs(value: String*): Self = StObject.set(x, "effective", js.Array(value :_*))
    
    @scala.inline
    def setLocal(value: js.Array[String]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setLocalVarargs(value: String*): Self = StObject.set(x, "local", js.Array(value :_*))
  }
}
