package typings.emberPolyfills

import typings.emberPolyfills.typesMod.Mix
import typings.emberPolyfills.typesMod.Mix3
import typings.emberPolyfills.typesMod.Mix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/polyfills", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Object): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def assign(target: js.Object, sources: js.Object*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def assign[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): Mix[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Mix[T, U]]
  inline def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): Mix3[T, U, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[Mix3[T, U, V]]
  inline def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): Mix4[T, U, V, W] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[Mix4[T, U, V, W]]
  
  inline def merge[T /* <: js.Object */, U /* <: js.Object */](original: T, updates: U): Mix[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(original.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Mix[T, U]]
}
