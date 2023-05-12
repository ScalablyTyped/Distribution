package typings.glimmerInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibTier1SymbolTableMod {
  
  trait BlockSymbolTable
    extends StObject
       with SymbolTable {
    
    var parameters: js.Array[Double]
  }
  object BlockSymbolTable {
    
    inline def apply(parameters: js.Array[Double]): BlockSymbolTable = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockSymbolTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockSymbolTable] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: js.Array[Double]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: Double*): Self = StObject.set(x, "parameters", js.Array(value*))
    }
  }
  
  trait ProgramSymbolTable
    extends StObject
       with SymbolTable {
    
    var hasEval: Boolean
    
    var symbols: js.Array[String]
  }
  object ProgramSymbolTable {
    
    inline def apply(hasEval: Boolean, symbols: js.Array[String]): ProgramSymbolTable = {
      val __obj = js.Dynamic.literal(hasEval = hasEval.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgramSymbolTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgramSymbolTable] (val x: Self) extends AnyVal {
      
      inline def setHasEval(value: Boolean): Self = StObject.set(x, "hasEval", value.asInstanceOf[js.Any])
      
      inline def setSymbols(value: js.Array[String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.ProgramSymbolTable
    - typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.BlockSymbolTable
  */
  trait SymbolTable extends StObject
  object SymbolTable {
    
    inline def BlockSymbolTable(parameters: js.Array[Double]): typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.BlockSymbolTable = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.BlockSymbolTable]
    }
    
    inline def ProgramSymbolTable(hasEval: Boolean, symbols: js.Array[String]): typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.ProgramSymbolTable = {
      val __obj = js.Dynamic.literal(hasEval = hasEval.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.ProgramSymbolTable]
    }
  }
}
