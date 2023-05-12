package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.SerializedBlock
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.SerializedInlineBlock
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Statements.Statement
import typings.glimmerInterfaces.distTypesLibTemplateMod.CompilableTemplate
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.SymbolTable
import typings.glimmerInterfaces.glimmerInterfacesInts.`1`
import typings.glimmerInterfaces.glimmerInterfacesInts.`2`
import typings.glimmerInterfaces.glimmerInterfacesInts.`3`
import typings.glimmerInterfaces.glimmerInterfacesInts.`4`
import typings.glimmerInterfaces.glimmerInterfacesInts.`5`
import typings.glimmerInterfaces.glimmerInterfacesInts.`6`
import typings.glimmerInterfaces.glimmerInterfacesInts.`7`
import typings.glimmerInterfaces.glimmerInterfacesInts.`8`
import typings.glimmerInterfaces.glimmerInterfacesStrings.`cautious-append`
import typings.glimmerInterfaces.glimmerInterfacesStrings.`cautious-non-dynamic-append`
import typings.glimmerInterfaces.glimmerInterfacesStrings.`trusting-append`
import typings.glimmerInterfaces.glimmerInterfacesStrings.`trusting-non-dynamic-append`
import typings.glimmerInterfaces.glimmerInterfacesStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibCompileOperandsMod {
  
  trait BlockOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `4`
    
    var value: SerializedInlineBlock | SerializedBlock
  }
  object BlockOperand {
    
    inline def apply(value: SerializedInlineBlock | SerializedBlock): BlockOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(4)
      __obj.asInstanceOf[BlockOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `4`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SerializedInlineBlock | SerializedBlock): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: (/* statements */ js.Array[Statement])*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type EncoderOperands = (js.Array[Any | Operand]) | (js.Tuple2[Operand, Operand]) | (js.Tuple3[Operand, Operand, Operand])
  
  trait EvalSymbolsOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `3`
    
    var value: Unit
  }
  object EvalSymbolsOperand {
    
    inline def apply(value: Unit): EvalSymbolsOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(3)
      __obj.asInstanceOf[EvalSymbolsOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EvalSymbolsOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.LabelOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.IsStrictModeOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.EvalSymbolsOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.StdLibOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.BlockOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.NonSmallIntOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.SymbolTableOperand
    - typings.glimmerInterfaces.distTypesLibCompileOperandsMod.LayoutOperand
  */
  trait HighLevelBuilderOperand extends StObject
  object HighLevelBuilderOperand {
    
    inline def BlockOperand(value: SerializedInlineBlock | SerializedBlock): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.BlockOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(4)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.BlockOperand]
    }
    
    inline def EvalSymbolsOperand(value: Unit): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.EvalSymbolsOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(3)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.EvalSymbolsOperand]
    }
    
    inline def IsStrictModeOperand(value: Unit): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.IsStrictModeOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.IsStrictModeOperand]
    }
    
    inline def LabelOperand(value: String): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.LabelOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.LabelOperand]
    }
    
    inline def LayoutOperand(value: CompilableTemplate[SymbolTable]): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.LayoutOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(8)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.LayoutOperand]
    }
    
    inline def NonSmallIntOperand(value: Double): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.NonSmallIntOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(6)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.NonSmallIntOperand]
    }
    
    inline def StdLibOperand(
      value: main | `trusting-append` | `cautious-append` | `trusting-non-dynamic-append` | `cautious-non-dynamic-append`
    ): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.StdLibOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(5)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.StdLibOperand]
    }
    
    inline def SymbolTableOperand(value: SymbolTable): typings.glimmerInterfaces.distTypesLibCompileOperandsMod.SymbolTableOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(7)
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibCompileOperandsMod.SymbolTableOperand]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`2`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`3`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`4`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`5`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`6`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`7`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`8`
  */
  trait HighLevelOperand extends StObject
  object HighLevelOperand {
    
    inline def Block: `4` = 4.asInstanceOf[`4`]
    
    inline def EvalSymbols: `3` = 3.asInstanceOf[`3`]
    
    inline def IsStrictMode: `2` = 2.asInstanceOf[`2`]
    
    inline def Label: `1` = 1.asInstanceOf[`1`]
    
    inline def Layout: `8` = 8.asInstanceOf[`8`]
    
    inline def NonSmallInt: `6` = 6.asInstanceOf[`6`]
    
    inline def StdLib: `5` = 5.asInstanceOf[`5`]
    
    inline def SymbolTable: `7` = 7.asInstanceOf[`7`]
  }
  
  trait IsStrictModeOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `2`
    
    var value: Unit
  }
  object IsStrictModeOperand {
    
    inline def apply(value: Unit): IsStrictModeOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[IsStrictModeOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsStrictModeOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `1`
    
    var value: String
  }
  object LabelOperand {
    
    inline def apply(value: String): LabelOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[LabelOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `8`
    
    var value: CompilableTemplate[SymbolTable]
  }
  object LayoutOperand {
    
    inline def apply(value: CompilableTemplate[SymbolTable]): LayoutOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(8)
      __obj.asInstanceOf[LayoutOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: CompilableTemplate[SymbolTable]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait NonSmallIntOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `6`
    
    var value: Double
  }
  object NonSmallIntOperand {
    
    inline def apply(value: Double): NonSmallIntOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(6)
      __obj.asInstanceOf[NonSmallIntOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonSmallIntOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Operand = Double
  
  type SingleBuilderOperand = js.UndefOr[
    HighLevelBuilderOperand | Double | String | Boolean | Null | (js.Array[Double | String])
  ]
  
  trait StdLibOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `5`
    
    var value: main | `trusting-append` | `cautious-append` | `trusting-non-dynamic-append` | `cautious-non-dynamic-append`
  }
  object StdLibOperand {
    
    inline def apply(
      value: main | `trusting-append` | `cautious-append` | `trusting-non-dynamic-append` | `cautious-non-dynamic-append`
    ): StdLibOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(5)
      __obj.asInstanceOf[StdLibOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StdLibOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(
        value: main | `trusting-append` | `cautious-append` | `trusting-non-dynamic-append` | `cautious-non-dynamic-append`
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymbolTableOperand
    extends StObject
       with HighLevelBuilderOperand {
    
    var `type`: `7`
    
    var value: SymbolTable
  }
  object SymbolTableOperand {
    
    inline def apply(value: SymbolTable): SymbolTableOperand = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(7)
      __obj.asInstanceOf[SymbolTableOperand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SymbolTableOperand] (val x: Self) extends AnyVal {
      
      inline def setType(value: `7`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SymbolTable): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
