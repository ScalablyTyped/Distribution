package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShallowRendererProps extends js.Object {
  var PROVIDER_VALUES: js.UndefOr[js.Any] = js.undefined
  var adapter: js.UndefOr[EnzymeAdapter] = js.undefined
  /* TODO what are these doing??? */
  var attachTo: js.UndefOr[js.Any] = js.undefined
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Any] = js.undefined
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/api/shallow.md#arguments
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The legacy enableComponentDidUpdateOnSetState option should be matched by
    * `lifecycles: { componentDidUpdate: { onSetState: true } }`, for compatibility
    */
  var enableComponentDidUpdateOnSetState: js.UndefOr[scala.Boolean] = js.undefined
  var hydrateIn: js.UndefOr[js.Any] = js.undefined
  /**
    * Enable experimental support for full react lifecycle methods
    */
  var lifecycleExperimental: js.UndefOr[scala.Boolean] = js.undefined
  var lifecycles: js.UndefOr[Lifecycles] = js.undefined
  /**
    * the legacy supportPrevContextArgumentOfComponentDidUpdate option should be matched by
    * `lifecycles: { componentDidUpdate: { prevContext: true } }`, for compatibility
    */
  var supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, when rendering Suspense enzyme will replace all the lazy components in children
    * with fallback element prop. Otherwise it won't handle fallback of lazy component.
    * Default to true. Note: not supported in React < 16.6.
    */
  var suspenseFallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A component that will render as a parent of the node.
    * It can be used to provide context to the node, among other things.
    * See https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html
    * Note: wrappingComponent must render its children.
    */
  var wrappingComponent: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Initial props to pass to the wrappingComponent if it is specified.
    */
  var wrappingComponentProps: js.UndefOr[js.Any] = js.undefined
}

object ShallowRendererProps {
  @scala.inline
  def apply(
    PROVIDER_VALUES: js.Any = null,
    adapter: EnzymeAdapter = null,
    attachTo: js.Any = null,
    context: js.Any = null,
    disableLifecycleMethods: js.UndefOr[scala.Boolean] = js.undefined,
    enableComponentDidUpdateOnSetState: js.UndefOr[scala.Boolean] = js.undefined,
    hydrateIn: js.Any = null,
    lifecycleExperimental: js.UndefOr[scala.Boolean] = js.undefined,
    lifecycles: Lifecycles = null,
    supportPrevContextArgumentOfComponentDidUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    suspenseFallback: js.UndefOr[scala.Boolean] = js.undefined,
    wrappingComponent: ComponentType[_] = null,
    wrappingComponentProps: js.Any = null
  ): ShallowRendererProps = {
    val __obj = js.Dynamic.literal()
    if (PROVIDER_VALUES != null) __obj.updateDynamic("PROVIDER_VALUES")(PROVIDER_VALUES)
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(disableLifecycleMethods)) __obj.updateDynamic("disableLifecycleMethods")(disableLifecycleMethods)
    if (!js.isUndefined(enableComponentDidUpdateOnSetState)) __obj.updateDynamic("enableComponentDidUpdateOnSetState")(enableComponentDidUpdateOnSetState)
    if (hydrateIn != null) __obj.updateDynamic("hydrateIn")(hydrateIn)
    if (!js.isUndefined(lifecycleExperimental)) __obj.updateDynamic("lifecycleExperimental")(lifecycleExperimental)
    if (lifecycles != null) __obj.updateDynamic("lifecycles")(lifecycles)
    if (!js.isUndefined(supportPrevContextArgumentOfComponentDidUpdate)) __obj.updateDynamic("supportPrevContextArgumentOfComponentDidUpdate")(supportPrevContextArgumentOfComponentDidUpdate)
    if (!js.isUndefined(suspenseFallback)) __obj.updateDynamic("suspenseFallback")(suspenseFallback)
    if (wrappingComponent != null) __obj.updateDynamic("wrappingComponent")(wrappingComponent.asInstanceOf[js.Any])
    if (wrappingComponentProps != null) __obj.updateDynamic("wrappingComponentProps")(wrappingComponentProps)
    __obj.asInstanceOf[ShallowRendererProps]
  }
}

