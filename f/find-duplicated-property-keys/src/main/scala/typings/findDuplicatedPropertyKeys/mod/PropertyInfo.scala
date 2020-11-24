package typings.findDuplicatedPropertyKeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyInfo extends js.Object {
  
  /**
    * Is this property an array
    */
  var isArray: Boolean = js.native
  
  /**
    *  The key name of the duplicated property
    */
  var key: String = js.native
  
  /**
    * The number of property keys having the same key and parent object
    */
  var occurrence: Double = js.native
  
  /**
    * The parent object of a property key
    */
  var parent: PropertyInfo = js.native
  
  /**
    * Returns a list of property keys, which represents the path to the property key of the current object.
    */
  def propertyPath(): js.Array[String] = js.native
}
object PropertyInfo {
  
  @scala.inline
  def apply(
    isArray: Boolean,
    key: String,
    occurrence: Double,
    parent: PropertyInfo,
    propertyPath: () => js.Array[String]
  ): PropertyInfo = {
    val __obj = js.Dynamic.literal(isArray = isArray.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], occurrence = occurrence.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], propertyPath = js.Any.fromFunction0(propertyPath))
    __obj.asInstanceOf[PropertyInfo]
  }
  
  @scala.inline
  implicit class PropertyInfoOps[Self <: PropertyInfo] (val x: Self) extends AnyVal {
    
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
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrence(value: Double): Self = this.set("occurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: PropertyInfo): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyPath(value: () => js.Array[String]): Self = this.set("propertyPath", js.Any.fromFunction0(value))
  }
}
