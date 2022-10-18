package typings.esfxCanceltoken

import typings.std.ReadableWritablePair
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStream[R] extends StObject {
  
  def pipeThrough[T](transform: ReadableWritablePair[T, R]): ReadableStream[T] = js.native
  def pipeThrough[T](transform: ReadableWritablePair[T, R], options: StreamPipeOptionsWithCancelToken): ReadableStream[T] = js.native
  
  def pipeTo(destination: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(destination: WritableStream[R], options: StreamPipeOptionsWithCancelToken): js.Promise[Unit] = js.native
}
