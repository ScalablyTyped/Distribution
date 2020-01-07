package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetHttpsProxiesScopedList extends js.Object {
  /**
    * A list of TargetHttpsProxies contained in this scope.
    */
  var targetHttpsProxies: js.UndefOr[js.Array[Schema$TargetHttpsProxy]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$TargetHttpsProxiesScopedList {
  @scala.inline
  def apply(targetHttpsProxies: js.Array[Schema$TargetHttpsProxy] = null, warning: Anon_Code = null): Schema$TargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetHttpsProxies != null) __obj.updateDynamic("targetHttpsProxies")(targetHttpsProxies.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetHttpsProxiesScopedList]
  }
}

