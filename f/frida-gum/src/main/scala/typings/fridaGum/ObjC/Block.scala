package typings.fridaGum.ObjC

import typings.fridaGum.AnyFunction
import typings.fridaGum.NativePointer
import typings.fridaGum.ObjectWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamically generated language binding for any Objective-C block.
  *
  * Also supports implementing a block from scratch by passing in an
  * implementation.
  */
trait Block
  extends StObject
     with ObjectWrapper {
  
  /**
    * Declares the signature of an externally defined block. This is needed
    * when working with blocks without signature metadata, i.e. when
    * `block.types === undefined`.
    *
    * @param signature Signature to use.
    */
  def declare(signature: BlockSignature): Unit
  
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  def implementation(args: Any*): Any
  /**
    * Current implementation. You may replace it by assigning to this property.
    */
  @JSName("implementation")
  var implementation_Original: AnyFunction
  
  /**
    * Signature, if available.
    */
  var types: js.UndefOr[String] = js.undefined
}
object Block {
  
  inline def apply(declare: BlockSignature => Unit, handle: NativePointer, implementation: AnyFunction): Block = {
    val __obj = js.Dynamic.literal(declare = js.Any.fromFunction1(declare), handle = handle.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setDeclare(value: BlockSignature => Unit): Self = StObject.set(x, "declare", js.Any.fromFunction1(value))
    
    inline def setImplementation(value: AnyFunction): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
