package typings.esbuildWasm.anon

import typings.esbuildWasm.mod.SameShape
import typings.esbuildWasm.mod.TransformOptions
import typings.esbuildWasm.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn6 extends StObject {
  
  def apply[T /* <: TransformOptions */](input: String): TransformResult[T] = js.native
  def apply[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): TransformResult[T] = js.native
  def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): TransformResult[T] = js.native
  def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): TransformResult[T] = js.native
}
