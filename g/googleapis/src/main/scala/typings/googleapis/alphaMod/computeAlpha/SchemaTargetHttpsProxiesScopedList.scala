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
  def apply(): SchemaTargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesScopedList]
  }
  @scala.inline
  implicit class SchemaTargetHttpsProxiesScopedListOps[Self <: SchemaTargetHttpsProxiesScopedList] (val x: Self) extends AnyVal {
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
    def setTargetHttpsProxiesVarargs(value: SchemaTargetHttpsProxy*): Self = this.set("targetHttpsProxies", js.Array(value :_*))
    @scala.inline
    def setTargetHttpsProxies(value: js.Array[SchemaTargetHttpsProxy]): Self = this.set("targetHttpsProxies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHttpsProxies: Self = this.set("targetHttpsProxies", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

