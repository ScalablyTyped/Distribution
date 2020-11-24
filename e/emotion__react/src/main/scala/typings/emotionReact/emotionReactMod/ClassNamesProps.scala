package typings.emotionReact.emotionReactMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNamesProps extends js.Object {
  
  def children(content: ClassNamesContent): ReactNode = js.native
}
object ClassNamesProps {
  
  @scala.inline
  def apply(children: ClassNamesContent => ReactNode): ClassNamesProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ClassNamesProps]
  }
  
  @scala.inline
  implicit class ClassNamesPropsOps[Self <: ClassNamesProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ClassNamesContent => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
