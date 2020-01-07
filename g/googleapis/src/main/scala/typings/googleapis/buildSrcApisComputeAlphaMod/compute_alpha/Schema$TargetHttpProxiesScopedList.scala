package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetHttpProxiesScopedList extends js.Object {
  /**
    * A list of TargetHttpProxies contained in this scope.
    */
  var targetHttpProxies: js.UndefOr[js.Array[Schema$TargetHttpProxy]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$TargetHttpProxiesScopedList {
  @scala.inline
  def apply(targetHttpProxies: js.Array[Schema$TargetHttpProxy] = null, warning: Anon_Code = null): Schema$TargetHttpProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetHttpProxies != null) __obj.updateDynamic("targetHttpProxies")(targetHttpProxies.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetHttpProxiesScopedList]
  }
}

