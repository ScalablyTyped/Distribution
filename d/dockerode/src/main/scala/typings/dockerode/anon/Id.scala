package typings.dockerode.anon

import typings.dockerode.dockerodeStrings.global
import typings.dockerode.dockerodeStrings.replicated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends js.Object {
  
  var id: js.UndefOr[js.Array[String]] = js.native
  
  var label: js.UndefOr[js.Array[String]] = js.native
  
  var mode: js.UndefOr[js.Array[replicated | global]] = js.native
  
  var name: js.UndefOr[js.Array[String]] = js.native
}
object Id {
  
  @scala.inline
  def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    
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
    def setIdVarargs(value: String*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: js.Array[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = this.set("label", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: js.Array[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setModeVarargs(value: (replicated | global)*): Self = this.set("mode", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: js.Array[replicated | global]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
