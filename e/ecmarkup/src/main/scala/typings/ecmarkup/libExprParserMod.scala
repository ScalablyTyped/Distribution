package typings.ecmarkup

import typings.ecmarkup.anon.Contents
import typings.ecmarkup.anon.NameString
import typings.ecmarkup.anon.Value
import typings.ecmarkup.ecmarkupStrings.`record-spec`
import typings.ecmarkup.ecmarkupStrings.`sdo-call`
import typings.ecmarkup.ecmarkupStrings.call
import typings.ecmarkup.ecmarkupStrings.callee
import typings.ecmarkup.ecmarkupStrings.failure
import typings.ecmarkup.ecmarkupStrings.list
import typings.ecmarkup.ecmarkupStrings.paren
import typings.ecmarkup.ecmarkupStrings.prose
import typings.ecmarkup.ecmarkupStrings.record
import typings.ecmarkup.ecmarkupStrings.seq
import typings.std.ReturnType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExprParserMod {
  
  @JSImport("ecmarkup/lib/expr-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(src: js.Array[FragmentNode], opNames: Set[String]): Seq | Failure = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], opNames.asInstanceOf[js.Any])).asInstanceOf[Seq | Failure]
  
  inline def walk(f: js.Function2[/* expr */ Expr, /* path */ js.Array[PathItem], Unit], current: Expr): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(f.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walk(
    f: js.Function2[/* expr */ Expr, /* path */ js.Array[PathItem], Unit],
    current: Expr,
    path: js.Array[PathItem]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(f.asInstanceOf[js.Any], current.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Call
    extends StObject
       with NonSeq {
    
    var arguments: js.Array[Seq]
    
    var callee: Prose
    
    var `type`: call
  }
  object Call {
    
    inline def apply(arguments: js.Array[Seq], callee: Prose): Call = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("call")
      __obj.asInstanceOf[Call]
    }
    
    extension [Self <: Call](x: Self) {
      
      inline def setArguments(value: js.Array[Seq]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: Seq*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setCallee(value: Prose): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
      
      inline def setType(value: call): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.libExprParserMod.NonSeq
    - typings.ecmarkup.libExprParserMod.Seq
  */
  trait Expr extends StObject
  object Expr {
    
    inline def Call(arguments: js.Array[Seq], callee: Prose): typings.ecmarkup.libExprParserMod.Call = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("call")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Call]
    }
    
    inline def List(elements: js.Array[Seq]): typings.ecmarkup.libExprParserMod.List = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.List]
    }
    
    inline def Paren(items: js.Array[NonSeq]): typings.ecmarkup.libExprParserMod.Paren = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("paren")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Paren]
    }
    
    inline def Prose(parts: js.Array[ProsePart]): typings.ecmarkup.libExprParserMod.Prose = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("prose")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Prose]
    }
    
    inline def Record(members: js.Array[Value]): typings.ecmarkup.libExprParserMod.Record = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("record")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Record]
    }
    
    inline def RecordSpec(members: js.Array[NameString]): typings.ecmarkup.libExprParserMod.RecordSpec = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("record-spec")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.RecordSpec]
    }
    
    inline def SDOCall(arguments: js.Array[Seq], callee: Prose, parseNode: Seq): typings.ecmarkup.libExprParserMod.SDOCall = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], parseNode = parseNode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sdo-call")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.SDOCall]
    }
    
    inline def Seq(items: js.Array[NonSeq]): typings.ecmarkup.libExprParserMod.Seq = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("seq")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Seq]
    }
  }
  
  trait Failure extends StObject {
    
    var message: String
    
    var offset: Double
    
    var `type`: failure
  }
  object Failure {
    
    inline def apply(message: String, offset: Double): Failure = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("failure")
      __obj.asInstanceOf[Failure]
    }
    
    extension [Self <: Failure](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: failure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FragmentNode = Unarray[
    ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof parseFragment */ Any
    ]
  ]
  
  trait List
    extends StObject
       with NonSeq {
    
    var elements: js.Array[Seq]
    
    var `type`: list
  }
  object List {
    
    inline def apply(elements: js.Array[Seq]): typings.ecmarkup.libExprParserMod.List = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.List]
    }
    
    extension [Self <: typings.ecmarkup.libExprParserMod.List](x: Self) {
      
      inline def setElements(value: js.Array[Seq]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Seq*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.libExprParserMod.Prose
    - typings.ecmarkup.libExprParserMod.List
    - typings.ecmarkup.libExprParserMod.Record
    - typings.ecmarkup.libExprParserMod.RecordSpec
    - typings.ecmarkup.libExprParserMod.Call
    - typings.ecmarkup.libExprParserMod.SDOCall
    - typings.ecmarkup.libExprParserMod.Paren
  */
  trait NonSeq
    extends StObject
       with Expr
  object NonSeq {
    
    inline def Call(arguments: js.Array[Seq], callee: Prose): typings.ecmarkup.libExprParserMod.Call = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("call")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Call]
    }
    
    inline def List(elements: js.Array[Seq]): typings.ecmarkup.libExprParserMod.List = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.List]
    }
    
    inline def Paren(items: js.Array[NonSeq]): typings.ecmarkup.libExprParserMod.Paren = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("paren")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Paren]
    }
    
    inline def Prose(parts: js.Array[ProsePart]): typings.ecmarkup.libExprParserMod.Prose = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("prose")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Prose]
    }
    
    inline def Record(members: js.Array[Value]): typings.ecmarkup.libExprParserMod.Record = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("record")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.Record]
    }
    
    inline def RecordSpec(members: js.Array[NameString]): typings.ecmarkup.libExprParserMod.RecordSpec = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("record-spec")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.RecordSpec]
    }
    
    inline def SDOCall(arguments: js.Array[Seq], callee: Prose, parseNode: Seq): typings.ecmarkup.libExprParserMod.SDOCall = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], parseNode = parseNode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sdo-call")
      __obj.asInstanceOf[typings.ecmarkup.libExprParserMod.SDOCall]
    }
  }
  
  trait Paren
    extends StObject
       with NonSeq {
    
    var items: js.Array[NonSeq]
    
    var `type`: paren
  }
  object Paren {
    
    inline def apply(items: js.Array[NonSeq]): Paren = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("paren")
      __obj.asInstanceOf[Paren]
    }
    
    extension [Self <: Paren](x: Self) {
      
      inline def setItems(value: js.Array[NonSeq]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: NonSeq*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: paren): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.Index
    - typings.ecmarkup.anon.Parent
    - typings.ecmarkup.anon.IndexParent
  */
  trait PathItem extends StObject
  object PathItem {
    
    inline def Index(index: Double, parent: typings.ecmarkup.libExprParserMod.List | Record | Seq | Paren): typings.ecmarkup.anon.Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Index]
    }
    
    inline def IndexParent(index: callee | Double, parent: SDOCall): typings.ecmarkup.anon.IndexParent = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.IndexParent]
    }
    
    inline def Parent(index: callee | Double, parent: Call): typings.ecmarkup.anon.Parent = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Parent]
    }
  }
  
  trait Prose
    extends StObject
       with NonSeq {
    
    var parts: js.Array[ProsePart]
    
    var `type`: prose
  }
  object Prose {
    
    inline def apply(parts: js.Array[ProsePart]): Prose = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("prose")
      __obj.asInstanceOf[Prose]
    }
    
    extension [Self <: Prose](x: Self) {
      
      inline def setParts(value: js.Array[ProsePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: ProsePart*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setType(value: prose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ProsePart = FragmentNode | Contents
  
  trait Record
    extends StObject
       with NonSeq {
    
    var members: js.Array[Value]
    
    var `type`: record
  }
  object Record {
    
    inline def apply(members: js.Array[Value]): Record = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("record")
      __obj.asInstanceOf[Record]
    }
    
    extension [Self <: Record](x: Self) {
      
      inline def setMembers(value: js.Array[Value]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: Value*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setType(value: record): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordSpec
    extends StObject
       with NonSeq {
    
    var members: js.Array[NameString]
    
    var `type`: `record-spec`
  }
  object RecordSpec {
    
    inline def apply(members: js.Array[NameString]): RecordSpec = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("record-spec")
      __obj.asInstanceOf[RecordSpec]
    }
    
    extension [Self <: RecordSpec](x: Self) {
      
      inline def setMembers(value: js.Array[NameString]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: NameString*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setType(value: `record-spec`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SDOCall
    extends StObject
       with NonSeq {
    
    var arguments: js.Array[Seq]
    
    var callee: Prose
    
    var parseNode: Seq
    
    var `type`: `sdo-call`
  }
  object SDOCall {
    
    inline def apply(arguments: js.Array[Seq], callee: Prose, parseNode: Seq): SDOCall = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], parseNode = parseNode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sdo-call")
      __obj.asInstanceOf[SDOCall]
    }
    
    extension [Self <: SDOCall](x: Self) {
      
      inline def setArguments(value: js.Array[Seq]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: Seq*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setCallee(value: Prose): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
      
      inline def setParseNode(value: Seq): Self = StObject.set(x, "parseNode", value.asInstanceOf[js.Any])
      
      inline def setType(value: `sdo-call`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Seq
    extends StObject
       with Expr {
    
    var items: js.Array[NonSeq]
    
    var `type`: seq
  }
  object Seq {
    
    inline def apply(items: js.Array[NonSeq]): Seq = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("seq")
      __obj.asInstanceOf[Seq]
    }
    
    extension [Self <: Seq](x: Self) {
      
      inline def setItems(value: js.Array[NonSeq]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: NonSeq*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: seq): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer U> ? U : T
    }}}
    */
  @js.native
  trait Unarray[T] extends StObject
}
