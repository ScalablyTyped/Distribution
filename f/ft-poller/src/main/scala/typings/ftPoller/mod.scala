package typings.ftPoller

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ft-poller", JSImport.Namespace)
  @js.native
  open class ^[PollerData, ExternalData] protected ()
    extends StObject
       with Poller[PollerData, ExternalData] {
    def this(config: Config[PollerData, ExternalData]) = this()
  }
  
  trait Config[PollerData, ExternalData] extends StObject {
    
    var autostart: js.UndefOr[Boolean] = js.undefined
    
    var defaultData: js.UndefOr[PollerData] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var parseData: js.UndefOr[js.Function1[/* data */ ExternalData, PollerData]] = js.undefined
    
    var refreshInterval: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object Config {
    
    inline def apply[PollerData, ExternalData](url: String): Config[PollerData, ExternalData] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[PollerData, ExternalData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config[?, ?], PollerData, ExternalData] (val x: Self & (Config[PollerData, ExternalData])) extends AnyVal {
      
      inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      inline def setDefaultData(value: PollerData): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
      
      inline def setDefaultDataUndefined: Self = StObject.set(x, "defaultData", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParseData(value: /* data */ ExternalData => PollerData): Self = StObject.set(x, "parseData", js.Any.fromFunction1(value))
      
      inline def setParseDataUndefined: Self = StObject.set(x, "parseData", js.undefined)
      
      inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = StringDictionary[Any]
  
  @js.native
  trait Poller[PollerData, ExternalData] extends StObject {
    
    def fetch(): Unit = js.native
    
    def getData(): PollerData = js.native
    
    def isRunning(): Boolean = js.native
    
    def retry(): Unit = js.native
    
    def start(): js.Promise[PollerData] = js.native
    def start(options: Options): js.Promise[PollerData] = js.native
    
    def stop(): Boolean = js.native
  }
}
