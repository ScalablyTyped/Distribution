package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProperties extends js.Object {
  
  var nestingLevels: js.UndefOr[js.Array[NestingLevel]] = js.native
}
object ListProperties {
  
  @scala.inline
  def apply(): ListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProperties]
  }
  
  @scala.inline
  implicit class ListPropertiesOps[Self <: ListProperties] (val x: Self) extends AnyVal {
    
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
    def setNestingLevelsVarargs(value: NestingLevel*): Self = this.set("nestingLevels", js.Array(value :_*))
    
    @scala.inline
    def setNestingLevels(value: js.Array[NestingLevel]): Self = this.set("nestingLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevels: Self = this.set("nestingLevels", js.undefined)
  }
}
