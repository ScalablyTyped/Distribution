package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Immutable extends js.Object {
  
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
  implicit class ImmutableOps[Self <: Immutable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    
    @scala.inline
    def setKeyExprVarargs(value: String*): Self = this.set("keyExpr", js.Array(value :_*))
    
    @scala.inline
    def setKeyExpr(value: String | js.Array[String]): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
  }
}
