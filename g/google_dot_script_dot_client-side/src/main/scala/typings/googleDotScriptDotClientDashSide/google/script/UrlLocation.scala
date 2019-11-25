package typings.googleDotScriptDotClientDashSide.google.script

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlLocation extends js.Object {
  /**
    * The string value of URL fragment after the # character, or an emptry string if no URL fragment is present
    */
  var hash: String
  /**
    * An object of key/value pairs that correspond to the URL request parameters.
    * Only the first value will be returned for parameters that have multiple values.
    * If no parameters are present, this will be an empty object.
    */
  var parameter: StringDictionary[String]
  /**
    * An object similar to location.parameter, but with an array of values for each key.
    * If no parameters are present, this will be an empty object.
    */
  var parameters: StringDictionary[js.Array[String]]
}

object UrlLocation {
  @scala.inline
  def apply(hash: String, parameter: StringDictionary[String], parameters: StringDictionary[js.Array[String]]): UrlLocation = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlLocation]
  }
}

