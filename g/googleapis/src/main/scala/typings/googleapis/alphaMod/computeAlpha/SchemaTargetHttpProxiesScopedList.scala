package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetHttpProxiesScopedList extends js.Object {
  /**
    * A list of TargetHttpProxies contained in this scope.
    */
  var targetHttpProxies: js.UndefOr[js.Array[SchemaTargetHttpProxy]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaTargetHttpProxiesScopedList {
  @scala.inline
  def apply(targetHttpProxies: js.Array[SchemaTargetHttpProxy] = null, warning: Code = null): SchemaTargetHttpProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetHttpProxies != null) __obj.updateDynamic("targetHttpProxies")(targetHttpProxies.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetHttpProxiesScopedList]
  }
}

