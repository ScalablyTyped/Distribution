package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "Boot")
@js.native
open class Boot () extends StObject {
  
  /**
    * The instance of agent
    * @member {Agent}
    */
  /* protected */ var agent: Agent = js.native
  
  /**
    * The instance of app
    * @member {Application}
    */
  /* protected */ var app: Application = js.native
  
  /**
    * The configuration of application
    * @member {EggAppConfig}
    */
  /* protected */ var config: EggAppConfig = js.native
  
  /**
    * logger
    * @member {EggLogger}
    */
  /* protected */ var logger: EggLogger = js.native
}
