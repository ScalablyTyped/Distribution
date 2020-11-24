package typings.gifJs.mod

import typings.gifJs.gifJsStrings.abort
import typings.gifJs.gifJsStrings.finished
import typings.gifJs.gifJsStrings.progress
import typings.gifJs.gifJsStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Blob
import typings.std.CanvasImageSource
import typings.std.CanvasRenderingContext2D
import typings.std.ImageData
import typings.std.Uint8Array
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIF extends EventEmitter {
  
  def addFrame(image: CanvasImageSource): Unit = js.native
  def addFrame(image: CanvasImageSource, options: AddFrameOptions): Unit = js.native
  def addFrame(image: CanvasRenderingContext2D): Unit = js.native
  def addFrame(image: CanvasRenderingContext2D, options: AddFrameOptions): Unit = js.native
  def addFrame(image: ImageData): Unit = js.native
  def addFrame(image: ImageData, options: AddFrameOptions): Unit = js.native
  def addFrame(image: WebGLRenderingContext): Unit = js.native
  def addFrame(image: WebGLRenderingContext, options: AddFrameOptions): Unit = js.native
  
  @JSName("on")
  def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_finished(event: finished, listener: js.Function2[/* blob */ Blob, /* data */ Uint8Array, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_finished(event: finished, listener: js.Function2[/* blob */ Blob, /* data */ Uint8Array, Unit]): this.type = js.native
  @JSName("once")
  def once_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  
  def render(): Unit = js.native
}
