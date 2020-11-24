package typings.fluentFfmpeg.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluent-ffmpeg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): FfmpegCommand = js.native
  def apply(input: js.UndefOr[scala.Nothing], options: FfmpegCommandOptions): FfmpegCommand = js.native
  def apply(input: String): FfmpegCommand = js.native
  def apply(input: String, options: FfmpegCommandOptions): FfmpegCommand = js.native
  def apply(input: Readable): FfmpegCommand = js.native
  def apply(input: Readable, options: FfmpegCommandOptions): FfmpegCommand = js.native
  def apply(options: FfmpegCommandOptions): FfmpegCommand = js.native
}
