package typings.enzyme.mod

import org.scalablytyped.runtime.StringDictionary
import typings.enzyme.anon.Dictkey
import typings.enzyme.anon.HasShouldComponentUpdateBug
import typings.enzyme.anon.OnSetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lifecycles
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ StringDictionary[js.Any] {
  var componentDidUpdate: js.UndefOr[OnSetState] = js.native
  var getChildContext: js.UndefOr[Dictkey] = js.native
  var getDerivedStateFromProps: js.UndefOr[HasShouldComponentUpdateBug | Boolean] = js.native
  var setState: js.UndefOr[js.Any] = js.native
}

object Lifecycles {
  @scala.inline
  def apply(): Lifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycles]
  }
  @scala.inline
  implicit class LifecyclesOps[Self <: Lifecycles] (val x: Self) extends AnyVal {
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
    def setComponentDidUpdate(value: OnSetState): Self = this.set("componentDidUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentDidUpdate: Self = this.set("componentDidUpdate", js.undefined)
    @scala.inline
    def setGetChildContext(value: Dictkey): Self = this.set("getChildContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetChildContext: Self = this.set("getChildContext", js.undefined)
    @scala.inline
    def setGetDerivedStateFromProps(value: HasShouldComponentUpdateBug | Boolean): Self = this.set("getDerivedStateFromProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetDerivedStateFromProps: Self = this.set("getDerivedStateFromProps", js.undefined)
    @scala.inline
    def setSetState(value: js.Any): Self = this.set("setState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetState: Self = this.set("setState", js.undefined)
  }
  
}

