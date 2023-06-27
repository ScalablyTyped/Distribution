package typings.domWebcodecs

import typings.std.Blob
import typings.std.DOMException
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLOrSVGImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.OffscreenCanvas
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AudioDataOutputCallback = js.Function1[/* output */ AudioData, Unit]

/**
  * Replaces CanvasImageSource; only applies if WebCodecs is available.
  */
type CanvasImageSourceWebCodecs = HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement | ImageBitmap | OffscreenCanvas | VideoFrame

type EncodedAudioChunkOutputCallback = js.Function2[/* output */ EncodedAudioChunk, /* metadata */ EncodedAudioChunkMetadata, Unit]

type EncodedVideoChunkOutputCallback = js.Function2[/* chunk */ EncodedVideoChunk, /* metadata */ EncodedVideoChunkMetadata, Unit]

/**
  * Replaces ImageBitmapSource; only applies if WebCodecs is available.
  */
type ImageBitmapSourceWebCodecs = CanvasImageSourceWebCodecs | Blob | ImageData

// type AllowSharedBufferSource = ArrayBuffer | ArrayBufferView;
// type BitrateMode = "constant" | "variable";
type ImageBufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | ReadableStream[Any]

/**
  * Replaces TexImageSource; only applies if WebCodecs is available.
  */
type TexImageSourceWebCodecs = ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | VideoFrame

type VideoFrameOutputCallback = js.Function1[/* output */ VideoFrame, Unit]

type WebCodecsErrorCallback = js.Function1[/* error */ DOMException, Unit]
