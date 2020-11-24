package typings.gherkin.anon

import typings.cucumberMessages.idGeneratorMod.NewId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultDialect extends js.Object {
  
  var defaultDialect: js.UndefOr[String] = js.native
  
  var includeGherkinDocument: js.UndefOr[Boolean] = js.native
  
  var includePickles: js.UndefOr[Boolean] = js.native
  
  var includeSource: js.UndefOr[Boolean] = js.native
  
  var newId: js.UndefOr[NewId] = js.native
}
object DefaultDialect {
  
  @scala.inline
  def apply(): DefaultDialect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultDialect]
  }
  
  @scala.inline
  implicit class DefaultDialectOps[Self <: DefaultDialect] (val x: Self) extends AnyVal {
    
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
    def setDefaultDialect(value: String): Self = this.set("defaultDialect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDialect: Self = this.set("defaultDialect", js.undefined)
    
    @scala.inline
    def setIncludeGherkinDocument(value: Boolean): Self = this.set("includeGherkinDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGherkinDocument: Self = this.set("includeGherkinDocument", js.undefined)
    
    @scala.inline
    def setIncludePickles(value: Boolean): Self = this.set("includePickles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePickles: Self = this.set("includePickles", js.undefined)
    
    @scala.inline
    def setIncludeSource(value: Boolean): Self = this.set("includeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSource: Self = this.set("includeSource", js.undefined)
    
    @scala.inline
    def setNewId(value: () => String): Self = this.set("newId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNewId: Self = this.set("newId", js.undefined)
  }
}
