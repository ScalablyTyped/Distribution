package typings.framesync

import typings.framesync.anon.Delta
import typings.framesync.typesMod.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("framesync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("framesync", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def postRender(process: Process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("postRender")(process.asInstanceOf[js.Any]).asInstanceOf[Process]
    @scala.inline
    def postRender(process: Process, keepAlive: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("postRender")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("postRender")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def postRender(process: Process, keepAlive: Unit, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("postRender")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    
    @scala.inline
    def preRender(process: Process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("preRender")(process.asInstanceOf[js.Any]).asInstanceOf[Process]
    @scala.inline
    def preRender(process: Process, keepAlive: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("preRender")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def preRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("preRender")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def preRender(process: Process, keepAlive: Unit, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("preRender")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    
    @scala.inline
    def read(process: Process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(process.asInstanceOf[js.Any]).asInstanceOf[Process]
    @scala.inline
    def read(process: Process, keepAlive: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def read(process: Process, keepAlive: Unit, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    
    @scala.inline
    def render(process: Process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(process.asInstanceOf[js.Any]).asInstanceOf[Process]
    @scala.inline
    def render(process: Process, keepAlive: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def render(process: Process, keepAlive: Unit, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    
    @scala.inline
    def update(process: Process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(process.asInstanceOf[js.Any]).asInstanceOf[Process]
    @scala.inline
    def update(process: Process, keepAlive: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
    @scala.inline
    def update(process: Process, keepAlive: Unit, immediate: Boolean): Process = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(process.asInstanceOf[js.Any], keepAlive.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Process]
  }
  
  object cancelSync {
    
    @JSImport("framesync", "cancelSync")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def postRender(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("postRender")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def preRender(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preRender")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def read(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def render(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def update(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def getFrameData(): Delta = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameData")().asInstanceOf[Delta]
}
