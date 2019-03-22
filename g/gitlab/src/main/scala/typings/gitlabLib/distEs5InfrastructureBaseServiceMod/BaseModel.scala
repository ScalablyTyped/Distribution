package typings
package gitlabLib.distEs5InfrastructureBaseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModel extends js.Object {
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  val rejectUnauthorized: scala.Boolean
  val requester: gitlabLib.distEs5InfrastructureXMLHttpRequesterMod.XhrStaticPromisified
  var url: java.lang.String
  val useXMLHttpRequest: scala.Boolean
}

object BaseModel {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double],
    rejectUnauthorized: scala.Boolean,
    requester: gitlabLib.distEs5InfrastructureXMLHttpRequesterMod.XhrStaticPromisified,
    url: java.lang.String,
    useXMLHttpRequest: scala.Boolean
  ): BaseModel = {
    val __obj = js.Dynamic.literal(headers = headers, rejectUnauthorized = rejectUnauthorized, requester = requester, url = url, useXMLHttpRequest = useXMLHttpRequest)
  
    __obj.asInstanceOf[BaseModel]
  }
}

