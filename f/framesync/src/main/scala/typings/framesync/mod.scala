package typings.framesync

import typings.framesync.anon.Delta
import typings.framesync.typesMod.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("framesync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getFrameData(): Delta = js.native
  
  @js.native
  object cancelSync extends js.Object {
    
    def postRender(process: Process): Unit = js.native
    
    def preRender(process: Process): Unit = js.native
    
    def read(process: Process): Unit = js.native
    
    def render(process: Process): Unit = js.native
    
    def update(process: Process): Unit = js.native
  }
  
  @js.native
  object default extends js.Object {
    
    def postRender(process: Process): Process = js.native
    def postRender(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    
    def preRender(process: Process): Process = js.native
    def preRender(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def preRender(process: Process, keepAlive: Boolean): Process = js.native
    def preRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    
    def read(process: Process): Process = js.native
    def read(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    
    def render(process: Process): Process = js.native
    def render(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    
    def update(process: Process): Process = js.native
    def update(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
  }
}
