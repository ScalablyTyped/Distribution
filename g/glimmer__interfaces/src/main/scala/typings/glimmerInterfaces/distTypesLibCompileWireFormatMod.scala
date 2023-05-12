package typings.glimmerInterfaces

import org.scalablytyped.runtime.StringDictionary
import typings.glimmerInterfaces.distTypesLibArrayMod.PresentArray
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.ConcatParams
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.ElementParameters
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.EvalInfo
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.GetVar
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Value
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibCurryMod.CurriedType
import typings.glimmerInterfaces.glimmerInterfacesInts.`0`
import typings.glimmerInterfaces.glimmerInterfacesInts.`10`
import typings.glimmerInterfaces.glimmerInterfacesInts.`11`
import typings.glimmerInterfaces.glimmerInterfacesInts.`12`
import typings.glimmerInterfaces.glimmerInterfacesInts.`13`
import typings.glimmerInterfaces.glimmerInterfacesInts.`14`
import typings.glimmerInterfaces.glimmerInterfacesInts.`15`
import typings.glimmerInterfaces.glimmerInterfacesInts.`16`
import typings.glimmerInterfaces.glimmerInterfacesInts.`17`
import typings.glimmerInterfaces.glimmerInterfacesInts.`18`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1`
import typings.glimmerInterfaces.glimmerInterfacesInts.`20`
import typings.glimmerInterfaces.glimmerInterfacesInts.`21`
import typings.glimmerInterfaces.glimmerInterfacesInts.`22`
import typings.glimmerInterfaces.glimmerInterfacesInts.`23`
import typings.glimmerInterfaces.glimmerInterfacesInts.`24`
import typings.glimmerInterfaces.glimmerInterfacesInts.`26`
import typings.glimmerInterfaces.glimmerInterfacesInts.`27`
import typings.glimmerInterfaces.glimmerInterfacesInts.`28`
import typings.glimmerInterfaces.glimmerInterfacesInts.`29`
import typings.glimmerInterfaces.glimmerInterfacesInts.`2`
import typings.glimmerInterfaces.glimmerInterfacesInts.`30`
import typings.glimmerInterfaces.glimmerInterfacesInts.`31`
import typings.glimmerInterfaces.glimmerInterfacesInts.`32`
import typings.glimmerInterfaces.glimmerInterfacesInts.`34`
import typings.glimmerInterfaces.glimmerInterfacesInts.`35`
import typings.glimmerInterfaces.glimmerInterfacesInts.`36`
import typings.glimmerInterfaces.glimmerInterfacesInts.`37`
import typings.glimmerInterfaces.glimmerInterfacesInts.`38`
import typings.glimmerInterfaces.glimmerInterfacesInts.`39`
import typings.glimmerInterfaces.glimmerInterfacesInts.`3`
import typings.glimmerInterfaces.glimmerInterfacesInts.`40`
import typings.glimmerInterfaces.glimmerInterfacesInts.`41`
import typings.glimmerInterfaces.glimmerInterfacesInts.`42`
import typings.glimmerInterfaces.glimmerInterfacesInts.`43`
import typings.glimmerInterfaces.glimmerInterfacesInts.`44`
import typings.glimmerInterfaces.glimmerInterfacesInts.`45`
import typings.glimmerInterfaces.glimmerInterfacesInts.`46`
import typings.glimmerInterfaces.glimmerInterfacesInts.`48`
import typings.glimmerInterfaces.glimmerInterfacesInts.`49`
import typings.glimmerInterfaces.glimmerInterfacesInts.`4`
import typings.glimmerInterfaces.glimmerInterfacesInts.`50`
import typings.glimmerInterfaces.glimmerInterfacesInts.`51`
import typings.glimmerInterfaces.glimmerInterfacesInts.`52`
import typings.glimmerInterfaces.glimmerInterfacesInts.`53`
import typings.glimmerInterfaces.glimmerInterfacesInts.`54`
import typings.glimmerInterfaces.glimmerInterfacesInts.`5`
import typings.glimmerInterfaces.glimmerInterfacesInts.`6`
import typings.glimmerInterfaces.glimmerInterfacesInts.`7`
import typings.glimmerInterfaces.glimmerInterfacesInts.`8`
import typings.glimmerInterfaces.glimmerInterfacesInts.`99`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibCompileWireFormatMod {
  
  type Argument = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Argument
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`14`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`24`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`15`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`22`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`16`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`23`
  */
  trait AttrOp extends StObject
  
  type Attribute = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Attribute
  
  object Core {
    
    type Args = js.Tuple2[Params, Hash]
    
    type Blocks = Option[js.Tuple2[js.Array[String], js.Array[SerializedInlineBlock]]]
    
    type CallArgs = js.Tuple2[Params, Hash]
    
    type ConcatParams = PresentArray[typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Expression]
    
    type ElementParameters = Option[PresentArray[ElementParameter]]
    
    type EvalInfo = js.Array[Double]
    
    type Expression = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
    
    type Hash = Option[
        js.Tuple2[
          PresentArray[String], 
          PresentArray[typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Expression]
        ]
      ]
    
    type NamedBlock = js.Tuple2[String, SerializedInlineBlock]
    
    type Params = Option[ConcatParams]
    
    type Path = Array[String]
    
    type Syntax = Path | Params | ConcatParams | Hash | Blocks | Args | EvalInfo
  }
  
  type CoreSyntax = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Syntax
  
  type ElementParameter = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.ElementParameter
  
  type Expression = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
  
  type ExpressionSexpOpcode = /* import warning: importer.ImportType#apply Failed type conversion: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression[0] */ js.Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ TSexpOpcode in @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression[0] ]: std.Extract<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression, {  0 :TSexpOpcode}>}
    }}}
    */
  @js.native
  trait ExpressionSexpOpcodeMap extends StObject
  
  object Expressions {
    
    type BooleanValue = Boolean
    
    type Concat = js.Tuple2[`29`, ConcatParams]
    
    type Curry = js.Tuple5[
        `50`, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression, 
        CurriedType, 
        Params, 
        Hash
      ]
    
    type Expression = js.UndefOr[
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.TupleExpression | Value
      ]
    
    type Get = GetVar | GetPath
    
    type GetContextualFree = GetFreeAsComponentOrHelperHeadOrThisFallback | GetFreeAsComponentOrHelperHead | GetFreeAsHelperHeadOrThisFallback | GetFreeAsDeprecatedHelperHeadOrThisFallback | GetFreeAsHelperHead | GetFreeAsModifierHead | GetFreeAsComponentHead
    
    type GetDynamicVar = js.Tuple2[
        `53`, 
        /* value */ typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
      ]
    
    type GetFree = GetStrictFree | GetContextualFree
    
    type GetFreeAsComponentHead = js.Tuple2[`39`, Double]
    
    type GetFreeAsComponentOrHelperHead = js.Tuple2[`35`, Double]
    
    type GetFreeAsComponentOrHelperHeadOrThisFallback = js.Tuple2[`34`, Double]
    
    type GetFreeAsDeprecatedHelperHeadOrThisFallback = js.Tuple2[`99`, Double]
    
    type GetFreeAsHelperHead = js.Tuple2[`37`, Double]
    
    type GetFreeAsHelperHeadOrThisFallback = js.Tuple2[`36`, Double]
    
    type GetFreeAsModifierHead = js.Tuple2[`38`, Double]
    
    type GetPath = GetPathSymbol | GetPathTemplateSymbol | GetPathFree
    
    type GetPathContextualFree = GetPathFreeAsComponentOrHelperHeadOrThisFallback | GetPathFreeAsComponentOrHelperHead | GetPathFreeAsHelperHeadOrThisFallback | GetPathFreeAsDeprecatedHelperHeadOrThisFallback | GetPathFreeAsHelperHead | GetPathFreeAsModifierHead | GetPathFreeAsComponentHead
    
    type GetPathFree = GetPathStrictFree | GetPathContextualFree
    
    type GetPathFreeAsComponentHead = js.Tuple3[`39`, Double, Path]
    
    type GetPathFreeAsComponentOrHelperHead = js.Tuple3[`35`, Double, Path]
    
    type GetPathFreeAsComponentOrHelperHeadOrThisFallback = js.Tuple3[`34`, Double, Path]
    
    type GetPathFreeAsDeprecatedHelperHeadOrThisFallback = js.Tuple3[`99`, Double, Path]
    
    type GetPathFreeAsHelperHead = js.Tuple3[`37`, Double, Path]
    
    type GetPathFreeAsHelperHeadOrThisFallback = js.Tuple3[`36`, Double, Path]
    
    type GetPathFreeAsModifierHead = js.Tuple3[`38`, Double, Path]
    
    type GetPathStrictFree = js.Tuple3[`31`, Double, Path]
    
    type GetPathSymbol = js.Tuple3[`30`, Double, Path]
    
    type GetPathTemplateSymbol = js.Tuple3[`32`, Double, Path]
    
    type GetStrictFree = js.Tuple2[`31`, Double]
    
    type GetSymbol = js.Tuple2[`30`, Double]
    
    type GetTemplateSymbol = js.Tuple2[`32`, Double]
    
    type GetVar = GetSymbol | GetTemplateSymbol | GetFree
    
    type HasBlock = js.Tuple2[
        `48`, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
      ]
    
    type HasBlockParams = js.Tuple2[
        `49`, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
      ]
    
    type Hash = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Hash
    
    type Helper = js.Tuple4[
        `28`, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression, 
        Option[Params], 
        Hash
      ]
    
    type IfInline = js.Tuple4[
        `52`, 
        /* condition */ typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression, 
        /* truthyValue */ typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression, 
        /* falsyValue */ js.UndefOr[
          Option[
            typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
          ]
        ]
      ]
    
    type Log = js.Tuple2[`54`, /* positional */ Params]
    
    type Not = js.Tuple2[
        `51`, 
        /* value */ typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
      ]
    
    type NullValue = Null
    
    type NumberValue = Double
    
    type Params = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Params
    
    type Path = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Path
    
    type StringValue = String
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type TupleExpression = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Get | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Undefined | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.HighLevelOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.HighLevelResolutionOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.ResolveComponentOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.ResolveComponentOrHelperOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.ResolveHelperOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.ResolveModifierOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.ResolveOptionalComponentOrHelperOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/encoder.ResolveOptionalHelperOp
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Args
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.CallArgs
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    */
    type TupleExpression = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Get | Any | Undefined
    
    type Undefined = js.Array[`27`]
    
    type Value = StringValue | NumberValue | BooleanValue | NullValue
  }
  
  type Get = GetVar
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`34`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`35`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`36`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`37`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`38`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`39`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`31`
  */
  trait GetContextualFreeOp extends StObject
  
  type JsonArray = js.Array[JsonValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonObject = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Dict<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonValue>
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonObject
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonValue
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Dict
  */
  trait JsonObject
    extends StObject
       with /* key */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonValue = string | number | boolean | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonObject | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonArray
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.JsonValue
  */
  type JsonValue = String | Double | Boolean | JsonObject | Any
  
  type SerializedBlock = js.Array[
    /* statements */ js.Array[typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Statement]
  ]
  
  type SerializedInlineBlock = js.Tuple2[
    /* statements */ js.Array[typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Statement], 
    /* parameters */ js.Array[Double]
  ]
  
  trait SerializedTemplate extends StObject {
    
    var block: SerializedTemplateBlock
    
    var id: js.UndefOr[Option[String]] = js.undefined
    
    var moduleName: String
  }
  object SerializedTemplate {
    
    inline def apply(block: SerializedTemplateBlock, moduleName: String): SerializedTemplate = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedTemplate] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: SerializedTemplateBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setId(value: Option[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    }
  }
  
  type SerializedTemplateBlock = js.Tuple4[
    js.Array[
      // statements
  typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Statement
    ], 
    js.Array[// symbols
  String], 
    // hasEval
  Boolean, 
    js.Array[// upvars
  String]
  ]
  
  type SerializedTemplateBlockJSON = String
  
  trait SerializedTemplateWithLazyBlock extends StObject {
    
    var block: SerializedTemplateBlockJSON
    
    var id: js.UndefOr[Option[String]] = js.undefined
    
    var isStrictMode: Boolean
    
    var moduleName: String
    
    var scope: js.UndefOr[js.Function0[js.Array[Any]] | Null] = js.undefined
  }
  object SerializedTemplateWithLazyBlock {
    
    inline def apply(block: SerializedTemplateBlockJSON, isStrictMode: Boolean, moduleName: String): SerializedTemplateWithLazyBlock = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], isStrictMode = isStrictMode.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedTemplateWithLazyBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedTemplateWithLazyBlock] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: SerializedTemplateBlockJSON): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setId(value: Option[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsStrictMode(value: Boolean): Self = StObject.set(x, "isStrictMode", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setScope(value: () => js.Array[Any]): Self = StObject.set(x, "scope", js.Any.fromFunction0(value))
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type SexpOpcode = /* keyof @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpOpcodeMap */ String
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ TSexpOpcode in @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression[0] ]: std.Extract<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression, {  0 :TSexpOpcode}>}
  - Dropped {[ TSexpOpcode in @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement[0] ]: std.Extract<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement, {  0 :TSexpOpcode}>} */ trait SexpOpcodeMap extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`2`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`3`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`4`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`5`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`6`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`7`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`8`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`10`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`11`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`12`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`13`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`14`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`15`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`16`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`17`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`18`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`20`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`21`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`22`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`23`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`24`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`26`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`27`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`28`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`29`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`30`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`32`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`31`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`34`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`35`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`36`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`99`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`37`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`38`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`39`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`40`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`41`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`42`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`43`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`44`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`45`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`46`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`48`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`49`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`50`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`51`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`52`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`53`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`54`
  */
  trait SexpOpcodes extends StObject
  object SexpOpcodes {
    
    // Statements
    inline def Append: `1` = 1.asInstanceOf[`1`]
    
    inline def AttrSplat: `17` = 17.asInstanceOf[`17`]
    
    inline def Block: `6` = 6.asInstanceOf[`6`]
    
    inline def Call: `28` = 28.asInstanceOf[`28`]
    
    inline def CloseElement: `13` = 13.asInstanceOf[`13`]
    
    inline def Comment: `3` = 3.asInstanceOf[`3`]
    
    inline def Component: `8` = 8.asInstanceOf[`8`]
    
    inline def ComponentAttr: `16` = 16.asInstanceOf[`16`]
    
    inline def Concat: `29` = 29.asInstanceOf[`29`]
    
    inline def Curry: `50` = 50.asInstanceOf[`50`]
    
    inline def Debugger: `26` = 26.asInstanceOf[`26`]
    
    inline def DynamicArg: `20` = 20.asInstanceOf[`20`]
    
    inline def DynamicAttr: `15` = 15.asInstanceOf[`15`]
    
    inline def Each: `42` = 42.asInstanceOf[`42`]
    
    inline def FlushElement: `12` = 12.asInstanceOf[`12`]
    
    inline def GetContextualFreeStart: `34` = 34.asInstanceOf[`34`]
    
    inline def GetDynamicVar: `53` = 53.asInstanceOf[`53`]
    
    inline def GetEnd: `39` = 39.asInstanceOf[`39`]
    
    inline def GetFreeAsComponentHead: `39` = 39.asInstanceOf[`39`]
    
    // a component or helper (`{{<expr> x}}` in append position)
    inline def GetFreeAsComponentOrHelperHead: `35` = 35.asInstanceOf[`35`]
    
    // `{{x}}` in append position (might be a helper or component invocation, otherwise fall back to `this`)
    inline def GetFreeAsComponentOrHelperHeadOrThisFallback: `34` = 34.asInstanceOf[`34`]
    
    // a helper or `this` fallback (deprecated) `@arg={{x}}`
    inline def GetFreeAsDeprecatedHelperHeadOrThisFallback: `99` = 99.asInstanceOf[`99`]
    
    // a call head `(x)`
    inline def GetFreeAsHelperHead: `37` = 37.asInstanceOf[`37`]
    
    // a helper or `this` fallback `attr={{x}}`
    inline def GetFreeAsHelperHeadOrThisFallback: `36` = 36.asInstanceOf[`36`]
    
    inline def GetFreeAsModifierHead: `38` = 38.asInstanceOf[`38`]
    
    inline def GetLooseFreeEnd: `39` = 39.asInstanceOf[`39`]
    
    inline def GetLooseFreeStart: `34` = 34.asInstanceOf[`34`]
    
    inline def GetStart: `30` = 30.asInstanceOf[`30`]
    
    // Free variables are only keywords in strict mode
    inline def GetStrictFree: `31` = 31.asInstanceOf[`31`]
    
    // Get
    // Get a local value via symbol
    inline def GetSymbol: `30` = 30.asInstanceOf[`30`]
    
    // GetPath + 0-2,
    // Template symbol are values that are in scope in the template in strict mode
    inline def GetTemplateSymbol: `32` = 32.asInstanceOf[`32`]
    
    // Keyword Expressions
    inline def HasBlock: `48` = 48.asInstanceOf[`48`]
    
    inline def HasBlockParams: `49` = 49.asInstanceOf[`49`]
    
    inline def If: `41` = 41.asInstanceOf[`41`]
    
    inline def IfInline: `52` = 52.asInstanceOf[`52`]
    
    // Keyword Statements
    inline def InElement: `40` = 40.asInstanceOf[`40`]
    
    inline def InvokeComponent: `46` = 46.asInstanceOf[`46`]
    
    inline def Let: `44` = 44.asInstanceOf[`44`]
    
    inline def Log: `54` = 54.asInstanceOf[`54`]
    
    inline def Modifier: `4` = 4.asInstanceOf[`4`]
    
    inline def Not: `51` = 51.asInstanceOf[`51`]
    
    inline def OpenElement: `10` = 10.asInstanceOf[`10`]
    
    inline def OpenElementWithSplat: `11` = 11.asInstanceOf[`11`]
    
    inline def StaticArg: `21` = 21.asInstanceOf[`21`]
    
    inline def StaticAttr: `14` = 14.asInstanceOf[`14`]
    
    inline def StaticComponentAttr: `24` = 24.asInstanceOf[`24`]
    
    inline def StrictBlock: `7` = 7.asInstanceOf[`7`]
    
    inline def StrictModifier: `5` = 5.asInstanceOf[`5`]
    
    inline def TrustingAppend: `2` = 2.asInstanceOf[`2`]
    
    inline def TrustingComponentAttr: `23` = 23.asInstanceOf[`23`]
    
    inline def TrustingDynamicAttr: `22` = 22.asInstanceOf[`22`]
    
    // Expressions
    inline def Undefined: `27` = 27.asInstanceOf[`27`]
    
    inline def With: `43` = 43.asInstanceOf[`43`]
    
    inline def WithDynamicVars: `45` = 45.asInstanceOf[`45`]
    
    inline def Yield: `18` = 18.asInstanceOf[`18`]
  }
  
  type SexpSyntax = Statement | TupleExpression
  
  type Statement = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Statement
  
  type StatementSexpOpcode = /* import warning: importer.ImportType#apply Failed type conversion: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement[0] */ js.Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ TSexpOpcode in @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement[0] ]: std.Extract<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement, {  0 :TSexpOpcode}>}
    }}}
    */
  @js.native
  trait StatementSexpOpcodeMap extends StObject
  
  object Statements {
    
    type AnyDynamicAttr = DynamicAttr | ComponentAttr | TrustingDynamicAttr | TrustingComponentAttr
    
    type AnyStaticAttr = StaticAttr | StaticComponentAttr
    
    type Append = js.Tuple2[
        `1`, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression
      ]
    
    type Argument = StaticArg | DynamicArg
    
    type AttrSplat = js.Tuple2[`17`, YieldTo]
    
    type Attribute = StaticAttr | StaticComponentAttr | DynamicAttr | TrustingDynamicAttr | ComponentAttr | TrustingComponentAttr
    
    type Block = js.Tuple5[
        `6`, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression, 
        Params, 
        Hash, 
        Blocks
      ]
    
    type Blocks = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Blocks
    
    type CloseElement = js.Array[`13`]
    
    type Comment = js.Tuple2[`3`, String]
    
    type Component = js.Tuple5[
        `8`, 
        /* tag */ typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression, 
        /* parameters */ ElementParameters, 
        /* args */ Hash, 
        /* blocks */ Blocks
      ]
    
    type ComponentAttr = js.Tuple4[
        `16`, 
        String | WellKnownAttrName, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression, 
        js.UndefOr[String]
      ]
    
    type ComponentFeature = Modifier | AttrSplat
    
    type Debugger = js.Tuple2[`26`, EvalInfo]
    
    type DynamicArg = js.Tuple3[
        `20`, 
        String, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression
      ]
    
    type DynamicAttr = js.Tuple4[
        `15`, 
        String | WellKnownAttrName, 
        typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression, 
        js.UndefOr[String]
      ]
    
    type Each = js.Tuple5[
        `42`, 
        /* condition */ typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression, 
        /* key */ Option[typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Expression], 
        /* block */ SerializedInlineBlock, 
        /* inverse */ Option[SerializedInlineBlock]
      ]
    
    type ElementParameter = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Attribute | typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Argument | ComponentFeature
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Expression = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression | undefined
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyDynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    */
    type Expression = js.UndefOr[Any]
    
    type FlushElement = js.Array[`12`]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Hash = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
    */
    type Hash = Any
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type If = [op: 41, condition: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, block: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock, inverse: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Option<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock>]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    */
    type If = js.Tuple4[
        `41`, 
        /* condition */ Any, 
        /* block */ SerializedInlineBlock, 
        /* inverse */ Option[SerializedInlineBlock]
      ]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type InElement = [op: 40, block: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock, guid: string, destination: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, insertBefore: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression | undefined]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    */
    type InElement = js.Tuple5[
        `40`, 
        /* block */ SerializedInlineBlock, 
        /* guid */ String, 
        /* destination */ Any, 
        /* insertBefore */ js.UndefOr[Any]
      ]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type InvokeComponent = [op: 46, definition: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, positional: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params, named: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash, blocks: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks | null]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    */
    type InvokeComponent = js.Tuple5[
        `46`, 
        /* definition */ Any, 
        /* positional */ Any, 
        /* named */ Any, 
        /* blocks */ Blocks | Null
      ]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Let = [op: 44, positional: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params, block: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    */
    type Let = js.Tuple3[`44`, /* positional */ Any, /* block */ SerializedInlineBlock]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Modifier = [4, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
    */
    type Modifier = js.Tuple4[`4`, Any, Params, Any]
    
    type OpenElement = js.Tuple2[`10`, String | WellKnownTagName]
    
    type OpenElementWithSplat = js.Tuple2[`11`, String | WellKnownTagName]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Params = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
    */
    type Params = Any
    
    type Path = typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Path
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Statement = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Comment | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.OpenElement | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.OpenElementWithSplat | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.FlushElement | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.CloseElement | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AttrSplat | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Yield | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Debugger | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    */
    type Statement = Any | TrustingAppend | Comment | OpenElement | OpenElementWithSplat | FlushElement | CloseElement | AttrSplat | Yield | StaticArg | Debugger | With | WithDynamicVars
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type StaticArg = [21, string, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
    */
    type StaticArg = js.Tuple3[`21`, String, Any]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type StaticAttr = [14, string | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.WellKnownAttrName, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, string | undefined]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyStaticAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
    */
    type StaticAttr = js.Tuple4[`14`, String | WellKnownAttrName, Any, js.UndefOr[String]]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type StaticComponentAttr = [24, string | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.WellKnownAttrName, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, string | undefined]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyStaticAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
    */
    type StaticComponentAttr = js.Tuple4[`24`, String | WellKnownAttrName, Any, js.UndefOr[String]]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type TrustingAppend = [2, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
    */
    type TrustingAppend = js.Tuple2[`2`, Any]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type TrustingComponentAttr = [23, string | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.WellKnownAttrName, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, string | undefined]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyDynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
    */
    type TrustingComponentAttr = js.Tuple4[`23`, String | WellKnownAttrName, Any, js.UndefOr[String]]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type TrustingDynamicAttr = [22, string | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.WellKnownAttrName, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, string | undefined]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyDynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
    */
    type TrustingDynamicAttr = js.Tuple4[`22`, String | WellKnownAttrName, Any, js.UndefOr[String]]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type With = [op: 43, value: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression, block: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock, inverse: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Option<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock>]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
    */
    type With = js.Tuple4[`43`, /* value */ Any, /* block */ Any, /* inverse */ Option[Any]]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type WithDynamicVars = [op: 45, args: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash, block: @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars
    */
    type WithDynamicVars = js.Tuple3[`45`, /* args */ Any, /* block */ Any]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Yield = [18, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.YieldTo, @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Option<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params>]
    }}}
    to avoid circular code involving: 
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars
    - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Yield
    */
    type Yield = js.Tuple3[`18`, YieldTo, Option[Any]]
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Syntax = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Value | undefined
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Yield
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Syntax
  */
  type Syntax = js.UndefOr[Any | Value]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SyntaxWithInternal = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Syntax | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.CallArgs | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Args
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.CallArgs
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.NamedBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Syntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.CoreSyntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Yield
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Syntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SyntaxWithInternal
  */
  type SyntaxWithInternal = Any
  
  type TemplateJavascript = String
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TemplateReference = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Option<@glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock>
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Yield
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TemplateReference
  */
  type TemplateReference = Option[Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TupleExpression = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Syntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SyntaxWithInternal
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression
  */
  type TupleExpression = Any
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TupleSyntax = @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement | @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression
  }}}
  to avoid circular code involving: 
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/array.PresentArray
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ConcatParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.ElementParameters
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Core.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Concat
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Curry
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.GetDynamicVar
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.HasBlockParams
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Helper
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.IfInline
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Log
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Not
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Expressions.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Append
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Argument
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Attribute
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Block
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Blocks
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Component
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ComponentFeature
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.DynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Each
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.ElementParameter
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Expression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Hash
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.If
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InElement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.InvokeComponent
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Let
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Modifier
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Params
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticArg
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.StaticComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingAppend
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingComponentAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.TrustingDynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.With
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.WithDynamicVars
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.Yield
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleSyntax
  */
  type TupleSyntax = Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`0`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`2`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`3`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`5`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`6`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`7`
  */
  trait VariableResolutionContext extends StObject
  object VariableResolutionContext {
    
    inline def AmbiguousAppend: `1` = 1.asInstanceOf[`1`]
    
    inline def AmbiguousAppendInvoke: `2` = 2.asInstanceOf[`2`]
    
    inline def AmbiguousInvoke: `3` = 3.asInstanceOf[`3`]
    
    inline def ResolveAsCallHead: `5` = 5.asInstanceOf[`5`]
    
    inline def ResolveAsComponentHead: `7` = 7.asInstanceOf[`7`]
    
    inline def ResolveAsModifierHead: `6` = 6.asInstanceOf[`6`]
    
    inline def Strict: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`0`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`2`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`3`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`4`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`5`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`6`
  */
  trait WellKnownAttrName extends StObject
  object WellKnownAttrName {
    
    inline def `class`: `0` = 0.asInstanceOf[`0`]
    
    inline def href: `6` = 6.asInstanceOf[`6`]
    
    inline def id: `1` = 1.asInstanceOf[`1`]
    
    inline def name: `3` = 3.asInstanceOf[`3`]
    
    inline def style: `5` = 5.asInstanceOf[`5`]
    
    inline def `type`: `4` = 4.asInstanceOf[`4`]
    
    inline def value: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`0`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`2`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`3`
  */
  trait WellKnownTagName extends StObject
  object WellKnownTagName {
    
    inline def a: `3` = 3.asInstanceOf[`3`]
    
    inline def div: `0` = 0.asInstanceOf[`0`]
    
    inline def p: `2` = 2.asInstanceOf[`2`]
    
    inline def span: `1` = 1.asInstanceOf[`1`]
  }
  
  type YieldTo = Double
}
