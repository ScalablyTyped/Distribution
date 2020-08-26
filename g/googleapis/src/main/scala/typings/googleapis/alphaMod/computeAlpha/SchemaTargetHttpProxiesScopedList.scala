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
  def apply(): SchemaTargetHttpProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpProxiesScopedList]
  }
  @scala.inline
  implicit class SchemaTargetHttpProxiesScopedListOps[Self <: SchemaTargetHttpProxiesScopedList] (val x: Self) extends AnyVal {
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
    def setTargetHttpProxiesVarargs(value: SchemaTargetHttpProxy*): Self = this.set("targetHttpProxies", js.Array(value :_*))
    @scala.inline
    def setTargetHttpProxies(value: js.Array[SchemaTargetHttpProxy]): Self = this.set("targetHttpProxies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetHttpProxies: Self = this.set("targetHttpProxies", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

