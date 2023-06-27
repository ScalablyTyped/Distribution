package typings.esbuildWasm.anon

import typings.esbuildWasm.libBrowserMod.SameShape
import typings.esbuildWasm.libBrowserMod.TransformOptions
import typings.esbuildWasm.libBrowserMod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallInputOptions extends StObject {
  
  def apply[T /* <: TransformOptions */](input: String): js.Promise[TransformResult[T]] = js.native
  def apply[T /* <: TransformOptions */](input: String, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]] = js.native
  def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array): js.Promise[TransformResult[T]] = js.native
  def apply[T /* <: TransformOptions */](input: js.typedarray.Uint8Array, options: SameShape[TransformOptions, T]): js.Promise[TransformResult[T]] = js.native
}
