package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines URL protocol schemes to be used on macOS.
  */
@js.native
trait MacOSProtocol extends js.Object {
  
  /**
    * The descriptive name. Maps to the `CFBundleURLName` metadata property.
    */
  var name: String = js.native
  
  /**
    * One or more protocol schemes associated with the app. For example, specifying `myapp`
    * would cause URLs such as `myapp://path` to be opened with the app. Maps to the
    * `CFBundleURLSchemes` metadata property.
    */
  var schemes: js.Array[String] = js.native
}
object MacOSProtocol {
  
  @scala.inline
  def apply(name: String, schemes: js.Array[String]): MacOSProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSProtocol]
  }
  
  @scala.inline
  implicit class MacOSProtocolOps[Self <: MacOSProtocol] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemesVarargs(value: String*): Self = this.set("schemes", js.Array(value :_*))
    
    @scala.inline
    def setSchemes(value: js.Array[String]): Self = this.set("schemes", value.asInstanceOf[js.Any])
  }
}
