package typings.eurekaJsClient.mod.EurekaClient

import typings.eurekaJsClient.anon.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EurekaConfig extends js.Object {
  var eureka: EurekaClientConfig = js.native
  var instance: EurekaInstanceConfig = js.native
  var logger: js.UndefOr[Debug] = js.native
  var requestMiddleware: js.UndefOr[
    js.Function2[/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit], Unit]
  ] = js.native
  var shouldUseDelta: js.UndefOr[Boolean] = js.native
}

object EurekaConfig {
  @scala.inline
  def apply(eureka: EurekaClientConfig, instance: EurekaInstanceConfig): EurekaConfig = {
    val __obj = js.Dynamic.literal(eureka = eureka.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaConfig]
  }
  @scala.inline
  implicit class EurekaConfigOps[Self <: EurekaConfig] (val x: Self) extends AnyVal {
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
    def setEureka(value: EurekaClientConfig): Self = this.set("eureka", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: EurekaInstanceConfig): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: Debug): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setRequestMiddleware(value: (/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit]) => Unit): Self = this.set("requestMiddleware", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRequestMiddleware: Self = this.set("requestMiddleware", js.undefined)
    @scala.inline
    def setShouldUseDelta(value: Boolean): Self = this.set("shouldUseDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldUseDelta: Self = this.set("shouldUseDelta", js.undefined)
  }
  
}

