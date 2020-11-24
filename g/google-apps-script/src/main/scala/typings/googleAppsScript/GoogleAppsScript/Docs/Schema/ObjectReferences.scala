package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectReferences extends js.Object {
  
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}
object ObjectReferences {
  
  @scala.inline
  def apply(): ObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectReferences]
  }
  
  @scala.inline
  implicit class ObjectReferencesOps[Self <: ObjectReferences] (val x: Self) extends AnyVal {
    
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
    def setObjectIdsVarargs(value: String*): Self = this.set("objectIds", js.Array(value :_*))
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
  }
}
