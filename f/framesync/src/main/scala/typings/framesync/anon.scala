package typings.framesync

import typings.framesync.typesMod.Process
import typings.framesync.typesMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delta extends StObject {
    
    var delta: Double
    
    var timestamp: Double
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
  trait keyinStepIdStep extends StObject {
    
    var postRender: Step
    
    var preRender: Step
    
    var read: Step
    
    var render: Step
    
    var update: Step
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
  trait keyinStepIdprocessProcess extends StObject {
    
    def postRender(process: Process): Process
    def postRender(process: Process, keepAlive: Boolean): Process
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def postRender(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("postRender")
    var postRender_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ]
    
    def preRender(process: Process): Process
    def preRender(process: Process, keepAlive: Boolean): Process
    def preRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def preRender(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("preRender")
    var preRender_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ]
    
    def read(process: Process): Process
    def read(process: Process, keepAlive: Boolean): Process
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def read(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("read")
    var read_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ]
    
    def render(process: Process): Process
    def render(process: Process, keepAlive: Boolean): Process
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def render(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("render")
    var render_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ]
    
    def update(process: Process): Process
    def update(process: Process, keepAlive: Boolean): Process
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def update(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("update")
    var update_Original: js.Function3[
        /* process */ Process, 
        /* keepAlive */ js.UndefOr[Boolean], 
        /* immediate */ js.UndefOr[Boolean], 
        Process
      ]
  }
  object keyinStepIdprocessProcess {
    
    @scala.inline
    def apply(
      postRender: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      preRender: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      read: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      render: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      update: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): keyinStepIdprocessProcess = {
      val __obj = js.Dynamic.literal(postRender = js.Any.fromFunction3(postRender), preRender = js.Any.fromFunction3(preRender), read = js.Any.fromFunction3(read), render = js.Any.fromFunction3(render), update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[keyinStepIdprocessProcess]
    }
    
    @scala.inline
    implicit class keyinStepIdprocessProcessMutableBuilder[Self <: keyinStepIdprocessProcess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostRender(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "postRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPreRender(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "preRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRead(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRender(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdate(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void} */
  trait keyinStepIdprocessProcessPostRender extends StObject {
    
    def postRender(process: Process): Unit
    @JSName("postRender")
    var postRender_Original: js.Function1[/* process */ Process, Unit]
    
    def preRender(process: Process): Unit
    @JSName("preRender")
    var preRender_Original: js.Function1[/* process */ Process, Unit]
    
    def read(process: Process): Unit
    @JSName("read")
    var read_Original: js.Function1[/* process */ Process, Unit]
    
    def render(process: Process): Unit
    @JSName("render")
    var render_Original: js.Function1[/* process */ Process, Unit]
    
    def update(process: Process): Unit
    @JSName("update")
    var update_Original: js.Function1[/* process */ Process, Unit]
  }
  object keyinStepIdprocessProcessPostRender {
    
    @scala.inline
    def apply(
      postRender: /* process */ Process => Unit,
      preRender: /* process */ Process => Unit,
      read: /* process */ Process => Unit,
      render: /* process */ Process => Unit,
      update: /* process */ Process => Unit
    ): keyinStepIdprocessProcessPostRender = {
      val __obj = js.Dynamic.literal(postRender = js.Any.fromFunction1(postRender), preRender = js.Any.fromFunction1(preRender), read = js.Any.fromFunction1(read), render = js.Any.fromFunction1(render), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[keyinStepIdprocessProcessPostRender]
    }
    
    @scala.inline
    implicit class keyinStepIdprocessProcessPostRenderMutableBuilder[Self <: keyinStepIdprocessProcessPostRender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostRender(value: /* process */ Process => Unit): Self = StObject.set(x, "postRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreRender(value: /* process */ Process => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRead(value: /* process */ Process => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRender(value: /* process */ Process => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: /* process */ Process => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
