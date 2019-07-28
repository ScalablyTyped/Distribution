package typings.framesync

import typings.framesync.libTypesMod.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framesync", JSImport.Namespace)
@js.native
object framesyncMod extends js.Object {
  def getFrameData(): Anon_Delta = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(cancelSync) */ @js.native
  object default extends js.Object {
    def fixedUpdate(process: Process): Process = js.native
    def fixedUpdate(process: Process, keepAlive: Boolean): Process = js.native
    def fixedUpdate(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def postRender(process: Process): Process = js.native
    def postRender(process: Process, keepAlive: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def read(process: Process): Process = js.native
    def read(process: Process, keepAlive: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def render(process: Process): Process = js.native
    def render(process: Process, keepAlive: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def update(process: Process): Process = js.native
    def update(process: Process, keepAlive: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
  }
  
}

