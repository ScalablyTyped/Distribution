package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MustacheStatement extends StObject {
  
  def MustacheStatement(node: Any): Any
  
  var Program: Enter
  
  def SubExpression(node: Any): Any
}
object MustacheStatement {
  
  inline def apply(MustacheStatement: Any => Any, Program: Enter, SubExpression: Any => Any): MustacheStatement = {
    val __obj = js.Dynamic.literal(MustacheStatement = js.Any.fromFunction1(MustacheStatement), Program = Program.asInstanceOf[js.Any], SubExpression = js.Any.fromFunction1(SubExpression))
    __obj.asInstanceOf[MustacheStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MustacheStatement] (val x: Self) extends AnyVal {
    
    inline def setMustacheStatement(value: Any => Any): Self = StObject.set(x, "MustacheStatement", js.Any.fromFunction1(value))
    
    inline def setProgram(value: Enter): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
    
    inline def setSubExpression(value: Any => Any): Self = StObject.set(x, "SubExpression", js.Any.fromFunction1(value))
  }
}
