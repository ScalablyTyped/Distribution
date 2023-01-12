package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<estree.estree.BlockStatement, 'type'> */
trait StaticBlock
  extends StObject
     with Statement {
  
  var body: js.Array[Statement]
  
  var innerComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var leadingComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var trailingComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  var `type`: typings.estree.estreeStrings.StaticBlock
}
object StaticBlock {
  
  inline def apply(body: js.Array[Statement]): StaticBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[StaticBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticBlock] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
    
    inline def setInnerCommentsUndefined: Self = StObject.set(x, "innerComments", js.undefined)
    
    inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
    
    inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
    
    inline def setType(value: typings.estree.estreeStrings.StaticBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
