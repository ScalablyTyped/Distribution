package typings.formulon

import typings.formulon.anon.Length
import typings.formulon.anon.LengthNumber
import typings.formulon.formulonStrings.`null`
import typings.formulon.formulonStrings.callExpression
import typings.formulon.formulonStrings.checkbox
import typings.formulon.formulonStrings.date
import typings.formulon.formulonStrings.datetime
import typings.formulon.formulonStrings.error
import typings.formulon.formulonStrings.geolocation
import typings.formulon.formulonStrings.identifier
import typings.formulon.formulonStrings.number
import typings.formulon.formulonStrings.text
import typings.formulon.formulonStrings.time
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formulon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ast(formulaText: String): CallExpression | Identifier | Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("ast")(formulaText.asInstanceOf[js.Any]).asInstanceOf[CallExpression | Identifier | Literal]
  
  inline def extract(formulaText: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(formulaText.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parse(formulaText: String): Literal | ParseError = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(formulaText.asInstanceOf[js.Any]).asInstanceOf[Literal | ParseError]
  inline def parse(formulaText: String, substitutions: Record[String, Literal]): Literal | ParseError = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(formulaText.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Literal | ParseError]
  
  trait CallExpression extends StObject {
    
    var arguments: js.Array[CallExpression | Identifier | Literal]
    
    var id: String
    
    var `type`: callExpression
  }
  object CallExpression {
    
    inline def apply(arguments: js.Array[CallExpression | Identifier | Literal], id: String): CallExpression = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("callExpression")
      __obj.asInstanceOf[CallExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallExpression] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Array[CallExpression | Identifier | Literal]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: (CallExpression | Identifier | Literal)*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: callExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identifier extends StObject {
    
    var name: String
    
    var `type`: identifier
  }
  object Identifier {
    
    inline def apply(name: String): Identifier = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("identifier")
      __obj.asInstanceOf[Identifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formulon.anon.TypeInfoNumbertypeliteral
    - typings.formulon.anon.TypeInfoTexttypeliteralva
    - typings.formulon.anon.TypeInfoOthertypeliteralv
  */
  trait Literal extends StObject
  object Literal {
    
    inline def TypeInfoNumbertypeliteral(options: Length, value: String | Double | Boolean): typings.formulon.anon.TypeInfoNumbertypeliteral = {
      val __obj = js.Dynamic.literal(dataType = "number", options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[typings.formulon.anon.TypeInfoNumbertypeliteral]
    }
    
    inline def TypeInfoOthertypeliteralv(
      dataType: checkbox | date | time | datetime | geolocation | `null`,
      value: String | Double | Boolean
    ): typings.formulon.anon.TypeInfoOthertypeliteralv = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[typings.formulon.anon.TypeInfoOthertypeliteralv]
    }
    
    inline def TypeInfoTexttypeliteralva(options: LengthNumber, value: String | Double | Boolean): typings.formulon.anon.TypeInfoTexttypeliteralva = {
      val __obj = js.Dynamic.literal(dataType = "text", options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[typings.formulon.anon.TypeInfoTexttypeliteralva]
    }
  }
  
  trait ParseError extends StObject {
    
    var errorType: String
    
    var message: String
    
    var `type`: error
  }
  object ParseError {
    
    inline def apply(errorType: String, message: String): ParseError = {
      val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ParseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
      
      inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeInfoNumber extends StObject {
    
    var dataType: number
    
    var options: Length
  }
  object TypeInfoNumber {
    
    inline def apply(options: Length): TypeInfoNumber = {
      val __obj = js.Dynamic.literal(dataType = "number", options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfoNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfoNumber] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: number): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Length): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeInfoOther extends StObject {
    
    var dataType: checkbox | date | time | datetime | geolocation | `null`
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object TypeInfoOther {
    
    inline def apply(dataType: checkbox | date | time | datetime | geolocation | `null`): TypeInfoOther = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfoOther]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfoOther] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: checkbox | date | time | datetime | geolocation | `null`): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait TypeInfoText extends StObject {
    
    var dataType: text
    
    var options: LengthNumber
  }
  object TypeInfoText {
    
    inline def apply(options: LengthNumber): TypeInfoText = {
      val __obj = js.Dynamic.literal(dataType = "text", options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfoText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfoText] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: LengthNumber): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
