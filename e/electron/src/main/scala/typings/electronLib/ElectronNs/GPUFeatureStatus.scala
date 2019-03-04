package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPUFeatureStatus extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/gpu-feature-status
  /**
    * Canvas.
    */
  var `2d_canvas`: java.lang.String
  /**
    * Flash.
    */
  var flash_3d: java.lang.String
  /**
    * Flash Stage3D.
    */
  var flash_stage3d: java.lang.String
  /**
    * Flash Stage3D Baseline profile.
    */
  var flash_stage3d_baseline: java.lang.String
  /**
    * Compositing.
    */
  var gpu_compositing: java.lang.String
  /**
    * Multiple Raster Threads.
    */
  var multiple_raster_threads: java.lang.String
  /**
    * Native GpuMemoryBuffers.
    */
  var native_gpu_memory_buffers: java.lang.String
  /**
    * Rasterization.
    */
  var rasterization: java.lang.String
  /**
    * Video Decode.
    */
  var video_decode: java.lang.String
  /**
    * Video Encode.
    */
  var video_encode: java.lang.String
  /**
    * VPx Video Decode.
    */
  var vpx_decode: java.lang.String
  /**
    * WebGL.
    */
  var webgl: java.lang.String
  /**
    * WebGL2.
    */
  var webgl2: java.lang.String
}

object GPUFeatureStatus {
  @scala.inline
  def apply(
    `2d_canvas`: java.lang.String,
    flash_3d: java.lang.String,
    flash_stage3d: java.lang.String,
    flash_stage3d_baseline: java.lang.String,
    gpu_compositing: java.lang.String,
    multiple_raster_threads: java.lang.String,
    native_gpu_memory_buffers: java.lang.String,
    rasterization: java.lang.String,
    video_decode: java.lang.String,
    video_encode: java.lang.String,
    vpx_decode: java.lang.String,
    webgl: java.lang.String,
    webgl2: java.lang.String
  ): GPUFeatureStatus = {
    val __obj = js.Dynamic.literal(flash_3d = flash_3d, flash_stage3d = flash_stage3d, flash_stage3d_baseline = flash_stage3d_baseline, gpu_compositing = gpu_compositing, multiple_raster_threads = multiple_raster_threads, native_gpu_memory_buffers = native_gpu_memory_buffers, rasterization = rasterization, video_decode = video_decode, video_encode = video_encode, vpx_decode = vpx_decode, webgl = webgl, webgl2 = webgl2)
    __obj.updateDynamic("2d_canvas")(`2d_canvas`)
    __obj.asInstanceOf[GPUFeatureStatus]
  }
}

