package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines URL protocol schemes to be used on macOS.
  */
trait MacOSProtocol extends js.Object {
  /**
    * The descriptive name. Maps to the `CFBundleURLName` metadata property.
    */
  var name: String
  /**
    * One or more protocol schemes associated with the app. For example, specifying `myapp`
    * would cause URLs such as `myapp://path` to be opened with the app. Maps to the
    * `CFBundleURLSchemes` metadata property.
    */
  var schemes: js.Array[String]
}

object MacOSProtocol {
  @scala.inline
  def apply(name: String, schemes: js.Array[String]): MacOSProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSProtocol]
  }
}

