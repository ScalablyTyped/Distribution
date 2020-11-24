package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class matching query which has one or more matching methods.
  */
@js.native
trait EnumerateMethodsMatchClass extends js.Object {
  
  /**
    * One or more matching method names, each followed by signature when
    * the `s` modifier is used.
    */
  var methods: Array[String] = js.native
  
  /**
    * Class name that matched the given query.
    */
  var name: String = js.native
}
object EnumerateMethodsMatchClass {
  
  @scala.inline
  def apply(methods: Array[String], name: String): EnumerateMethodsMatchClass = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateMethodsMatchClass]
  }
  
  @scala.inline
  implicit class EnumerateMethodsMatchClassOps[Self <: EnumerateMethodsMatchClass] (val x: Self) extends AnyVal {
    
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
    def setMethods(value: Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
