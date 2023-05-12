package typings.fastEquals

import typings.fastEquals.distEsmTypesInternalTypesMod.Dictionary
import typings.fastEquals.distEsmTypesInternalTypesMod.PrimitiveWrapper
import typings.fastEquals.distEsmTypesInternalTypesMod.State
import typings.fastEquals.distEsmTypesInternalTypesMod.TypedArray
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTypesEqualsMod {
  
  @JSImport("fast-equals/dist/esm/types/equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areArraysEqual(a: js.Array[Any], b: js.Array[Any], state: State[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areArraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areDatesEqual(a: js.Date, b: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areDatesEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areMapsEqual(a: Map[Any, Any], b: Map[Any, Any], state: State[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areMapsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areObjectsEqual(a: Dictionary[Any], b: Dictionary[Any], state: State[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areObjectsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areObjectsEqualStrict(a: Dictionary[Any], b: Dictionary[Any], state: State[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areObjectsEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arePrimitiveWrappersEqual(a: PrimitiveWrapper, b: PrimitiveWrapper): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arePrimitiveWrappersEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areRegExpsEqual(a: js.RegExp, b: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areRegExpsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areSetsEqual(a: Set[Any], b: Set[Any], state: State[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSetsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def areTypedArraysEqual(a: TypedArray, b: TypedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areTypedArraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
