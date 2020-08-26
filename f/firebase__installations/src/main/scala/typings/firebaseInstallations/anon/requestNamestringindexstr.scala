package typings.firebaseInstallations.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  requestName :string, [index: string] : string | number} & @firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData */
@js.native
trait requestNamestringindexstr extends /* index */ StringDictionary[String | Double] {
  var requestName: String = js.native
  var serverCode: Double = js.native
  var serverMessage: String = js.native
  var serverStatus: String = js.native
}

object requestNamestringindexstr {
  @scala.inline
  def apply(requestName: String, serverCode: Double, serverMessage: String, serverStatus: String): requestNamestringindexstr = {
    val __obj = js.Dynamic.literal(requestName = requestName.asInstanceOf[js.Any], serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[requestNamestringindexstr]
  }
  @scala.inline
  implicit class requestNamestringindexstrOps[Self <: requestNamestringindexstr] (val x: Self) extends AnyVal {
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
    def setRequestName(value: String): Self = this.set("requestName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerCode(value: Double): Self = this.set("serverCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerMessage(value: String): Self = this.set("serverMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerStatus(value: String): Self = this.set("serverStatus", value.asInstanceOf[js.Any])
  }
  
}

