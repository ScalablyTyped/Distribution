package typings.fridaGum.ObjC

import typings.fridaGum.AnyFunction
import typings.fridaGum.NativeFunctionOptions
import typings.fridaGum.NativePointer
import typings.fridaGum.ObjectWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMethod
  extends StObject
     with ObjectWrapper
     with AnyFunction {
  
  /**
    * Argument type names.
    */
  var argumentTypes: js.Array[String] = js.native
  
  /**
    * Makes a new method wrapper with custom NativeFunction options.
    *
    * Useful for e.g. setting `traps: "all"` to perform execution tracing
    * in conjunction with Stalker.
    */
  def clone(options: NativeFunctionOptions): ObjectMethod = js.native
  
  /**
    * Current implementation.
    *
    * You may replace it by assigning to this property. See `ObjC.implement()` for details.
    */
  var implementation: NativePointer = js.native
  
  /**
    * Return type name.
    */
  var returnType: String = js.native
  
  /**
    * Objective-C selector. Use `ObjC.selectorAsString()` to convert it to a string.
    */
  var selector: NativePointer = js.native
  
  /**
    * Signature.
    */
  var types: String = js.native
}
