package typings.fastMemoize.mod

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[F /* <: Func */] extends js.Object {
  
  var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.native
  
  var serializer: js.UndefOr[Serializer] = js.native
  
  var strategy: js.UndefOr[MemoizeFunc] = js.native
}
object Options {
  
  @scala.inline
  def apply[F /* <: Func */](): Options[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[F]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], F /* <: Func */] (val x: Self with Options[F]) extends AnyVal {
    
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
    def setCache(value: Cache[String, ReturnType[F]]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setSerializer(value: /* args */ js.Array[js.Any] => String): Self = this.set("serializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
    
    @scala.inline
    def setStrategy(value: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func): Self = this.set("strategy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
