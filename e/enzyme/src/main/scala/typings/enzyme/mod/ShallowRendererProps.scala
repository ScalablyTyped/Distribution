package typings.enzyme.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShallowRendererProps extends js.Object {
  
  var PROVIDER_VALUES: js.UndefOr[js.Any] = js.native
  
  var adapter: js.UndefOr[EnzymeAdapter] = js.native
  
  /* TODO what are these doing??? */
  var attachTo: js.UndefOr[js.Any] = js.native
  
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Any] = js.native
  
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/api/shallow.md#arguments
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
  
  /**
    * The legacy enableComponentDidUpdateOnSetState option should be matched by
    * `lifecycles: { componentDidUpdate: { onSetState: true } }`, for compatibility
    */
  var enableComponentDidUpdateOnSetState: js.UndefOr[Boolean] = js.native
  
  var hydrateIn: js.UndefOr[js.Any] = js.native
  
  /**
    * Enable experimental support for full react lifecycle methods
    */
  var lifecycleExperimental: js.UndefOr[Boolean] = js.native
  
  var lifecycles: js.UndefOr[Lifecycles] = js.native
  
  /**
    * the legacy supportPrevContextArgumentOfComponentDidUpdate option should be matched by
    * `lifecycles: { componentDidUpdate: { prevContext: true } }`, for compatibility
    */
  var supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, when rendering Suspense enzyme will replace all the lazy components in children
    * with fallback element prop. Otherwise it won't handle fallback of lazy component.
    * Default to true. Note: not supported in React < 16.6.
    */
  var suspenseFallback: js.UndefOr[Boolean] = js.native
  
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
object ShallowRendererProps {
  
  @scala.inline
  def apply(): ShallowRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShallowRendererProps]
  }
  
  @scala.inline
  implicit class ShallowRendererPropsOps[Self <: ShallowRendererProps] (val x: Self) extends AnyVal {
    
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
    def setPROVIDER_VALUES(value: js.Any): Self = this.set("PROVIDER_VALUES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePROVIDER_VALUES: Self = this.set("PROVIDER_VALUES", js.undefined)
    
    @scala.inline
    def setAdapter(value: EnzymeAdapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setAttachTo(value: js.Any): Self = this.set("attachTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachTo: Self = this.set("attachTo", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDisableLifecycleMethods(value: Boolean): Self = this.set("disableLifecycleMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLifecycleMethods: Self = this.set("disableLifecycleMethods", js.undefined)
    
    @scala.inline
    def setEnableComponentDidUpdateOnSetState(value: Boolean): Self = this.set("enableComponentDidUpdateOnSetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableComponentDidUpdateOnSetState: Self = this.set("enableComponentDidUpdateOnSetState", js.undefined)
    
    @scala.inline
    def setHydrateIn(value: js.Any): Self = this.set("hydrateIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHydrateIn: Self = this.set("hydrateIn", js.undefined)
    
    @scala.inline
    def setLifecycleExperimental(value: Boolean): Self = this.set("lifecycleExperimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleExperimental: Self = this.set("lifecycleExperimental", js.undefined)
    
    @scala.inline
    def setLifecycles(value: Lifecycles): Self = this.set("lifecycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycles: Self = this.set("lifecycles", js.undefined)
    
    @scala.inline
    def setSupportPrevContextArgumentOfComponentDidUpdate(value: Boolean): Self = this.set("supportPrevContextArgumentOfComponentDidUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportPrevContextArgumentOfComponentDidUpdate: Self = this.set("supportPrevContextArgumentOfComponentDidUpdate", js.undefined)
    
    @scala.inline
    def setSuspenseFallback(value: Boolean): Self = this.set("suspenseFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspenseFallback: Self = this.set("suspenseFallback", js.undefined)
    
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
