package typings.friendlyErrorsWebpackPlugin.mod

import typings.friendlyErrorsWebpackPlugin.anon.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var additionalFormatters: js.UndefOr[
    js.Array[
      js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
    ]
  ] = js.native
  var additionalTransformers: js.UndefOr[js.Array[js.Function1[/* error */ _, _]]] = js.native
  var clearConsole: js.UndefOr[Boolean] = js.native
  var compilationSuccessInfo: js.UndefOr[Messages] = js.native
  var onErrors: js.UndefOr[js.Function2[/* severity */ Severity, /* errors */ String, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAdditionalFormattersVarargs(value: (js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]])*): Self = this.set("additionalFormatters", js.Array(value :_*))
    @scala.inline
    def setAdditionalFormatters(
      value: js.Array[
          js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
        ]
    ): Self = this.set("additionalFormatters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalFormatters: Self = this.set("additionalFormatters", js.undefined)
    @scala.inline
    def setAdditionalTransformersVarargs(value: (js.Function1[js.Any, js.Any])*): Self = this.set("additionalTransformers", js.Array(value :_*))
    @scala.inline
    def setAdditionalTransformers(value: js.Array[js.Function1[/* error */ _, _]]): Self = this.set("additionalTransformers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalTransformers: Self = this.set("additionalTransformers", js.undefined)
    @scala.inline
    def setClearConsole(value: Boolean): Self = this.set("clearConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearConsole: Self = this.set("clearConsole", js.undefined)
    @scala.inline
    def setCompilationSuccessInfo(value: Messages): Self = this.set("compilationSuccessInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilationSuccessInfo: Self = this.set("compilationSuccessInfo", js.undefined)
    @scala.inline
    def setOnErrors(value: (/* severity */ Severity, /* errors */ String) => Unit): Self = this.set("onErrors", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnErrors: Self = this.set("onErrors", js.undefined)
  }
  
}

