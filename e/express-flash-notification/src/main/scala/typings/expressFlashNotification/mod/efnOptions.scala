package typings.expressFlashNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait efnOptions extends js.Object {
  var afterAllRender: js.UndefOr[
    js.Function2[
      /* htmlFragments */ js.Array[String], 
      /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit], 
      Unit
    ]
  ] = js.native
  var beforeSingleRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var localsName: js.UndefOr[String] = js.native
  var sessionName: js.UndefOr[String] = js.native
  var utilityName: js.UndefOr[String] = js.native
  var viewName: js.UndefOr[String] = js.native
}

object efnOptions {
  @scala.inline
  def apply(): efnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[efnOptions]
  }
  @scala.inline
  implicit class efnOptionsOps[Self <: efnOptions] (val x: Self) extends AnyVal {
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
    def setAfterAllRender(
      value: (/* htmlFragments */ js.Array[String], /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit]) => Unit
    ): Self = this.set("afterAllRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterAllRender: Self = this.set("afterAllRender", js.undefined)
    @scala.inline
    def setBeforeSingleRender(
      value: (/* item */ js.Any, /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit]) => Unit
    ): Self = this.set("beforeSingleRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSingleRender: Self = this.set("beforeSingleRender", js.undefined)
    @scala.inline
    def setLocalsName(value: String): Self = this.set("localsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalsName: Self = this.set("localsName", js.undefined)
    @scala.inline
    def setSessionName(value: String): Self = this.set("sessionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionName: Self = this.set("sessionName", js.undefined)
    @scala.inline
    def setUtilityName(value: String): Self = this.set("utilityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilityName: Self = this.set("utilityName", js.undefined)
    @scala.inline
    def setViewName(value: String): Self = this.set("viewName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewName: Self = this.set("viewName", js.undefined)
  }
  
}

