package typings.formik.typesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedRenderProps[T] extends js.Object {
  
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[js.Function1[/* props */ T, ReactNode]] = js.native
  
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[String | (ComponentType[T | Unit])] = js.native
  
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    */
  var render: js.UndefOr[js.Function1[/* props */ T, ReactNode]] = js.native
}
object SharedRenderProps {
  
  @scala.inline
  def apply[T](): SharedRenderProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedRenderProps[T]]
  }
  
  @scala.inline
  implicit class SharedRenderPropsOps[Self <: SharedRenderProps[_], T] (val x: Self with SharedRenderProps[T]) extends AnyVal {
    
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
    def setChildren(value: /* props */ T => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponent(value: String | (ComponentType[T | Unit])): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setRender(value: /* props */ T => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
