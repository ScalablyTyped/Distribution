package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "Configuration")
@js.native
open class Configuration () extends StObject {
  
  def getDefaultApiClient(): ApiClient = js.native
  
  def setDefaultApiClient(defaultApiClient: ApiClient): Unit = js.native
}
/* static members */
object Configuration {
  
  @JSImport("docusign-esign", "Configuration")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("docusign-esign", "Configuration.default")
  @js.native
  def default: Configuration = js.native
  inline def default_=(x: Configuration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
