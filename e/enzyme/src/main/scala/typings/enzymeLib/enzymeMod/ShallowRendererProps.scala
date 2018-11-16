package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShallowRendererProps extends js.Object {
  /**
       * Context to be passed into the component
       */
  var context: js.UndefOr[js.Object] = js.undefined
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.1.1/docs/api/shallow.md#arguments
  /**
       * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
       * setProps and setContext. Default to false.
       */
  var disableLifecycleMethods: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Enable experimental support for full react lifecycle methods
       */
  var lifecycleExperimental: js.UndefOr[scala.Boolean] = js.undefined
}

