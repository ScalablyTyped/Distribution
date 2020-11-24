package typings.forgeDi.regexInspectorMod

import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.dependencyMod.Dependency
import typings.forgeDi.inspectorMod.Inspector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexInspector extends Inspector {
  
  var getParameterNames: js.Any = js.native
}
object RegexInspector {
  
  @scala.inline
  def apply(
    findConstructor: Constructor => Constructor,
    getDependencies: js.Function => js.Array[Dependency],
    getParameterNames: js.Any
  ): RegexInspector = {
    val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies), getParameterNames = getParameterNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexInspector]
  }
  
  @scala.inline
  implicit class RegexInspectorOps[Self <: RegexInspector] (val x: Self) extends AnyVal {
    
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
    def setGetParameterNames(value: js.Any): Self = this.set("getParameterNames", value.asInstanceOf[js.Any])
  }
}
