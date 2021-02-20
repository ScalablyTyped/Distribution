package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Immutable extends StObject {
  
  var immutable: js.UndefOr[Boolean] = js.native
  
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.native
}
object Immutable {
  
  @scala.inline
  def apply(): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  implicit class ImmutableMutableBuilder[Self <: Immutable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    @scala.inline
    def setKeyExpr(value: String | js.Array[String]): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    @scala.inline
    def setKeyExprVarargs(value: String*): Self = StObject.set(x, "keyExpr", js.Array(value :_*))
  }
}
