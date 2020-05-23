package typings.firebaseInstallations.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  requestName  :string, [index: string] : string | number} & @firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData */
trait requestNamestringindexstr extends /* index */ StringDictionary[String | Double] {
  var requestName: String
  var serverCode: Double
  var serverMessage: String
  var serverStatus: String
}

object requestNamestringindexstr {
  @scala.inline
  def apply(
    requestName: String,
    serverCode: Double,
    serverMessage: String,
    serverStatus: String,
    StringDictionary: /* key */ StringDictionary[String | Double] = null
  ): requestNamestringindexstr = {
    val __obj = js.Dynamic.literal(requestName = requestName.asInstanceOf[js.Any], serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[requestNamestringindexstr]
  }
}

