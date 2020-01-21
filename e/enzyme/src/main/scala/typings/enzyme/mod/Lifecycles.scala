package typings.enzyme.mod

import org.scalablytyped.runtime.StringDictionary
import typings.enzyme.AnonCalledByRenderer
import typings.enzyme.AnonHasShouldComponentUpdateBug
import typings.enzyme.AnonOnSetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycles
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ StringDictionary[js.Any] {
  var componentDidUpdate: js.UndefOr[AnonOnSetState] = js.undefined
  var getChildContext: js.UndefOr[AnonCalledByRenderer] = js.undefined
  var getDerivedStateFromProps: js.UndefOr[AnonHasShouldComponentUpdateBug | Boolean] = js.undefined
  var setState: js.UndefOr[js.Any] = js.undefined
}

object Lifecycles {
  @scala.inline
  def apply(
    StringDictionary: // TODO Maybe some life cycle are missing
  /* lifecycleName */ StringDictionary[js.Any] = null,
    componentDidUpdate: AnonOnSetState = null,
    getChildContext: AnonCalledByRenderer = null,
    getDerivedStateFromProps: AnonHasShouldComponentUpdateBug | Boolean = null,
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

