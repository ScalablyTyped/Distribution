package typings.forkTsCheckerWebpackPlugin.formatterOptionsMod

import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.ComplexFormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexFormatterPreferences[T /* <: FormatterType */] extends js.Object {
  
  var options: js.UndefOr[ComplexFormatterOptions[T]] = js.native
  
  var `type`: T = js.native
}
object ComplexFormatterPreferences {
  
  @scala.inline
  def apply[T /* <: FormatterType */](`type`: T): ComplexFormatterPreferences[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexFormatterPreferences[T]]
  }
  
  @scala.inline
  implicit class ComplexFormatterPreferencesOps[Self <: ComplexFormatterPreferences[_], T /* <: FormatterType */] (val x: Self with ComplexFormatterPreferences[T]) extends AnyVal {
    
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ComplexFormatterOptions[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
