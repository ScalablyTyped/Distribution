package typings.estree.mod

import typings.estree.estreeStrings.constructor
import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.method
import typings.estree.estreeStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodDefinition
  extends StObject
     with BaseNode
     with Node {
  
  var computed: Boolean
  
  var key: Expression
  
  var kind: constructor | method | get | set
  
  var static: Boolean
  
  @JSName("type")
  var type_MethodDefinition: typings.estree.estreeStrings.MethodDefinition
  
  var value: FunctionExpression
}
object MethodDefinition {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    value: FunctionExpression
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodDefinition")
    __obj.asInstanceOf[MethodDefinition]
  }
  
  @scala.inline
  implicit class MethodDefinitionMutableBuilder[Self <: MethodDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: constructor | method | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.MethodDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
