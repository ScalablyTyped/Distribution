package typings.devexpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[TOptions] extends js.Object {
  
  var result: TOptions = js.native
  
  def set[TProperty /* <: /* keyof TOptions */ String */](
    property: TProperty,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any
  ): Result[TOptions] = js.native
}
object Set {
  
  @scala.inline
  def apply[TOptions](
    result: TOptions,
    set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any) => Result[TOptions]
  ): Set[TOptions] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Set[TOptions]]
  }
  
  @scala.inline
  implicit class SetOps[Self <: Set[_], TOptions] (val x: Self with Set[TOptions]) extends AnyVal {
    
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
    def setResult(value: TOptions): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any) => Result[TOptions]
    ): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
