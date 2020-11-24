package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeApplication extends Type_ {
  
  var applications: js.Array[Type_] = js.native
  
  var expression: Type_ = js.native
  
  var `type`: typings.doctrine.doctrineStrings.TypeApplication = js.native
}
object TypeApplication {
  
  @scala.inline
  def apply(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeApplication]
  }
  
  @scala.inline
  implicit class TypeApplicationOps[Self <: TypeApplication] (val x: Self) extends AnyVal {
    
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
    def setApplicationsVarargs(value: Type_ *): Self = this.set("applications", js.Array(value :_*))
    
    @scala.inline
    def setApplications(value: js.Array[Type_]): Self = this.set("applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Type_): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.TypeApplication): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
