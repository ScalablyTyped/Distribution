package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.TransformOptions
import typings.esbuildWasm.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn6 extends StObject {
  
  def apply(input: String): TransformResult[TransformOptions] = js.native
  def apply(input: String, options: TransformOptions): TransformResult[TransformOptions] = js.native
  def apply(input: js.typedarray.Uint8Array): TransformResult[TransformOptions] = js.native
  def apply(input: js.typedarray.Uint8Array, options: TransformOptions): TransformResult[TransformOptions] = js.native
  def apply[SpecificOptions /* <: TransformOptions */](input: String, options: SpecificOptions): TransformResult[SpecificOptions] = js.native
}
