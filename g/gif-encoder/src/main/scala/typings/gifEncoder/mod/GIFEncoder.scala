package typings.gifEncoder.mod

import typings.gifEncoder.anon.IndexedPixels
import typings.gifEncoder.gifEncoderNumbers.`0`
import typings.gifEncoder.gifEncoderNumbers.`1`
import typings.gifEncoder.gifEncoderNumbers.`2`
import typings.gifEncoder.gifEncoderNumbers.`3`
import typings.gifEncoder.gifEncoderStrings.close
import typings.gifEncoder.gifEncoderStrings.data
import typings.gifEncoder.gifEncoderStrings.end
import typings.gifEncoder.gifEncoderStrings.error
import typings.gifEncoder.gifEncoderStrings.finishNumbersignstart
import typings.gifEncoder.gifEncoderStrings.finishNumbersignstop
import typings.gifEncoder.gifEncoderStrings.frameNumbersignstart
import typings.gifEncoder.gifEncoderStrings.frameNumbersignstop
import typings.gifEncoder.gifEncoderStrings.pause
import typings.gifEncoder.gifEncoderStrings.readable
import typings.gifEncoder.gifEncoderStrings.resume
import typings.gifEncoder.gifEncoderStrings.writeHeaderNumbersignstart
import typings.gifEncoder.gifEncoderStrings.writeHeaderNumbersignstop
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIFEncoder extends Readable {
  
  /**
    * Write out a new frame to the GIF.
    */
  def addFrame(
    /**
    * ArrayLike of pixels (0x00 - 0xFF) for the new frame.
    * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
    * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
    *
    * If used with the options palette and indexedPixels, then this becomes the index in the palette.
    */
  imageData: Pixels
  ): Unit = js.native
  def addFrame(
    /**
    * ArrayLike of pixels (0x00 - 0xFF) for the new frame.
    * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
    * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
    *
    * If used with the options palette and indexedPixels, then this becomes the index in the palette.
    */
  imageData: Pixels,
    /**
    * Optional parameter for options.
    */
  options: IndexedPixels
  ): Unit = js.native
  
  /**
    * First part of addFrame; runs setImagePixels(removeAlphaChannel(imageData)) and runs analyzePixels().
    */
  def analyzeImage(
    /**
    * ArrayLike of pixels (0x00 - 0xFF) for the analyzed frame.
    * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
    * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
    *
    * If used with the options palette and indexedPixels, then this becomes the index in the palette.
    */
  imageData: Pixels
  ): Unit = js.native
  def analyzeImage(
    /**
    * ArrayLike of pixels (0x00 - 0xFF) for the analyzed frame.
    * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
    * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
    *
    * If used with the options palette and indexedPixels, then this becomes the index in the palette.
    */
  imageData: Pixels,
    /**
    * Optional parameter for options.
    */
  options: IndexedPixels
  ): Unit = js.native
  
  /**
    * Write out footer bytes.
    */
  def finish(): Unit = js.native
  
  /**
    * We have a secondary internal buffer that collects each byte from writeByte.
    * This is to prevent create a new Buffer and data event for every byte of data.
    *
    * This method empties the internal buffer and pushes it out to the stream buffer for reading.
    */
  def flushData(): Unit = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finishstart(event: finishNumbersignstart, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_finishstop(event: finishNumbersignstop, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_framestart(event: frameNumbersignstart, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_framestop(event: frameNumbersignstop, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_writeHeaderstart(event: writeHeaderNumbersignstart, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_writeHeaderstop(event: writeHeaderNumbersignstop, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finishstart(event: finishNumbersignstart, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_finishstop(event: finishNumbersignstop, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_framestart(event: frameNumbersignstart, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_framestop(event: frameNumbersignstop, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_writeHeaderstart(event: writeHeaderNumbersignstart, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_writeHeaderstop(event: writeHeaderNumbersignstop, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Third part of addFrame; encodes the analyzed/indexed pixels for the GIF format.
    */
  def outputImage(): Unit = js.native
  
  /**
    * Internal store for imageData passed in by addFrame.
    */
  var pixels: Pixels = js.native
  
  /**
    * Reduces imageData into a Uint8Array of length 3 * width * height containing sequences of r, g, b; removing the alpha channel.
    */
  def removeAlphaChannel(
    /**
    * ArrayLike of pixels (0x00 - 0xFF) for the source frame.
    * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
    * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
    */
  imageData: Pixels
  ): Unit = js.native
  
  /**
    * Set millisecond delay between frames.
    */
  def setDelay(/**
    * Amount of milliseconds to delay between frames.
    */
  ms: Double): Unit = js.native
  
  /**
    * Alters behavior of how to render between frames.
    */
  @JSName("setDispose")
  def setDispose_0(
    /**
    * If no transparent color has been set, defaults to 0.
    * Otherwise, defaults to 2.
    *
    * 0 -  No disposal specified. The decoder is
    *      not required to take any action.
    *
    * 1 -  Do not dispose. The graphic is to be left
    *      in place.
    *
    * 2 -  Restore to background color. The area used by the
    *      graphic must be restored to the background color.
    *
    * 3 -  Restore to previous. The decoder is required to
    *      restore the area overwritten by the graphic with
    *      what was there prior to rendering the graphic.
    */
  disposalCode: `0`
  ): Unit = js.native
  @JSName("setDispose")
  def setDispose_1(
    /**
    * If no transparent color has been set, defaults to 0.
    * Otherwise, defaults to 2.
    *
    * 0 -  No disposal specified. The decoder is
    *      not required to take any action.
    *
    * 1 -  Do not dispose. The graphic is to be left
    *      in place.
    *
    * 2 -  Restore to background color. The area used by the
    *      graphic must be restored to the background color.
    *
    * 3 -  Restore to previous. The decoder is required to
    *      restore the area overwritten by the graphic with
    *      what was there prior to rendering the graphic.
    */
  disposalCode: `1`
  ): Unit = js.native
  @JSName("setDispose")
  def setDispose_2(
    /**
    * If no transparent color has been set, defaults to 0.
    * Otherwise, defaults to 2.
    *
    * 0 -  No disposal specified. The decoder is
    *      not required to take any action.
    *
    * 1 -  Do not dispose. The graphic is to be left
    *      in place.
    *
    * 2 -  Restore to background color. The area used by the
    *      graphic must be restored to the background color.
    *
    * 3 -  Restore to previous. The decoder is required to
    *      restore the area overwritten by the graphic with
    *      what was there prior to rendering the graphic.
    */
  disposalCode: `2`
  ): Unit = js.native
  @JSName("setDispose")
  def setDispose_3(
    /**
    * If no transparent color has been set, defaults to 0.
    * Otherwise, defaults to 2.
    *
    * 0 -  No disposal specified. The decoder is
    *      not required to take any action.
    *
    * 1 -  Do not dispose. The graphic is to be left
    *      in place.
    *
    * 2 -  Restore to background color. The area used by the
    *      graphic must be restored to the background color.
    *
    * 3 -  Restore to previous. The decoder is required to
    *      restore the area overwritten by the graphic with
    *      what was there prior to rendering the graphic.
    */
  disposalCode: `3`
  ): Unit = js.native
  
  /**
    * Set delay between frames based on frames per second. Cannot be used with setDelay().
    */
  def setFrameRate(/**
    * Amount of frames per second.
    */
  framesPerSecond: Double): Unit = js.native
  
  /**
    * Save palette as this.userPalette for frame writing.
    */
  def setImagePalette(
    /**
    * Array of pixels to use as palette for the frame.
    * It should follow the sequence of r, g, b, a.
    */
  palette: Pixels
  ): Unit = js.native
  
  /**
    * Save pixels as this.pixels for image analysis.
    */
  def setImagePixels(
    /**
    * ArrayLike of pixels (0x00 - 0xFF) for the frame to save.
    * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
    * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
    */
  pixels: Pixels
  ): Unit = js.native
  
  /**
    * Set the quality (computational/performance trade-off).
    */
  def setQuality(
    /**
    * A positive number.
    *
    * 1 is best colors, worst performance.
    *
    * 20 is suggested maximum but there is no limit.
    *
    * 10 is the default, provided an even trade-off.
    */
  quality: Double
  ): Unit = js.native
  
  /**
    * Sets the amount of times to repeat the GIF.
    */
  def setRepeat(
    /**
    * If n is -1, play once.
    *
    * If n is 0, loop indefinitely.
    *
    * If n is a positive number, loop n times.
    */
  amount: Double
  ): Unit = js.native
  
  /**
    * Sets the color which represents transparency in the GIF.
    */
  def setTransparent(/**
    * RGB color to represent transparent background, e.g. 0x00FF00
    */
  color: Double): Unit = js.native
  
  /**
    * Internal store for palette passed in by addFrame.
    */
  var userPalette: Pixels = js.native
  
  /**
    * Write out header bytes, following the GIF89a specification.
    */
  def writeHeader(): Unit = js.native
  
  /**
    * Second part of addFrame; behavior varies on if it is the first frame or following frame.
    *
    * In either case, it writes out a bunch of bytes about the image (e.g. palette, color tables).
    */
  def writeImageInfo(): Unit = js.native
}
