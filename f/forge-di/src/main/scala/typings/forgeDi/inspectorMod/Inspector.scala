package typings.forgeDi.inspectorMod

import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inspector extends js.Object {
  
  def findConstructor(func: Constructor): Constructor = js.native
  
  def getDependencies(func: js.Function): js.Array[Dependency] = js.native
}
object Inspector {
  
  @scala.inline
  def apply(findConstructor: Constructor => Constructor, getDependencies: js.Function => js.Array[Dependency]): Inspector = {
    val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies))
    __obj.asInstanceOf[Inspector]
  }
  
  @scala.inline
  implicit class InspectorOps[Self <: Inspector] (val x: Self) extends AnyVal {
    
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
    def setFindConstructor(value: Constructor => Constructor): Self = this.set("findConstructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDependencies(value: js.Function => js.Array[Dependency]): Self = this.set("getDependencies", js.Any.fromFunction1(value))
  }
}
