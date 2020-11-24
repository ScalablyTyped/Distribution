package typings.expressDelayHeader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * @default process.env.NODE_ENV
    */
  var currentEnv: js.UndefOr[String] = js.native
  
  /**
    * @default 'delay'
    */
  var headerName: js.UndefOr[String] = js.native
  
  /**
    * @default 'development'
    */
  var nodeEnv: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * @default setTimeout
    */
  var timeoutFunction: js.UndefOr[js.Function2[/* next */ js.Function0[Unit], /* ms */ Double, Unit]] = js.native
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
    def setCurrentEnv(value: String): Self = this.set("currentEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentEnv: Self = this.set("currentEnv", js.undefined)
    
    @scala.inline
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    
    @scala.inline
    def setNodeEnvVarargs(value: String*): Self = this.set("nodeEnv", js.Array(value :_*))
    
    @scala.inline
    def setNodeEnv(value: String | js.Array[String]): Self = this.set("nodeEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeEnv: Self = this.set("nodeEnv", js.undefined)
    
    @scala.inline
    def setTimeoutFunction(value: (/* next */ js.Function0[Unit], /* ms */ Double) => Unit): Self = this.set("timeoutFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTimeoutFunction: Self = this.set("timeoutFunction", js.undefined)
  }
}
