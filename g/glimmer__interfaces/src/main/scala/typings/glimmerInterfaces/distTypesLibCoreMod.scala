package typings.glimmerInterfaces

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibCoreMod {
  
  type Destroyable = js.Object
  
  type Destructor[T /* <: Destroyable */] = js.Function1[/* destroyable */ T, Unit]
  
  type Dict[T] = StringDictionary[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    D extends @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Dict<infer V> ? V : never
    }}}
    */
  @js.native
  trait DictValue[D /* <: Dict[Any] */] extends StObject
  
  type FIXME[T, S /* <: String */] = T
  
  type Maybe[T] = js.UndefOr[Option[T] | Unit]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Option = T | null
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
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Argument
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Attribute
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
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedInlineBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SerializedTemplateBlock
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.SexpSyntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statement
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyDynamicAttr
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.Statements.AnyStaticAttr
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
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TemplateReference
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleExpression
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/compile/wire-format.TupleSyntax
  - @glimmer/interfaces.@glimmer/interfaces/dist/types/lib/core.Option
  */
  type Option[T] = T | Null
  
  type Present = js.Object | Unit
  
  type Recast[T, U] = (T & U) | U
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.anon.Done[Tick]
    - typings.glimmerInterfaces.anon.Value[Return]
  */
  trait RichIteratorResult[Tick, Return] extends StObject
  object RichIteratorResult {
    
    inline def Done[Tick](value: Tick): typings.glimmerInterfaces.anon.Done[Tick] = {
      val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.glimmerInterfaces.anon.Done[Tick]]
    }
    
    inline def Value[Return](value: Return): typings.glimmerInterfaces.anon.Value[Return] = {
      val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.glimmerInterfaces.anon.Value[Return]]
    }
  }
  
  trait Unique[T] extends StObject {
    
    @JSName("Unique [id=ada0f31f-27f7-4ab0-bc03-0005387c9d5f]")
    var `Unique [idEqualssignada0f31f-27f7-4ab0-bc03-0005387c9d5f]`: T
  }
  object Unique {
    
    inline def apply[T](`Unique [idEqualssignada0f31f-27f7-4ab0-bc03-0005387c9d5f]`: T): Unique[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Unique [id=ada0f31f-27f7-4ab0-bc03-0005387c9d5f]")((`Unique [idEqualssignada0f31f-27f7-4ab0-bc03-0005387c9d5f]`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Unique[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unique[?], T] (val x: Self & Unique[T]) extends AnyVal {
      
      inline def `setUnique [idEqualssignada0f31f-27f7-4ab0-bc03-0005387c9d5f]`(value: T): Self = StObject.set(x, "Unique [id=ada0f31f-27f7-4ab0-bc03-0005387c9d5f]", value.asInstanceOf[js.Any])
    }
  }
}
