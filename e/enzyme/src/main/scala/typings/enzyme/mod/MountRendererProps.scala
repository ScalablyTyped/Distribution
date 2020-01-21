package typings.enzyme.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountRendererProps extends js.Object {
  /**
    * DOM Element to attach the component to
    */
  var attachTo: js.UndefOr[HTMLElement | Null] = js.undefined
  /**
    * Merged contextTypes for all children of the wrapper
    */
  var childContextTypes: js.UndefOr[js.Object] = js.undefined
  /**
    * Context to be passed into the component
    */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * A component that will render as a parent of the node.
    * It can be used to provide context to the `node`, among other things.
    * See the [getWrappingComponent() docs](https://airbnb.io/enzyme/docs/api/ShallowWrapper/getWrappingComponent.html) for an example.
    * **Note**: `wrappingComponent` must render its children.
    */
  var wrappingComponent: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Initial props to pass to the `wrappingComponent` if it is specified.
    */
  var wrappingComponentProps: js.UndefOr[js.Object] = js.undefined
}

object MountRendererProps {
  @scala.inline
  def apply(
    attachTo: HTMLElement = null,
    childContextTypes: js.Object = null,
    context: js.Object = null,
    wrappingComponent: ComponentType[_] = null,
    wrappingComponentProps: js.Object = null
  ): MountRendererProps = {
    val __obj = js.Dynamic.literal()
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo.asInstanceOf[js.Any])
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (wrappingComponent != null) __obj.updateDynamic("wrappingComponent")(wrappingComponent.asInstanceOf[js.Any])
    if (wrappingComponentProps != null) __obj.updateDynamic("wrappingComponentProps")(wrappingComponentProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountRendererProps]
  }
}

