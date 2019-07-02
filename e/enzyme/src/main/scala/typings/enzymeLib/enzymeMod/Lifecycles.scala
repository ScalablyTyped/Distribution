package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycles
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var componentDidUpdate: js.UndefOr[enzymeLib.Anon_OnSetState] = js.undefined
  var getChildContext: js.UndefOr[enzymeLib.Anon_CalledByRenderer] = js.undefined
  var getDerivedStateFromProps: js.UndefOr[enzymeLib.Anon_HasShouldComponentUpdateBug | scala.Boolean] = js.undefined
  var setState: js.UndefOr[js.Any] = js.undefined
}

object Lifecycles {
  @scala.inline
  def apply(
    StringDictionary: // TODO Maybe some life cycle are missing
  /* lifecycleName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    componentDidUpdate: enzymeLib.Anon_OnSetState = null,
    getChildContext: enzymeLib.Anon_CalledByRenderer = null,
    getDerivedStateFromProps: enzymeLib.Anon_HasShouldComponentUpdateBug | scala.Boolean = null,
    setState: js.Any = null
  ): Lifecycles = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(componentDidUpdate)
    if (getChildContext != null) __obj.updateDynamic("getChildContext")(getChildContext)
    if (getDerivedStateFromProps != null) __obj.updateDynamic("getDerivedStateFromProps")(getDerivedStateFromProps.asInstanceOf[js.Any])
    if (setState != null) __obj.updateDynamic("setState")(setState)
    __obj.asInstanceOf[Lifecycles]
  }
}

