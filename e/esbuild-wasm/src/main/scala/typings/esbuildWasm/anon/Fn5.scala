package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.TransformOptions
import typings.esbuildWasm.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn5 extends StObject {
  
  def apply(input: String): js.Promise[TransformResult[TransformOptions]] = js.native
  def apply(input: String, options: TransformOptions): js.Promise[TransformResult[TransformOptions]] = js.native
  def apply(input: js.typedarray.Uint8Array): js.Promise[TransformResult[TransformOptions]] = js.native
  def apply(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult[TransformOptions]] = js.native
  def apply[SpecificOptions /* <: TransformOptions */](input: String, options: SpecificOptions): js.Promise[TransformResult[SpecificOptions]] = js.native
  def apply[SpecificOptions /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SpecificOptions): js.Promise[TransformResult[SpecificOptions]] = js.native
}
