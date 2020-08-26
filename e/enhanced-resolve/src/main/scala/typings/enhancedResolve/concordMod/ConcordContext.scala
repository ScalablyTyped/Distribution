package typings.enhancedResolve.concordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcordContext extends js.Object {
  var environments: js.UndefOr[js.Array[String]] = js.native
  var referrer: js.UndefOr[String] = js.native
  var supportedResourceTypes: js.UndefOr[js.Array[String]] = js.native
}

object ConcordContext {
  @scala.inline
  def apply(): ConcordContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcordContext]
  }
  @scala.inline
  implicit class ConcordContextOps[Self <: ConcordContext] (val x: Self) extends AnyVal {
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
    def setEnvironmentsVarargs(value: String*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[String]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setSupportedResourceTypesVarargs(value: String*): Self = this.set("supportedResourceTypes", js.Array(value :_*))
    @scala.inline
    def setSupportedResourceTypes(value: js.Array[String]): Self = this.set("supportedResourceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedResourceTypes: Self = this.set("supportedResourceTypes", js.undefined)
  }
  
}

