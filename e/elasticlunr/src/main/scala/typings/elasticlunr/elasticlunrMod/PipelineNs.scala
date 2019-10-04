package typings.elasticlunr.elasticlunrMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticlunr", "Pipeline")
@js.native
object PipelineNs extends js.Object {
  @JSName("registeredFunctions")
  @js.native
  object registeredFunctionsNs extends js.Object {
    def stemmer(w: String): String = js.native
    def stopWordFilter(token: String): String = js.native
    def trimmer(token: String): String = js.native
    @JSName("stemmer")
    @js.native
    object stemmerNs extends js.Object {
      val label: String = js.native
    }
    
    @JSName("stopWordFilter")
    @js.native
    object stopWordFilterNs extends js.Object {
      val label: String = js.native
      @js.native
      object stopWords extends /* key */ StringDictionary[Boolean]
      
    }
    
    @JSName("trimmer")
    @js.native
    object trimmerNs extends js.Object {
      val label: String = js.native
    }
    
  }
  
}

