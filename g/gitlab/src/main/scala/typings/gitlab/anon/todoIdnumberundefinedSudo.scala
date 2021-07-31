package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  todoId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait todoIdnumberundefinedSudo extends StObject {
  
  var sudo: js.UndefOr[String | Double] = js.undefined
  
  var todoId: js.UndefOr[Double] = js.undefined
}
object todoIdnumberundefinedSudo {
  
  @scala.inline
  def apply(): todoIdnumberundefinedSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[todoIdnumberundefinedSudo]
  }
  
  @scala.inline
  implicit class todoIdnumberundefinedSudoMutableBuilder[Self <: todoIdnumberundefinedSudo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    
    @scala.inline
    def setTodoId(value: Double): Self = StObject.set(x, "todoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodoIdUndefined: Self = StObject.set(x, "todoId", js.undefined)
  }
}
