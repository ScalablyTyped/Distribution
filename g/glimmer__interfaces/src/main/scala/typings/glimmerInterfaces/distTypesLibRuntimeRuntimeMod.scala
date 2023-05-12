package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibProgramMod.ResolutionTimeConstants
import typings.glimmerInterfaces.distTypesLibProgramMod.RuntimeConstants
import typings.glimmerInterfaces.distTypesLibProgramMod.RuntimeHeap
import typings.glimmerInterfaces.distTypesLibProgramMod.RuntimeOp
import typings.glimmerInterfaces.distTypesLibRuntimeEnvironmentMod.Environment
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibSerializeMod.RuntimeResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeRuntimeMod {
  
  trait RuntimeArtifacts extends StObject {
    
    val constants: RuntimeConstants & ResolutionTimeConstants
    
    val heap: RuntimeHeap
  }
  object RuntimeArtifacts {
    
    inline def apply(constants: RuntimeConstants & ResolutionTimeConstants, heap: RuntimeHeap): RuntimeArtifacts = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], heap = heap.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeArtifacts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeArtifacts] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: RuntimeConstants & ResolutionTimeConstants): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setHeap(value: RuntimeHeap): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeContext extends StObject {
    
    var env: Environment
    
    var program: RuntimeProgram
    
    var resolver: RuntimeResolver[Owner]
  }
  object RuntimeContext {
    
    inline def apply(env: Environment, program: RuntimeProgram, resolver: RuntimeResolver[Owner]): RuntimeContext = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeContext] (val x: Self) extends AnyVal {
      
      inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: RuntimeProgram): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: RuntimeResolver[Owner]): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeProgram extends StObject {
    
    val constants: RuntimeConstants & ResolutionTimeConstants
    
    val heap: RuntimeHeap
    
    def opcode(offset: Double): RuntimeOp
  }
  object RuntimeProgram {
    
    inline def apply(
      constants: RuntimeConstants & ResolutionTimeConstants,
      heap: RuntimeHeap,
      opcode: Double => RuntimeOp
    ): RuntimeProgram = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], heap = heap.asInstanceOf[js.Any], opcode = js.Any.fromFunction1(opcode))
      __obj.asInstanceOf[RuntimeProgram]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeProgram] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: RuntimeConstants & ResolutionTimeConstants): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setHeap(value: RuntimeHeap): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      inline def setOpcode(value: Double => RuntimeOp): Self = StObject.set(x, "opcode", js.Any.fromFunction1(value))
    }
  }
}
