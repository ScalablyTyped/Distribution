package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.windowLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes the browser's profiler.
  *
  * Permissions: `geckoProfiler`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object geckoProfiler {
  
  /* geckoProfiler types */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.java_
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.js_
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.leaf
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mainthreadio
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responsiveness
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.screenshots
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.seqstyle
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stackwalk
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tasktracer
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.threads
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jstracer
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jsallocations
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.nostacksampling
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.nativeallocations
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.preferencereads
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ipcmessages
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fileio
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fileioall
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.noiostacks
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audiocallbacktracing
  */
  trait ProfilerFeature extends StObject
  object ProfilerFeature {
    
    inline def audiocallbacktracing: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audiocallbacktracing = "audiocallbacktracing".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.audiocallbacktracing]
    
    inline def fileio: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fileio = "fileio".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fileio]
    
    inline def fileioall: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fileioall = "fileioall".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fileioall]
    
    inline def ipcmessages: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ipcmessages = "ipcmessages".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ipcmessages]
    
    inline def java_ : typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.java_ = "java".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.java_]
    
    inline def js_ : typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.js_ = "js".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.js_]
    
    inline def jsallocations: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jsallocations = "jsallocations".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jsallocations]
    
    inline def jstracer: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jstracer = "jstracer".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.jstracer]
    
    inline def leaf: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.leaf = "leaf".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.leaf]
    
    inline def mainthreadio: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mainthreadio = "mainthreadio".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mainthreadio]
    
    inline def nativeallocations: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.nativeallocations = "nativeallocations".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.nativeallocations]
    
    inline def noiostacks: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.noiostacks = "noiostacks".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.noiostacks]
    
    inline def nostacksampling: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.nostacksampling = "nostacksampling".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.nostacksampling]
    
    inline def preferencereads: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.preferencereads = "preferencereads".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.preferencereads]
    
    inline def responsiveness: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responsiveness = "responsiveness".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.responsiveness]
    
    inline def screenshots: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.screenshots = "screenshots".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.screenshots]
    
    inline def seqstyle: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.seqstyle = "seqstyle".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.seqstyle]
    
    inline def stackwalk: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stackwalk = "stackwalk".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.stackwalk]
    
    inline def tasktracer: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tasktracer = "tasktracer".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tasktracer]
    
    inline def threads: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.threads = "threads".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.threads]
  }
  
  trait StartSettings extends StObject {
    
    /**
      * The maximum size in bytes of the buffer used to store profiling data. A larger value allows capturing a profile that covers a greater amount of time.
      */
    var bufferSize: Double
    
    /** A list of active features for the profiler. */
    var features: js.Array[ProfilerFeature]
    
    /**
      * Interval in milliseconds between samples of profiling data. A smaller value will increase the detail of the profiles captured.
      */
    var interval: Double
    
    /** A list of thread names for which to capture profiles. */
    var threads: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The length of the window of time that's kept in the buffer. Any collected samples are discarded as soon as they are older than the number of seconds specified in this setting. Zero means no duration restriction.
      */
    var windowLength: js.UndefOr[Double] = js.undefined
  }
  object StartSettings {
    
    inline def apply(bufferSize: Double, features: js.Array[ProfilerFeature], interval: Double): StartSettings = {
      val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartSettings]
    }
    
    extension [Self <: StartSettings](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: js.Array[ProfilerFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: ProfilerFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setThreads(value: js.Array[String]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
      
      inline def setThreadsVarargs(value: String*): Self = StObject.set(x, "threads", js.Array(value :_*))
      
      inline def setWindowLength(value: Double): Self = StObject.set(x, "windowLength", value.asInstanceOf[js.Any])
      
      inline def setWindowLengthUndefined: Self = StObject.set(x, "windowLength", js.undefined)
    }
  }
  
  type Supports = windowLength
}
