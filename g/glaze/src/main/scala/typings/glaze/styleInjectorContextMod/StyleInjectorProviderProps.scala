package typings.glaze.styleInjectorContextMod

import typings.glaze.styleInjectorMod.StyleInjector
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleInjectorProviderProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var injector: js.UndefOr[StyleInjector] = js.native
}
object StyleInjectorProviderProps {
  
  @scala.inline
  def apply(): StyleInjectorProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleInjectorProviderProps]
  }
  
  @scala.inline
  implicit class StyleInjectorProviderPropsOps[Self <: StyleInjectorProviderProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInjector(value: StyleInjector): Self = this.set("injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjector: Self = this.set("injector", js.undefined)
  }
}
