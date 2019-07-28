package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPUFeatureStatus extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/gpu-feature-status
  /**
    * Canvas.
    */
  var `2d_canvas`: String
  /**
    * Flash.
    */
  var flash_3d: String
  /**
    * Flash Stage3D.
    */
  var flash_stage3d: String
  /**
    * Flash Stage3D Baseline profile.
    */
  var flash_stage3d_baseline: String
  /**
    * Compositing.
    */
  var gpu_compositing: String
  /**
    * Multiple Raster Threads.
    */
  var multiple_raster_threads: String
  /**
    * Native GpuMemoryBuffers.
    */
  var native_gpu_memory_buffers: String
  /**
    * Rasterization.
    */
  var rasterization: String
  /**
    * Video Decode.
    */
  var video_decode: String
  /**
    * Video Encode.
    */
  var video_encode: String
  /**
    * VPx Video Decode.
    */
  var vpx_decode: String
  /**
    * WebGL.
    */
  var webgl: String
  /**
    * WebGL2.
    */
  var webgl2: String
}

object GPUFeatureStatus {
  @scala.inline
  def apply(
    `2d_canvas`: String,
    flash_3d: String,
    flash_stage3d: String,
    flash_stage3d_baseline: String,
    gpu_compositing: String,
    multiple_raster_threads: String,
    native_gpu_memory_buffers: String,
    rasterization: String,
    video_decode: String,
    video_encode: String,
    vpx_decode: String,
    webgl: String,
    webgl2: String
  ): GPUFeatureStatus = {
    val __obj = js.Dynamic.literal(flash_3d = flash_3d, flash_stage3d = flash_stage3d, flash_stage3d_baseline = flash_stage3d_baseline, gpu_compositing = gpu_compositing, multiple_raster_threads = multiple_raster_threads, native_gpu_memory_buffers = native_gpu_memory_buffers, rasterization = rasterization, video_decode = video_decode, video_encode = video_encode, vpx_decode = vpx_decode, webgl = webgl, webgl2 = webgl2)
    __obj.updateDynamic("2d_canvas")(`2d_canvas`)
    __obj.asInstanceOf[GPUFeatureStatus]
  }
}

