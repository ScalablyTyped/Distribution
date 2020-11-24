package typings.emberObject.mod.emberUtilsPrivateTypesAugmentingMod

import org.scalablytyped.runtime.Instantiable0
import typings.emberObject.mod.EmberObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeLookup extends js.Object {
  
  var `class`: Instantiable0[EmberObject] = js.native
  
  var instance: EmberObject = js.native
}
object TypeLookup {
  
  @scala.inline
  def apply(`class`: Instantiable0[EmberObject], instance: EmberObject): TypeLookup = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLookup]
  }
  
  @scala.inline
  implicit class TypeLookupOps[Self <: TypeLookup] (val x: Self) extends AnyVal {
    
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
    def setClass(value: Instantiable0[EmberObject]): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: EmberObject): Self = this.set("instance", value.asInstanceOf[js.Any])
  }
}
