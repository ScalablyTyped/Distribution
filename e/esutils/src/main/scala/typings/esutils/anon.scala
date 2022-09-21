package typings.esutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecodeUtf16 extends StObject {
    
    def decodeUtf16(lead: Any, trail: Any): Any
    
    def isIdentifierES5(id: Any, strict: Any): Boolean
    
    def isIdentifierES6(id: Any, strict: Any): Boolean
    
    def isIdentifierNameES5(id: Any): Boolean
    
    def isIdentifierNameES6(id: Any): Boolean
    
    def isKeywordES5(id: Any, strict: Any): Boolean
    
    def isKeywordES6(id: Any, strict: Any): Boolean
    
    def isReservedWordES5(id: Any, strict: Any): Boolean
    
    def isReservedWordES6(id: Any, strict: Any): Boolean
    
    def isRestrictedWord(id: Any): Boolean
    
    def isStrictModeReservedWordES6(id: Any): Boolean
  }
  object DecodeUtf16 {
    
    inline def apply(
      decodeUtf16: (Any, Any) => Any,
      isIdentifierES5: (Any, Any) => Boolean,
      isIdentifierES6: (Any, Any) => Boolean,
      isIdentifierNameES5: Any => Boolean,
      isIdentifierNameES6: Any => Boolean,
      isKeywordES5: (Any, Any) => Boolean,
      isKeywordES6: (Any, Any) => Boolean,
      isReservedWordES5: (Any, Any) => Boolean,
      isReservedWordES6: (Any, Any) => Boolean,
      isRestrictedWord: Any => Boolean,
      isStrictModeReservedWordES6: Any => Boolean
    ): DecodeUtf16 = {
      val __obj = js.Dynamic.literal(decodeUtf16 = js.Any.fromFunction2(decodeUtf16), isIdentifierES5 = js.Any.fromFunction2(isIdentifierES5), isIdentifierES6 = js.Any.fromFunction2(isIdentifierES6), isIdentifierNameES5 = js.Any.fromFunction1(isIdentifierNameES5), isIdentifierNameES6 = js.Any.fromFunction1(isIdentifierNameES6), isKeywordES5 = js.Any.fromFunction2(isKeywordES5), isKeywordES6 = js.Any.fromFunction2(isKeywordES6), isReservedWordES5 = js.Any.fromFunction2(isReservedWordES5), isReservedWordES6 = js.Any.fromFunction2(isReservedWordES6), isRestrictedWord = js.Any.fromFunction1(isRestrictedWord), isStrictModeReservedWordES6 = js.Any.fromFunction1(isStrictModeReservedWordES6))
      __obj.asInstanceOf[DecodeUtf16]
    }
    
    extension [Self <: DecodeUtf16](x: Self) {
      
      inline def setDecodeUtf16(value: (Any, Any) => Any): Self = StObject.set(x, "decodeUtf16", js.Any.fromFunction2(value))
      
      inline def setIsIdentifierES5(value: (Any, Any) => Boolean): Self = StObject.set(x, "isIdentifierES5", js.Any.fromFunction2(value))
      
      inline def setIsIdentifierES6(value: (Any, Any) => Boolean): Self = StObject.set(x, "isIdentifierES6", js.Any.fromFunction2(value))
      
      inline def setIsIdentifierNameES5(value: Any => Boolean): Self = StObject.set(x, "isIdentifierNameES5", js.Any.fromFunction1(value))
      
      inline def setIsIdentifierNameES6(value: Any => Boolean): Self = StObject.set(x, "isIdentifierNameES6", js.Any.fromFunction1(value))
      
      inline def setIsKeywordES5(value: (Any, Any) => Boolean): Self = StObject.set(x, "isKeywordES5", js.Any.fromFunction2(value))
      
      inline def setIsKeywordES6(value: (Any, Any) => Boolean): Self = StObject.set(x, "isKeywordES6", js.Any.fromFunction2(value))
      
      inline def setIsReservedWordES5(value: (Any, Any) => Boolean): Self = StObject.set(x, "isReservedWordES5", js.Any.fromFunction2(value))
      
      inline def setIsReservedWordES6(value: (Any, Any) => Boolean): Self = StObject.set(x, "isReservedWordES6", js.Any.fromFunction2(value))
      
      inline def setIsRestrictedWord(value: Any => Boolean): Self = StObject.set(x, "isRestrictedWord", js.Any.fromFunction1(value))
      
      inline def setIsStrictModeReservedWordES6(value: Any => Boolean): Self = StObject.set(x, "isStrictModeReservedWordES6", js.Any.fromFunction1(value))
    }
  }
  
  trait IsDecimalDigit extends StObject {
    
    def isDecimalDigit(ch: Any): Boolean
    
    def isHexDigit(ch: Any): Boolean
    
    def isIdentifierPartES5(ch: Any): Boolean
    
    def isIdentifierPartES6(ch: Any): Boolean
    
    def isIdentifierStartES5(ch: Any): Boolean
    
    def isIdentifierStartES6(ch: Any): Boolean
    
    def isLineTerminator(ch: Any): Boolean
    
    def isOctalDigit(ch: Any): Boolean
    
    def isWhiteSpace(ch: Any): Boolean
  }
  object IsDecimalDigit {
    
    inline def apply(
      isDecimalDigit: Any => Boolean,
      isHexDigit: Any => Boolean,
      isIdentifierPartES5: Any => Boolean,
      isIdentifierPartES6: Any => Boolean,
      isIdentifierStartES5: Any => Boolean,
      isIdentifierStartES6: Any => Boolean,
      isLineTerminator: Any => Boolean,
      isOctalDigit: Any => Boolean,
      isWhiteSpace: Any => Boolean
    ): IsDecimalDigit = {
      val __obj = js.Dynamic.literal(isDecimalDigit = js.Any.fromFunction1(isDecimalDigit), isHexDigit = js.Any.fromFunction1(isHexDigit), isIdentifierPartES5 = js.Any.fromFunction1(isIdentifierPartES5), isIdentifierPartES6 = js.Any.fromFunction1(isIdentifierPartES6), isIdentifierStartES5 = js.Any.fromFunction1(isIdentifierStartES5), isIdentifierStartES6 = js.Any.fromFunction1(isIdentifierStartES6), isLineTerminator = js.Any.fromFunction1(isLineTerminator), isOctalDigit = js.Any.fromFunction1(isOctalDigit), isWhiteSpace = js.Any.fromFunction1(isWhiteSpace))
      __obj.asInstanceOf[IsDecimalDigit]
    }
    
    extension [Self <: IsDecimalDigit](x: Self) {
      
      inline def setIsDecimalDigit(value: Any => Boolean): Self = StObject.set(x, "isDecimalDigit", js.Any.fromFunction1(value))
      
      inline def setIsHexDigit(value: Any => Boolean): Self = StObject.set(x, "isHexDigit", js.Any.fromFunction1(value))
      
      inline def setIsIdentifierPartES5(value: Any => Boolean): Self = StObject.set(x, "isIdentifierPartES5", js.Any.fromFunction1(value))
      
      inline def setIsIdentifierPartES6(value: Any => Boolean): Self = StObject.set(x, "isIdentifierPartES6", js.Any.fromFunction1(value))
      
      inline def setIsIdentifierStartES5(value: Any => Boolean): Self = StObject.set(x, "isIdentifierStartES5", js.Any.fromFunction1(value))
      
      inline def setIsIdentifierStartES6(value: Any => Boolean): Self = StObject.set(x, "isIdentifierStartES6", js.Any.fromFunction1(value))
      
      inline def setIsLineTerminator(value: Any => Boolean): Self = StObject.set(x, "isLineTerminator", js.Any.fromFunction1(value))
      
      inline def setIsOctalDigit(value: Any => Boolean): Self = StObject.set(x, "isOctalDigit", js.Any.fromFunction1(value))
      
      inline def setIsWhiteSpace(value: Any => Boolean): Self = StObject.set(x, "isWhiteSpace", js.Any.fromFunction1(value))
    }
  }
  
  trait IsExpression extends StObject {
    
    def isExpression(node: Any): Boolean
    
    def isIterationStatement(node: Any): Boolean
    
    def isProblematicIfStatement(node: Any): Boolean
    
    def isSourceElement(node: Any): Boolean
    
    def isStatement(node: Any): Boolean
    
    var trailingStatement: Any
  }
  object IsExpression {
    
    inline def apply(
      isExpression: Any => Boolean,
      isIterationStatement: Any => Boolean,
      isProblematicIfStatement: Any => Boolean,
      isSourceElement: Any => Boolean,
      isStatement: Any => Boolean,
      trailingStatement: Any
    ): IsExpression = {
      val __obj = js.Dynamic.literal(isExpression = js.Any.fromFunction1(isExpression), isIterationStatement = js.Any.fromFunction1(isIterationStatement), isProblematicIfStatement = js.Any.fromFunction1(isProblematicIfStatement), isSourceElement = js.Any.fromFunction1(isSourceElement), isStatement = js.Any.fromFunction1(isStatement), trailingStatement = trailingStatement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsExpression]
    }
    
    extension [Self <: IsExpression](x: Self) {
      
      inline def setIsExpression(value: Any => Boolean): Self = StObject.set(x, "isExpression", js.Any.fromFunction1(value))
      
      inline def setIsIterationStatement(value: Any => Boolean): Self = StObject.set(x, "isIterationStatement", js.Any.fromFunction1(value))
      
      inline def setIsProblematicIfStatement(value: Any => Boolean): Self = StObject.set(x, "isProblematicIfStatement", js.Any.fromFunction1(value))
      
      inline def setIsSourceElement(value: Any => Boolean): Self = StObject.set(x, "isSourceElement", js.Any.fromFunction1(value))
      
      inline def setIsStatement(value: Any => Boolean): Self = StObject.set(x, "isStatement", js.Any.fromFunction1(value))
      
      inline def setTrailingStatement(value: Any): Self = StObject.set(x, "trailingStatement", value.asInstanceOf[js.Any])
    }
  }
}
