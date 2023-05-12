package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCompileOperandsMod.Operand
import typings.glimmerInterfaces.distTypesLibTemplateMod.CompilerBuffer
import typings.glimmerInterfaces.distTypesLibVmOpcodesMod.MachineOp
import typings.glimmerInterfaces.distTypesLibVmOpcodesMod.Op
import typings.glimmerInterfaces.glimmerInterfacesInts.`0`
import typings.glimmerInterfaces.glimmerInterfacesInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibCompileInstructionEncoderMod {
  
  @js.native
  trait InstructionEncoder extends StObject {
    
    val buffer: CompilerBuffer = js.native
    
    @JSName("encode")
    def encode_0(`type`: Op, machine: `0`, operands: Operand*): Unit = js.native
    @JSName("encode")
    def encode_0b00000000000000000000010000000000(`type`: MachineOp, machine: /* 0b00000000000000000000010000000000 */ Double, operands: Operand*): Unit = js.native
    
    def patch(position: Double, target: Double): Unit = js.native
    
    var size: Double = js.native
  }
  
  object OpcodeSize {
    
    inline def ARG_SHIFT: `8` = 8.asInstanceOf[`8`]
    
    inline def MACHINE_MASK: /* 0b00000000000000000000010000000000 */ Double = Double.asInstanceOf[/* 0b00000000000000000000010000000000 */ Double]
    
    inline def MAX_SIZE: /* 0x7fffffff */ Double = Double.asInstanceOf[/* 0x7fffffff */ Double]
    
    inline def OPERAND_LEN_MASK: /* 0b00000000000000000000001100000000 */ Double = Double.asInstanceOf[/* 0b00000000000000000000001100000000 */ Double]
    
    inline def TYPE_MASK: /* 0b00000000000000000000000011111111 */ Double = Double.asInstanceOf[/* 0b00000000000000000000000011111111 */ Double]
    
    inline def TYPE_SIZE: /* 0b11111111 */ Double = Double.asInstanceOf[/* 0b11111111 */ Double]
  }
  type OpcodeSize = `8` | (/* 0x7fffffff */ Double)
}
