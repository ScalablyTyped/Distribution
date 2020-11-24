package typings.gifencoder.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIFEncoder extends js.Object {
  
  def addFrame(ctx: CanvasRenderingContext2D): Unit = js.native
  
  def createReadStream(): Readable = js.native
  
  def createWriteStream(options: GIFOptions): Transform = js.native
  
  def finish(): Unit = js.native
  
  def setDelay(/** frame delay in ms */ delay: Double): Unit = js.native
  
  def setQuality(/** image quality. 10 is default */ quality: Double): Unit = js.native
  
  def setRepeat(/** 0 for repeat, -1 for no-repeat */
  repeat: Double): Unit = js.native
  
  def start(): Unit = js.native
}
object GIFEncoder {
  
  @scala.inline
  def apply(
    addFrame: CanvasRenderingContext2D => Unit,
    createReadStream: () => Readable,
    createWriteStream: GIFOptions => Transform,
    finish: () => Unit,
    setDelay: Double => Unit,
    setQuality: Double => Unit,
    setRepeat: Double => Unit,
    start: () => Unit
  ): GIFEncoder = {
    val __obj = js.Dynamic.literal(addFrame = js.Any.fromFunction1(addFrame), createReadStream = js.Any.fromFunction0(createReadStream), createWriteStream = js.Any.fromFunction1(createWriteStream), finish = js.Any.fromFunction0(finish), setDelay = js.Any.fromFunction1(setDelay), setQuality = js.Any.fromFunction1(setQuality), setRepeat = js.Any.fromFunction1(setRepeat), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[GIFEncoder]
  }
  
  @scala.inline
  implicit class GIFEncoderOps[Self <: GIFEncoder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddFrame(value: CanvasRenderingContext2D => Unit): Self = this.set("addFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateReadStream(value: () => Readable): Self = this.set("createReadStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWriteStream(value: GIFOptions => Transform): Self = this.set("createWriteStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDelay(value: Double => Unit): Self = this.set("setDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuality(value: Double => Unit): Self = this.set("setQuality", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRepeat(value: Double => Unit): Self = this.set("setRepeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
