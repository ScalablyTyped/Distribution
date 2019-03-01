package typings
package googleDotScriptDotClientDashSideLib.googleNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlLocation extends js.Object {
  /**
    * The string value of URL fragment after the # character, or an emptry string if no URL fragment is present
    */
  var hash: java.lang.String
  /**
    * An object of key/value pairs that correspond to the URL request parameters.
    * Only the first value will be returned for parameters that have multiple values.
    * If no parameters are present, this will be an empty object.
    */
  var parameter: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * An object similar to location.parameter, but with an array of values for each key.
    * If no parameters are present, this will be an empty object.
    */
  var parameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}

object UrlLocation {
  @scala.inline
  def apply(
    hash: java.lang.String,
    parameter: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    parameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  ): UrlLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("parameter")(parameter)
    __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[UrlLocation]
  }
}

