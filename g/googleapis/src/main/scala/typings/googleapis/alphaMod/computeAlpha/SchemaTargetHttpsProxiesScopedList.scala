package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetHttpsProxiesScopedList extends js.Object {
  /**
    * A list of TargetHttpsProxies contained in this scope.
    */
  var targetHttpsProxies: js.UndefOr[js.Array[SchemaTargetHttpsProxy]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaTargetHttpsProxiesScopedList {
  @scala.inline
  def apply(targetHttpsProxies: js.Array[SchemaTargetHttpsProxy] = null, warning: Code = null): SchemaTargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetHttpsProxies != null) __obj.updateDynamic("targetHttpsProxies")(targetHttpsProxies.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetHttpsProxiesScopedList]
  }
}

