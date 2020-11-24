package typings.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSpec extends js.Object {
  
  /**
    * Name and type of each field to expose.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Interfaces implemented by this class.
    */
  var implements: js.UndefOr[js.Array[typings.fridaGum.anon.Wrapper]] = js.native
  
  /**
    * Methods to implement. Use the special name `$init` to define one or more constructors.
    */
  var methods: js.UndefOr[
    StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]
  ] = js.native
  
  /**
    * Name of the class.
    */
  var name: String = js.native
  
  /**
    * Super-class. Omit to inherit from `java.lang.Object`.
    */
  var superClass: js.UndefOr[typings.fridaGum.anon.Wrapper] = js.native
}
object ClassSpec {
  
  @scala.inline
  def apply(name: String): ClassSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSpec]
  }
  
  @scala.inline
  implicit class ClassSpecOps[Self <: ClassSpec] (val x: Self) extends AnyVal {
    
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
    def setFields(value: StringDictionary[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setImplementsVarargs(value: typings.fridaGum.anon.Wrapper*): Self = this.set("implements", js.Array(value :_*))
    
    @scala.inline
    def setImplements(value: js.Array[typings.fridaGum.anon.Wrapper]): Self = this.set("implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplements: Self = this.set("implements", js.undefined)
    
    @scala.inline
    def setMethods(value: StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setSuperClass(value: typings.fridaGum.anon.Wrapper): Self = this.set("superClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperClass: Self = this.set("superClass", js.undefined)
  }
}
