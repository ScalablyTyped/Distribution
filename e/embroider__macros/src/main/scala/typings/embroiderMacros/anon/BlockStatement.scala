package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStatement extends StObject {
  
  def BlockStatement(node: Any): Any
  
  def ElementNode(node: Any): Unit
  
  def MustacheStatement(node: Any): Any
  
  var Program: Enter
  
  def SubExpression(node: Any): Any
}
object BlockStatement {
  
  inline def apply(
    BlockStatement: Any => Any,
    ElementNode: Any => Unit,
    MustacheStatement: Any => Any,
    Program: Enter,
    SubExpression: Any => Any
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(BlockStatement = js.Any.fromFunction1(BlockStatement), ElementNode = js.Any.fromFunction1(ElementNode), MustacheStatement = js.Any.fromFunction1(MustacheStatement), Program = Program.asInstanceOf[js.Any], SubExpression = js.Any.fromFunction1(SubExpression))
    __obj.asInstanceOf[BlockStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockStatement] (val x: Self) extends AnyVal {
    
    inline def setBlockStatement(value: Any => Any): Self = StObject.set(x, "BlockStatement", js.Any.fromFunction1(value))
    
    inline def setElementNode(value: Any => Unit): Self = StObject.set(x, "ElementNode", js.Any.fromFunction1(value))
    
    inline def setMustacheStatement(value: Any => Any): Self = StObject.set(x, "MustacheStatement", js.Any.fromFunction1(value))
    
    inline def setProgram(value: Enter): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
    
    inline def setSubExpression(value: Any => Any): Self = StObject.set(x, "SubExpression", js.Any.fromFunction1(value))
  }
}
