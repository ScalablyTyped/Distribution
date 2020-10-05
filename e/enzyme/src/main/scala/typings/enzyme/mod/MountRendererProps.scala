package typings.enzyme.mod

import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountRendererProps extends js.Object {
  /**
    * DOM Element to attach the component to
    */
  var attachTo: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * Merged contextTypes for all children of the wrapper
    */
  var childContextTypes: js.UndefOr[js.Object] = js.native
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Object] = js.native
  /**
    * A component that will render as a parent of the node.
    * It can be used to provide context to the `node`, among other things.
    * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
    * **Note**: `wrappingComponent` must render its children.
    */
  var wrappingComponent: js.UndefOr[ComponentType[_]] = js.native
  /**
    * Initial props to pass to the `wrappingComponent` if it is specified.
    */
  var wrappingComponentProps: js.UndefOr[js.Object] = js.native
}

object MountRendererProps {
  @scala.inline
  def apply(): MountRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountRendererProps]
  }
  @scala.inline
  implicit class MountRendererPropsOps[Self <: MountRendererProps] (val x: Self) extends AnyVal {
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
    def setAttachTo(value: HTMLElement): Self = this.set("attachTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachTo: Self = this.set("attachTo", js.undefined)
    @scala.inline
    def setAttachToNull: Self = this.set("attachTo", null)
    @scala.inline
    def setChildContextTypes(value: js.Object): Self = this.set("childContextTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildContextTypes: Self = this.set("childContextTypes", js.undefined)
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setWrappingComponentFunction2(value: (_, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = this.set("wrappingComponent", js.Any.fromFunction2(value))
    @scala.inline
    def setWrappingComponent(value: ComponentType[_]): Self = this.set("wrappingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrappingComponent: Self = this.set("wrappingComponent", js.undefined)
    @scala.inline
    def setWrappingComponentProps(value: js.Object): Self = this.set("wrappingComponentProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrappingComponentProps: Self = this.set("wrappingComponentProps", js.undefined)
  }
  
}

