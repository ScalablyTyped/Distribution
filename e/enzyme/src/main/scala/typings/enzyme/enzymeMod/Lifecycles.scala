package typings.enzyme.enzymeMod

import org.scalablytyped.runtime.StringDictionary
import typings.enzyme.Anon_CalledByRenderer
import typings.enzyme.Anon_HasShouldComponentUpdateBug
import typings.enzyme.Anon_OnSetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycles
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ StringDictionary[js.Any] {
  var componentDidUpdate: js.UndefOr[Anon_OnSetState] = js.undefined
  var getChildContext: js.UndefOr[Anon_CalledByRenderer] = js.undefined
  var getDerivedStateFromProps: js.UndefOr[Anon_HasShouldComponentUpdateBug | Boolean] = js.undefined
  var setState: js.UndefOr[js.Any] = js.undefined
}

object Lifecycles {
  @scala.inline
  def apply(
    StringDictionary: // TODO Maybe some life cycle are missing
  /* lifecycleName */ StringDictionary[js.Any] = null,
    componentDidUpdate: Anon_OnSetState = null,
    getChildContext: Anon_CalledByRenderer = null,
    getDerivedStateFromProps: Anon_HasShouldComponentUpdateBug | Boolean = null,
    setState: js.Any = null
  ): Lifecycles = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(componentDidUpdate.asInstanceOf[js.Any])
    if (getChildContext != null) __obj.updateDynamic("getChildContext")(getChildContext.asInstanceOf[js.Any])
    if (getDerivedStateFromProps != null) __obj.updateDynamic("getDerivedStateFromProps")(getDerivedStateFromProps.asInstanceOf[js.Any])
    if (setState != null) __obj.updateDynamic("setState")(setState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycles]
  }
}

