package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataV4Adaptor
  extends StObject
     with ODataAdaptor {
  
  @JSName("options")
  var options_ODataV4Adaptor: ODataAdaptorOptions = js.native
  
  def processQuery(ds: Any, query: Query): typings.ejWebAll.anon.ContentType = js.native
}
