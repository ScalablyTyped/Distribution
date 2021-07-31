package typings.gifencoder

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gifencoder", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with GIFEncoder {
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    override def addFrame(ctx: CanvasRenderingContext2D): Unit = js.native
    
    /* CompleteClass */
    override def createReadStream(): Readable = js.native
    
    /* CompleteClass */
    override def createWriteStream(options: GIFOptions): Transform = js.native
    
    /* CompleteClass */
    override def finish(): Unit = js.native
    
    /* CompleteClass */
    override def setDelay(/** frame delay in ms */ delay: Double): Unit = js.native
    
    /* CompleteClass */
    override def setQuality(/** image quality. 10 is default */ quality: Double): Unit = js.native
    
    /* CompleteClass */
    override def setRepeat(/** 0 for repeat, -1 for no-repeat */
    repeat: Double): Unit = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
  }
  
  trait GIFEncoder extends StObject {
    
    def addFrame(ctx: CanvasRenderingContext2D): Unit
    
    def createReadStream(): Readable
    
    def createWriteStream(options: GIFOptions): Transform
    
    def finish(): Unit
    
    def setDelay(/** frame delay in ms */ delay: Double): Unit
    
    def setQuality(/** image quality. 10 is default */ quality: Double): Unit
    
    def setRepeat(/** 0 for repeat, -1 for no-repeat */
    repeat: Double): Unit
    
    def start(): Unit
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
    implicit class GIFEncoderMutableBuilder[Self <: GIFEncoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFrame(value: CanvasRenderingContext2D => Unit): Self = StObject.set(x, "addFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateReadStream(value: () => Readable): Self = StObject.set(x, "createReadStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateWriteStream(value: GIFOptions => Transform): Self = StObject.set(x, "createWriteStream", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDelay(value: Double => Unit): Self = StObject.set(x, "setDelay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetQuality(value: Double => Unit): Self = StObject.set(x, "setQuality", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRepeat(value: Double => Unit): Self = StObject.set(x, "setRepeat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  trait GIFOptions extends StObject {
    
    /** frame delay in ms */
    var delay: Double
    
    /** image quality. 10 is default */
    var quality: Double
    
    /** 0 for repeat, -1 for no-repeat */
    var repeat: Double
  }
  object GIFOptions {
    
    @scala.inline
    def apply(delay: Double, quality: Double, repeat: Double): GIFOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GIFOptions]
    }
    
    @scala.inline
    implicit class GIFOptionsMutableBuilder[Self <: GIFOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    }
  }
}
