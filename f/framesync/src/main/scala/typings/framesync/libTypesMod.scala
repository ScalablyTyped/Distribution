package typings.framesync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void} */
  trait CancelSync extends StObject {
    
    def postRender(process: Process): Unit
    @JSName("postRender")
    var postRender_Original: js.Function1[/* process */ Process, Unit]
    
    def postUpdate(process: Process): Unit
    @JSName("postUpdate")
    var postUpdate_Original: js.Function1[/* process */ Process, Unit]
    
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
  object CancelSync {
    
    inline def apply(
      postRender: /* process */ Process => Unit,
      postUpdate: /* process */ Process => Unit,
      preRender: /* process */ Process => Unit,
      read: /* process */ Process => Unit,
      render: /* process */ Process => Unit,
      update: /* process */ Process => Unit
    ): CancelSync = {
      val __obj = js.Dynamic.literal(postRender = js.Any.fromFunction1(postRender), postUpdate = js.Any.fromFunction1(postUpdate), preRender = js.Any.fromFunction1(preRender), read = js.Any.fromFunction1(read), render = js.Any.fromFunction1(render), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[CancelSync]
    }
    
    extension [Self <: CancelSync](x: Self) {
      
      inline def setPostRender(value: /* process */ Process => Unit): Self = StObject.set(x, "postRender", js.Any.fromFunction1(value))
      
      inline def setPostUpdate(value: /* process */ Process => Unit): Self = StObject.set(x, "postUpdate", js.Any.fromFunction1(value))
      
      inline def setPreRender(value: /* process */ Process => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      inline def setRead(value: /* process */ Process => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setRender(value: /* process */ Process => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: /* process */ Process => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: (): void} */
  trait FlushSync extends StObject {
    
    def postRender(): Unit
    @JSName("postRender")
    var postRender_Original: js.Function0[Unit]
    
    def postUpdate(): Unit
    @JSName("postUpdate")
    var postUpdate_Original: js.Function0[Unit]
    
    def preRender(): Unit
    @JSName("preRender")
    var preRender_Original: js.Function0[Unit]
    
    def read(): Unit
    @JSName("read")
    var read_Original: js.Function0[Unit]
    
    def render(): Unit
    @JSName("render")
    var render_Original: js.Function0[Unit]
    
    def update(): Unit
    @JSName("update")
    var update_Original: js.Function0[Unit]
  }
  object FlushSync {
    
    inline def apply(
      postRender: () => Unit,
      postUpdate: () => Unit,
      preRender: () => Unit,
      read: () => Unit,
      render: () => Unit,
      update: () => Unit
    ): FlushSync = {
      val __obj = js.Dynamic.literal(postRender = js.Any.fromFunction0(postRender), postUpdate = js.Any.fromFunction0(postUpdate), preRender = js.Any.fromFunction0(preRender), read = js.Any.fromFunction0(read), render = js.Any.fromFunction0(render), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[FlushSync]
    }
    
    extension [Self <: FlushSync](x: Self) {
      
      inline def setPostRender(value: () => Unit): Self = StObject.set(x, "postRender", js.Any.fromFunction0(value))
      
      inline def setPostUpdate(value: () => Unit): Self = StObject.set(x, "postUpdate", js.Any.fromFunction0(value))
      
      inline def setPreRender(value: () => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction0(value))
      
      inline def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait FrameData extends StObject {
    
    var delta: Double
    
    var timestamp: Double
  }
  object FrameData {
    
    inline def apply(delta: Double, timestamp: Double): FrameData = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameData]
    }
    
    extension [Self <: FrameData](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = js.Function1[/* data */ FrameData, Unit]
  
  type Schedule = js.Function3[
    /* process */ Process, 
    /* keepAlive */ js.UndefOr[Boolean], 
    /* immediate */ js.UndefOr[Boolean], 
    Process
  ]
  
  trait Step extends StObject {
    
    def cancel(process: Process): Unit
    
    def process(frame: FrameData): Unit
    
    def schedule(process: Process): Process
    def schedule(process: Process, keepAlive: Boolean): Process
    def schedule(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def schedule(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("schedule")
    var schedule_Original: Schedule
  }
  object Step {
    
    inline def apply(
      cancel: Process => Unit,
      process: FrameData => Unit,
      schedule: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Step = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), process = js.Any.fromFunction1(process), schedule = js.Any.fromFunction3(schedule))
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setCancel(value: Process => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setProcess(value: FrameData => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setSchedule(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "schedule", js.Any.fromFunction3(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.framesync.framesyncStrings.read
    - typings.framesync.framesyncStrings.update
    - typings.framesync.framesyncStrings.postUpdate
    - typings.framesync.framesyncStrings.preRender
    - typings.framesync.framesyncStrings.render
    - typings.framesync.framesyncStrings.postRender
  */
  trait StepId extends StObject
  object StepId {
    
    inline def postRender: typings.framesync.framesyncStrings.postRender = "postRender".asInstanceOf[typings.framesync.framesyncStrings.postRender]
    
    inline def postUpdate: typings.framesync.framesyncStrings.postUpdate = "postUpdate".asInstanceOf[typings.framesync.framesyncStrings.postUpdate]
    
    inline def preRender: typings.framesync.framesyncStrings.preRender = "preRender".asInstanceOf[typings.framesync.framesyncStrings.preRender]
    
    inline def read: typings.framesync.framesyncStrings.read = "read".asInstanceOf[typings.framesync.framesyncStrings.read]
    
    inline def render: typings.framesync.framesyncStrings.render = "render".asInstanceOf[typings.framesync.framesyncStrings.render]
    
    inline def update: typings.framesync.framesyncStrings.update = "update".asInstanceOf[typings.framesync.framesyncStrings.update]
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step} */
  trait Steps extends StObject {
    
    var postRender: Step
    
    var postUpdate: Step
    
    var preRender: Step
    
    var read: Step
    
    var render: Step
    
    var update: Step
  }
  object Steps {
    
    inline def apply(postRender: Step, postUpdate: Step, preRender: Step, read: Step, render: Step, update: Step): Steps = {
      val __obj = js.Dynamic.literal(postRender = postRender.asInstanceOf[js.Any], postUpdate = postUpdate.asInstanceOf[js.Any], preRender = preRender.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    extension [Self <: Steps](x: Self) {
      
      inline def setPostRender(value: Step): Self = StObject.set(x, "postRender", value.asInstanceOf[js.Any])
      
      inline def setPostUpdate(value: Step): Self = StObject.set(x, "postUpdate", value.asInstanceOf[js.Any])
      
      inline def setPreRender(value: Step): Self = StObject.set(x, "preRender", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Step): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setRender(value: Step): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Step): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Schedule} */
  trait Sync extends StObject {
    
    def postRender(process: Process): Process
    def postRender(process: Process, keepAlive: Boolean): Process
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def postRender(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("postRender")
    var postRender_Original: Schedule
    
    def postUpdate(process: Process): Process
    def postUpdate(process: Process, keepAlive: Boolean): Process
    def postUpdate(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def postUpdate(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("postUpdate")
    var postUpdate_Original: Schedule
    
    def preRender(process: Process): Process
    def preRender(process: Process, keepAlive: Boolean): Process
    def preRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def preRender(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("preRender")
    var preRender_Original: Schedule
    
    def read(process: Process): Process
    def read(process: Process, keepAlive: Boolean): Process
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def read(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("read")
    var read_Original: Schedule
    
    def render(process: Process): Process
    def render(process: Process, keepAlive: Boolean): Process
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def render(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("render")
    var render_Original: Schedule
    
    def update(process: Process): Process
    def update(process: Process, keepAlive: Boolean): Process
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process
    def update(process: Process, keepAlive: Unit, immediate: Boolean): Process
    @JSName("update")
    var update_Original: Schedule
  }
  object Sync {
    
    inline def apply(
      postRender: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      postUpdate: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      preRender: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      read: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      render: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
      update: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Sync = {
      val __obj = js.Dynamic.literal(postRender = js.Any.fromFunction3(postRender), postUpdate = js.Any.fromFunction3(postUpdate), preRender = js.Any.fromFunction3(preRender), read = js.Any.fromFunction3(read), render = js.Any.fromFunction3(render), update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[Sync]
    }
    
    extension [Self <: Sync](x: Self) {
      
      inline def setPostRender(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "postRender", js.Any.fromFunction3(value))
      
      inline def setPostUpdate(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "postUpdate", js.Any.fromFunction3(value))
      
      inline def setPreRender(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "preRender", js.Any.fromFunction3(value))
      
      inline def setRead(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      inline def setRender(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setUpdate(
        value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
}
