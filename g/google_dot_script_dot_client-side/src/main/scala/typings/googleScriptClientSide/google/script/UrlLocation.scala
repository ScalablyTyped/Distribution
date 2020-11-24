package typings.googleScriptClientSide.google.script

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlLocation extends js.Object {
  
  /**
    * The string value of URL fragment after the # character, or an emptry string if no URL fragment is present
    */
  var hash: String = js.native
  
  /**
    * An object of key/value pairs that correspond to the URL request parameters.
    * Only the first value will be returned for parameters that have multiple values.
    * If no parameters are present, this will be an empty object.
    */
  var parameter: StringDictionary[String] = js.native
  
  /**
    * An object similar to location.parameter, but with an array of values for each key.
    * If no parameters are present, this will be an empty object.
    */
  var parameters: StringDictionary[js.Array[String]] = js.native
}
object UrlLocation {
  
  @scala.inline
  def apply(hash: String, parameter: StringDictionary[String], parameters: StringDictionary[js.Array[String]]): UrlLocation = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlLocation]
  }
  
  @scala.inline
  implicit class UrlLocationOps[Self <: UrlLocation] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: StringDictionary[String]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Array[String]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
}
