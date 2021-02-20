package typings.framesync

import typings.framesync.typesMod.Process
import typings.framesync.typesMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Delta extends StObject {
    
    var delta: Double = js.native
    
    var timestamp: Double = js.native
  }
  object Delta {
    
    @scala.inline
    def apply(delta: Double, timestamp: Double): Delta = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delta]
    }
    
    @scala.inline
    implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step} */
  @js.native
  trait keyinStepIdStep extends StObject {
    
    var postRender: Step = js.native
    
    var preRender: Step = js.native
    
    var read: Step = js.native
    
    var render: Step = js.native
    
    var update: Step = js.native
  }
  object keyinStepIdStep {
    
    @scala.inline
    def apply(postRender: Step, preRender: Step, read: Step, render: Step, update: Step): keyinStepIdStep = {
      val __obj = js.Dynamic.literal(postRender = postRender.asInstanceOf[js.Any], preRender = preRender.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinStepIdStep]
    }
    
    @scala.inline
    implicit class keyinStepIdStepMutableBuilder[Self <: keyinStepIdStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostRender(value: Step): Self = StObject.set(x, "postRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreRender(value: Step): Self = StObject.set(x, "preRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: Step): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: Step): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: Step): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive : boolean | undefined, immediate : boolean | undefined): framesync.framesync/lib/types.Process} */
  @js.native
  trait keyinStepIdprocessProcess extends StObject {
    
    def postRender(process: Process): Process = js.native
    def postRender(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    @JSName("postRender")
    var postRender_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ] = js.native
    
    def preRender(process: Process): Process = js.native
    def preRender(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def preRender(process: Process, keepAlive: Boolean): Process = js.native
    def preRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    @JSName("preRender")
    var preRender_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ] = js.native
    
    def read(process: Process): Process = js.native
    def read(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    @JSName("read")
    var read_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ] = js.native
    
    def render(process: Process): Process = js.native
    def render(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    @JSName("render")
    var render_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ] = js.native
    
    def update(process: Process): Process = js.native
    def update(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    @JSName("update")
    var update_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ] = js.native
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void} */
  @js.native
  trait keyinStepIdprocessProcessPostRender extends StObject {
    
    def postRender(process: Process): Unit = js.native
    @JSName("postRender")
    var postRender_Original: js.Function1[/* process */ Process, Unit] = js.native
    
    def preRender(process: Process): Unit = js.native
    @JSName("preRender")
    var preRender_Original: js.Function1[/* process */ Process, Unit] = js.native
    
    def read(process: Process): Unit = js.native
    @JSName("read")
    var read_Original: js.Function1[/* process */ Process, Unit] = js.native
    
    def render(process: Process): Unit = js.native
    @JSName("render")
    var render_Original: js.Function1[/* process */ Process, Unit] = js.native
    
    def update(process: Process): Unit = js.native
    @JSName("update")
    var update_Original: js.Function1[/* process */ Process, Unit] = js.native
  }
}
