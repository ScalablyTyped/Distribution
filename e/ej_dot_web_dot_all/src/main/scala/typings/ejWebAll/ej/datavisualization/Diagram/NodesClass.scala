package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesClass extends js.Object {
  
  /** Defines the collection of attributes
    * @Default {[]}
    */
  var attributes: js.UndefOr[js.Array[NodesClassAttribute]] = js.native
  
  /** Defines the collection of methods of a Class.
    * @Default {[]}
    */
  var methods: js.UndefOr[js.Array[NodesClassMethod]] = js.native
  
  /** Sets the name of class.
    */
  var name: js.UndefOr[String] = js.native
}
object NodesClass {
  
  @scala.inline
  def apply(): NodesClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesClass]
  }
  
  @scala.inline
  implicit class NodesClassOps[Self <: NodesClass] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: NodesClassAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[NodesClassAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: NodesClassMethod*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[NodesClassMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
